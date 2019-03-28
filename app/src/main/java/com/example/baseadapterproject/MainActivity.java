package com.example.baseadapterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.baseadapterproject.adapter.PersonAdapter;
import com.example.baseadapterproject.bean.Bean;
import com.example.baseadapterproject.common.CommonListAdapter;
import com.example.baseadapterproject.common.CommonViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv_main;
    private List<Bean> mList;
    private PersonAdapter mAdapter;
    private CommonListAdapter mCommonListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_main = findViewById(R.id.lv_main);

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
//        mAdapter = new PersonAdapter(mList, this);
        mCommonListAdapter = new CommonListAdapter<Bean>(MainActivity.this,R.layout.item_list) {
            @Override
            public void convert(CommonViewHolder viewHolder, Bean bean) {
                viewHolder.setText(R.id.tv_name,bean.getName())
                        .setText(R.id.tv_address,bean.getAddress())
                        .setText(R.id.tv_age,"年龄：" + bean.getAge());
            }
        };
        mCommonListAdapter.setmDatas(mList);
        lv_main.setAdapter(mCommonListAdapter);
    }
}
