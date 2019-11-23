package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {   /* 2.6.1 BaseActivity 替换 AppCompatActivity 知晓当前是在哪一个活动 */

    /*  2.6.3 启动活动的最佳写法 */
    public  static void actionStart (Context context, String data1,String data2){
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("param1",data1);
        intent.putExtra("param2",data2);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        /* 2.5.4 singInstance 共享实例 */
        Log.d("SecondActivity","Task id is" + getTaskId()); //打印当前SecondActivity返回栈的ID

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

//                Intent intent = new Intent();
//                intent.putExtra("data_return","Hello FirstActivity"); //把需要传递的数据存放在Intent
//
//                /**
//                 *  方法：setResult() 用于向上一个活动返回数据
//                 *  参数1：用于向上一个活动返回处理结果，一般只使用RESULT_OK或RESULT_CANCELED
//                 *  参数2：把带有数据的Intent传递回去
//                 */
//                setResult(RESULT_OK,intent);
//                finish(); //销毁当前的活动

/*************************2.5.2 singleTop ***************************/
//                Intent intent = new Intent(SecondActivity.this,FirstActivity.class);
//                startActivity(intent);

/*************************2.5.4 singInstance 共享实例 ***************************/
        Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
        startActivity(intent);

            }
        });
    }

    /* 2.5.3 singleTask */
    @Override
    protected  void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity","onDestroy");
    }
}
