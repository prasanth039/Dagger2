package com.example.prasanth.simplemvplist.DaggerTest;

import com.example.prasanth.simplemvplist.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Prasanth on 11/26/2016.
 */
@Component(modules = {ModelModule.class})
@Singleton
public interface AppComponent {
    void inject(HomeActivity activity);
}
