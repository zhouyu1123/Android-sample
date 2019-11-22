package com.example.activitylifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG , "onCreate");
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            Log.d(TAG , "activity_main savedInstanceState");
            String tempData = savedInstanceState.getString("data_key");
            Log.d(TAG , tempData);
        }
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_Dialog_activity);

        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });


        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
                Log.d(TAG , "onClick");
            }
        });
    }


    @Override
    protected  void onStart() {
        super.onStart();
        Log.d(TAG , "onStart");
    }


    @Override
    protected  void onResume() {
        super.onResume();
        Log.d(TAG , "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG , "onPause");
    }


    @Override
    protected  void onStop() {
        super.onStop();
        Log.d(TAG , "onStop");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG , "onDestroy");
    }

    @Override
    protected  void onRestart() {
        super.onRestart();
        Log.d(TAG , "onRestart");
    }

    /**
     * 方法onSaveInstancestate()
     * @param outState ： Bundle 提供了一系列的方法用于保存数据
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "Something you just typed";
        /**
         *  使用putString() 方法保存字符串，putInt保存整形数据，以此类推
         *  每个方法有两个参数：
         *  参数1：键，用于后面Bundle中取值
         *  参数2：真正需要保存的内容
         */
        outState.putString("data_key",tempData);
        Log.d(TAG ,"putString");
    }
}
