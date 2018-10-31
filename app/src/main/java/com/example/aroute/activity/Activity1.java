package com.example.aroute.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.aroute.R;

/**
 * @author zcm
 * @create 2018/10/30
 * @Describe
 */
@Route( path = "/test/Activity1")
public class Activity1 extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        Intent intent = getIntent();
        String content = intent.getStringExtra("str_info");
        Log.d("route","接收到的信息=="+content);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                String str = data.getStringExtra("str_info");
                Log.d("route","接收到的信息=="+str);
                break;
        }
    }
}
