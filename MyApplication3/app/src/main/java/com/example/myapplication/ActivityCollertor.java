/**
 * 2.6.2 随时随地退出程序 专门的集合类对所有的活动进行管理
 */
package com.example.myapplication;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollertor {
    public static List<Activity> activities = new ArrayList<>(); //通过一个List来管理活动

    /* 提供一个addActivity() 方法用来向List中添加一个活动 */
    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    /* removeActivity() 方法用来向List中移除一个活动 */
    public static void  removeActivity(Activity activity) {
        activities.remove(activity);
    }

    /* finishAll() 方法用来向List中销魂每一个活动 */
    public static void finishAll() {
        for (Activity activity : activities)
        {
            if (! activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}
