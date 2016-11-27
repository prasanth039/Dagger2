package com.example.prasanth.simplemvplist;

import com.example.prasanth.simplemvplist.model.GithubUser;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Prasanth on 11/23/2016.
 */
public class PresenterImpl implements Contract.Presenter {
    private Contract.Model model;
    private Contract.View view;

    @Override
    public void bindView(Contract.View view) {
        this.view = view;
    }

    @Inject
    public PresenterImpl(Contract.Model model) {
        this.model = model;
    }

    @Override
    public void onViewLoaded() {
        model.getUserList().enqueue(new Callback<List<GithubUser>>() {
            @Override
            public void onResponse(Call<List<GithubUser>> call, Response<List<GithubUser>> response) {
                view.showUserList(response.body());
            }

            @Override
            public void onFailure(Call<List<GithubUser>> call, Throwable t) {

            }
        });
    }
}
