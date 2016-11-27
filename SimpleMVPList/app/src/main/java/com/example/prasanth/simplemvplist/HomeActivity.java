package com.example.prasanth.simplemvplist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;

import com.example.prasanth.simplemvplist.adapter.DummyAdapter;
import com.example.prasanth.simplemvplist.model.GithubUser;

import java.util.List;

import javax.inject.Inject;

public class HomeActivity extends AppCompatActivity implements Contract.View {

    private Contract.Presenter presenter;
    private RecyclerView recyclerView;
    private DummyAdapter adapter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = (RecyclerView) findViewById(R.id.dummy_list);
        progressBar = (ProgressBar) findViewById(R.id.progress_spinner);
        progressBar.setVisibility(View.VISIBLE);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        adapter = new DummyAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ((App)getApplication()).getAppComponent().inject(this);
    }

    @Inject
    public void setPresenter(PresenterImpl presenter) {
        this.presenter = presenter;
        presenter.bindView(this);
        presenter.onViewLoaded();
    }

    @Override
    public void showUserList(List<GithubUser> list) {
        progressBar.setVisibility(View.GONE);
        adapter.setUsers(list);
        adapter.notifyDataSetChanged();
    }
}
