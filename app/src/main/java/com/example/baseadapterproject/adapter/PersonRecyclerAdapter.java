package com.example.baseadapterproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.baseadapterproject.R;
import com.example.baseadapterproject.bean.Bean;
import com.example.baseadapterproject.common.CommonRecyclerAdapter;
import com.example.baseadapterproject.common.CommonRecyclerViewHolder;

import java.util.List;

/**
 * 慎   人之所以能,是因为相信自己能
 * 2019/3/27
 */
public class PersonRecyclerAdapter extends CommonRecyclerAdapter<Bean> {

    public void setData(List<Bean> data) {
        setDatas(data);
    }

    public PersonRecyclerAdapter(int layoutId, Context context) {
        super(layoutId, context);
    }

    @Override
    public void convert(CommonRecyclerViewHolder viewHolder, int position, Bean bean) {
        if (bean != null) {
            viewHolder.setText(R.id.tv_name,bean.getName());
            viewHolder.setText(R.id.tv_address,bean.getAddress());
            viewHolder.setText(R.id.tv_age,"年龄：" + bean.getAge());
        }
    }
}
