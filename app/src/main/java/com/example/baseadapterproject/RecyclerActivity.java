package com.example.baseadapterproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.baseadapterproject.R;
import com.example.baseadapterproject.adapter.PersonRecyclerAdapter;
import com.example.baseadapterproject.bean.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 慎   人之所以能,是因为相信自己能
 * 2019/3/27
 */
public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Bean> mList;
    private LinearLayoutManager manager;
    private PersonRecyclerAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycler);
        mRecyclerView = findViewById(R.id.recycler);

        initData();

        initView();

    }

    private void initData() {
        mList = new ArrayList<>();
        mList.add(new Bean("xiaoming 1", "湖南省长沙市天心区", 18));
        mList.add(new Bean("xiaoming 2", "湖南省长沙市天心区", 18));
        mList.add(new Bean("xiaoming 3", "湖南省长沙市天心区", 18));
        mList.add(new Bean("xiaoming 4", "湖南省长沙市天心区", 18));
        mList.add(new Bean("xiaoming 5", "湖南省长沙市天心区", 18));
        mList.add(new Bean("xiaoming 6", "湖南省长沙市天心区", 18));
    }

    private void initView() {
        if (manager == null)
            manager = new LinearLayoutManager(this);
        if (mAdapter == null)
            mAdapter = new PersonRecyclerAdapter(R.layout.item_list,this);
        mAdapter.setData(mList);
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
