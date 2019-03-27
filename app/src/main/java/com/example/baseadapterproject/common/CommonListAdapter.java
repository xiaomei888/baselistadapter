package com.example.baseadapterproject.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.baseadapterproject.R;
import com.example.baseadapterproject.bean.Bean;

import java.util.List;

/**
 * 慎   人之所以能,是因为相信自己能
 * 2019/3/27
 */
public abstract class CommonListAdapter<T> extends BaseAdapter {
    //泛型List
    private List<T> mDatas;
    private Context mContext;

    public void setmDatas(List<T> mDatas) {
        this.mDatas = mDatas;
    }

    public CommonListAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return (mDatas == null)?0:mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        CommonViewHolder viewHolder = CommonViewHolder.get(mContext, convertView, parent, position, R.layout.item_list);
        T bean = mDatas.get(position);

        convert(viewHolder,bean);

        return viewHolder.getConvertView();
    }

    public abstract void convert(CommonViewHolder viewHolder,T bean);
}
