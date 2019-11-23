package com.example.uiwidgettest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /* 3.2.3  Edittext */
    private EditText editText;

    /* 3.2.4 ImageView */
    private ImageView imageView;

    /* 3.2.5 ProgressBar */
    private ProgressBar progressBar;

     String TAG = "mainActivityTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* 3.2.5 ProgressBar */
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        /* 3.2.4 ImageView */
        imageView = (ImageView) findViewById(R.id.image_view);


        /* 3.2.3  Edittext */
        editText = (EditText) findViewById(R.id.edit_text);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /* 3.2.5 ProgressBar */
//                if (progressBar.getVisibility() == View.GONE){
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);

                /* 3.2.4 ImageView */
                imageView.setImageResource(R.drawable.image2);
                Log.d(TAG ,"这是一个测试按键！");

                /* 3.2.3  Edittext */
                /**
                 *  首先，通过findViewById()方法得到EditText的实例，
                 *  然后，在按钮的点击事件里调用EdiText的getText()方法
                 *  获取到输入的内容，再调用toString()方法转换成为字符串。
                 *  最后，使用Toast将输入的内容显示出来。
                 */
                String inputText = editText.getText().toString();
                Toast.makeText(MainActivity.this,inputText,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
