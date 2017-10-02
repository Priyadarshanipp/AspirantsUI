package com.example.dell.myapplication;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by Dell on 27-Sep-17.
 */

public class hdoctor extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hdoctor, container, false);
        return rootView;
    }

}
