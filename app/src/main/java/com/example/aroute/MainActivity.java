package com.example.aroute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.aroute.activity.service.IService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Autowired(name = "/service/Service1")
    IService service;

    @Autowired(name = "/service/Service2")
    IService service2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.activity_drump).setOnClickListener(this);
        findViewById(R.id.group_drump).setOnClickListener(this);
        findViewById(R.id.url_drump).setOnClickListener(this);
        findViewById(R.id.service_drump_1).setOnClickListener(this);
        findViewById(R.id.service_drump_2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_drump:
                //不传参跳转
//                ARouter.getInstance().build("/test/Activity1").navigation();
                //传参跳转
//                ARouter.getInstance().build("/test/Activity1").withString("str_info","str_info_content").navigation();
                //
                ARouter.getInstance().build("/test/Activity1").withString("str_info","str_info_content").navigation(this,1);
                break;
            case R.id.group_drump:
                ARouter.getInstance().build("/test/GroupActivity1", "com").navigation();
                break;
            case R.id.url_drump:
                ARouter.getInstance().build("/test/WebActivity").navigation();
                break;
            case R.id.service_drump_1:
                ARouter.getInstance().inject(this);
                service.sayHello(this);
                break;
            case R.id.service_drump_2:
                service2.sayHello(this);
                break;
        }
    }
}
