package com.example.apple.demostudy.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseMvpActivity<V extends View , M extends Model , P extends BasePresenter>
        extends AppCompatActivity implements BaseMvp<V,M,P> {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
        if(presenter != null)
        {
            presenter.registerModel(createModel());
            presenter.registerView(createView());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null)
        {
            presenter.destory();
        }
    }
}
