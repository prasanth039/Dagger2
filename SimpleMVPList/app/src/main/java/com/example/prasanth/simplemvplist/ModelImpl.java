package com.example.prasanth.simplemvplist;

import com.example.prasanth.simplemvplist.model.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Prasanth on 11/23/2016.
 */

public class ModelImpl implements Contract.Model {
    private GithubService githubService;

    public ModelImpl() {
        Retrofit retrofit = new Retrofit.Builder()
                // Base URL can change for endpoints (dev, staging, live..)
                .baseUrl("https://api.github.com")
                // Takes care of converting the JSON response into java objects
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        githubService = retrofit.create(GithubService.class);
    }

    @Override
    public Call<List<GithubUser>> getUserList() {
        return githubService.getUserList();
    }
}
