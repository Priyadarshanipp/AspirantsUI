package com.example.dell.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Main11Activity extends AppCompatActivity {

    String[] title = {"asdf", "afgt", "thujd"};
    int[] images = {R.drawable.ic_menu_camera, R.drawable.ic_menu_gallery, R.drawable.ic_menu_send};
    String[] des = {"hello pranjali", "ghvfgh", "fghjvc"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmain);
        ListView v = (ListView) findViewById(R.id.ListViewb);
        CustomAdapter ca = new CustomAdapter(getBaseContext(), title, images, des);
        v.setAdapter(ca);


    }
}
    class CustomAdapter extends ArrayAdapter{

        int []imgArr;
        String []titleArr;
        String []desArr;
        public CustomAdapter(Context c,String []title,int []img,String []des)
        {
            super(c,R.layout.blogdesign,R.id.textView22,title);
            this.imgArr=img;
            this.desArr=des;
            this.titleArr=title;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row=inflater.inflate(R.layout.blogdesign,viewGroup,false);


            ImageView iv=(ImageView)row.findViewById(R.id.imageView7);
            TextView tv=(TextView)row.findViewById(R.id.textView22);
            TextView tv2=(TextView)row.findViewById(R.id.textView14);
            iv.setImageResource(imgArr[i]);
            tv.setText(titleArr[i]);
            tv2.setText(desArr[i]);
            return row;
        }
    }


