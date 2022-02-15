package com.example.proxydemo.staticproxy;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proxydemo.R;
import com.example.proxydemo.common.Person;

public class StaticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static);
    }
    
    public void onTest(View v) {
        //被代理的学生张三，他的班费上交有代理对象monitor（班长）完成
        Person zhangsan = new Student("张三");

        //生成代理对象，并将张三传给代理对象
        Person monitor = new StudentsProxy(zhangsan);

        //班长代理上交班费
        monitor.giveMoney();
    }
    
}