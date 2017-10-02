package com.example.dell.myapplication;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Main7Activity extends AppCompatActivity {

    ArrayList<String> sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dismain);
        sv=new ArrayList<>();
        sv.add("One");
        sv.add("Two");
        sv.add("T");
        sv.add("fwo");
        sv.add("ghwo");
        sv.add("kjo");
        sv.add("Trto");
        sv.add("qwd");

        ArrayAdapter<String> a=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sv);
        ListView lv=(ListView)findViewById(R.id.ListView2);
        lv.setAdapter(a);
        lv=(ListView)findViewById(R.id.ListView2);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,sv);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                gotodinfo();
            }
        });

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.disease_menu,menu);

        MenuItem searchitem=menu.findItem(R.id.item_search2);
        SearchView searchView=(SearchView) MenuItemCompat.getActionView(searchitem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){

            @Override
            public boolean onQueryTextSubmit(String query) {
                ArrayList<String> temp=new ArrayList<String>();
                for(String tmp:sv)
                {
                    if(tmp.toLowerCase().equalsIgnoreCase(query.toLowerCase()))
                    {
                        temp.add(tmp);
                    }
                }
                ArrayAdapter<String> a=new ArrayAdapter<String>(Main7Activity.this,android.R.layout.simple_list_item_1,temp);
                ListView lv=(ListView)findViewById(R.id.ListView2);
                lv.setAdapter(a);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }

    public void gotodinfo( )
    {
        Intent in=new Intent(this,Main8Activity.class);
        startActivity(in);
    }
}
