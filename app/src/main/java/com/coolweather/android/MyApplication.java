package com.coolweather.android;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

import org.litepal.LitePalApplication;


public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.initialize(context);
        Stetho.initializeWithDefaults(this);
    }
}
