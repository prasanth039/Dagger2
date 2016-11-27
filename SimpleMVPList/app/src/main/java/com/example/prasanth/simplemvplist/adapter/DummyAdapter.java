package com.example.prasanth.simplemvplist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.prasanth.simplemvplist.R;
import com.example.prasanth.simplemvplist.model.GithubUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasanth on 11/23/2016.
 */

public class DummyAdapter extends RecyclerView.Adapter {

    private List<GithubUser> users = new ArrayList<>();

    public void setUsers(List<GithubUser> users) {
        this.users.addAll(users);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dummy_item, parent, false);
        return new DummyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        DummyViewHolder dummyViewHolder = (DummyViewHolder) holder;
        dummyViewHolder.title.setText(users.get(position).getLogin());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class DummyViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        public DummyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.dummy_title);
        }
    }
}
