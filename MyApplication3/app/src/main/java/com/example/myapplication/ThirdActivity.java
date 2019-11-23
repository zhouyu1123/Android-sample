package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {   /* 2.6.1 BaseActivity 替换 AppCompatActivity 知晓当前是在哪一个活动 */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* 2.5.4 singInstance 共享实例 */
        Log.d("ThirdActivity","Task id is" + getTaskId()); //打印当前ThirdActivity返回栈的ID
        setContentView(R.layout.third_layout);

        /*  2.6.2 随时随地退出程序 */
       Button button3 = (Button) findViewById(R.id.button_3);
       button3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               ActivityCollertor.finishAll();

               /**
                * killProcess()方法用于杀掉一个进程它接收一个进程ID参数，
                * 我们可以通过myPid()方法获得当前的进程ID.
                * 该方法只能用于杀掉当前进程
                */
               android.os.Process.killProcess(android.os.Process.myPid());
           }
       });

    }
}
