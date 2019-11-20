package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1); //获取布局文件中定义的元素
        button1.setOnClickListener(new View.OnClickListener() {   //按钮注册一个监听器
            @Override
            public void onClick(View v) {      // 点击按钮时，就会执行监听器onClick方法
                /**
                 *  函数: makeTest() 创建一个Toast对象
                 *  参数1：Toast要求的上下文
                 *  参数2： 显示文本的内容
                 *  参数3：显示的时常
                 */
                Toast.makeText(FirstActivity.this,"you clicked Button 1",
                Toast.LENGTH_SHORT).show();
            }
        });
    }
}
