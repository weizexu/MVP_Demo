package com.example.apple.demostudy.mvp;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<V extends View , M extends Model> implements Presenter<V,M>{

    private WeakReference<V> wrf;

    protected M model;

    @Override
    public void registerView(V view) {
        wrf = new WeakReference<V>(view);
    }

    @Override
    public void registerModel(M model) {
        this.model = model;
    }

    @Override
    public V getView() {
        return wrf == null ? null : wrf.get();
    }

    @Override
    public void destory() {
        if(wrf != null)
        {
            wrf.clear();
            wrf = null;
            onViewDestory();
        }
    }

    protected abstract void onViewDestory();
}
