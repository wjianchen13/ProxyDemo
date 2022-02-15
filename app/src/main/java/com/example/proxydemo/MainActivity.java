package com.example.proxydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.proxydemo.dynamicproxy.DynamicActivity;
import com.example.proxydemo.staticproxy.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onStatic(View v) {
        startActivity(new Intent(this, StaticActivity.class));
    }

    public void onDynamic(View v) {
        startActivity(new Intent(this, DynamicActivity.class));
    }
    
}