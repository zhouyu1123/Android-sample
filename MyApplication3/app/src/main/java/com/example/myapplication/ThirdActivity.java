package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* 2.5.4 singInstance 共享实例 */
        Log.d("ThirdActivity","Task id is" + getTaskId()); //打印当前ThirdActivity返回栈的ID
        setContentView(R.layout.third_layout);
    }
}
