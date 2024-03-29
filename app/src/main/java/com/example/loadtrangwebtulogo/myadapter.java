package com.example.loadtrangwebtulogo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import java.util.ArrayList;

public class myadapter extends  BaseAdapter{
    private ArrayList<Integer> list = new ArrayList<>();
    private Context context;
    public myadapter(ArrayList<Integer> list,Context context){
        this.list = list;
        this.context = context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(this.context);
        imageView.setImageResource(list.get(i));
        imageView.setScaleType(ImageView.ScaleType.FIT_END);
        imageView.setLayoutParams(new Gallery.LayoutParams(200,200));
        return imageView;
    }
}
