package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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

/*************************2.2.6  销毁活动***************************/

              //  finish();//点击一下按钮，当前的活动就被成功销毁

/*************************2.3.1 显示Intent***************************/
                /**
                 * 函数：Intent(Context packageContext,Class<?> cls)
                 * 参数Context: 要求提供一个启动活动的上下文
                 * 参数Class： 则是指定我们想要启动的目标活动
                 */
               // Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                /**
                 * 类：Activity
                 * 方法：startActivity()
                 * 该方法功能： 专门用于启动活动的，它接收一个Intent参数，
                 * 这里我们将构建好的Intent传入startActivity()方法就可以启动目标活动
                 */
                //startActivity(intent);

/*************************2.3.2 隐示Intent***************************/
//            Intent intent = new Intent("com.example.myapplication.ACTION_START");
//            //每个Intent中，只能指定一个action,但是可以指定多个category.
//           intent.addCategory("com.example.myapplication.MY_CATEGORY");
//            startActivity(intent);
/*************************2.3.3 更多隐式Intent用法***************************/
            /**
             * Intent.ACTION_VIEW 这是Andriod系统内置的动作,其常量值为，
             * android.intent.action.VIEW。然后，通过Uri.pares()方法，
             * 将一个网址字符串解析成一个Uri对象，再调用Intent的setData()方法将
             * 这个Uri对象传递进去。
             */
            //打开一个网页
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("http:www.baidu.com"));
//            startActivity(intent);
            /**
             * tel表示拨打电话，调用系统的拨号界面
             * 首先，指定了Intent的action是Intent.ACTION_DIAL,这是
             * Android 系统内置的动作。然后在data部分指定了协议tel.号码是10086.
             */
//            Intent intent = new Intent(Intent.ACTION_DIAL);
//            intent.setData(Uri.parse("tel:10086"));
//            startActivity(intent);

/*************************2.3.4 向下一个活动传递数据***************************/
//            String data = "Hello SecondActivity";
//            Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                /**
//                 * 方法：putExtra()
//                 * 参数name:键
//                 * 参数value: 传递的数据
//                 */
//            intent.putExtra("extra_data",data);
//            startActivity(intent);

/*************************2.3.5 返回数据给上一个活动***************************/
            /**
             * 方法：startActivityForResult()
             * 参数1:Intent
             * 参数2：请求码，用于在之后的回调中判断数据的来源
             */
            Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
            startActivityForResult(intent,1); //请求码，是一个唯一的值，这里传入1.

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

    /**
     *  由于使用startActivityForResult()方法来启动的SecondActivity,在SecondActivity销毁
     *  之后会回调一个活动的OnActivityResult()方法，因此需要重写这个方法得到返回的数据
     *
     *  参数requestCode：即我们启动活动时传入的请求码
     *  参数resultCode: 即我们在返回数据时，传入的处理结果
     *  参数data: 即携带着返回数据的Intent
     */
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){

        switch (requestCode){

            case 1:

                if (resultCode == RESULT_OK){
                    Log.d("1123","zhouyu");
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);

                }
                break;
            default:
        }
    }
}
