package com.example.dell.myapplication;

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
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class Main9Activity extends AppCompatActivity {

    ArrayList<String> sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mtmain);
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
        ListView lv=(ListView)findViewById(R.id.Listview3);
        lv.setAdapter(a);
        lv=(ListView)findViewById(R.id.Listview3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,sv);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                gotoinfo();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.terms_menu,menu);

        MenuItem searchitem=menu.findItem(R.id.item_search3);
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
                ArrayAdapter<String> a=new ArrayAdapter<String>(Main9Activity.this,android.R.layout.simple_list_item_1,temp);
                ListView lv=(ListView)findViewById(R.id.Listview3);
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


    private void gotoinfo() {
        Intent i=new Intent(this,mtexplain.class);
        startActivity(i);
    }
}
