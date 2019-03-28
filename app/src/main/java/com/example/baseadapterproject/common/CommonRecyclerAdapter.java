package com.example.baseadapterproject.common;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.baseadapterproject.bean.Bean;

import java.util.List;

/**
 * 慎   人之所以能,是因为相信自己能
 * 2019/3/28
 */
public abstract class CommonRecyclerAdapter<T> extends RecyclerView.Adapter<CommonRecyclerViewHolder> {

    private List<T> mDatas;
    private int mLayoutId;
    private Context mContext;

    public void setDatas(List<T> datas) {
        this.mDatas = datas;
        this.notifyDataSetChanged();
    }

    public CommonRecyclerAdapter(int mLayoutId, Context mContext) {
        this.mLayoutId = mLayoutId;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public CommonRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View convertView = LayoutInflater.from(mContext).inflate(mLayoutId, null);
        return new CommonRecyclerViewHolder(convertView);
    }

    @Override
    public int getItemCount() {
        return (mDatas == null) ? 0 : mDatas.size();
    }

    @Override
    public void onBindViewHolder(@NonNull CommonRecyclerViewHolder viewHolder, int i) {
        T bean = mDatas.get(i);
        convert(viewHolder,i,bean);
    }

    public abstract void convert(CommonRecyclerViewHolder viewHolder,int position,T bean);
}
