package com.example.apple.demostudy;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.apple.demostudy.mvp.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<LoginView,LoginModel,LoginPresenter> implements LoginView {


    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.mtv);
        presenter.getData();
    }

    @Override
    public void showToast(String msg) {
        textView.setText(msg);
    }

    @Override
    public LoginModel createModel() {
        return new LoginModelmpl();
    }

    @Override
    public LoginView createView() {
        return this;
    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }
}