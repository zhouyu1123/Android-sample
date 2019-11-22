package com.example.administrator.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //当前的页面布局采用的是res/layout/activity_main.xml
        setContentView(R.layout.activity_main);
        //获取名叫tv_hello的TextView控件
        TextView tv_hello = findViewById(R.id.tv_hello);
        //设置控件显示的内容
        tv_hello.setText("只喜欢周瑜，不接受反驳！！！");
        //设置TextView控件文件的颜色
        tv_hello.setTextColor(Color.RED);
        //设置TextView控件的文字大小
        tv_hello.setTextSize(30);
    }
}
