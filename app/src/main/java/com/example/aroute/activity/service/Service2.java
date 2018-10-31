package com.example.aroute.activity.service;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @author zcm
 * @create 2018/10/31
 * @Describe
 */
@Route(path = "/service/Service2",name = "service2")
public class Service2 implements IService{
    @Override
    public void sayHello(Context context) {
        Toast.makeText(context,"service2 hello",Toast.LENGTH_LONG).show();
    }

    @Override
    public void init(Context context) {

    }
}
