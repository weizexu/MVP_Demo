package com.example.apple.demostudy;

import com.example.apple.demostudy.mvp.BasePresenter;
import com.example.apple.demostudy.mvp.Presenter;

public class LoginPresenter  extends BasePresenter<LoginView,LoginModel> {

    public void getData(){
        String name = "";
        if(model != null){
            name = model.getName();

        }
        if(getView() != null){
            getView().showToast(name);
        }
    }

    @Override
    protected void onViewDestory() {
        if(model != null)
        {
            model.stop();
        }
    }
}
