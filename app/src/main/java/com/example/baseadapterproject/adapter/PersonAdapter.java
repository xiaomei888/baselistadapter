package com.example.baseadapterproject.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.baseadapterproject.R;
import com.example.baseadapterproject.bean.Bean;
import com.example.baseadapterproject.common.CommonListAdapter;
import com.example.baseadapterproject.common.CommonViewHolder;

import java.util.List;

/**
 * 慎   人之所以能,是因为相信自己能
 * 2019/3/26
 */
public class PersonAdapter extends CommonListAdapter<Bean> {

    public PersonAdapter(List mDatas,Context context,int layoutId) {
        super(context,layoutId);
        setmDatas(mDatas);
    }

    @Override
    public void convert(CommonViewHolder viewHolder,Bean bean) {
        viewHolder.setText(R.id.tv_name,bean.getName())
                .setText(R.id.tv_address,bean.getAddress())
                .setText(R.id.tv_age,"年龄：" + bean.getAge());
        //.setImageResource(...)
//        ((TextView) viewHolder.getView(R.id.tv_name)).setText(bean.getName());
//        ((TextView) viewHolder.getView(R.id.tv_address)).setText(bean.getAddress());
//        ((TextView) viewHolder.getView(R.id.tv_age)).setText("年龄：" + bean.getAge());
    }
}
