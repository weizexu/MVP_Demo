package com.example.apple.demostudy.mvp;

public interface BaseMvp<V extends View , M extends Model , P extends BasePresenter> {

    M createModel();

    V createView();

    P createPresenter();
}
