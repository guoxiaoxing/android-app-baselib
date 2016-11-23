package com.guoxiaoxing.baselib.injection;

import android.content.Context;
import android.support.annotation.NonNull;

import com.guoxiaoxing.baselib.GXApplication;

import dagger.Module;
import dagger.Provides;

@Module
public final class AppModule {
    @NonNull
    private final GXApplication mApp;

    public AppModule(@NonNull GXApplication app) {
        mApp = app;
    }

    @Provides
    public Context provideAppContext() {
        return mApp;
    }

    @Provides
    public GXApplication provideApp() {
        return mApp;
    }
}
