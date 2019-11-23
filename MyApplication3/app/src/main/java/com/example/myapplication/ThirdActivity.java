package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends BaseActivity {   /* 2.6.1 BaseActivity 替换 AppCompatActivity 知晓当前是在哪一个活动 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* 2.5.4 singInstance 共享实例 */
        Log.d("ThirdActivity","Task id is" + getTaskId()); //打印当前ThirdActivity返回栈的ID
        setContentView(R.layout.third_layout);
    }
}
