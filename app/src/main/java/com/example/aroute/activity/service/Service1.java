package com.example.aroute.activity.service;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @author zcm
 * @create 2018/10/31
 * @Describe
 */
@Route(path = "/service/Service1",name = "service1")
public class Service1 implements IService{
    @Override
    public void sayHello(Context context) {
        Toast.makeText(context,"service1 hello",Toast.LENGTH_LONG).show();
    }

    @Override
    public void init(Context context) {

    }
}
