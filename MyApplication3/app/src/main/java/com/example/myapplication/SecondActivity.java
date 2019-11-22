package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

//        /* 取出数据，并打印 */
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity",data);

        /**
         *  注册按钮点击事件，并在点击事件中添加返回数据的逻辑
         */
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return","Hello FirstActivity"); //把需要传递的数据存放在Intent

                /**
                 *  方法：setResult() 用于向上一个活动返回数据
                 *  参数1：用于向上一个活动返回处理结果，一般只使用RESULT_OK或RESULT_CANCELED
                 *  参数2：把带有数据的Intent传递回去
                 */
                setResult(RESULT_OK,intent);
                finish(); //销毁当前的活动
            }
        });
    }
}
