package com.vikra.mmovie.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.vikra.mmovie.model.NavigationDrawerItemModel;

import java.util.ArrayList;

/**
 * Created by raditya on 12/5/2014.
 */
public class NavigationDrawerListAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<NavigationDrawerItemModel> mNavigationDrawerItemModel;

    public NavigationDrawerListAdapter(Context context, ArrayList<NavigationDrawerItemModel> navigationDrawerItemModel){
        this.mContext = context;
        this.mNavigationDrawerItemModel = navigationDrawerItemModel;
    }

    @Override
    public int getCount() {
        return mNavigationDrawerItemModel.size();
    }

    @Override
    public Object getItem(int position) {
        return mNavigationDrawerItemModel.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
