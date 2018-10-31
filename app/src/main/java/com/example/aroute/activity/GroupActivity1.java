package com.example.aroute.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.aroute.R;

/**
 * @author zcm
 * @create 2018/10/30
 * @Describe
 */
@Route(path = "/test/GroupActivity1",group = "com")
public class GroupActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        TextView textView = (TextView)findViewById(R.id.txt);
        textView.setText("groupactivity");
    }
}
