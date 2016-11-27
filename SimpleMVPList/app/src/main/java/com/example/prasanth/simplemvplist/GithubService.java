package com.example.prasanth.simplemvplist;

import com.example.prasanth.simplemvplist.model.GithubUser;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Prasanth on 11/23/2016.
 */

public interface GithubService {
    @GET("users")
    Call<List<GithubUser>> getUserList();
}
