package com.example.prasanth.simplemvplist.DaggerTest;

import com.example.prasanth.simplemvplist.Contract;
import com.example.prasanth.simplemvplist.ModelImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Prasanth on 11/26/2016.
 */

@Module
public class ModelModule {

    @Provides
    public Contract.Model providesModel() {
        return new ModelImpl();
    }
}
