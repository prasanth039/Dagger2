package com.example.prasanth.simplemvplist;

import com.example.prasanth.simplemvplist.model.GithubUser;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Prasanth on 11/22/2016.
 */

public interface Contract {
    interface Model {
        Call<List<GithubUser>> getUserList();
    }

    interface Presenter {
        void bindView(View view);

        void onViewLoaded();
    }

    interface View {
        void showUserList(List<GithubUser> list);
    }
}
