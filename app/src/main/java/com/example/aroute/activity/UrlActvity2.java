package com.example.aroute.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.aroute.R;

/**
 * @author zcm
 * @create 2018/10/31
 * @Describe
 */
@Route(path = "/test/UrlActivity2")
public class UrlActvity2 extends AppCompatActivity{
    @Autowired
    String name;

    @Autowired
    int age;

    @Autowired
    boolean boy;

    @Autowired
    int high;

    @Autowired
    String obj ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity1);
        TextView textView = (TextView) findViewById(R.id.txt);

        //解析参数
        Bundle bundle = getIntent().getExtras();
        String name1 = bundle.getString("name");

        textView.setText("参数是： " + "name: " + name + "  age: " + age
                + " boy: " + boy + " name1: " + name1 + " obj: " + obj.toString() );
    }
}
