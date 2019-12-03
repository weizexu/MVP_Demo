package com.example.apple.demostudy;

import android.util.Log;

public class LoginModelmpl implements LoginModel {
    @Override
    public String getName() {
        return "张三123";
    }

    @Override
    public void stop() {
        Log.e("stop", "stop: " );
    }
}
