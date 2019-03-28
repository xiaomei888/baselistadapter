package com.example.baseadapterproject.common;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 慎   人之所以能,是因为相信自己能
 * 2019/3/28
 */
public class CommonRecyclerViewHolder extends RecyclerView.ViewHolder {

    public View mItemView;
    private SparseArray<View> mViews;

    public CommonRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        mViews = new SparseArray<>();
        this.mItemView = itemView;
    }

    public View getView(int viewId) {
        View view = mViews.get(viewId);
        if(view == null){
            view = mItemView.findViewById(viewId);
            mViews.put(viewId,view);
        }
        return view;
    }

    public CommonRecyclerViewHolder setText(int viewId,String text){
        ((TextView)getView(viewId)).setText(text);
        return this;
    }

    public CommonRecyclerViewHolder setImageResource(int viewId,int resId){
        ((ImageView)getView(viewId)).setImageResource(resId);
        return this;
    }
}
