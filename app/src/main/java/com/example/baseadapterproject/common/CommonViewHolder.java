package com.example.baseadapterproject.common;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 慎   人之所以能,是因为相信自己能
 * 打造万能adapter   之ViewHolder
 * 2019/3/26
 */
public class CommonViewHolder {

    private SparseArray<View> mViews;
    private View mConvertView;
    private int mPosition;

    public CommonViewHolder(Context mContext, ViewGroup parent, int position, int resId) {
        this.mPosition = position;
        mViews = new SparseArray<>();
        mConvertView = LayoutInflater.from(mContext).inflate(resId, parent, false);
        mConvertView.setTag(this);
    }

    public static CommonViewHolder get(Context mContext, View convertView, ViewGroup parent, int position, int resId) {
        if (convertView == null) {
            return new CommonViewHolder(mContext, parent, position, resId);
        } else {
            CommonViewHolder viewHolder = (CommonViewHolder) convertView.getTag();
            viewHolder.mPosition = position;
            return viewHolder;
        }
    }

    /**
     * 通过VIewid获取控件
     *
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T getView(int viewId) {
        T view = (T) mViews.get(viewId);
        if (view == null) {
            view = (T) mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return view;
    }

    public  CommonViewHolder setText(int viewId,String text){
        ((TextView)getView(viewId)).setText(text);
        return this;
    }

    public CommonViewHolder setImageResource(int viewId,int resId){
        ((ImageView)getView(viewId)).setImageResource(resId);
        return this;
    }


    public View getConvertView() {
        return mConvertView;
    }
}
