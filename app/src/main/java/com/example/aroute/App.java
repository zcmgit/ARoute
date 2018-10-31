package com.example.aroute;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author zcm
 * @create 2018/10/30
 * @Describe
 */
public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);
    }
}
