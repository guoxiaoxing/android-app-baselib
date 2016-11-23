package com.guoxiaoxing.baselib.presenter.loader;

import android.support.annotation.NonNull;

import com.guoxiaoxing.baselib.presenter.BasePresenter;

/**
 * Factory to implement to create a presenter
 */
public interface PresenterFactory<T extends BasePresenter> {
    @NonNull
    T create();
}
