package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
                 *  函数: makeTest()
                 *  功能：创建一个Toast对象
                 *  参数1：Toast要求的上下文
                 *  参数2： 显示文本的内容
                 *  参数3：显示的时常,有2两个内置参数选择，Toast.LENGTH_SHORT和Toast.LENGTH_LONG.
                 */
              //  Toast.makeText(FirstActivity.this,"you clicked Button 1",
              //    Toast.LENGTH_LONG).show();
              //  finish();//点击一下按钮，当前的活动就被成功销毁

                /**
                 * 函数：Intent(Context packageContext,Class<?> cls)
                 * 参数Context: 要求提供一个启动活动的上下文
                 * 参数Class： 则是指定我们想要启动的目标活动
                 */
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                /**
                 * 类：Activity
                 * 方法：startActivity()
                 * 该方法功能： 专门用于启动活动的，它接收一个Intent参数，
                 * 这里我们将构建好的Intent传入startActivity()方法就可以启动目标活动
                 */
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //重写方法 onCreateOptionsMenu
        /**
         *  函数： getMenuInflater()
         *  功能：能够得到getMenuInflater对象
         *  inflate接收两个参数
         *  参数1:用于指定我们通过哪个资源文件夹来创建菜单
         *  参数2：用于指定我们的菜单项将添加到哪一个Menu对象中
         *  返回：Ture,表示允许创建的菜单显示出来，false无法显示
         */
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    /**
     * 函数： onOptionsItemSelected()
     * 功能： 菜单响应事件
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){ //通过调用getItemID来判断点击的是哪个菜单
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }
}
