package com.example.dell.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ask_for_help extends AppCompatActivity {

    String []name={"Helping Hands"};
    String []info={"Helping hangs is a non-profit NGO who support economically to the patients suffering from cancer.Helping hands is situated in kolhapur.COntact-9012345321"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_for_help);
        ListView v = (ListView) findViewById(R.id.asklist);
        CustomAdapter3 ca = new CustomAdapter3(getBaseContext(),name,info);
        v.setAdapter(ca);

    }
}
class CustomAdapter3 extends ArrayAdapter {

    String []name;
    String []info;

    public CustomAdapter3(Context c, String []name, String []info)
    {
        super(c,R.layout.showamb,R.id.textView28,name);
        this.name=name;
        this.info=info;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.askhelp,viewGroup,false);


        TextView tv=(TextView)row.findViewById(R.id.textView25);
        TextView tv1=(TextView)row.findViewById(R.id.textView26);

        tv.setText(name[i]);
        tv1.setText(info[i]);
        return row;
    }
}


