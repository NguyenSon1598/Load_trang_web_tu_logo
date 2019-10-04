package com.example.loadtrangwebtulogo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //String arr[]={"Ipad","Iphone","New Ipad","SamSung","Nokia","Sony Ericson","LG","Q-Mobile","HTC","HK Phone,","Blackerry",
     //       "G Phone","FPT-phone"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> lstimg = new ArrayList<Integer>();
        lstimg.add(R.drawable.h1);
        lstimg.add(R.mipmap.h2);
        lstimg.add(R.mipmap.h3);
        lstimg.add(R.mipmap.h4);
        lstimg.add(R.mipmap.h5);
        lstimg.add(R.mipmap.h6);
        lstimg.add(R.mipmap.h7);
        lstimg.add(R.mipmap.h8);
        lstimg.add(R.mipmap.h9);
        lstimg.add(R.mipmap.h10);
        final GridView gv =(GridView)findViewById(R.id.gridView1);
        myadapter da = new myadapter(lstimg,MainActivity.this);
        gv.setAdapter(da);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
