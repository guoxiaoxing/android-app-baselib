package com.guoxiaoxing.baselib.presenter.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.guoxiaoxing.baselib.presenter.GXPresenter;

/**
 * Abstract presenter implementation that contains base implementation for other presenters.
 * Subclasses must call super for all {@link GXPresenter} method overriding.
 */
public abstract class GXPresenterImpl<V> implements GXPresenter<V> {
    /**
     * The view
     */
    @Nullable
    protected V mView;

    @Override
    public void onViewAttached(@NonNull V view) {
        mView = view;
    }


    @Override
    public void onStart(boolean firstStart) {

    }

    @Override
    public void onStop() {

    }


    @Override
    public void onViewDetached() {
        mView = null;
    }

    @Override
    public void onPresenterDestroyed() {

    }
}
