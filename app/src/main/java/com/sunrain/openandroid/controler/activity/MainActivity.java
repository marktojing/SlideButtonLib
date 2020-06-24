package com.sunrain.openandroid.controler.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import pub.devrel.easypermissions.EasyPermissions;

import android.os.Build;
import android.os.Bundle;

import com.sunrain.openandroid.R;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        MyView myView = new MyView(this);
//        myView.setExampleString("测试");
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode,permissions,grantResults);
    }
}
