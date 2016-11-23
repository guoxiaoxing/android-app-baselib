package com.guoxiaoxing.baselib;

import android.app.Application;
import android.support.annotation.NonNull;

import com.guoxiaoxing.baselib.injection.AppComponent;
import com.guoxiaoxing.baselib.injection.AppModule;
import com.guoxiaoxing.baselib.injection.DaggerAppComponent;

public final class GXApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    @NonNull
    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}