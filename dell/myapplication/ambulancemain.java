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

public class ambulancemain extends AppCompatActivity {


    String []name={"sangli Ambulance services"};
    String []contact={"90123456778"};
    String []Address={"civil road sangli"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulancemain);
        ListView v = (ListView) findViewById(R.id.ambList);
        CustomAdapter2 ca = new CustomAdapter2(getBaseContext(),name,Address,contact);
        v.setAdapter(ca);

    }

   }

class CustomAdapter2 extends ArrayAdapter {

    String []ambaname;
    String []acontact;
    String []aaddress;
    public CustomAdapter2(Context c, String []name, String []address, String []cont)
    {
        super(c,R.layout.showamb,R.id.textView28,name);
        this.ambaname=name;
        this.acontact=address;
        this.aaddress=cont;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.showamb,viewGroup,false);


        TextView tv=(TextView)row.findViewById(R.id.textView28);
        TextView tv1=(TextView)row.findViewById(R.id.textView30);
        TextView tv2=(TextView)row.findViewById(R.id.textView29);
        tv.setText(ambaname[i]);
        tv1.setText(acontact[i]);
        tv2.setText(aaddress[i]);
        return row;
    }
}


