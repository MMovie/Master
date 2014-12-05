package com.vikra.mmovie.model;

/**
 * Created by raditya on 12/5/2014.
 */
public class NavigationDrawerItemModel {

    private String title;
    private int icon;

    public NavigationDrawerItemModel(){}

    public NavigationDrawerItemModel(String title, int icon){
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
