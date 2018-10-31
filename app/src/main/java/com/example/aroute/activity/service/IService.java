package com.example.aroute.activity.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author zcm
 * @create 2018/10/31
 * @Describe
 */
public interface IService extends IProvider {
    void sayHello(Context context);
}
