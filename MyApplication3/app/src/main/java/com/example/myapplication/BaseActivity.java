/**
 * 2.6.1 知晓当前是在哪一个活动
 */
package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle saveInstanceState) {  //在onCreate() 方法中获取了当前的实例的类名，并打印
        super.onCreate(saveInstanceState);
        Log.d("BaseActivity", getClass().getSimpleName());
    }
}
