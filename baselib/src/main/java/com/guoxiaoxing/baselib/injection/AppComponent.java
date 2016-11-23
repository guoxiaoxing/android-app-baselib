package com.guoxiaoxing.baselib.injection;

import android.content.Context;

import com.guoxiaoxing.baselib.GXApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getAppContext();

    GXApplication getApp();
}