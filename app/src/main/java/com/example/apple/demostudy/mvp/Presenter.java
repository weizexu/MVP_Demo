package com.example.apple.demostudy.mvp;

public interface Presenter<V extends View , M extends Model> {

    /*注册view*/
    void registerView(V view);

    /*注册model*/
    void registerModel(M model);

    /*获取viw*/
    V getView();

    /*销毁*/
    void destory();
}
