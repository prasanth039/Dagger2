package com.example.prasanth.simplemvplist;

import android.app.Application;

import com.example.prasanth.simplemvplist.DaggerTest.AppComponent;
import com.example.prasanth.simplemvplist.DaggerTest.DaggerAppComponent;

/**
 * Created by Prasanth on 11/26/2016.
 */

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
