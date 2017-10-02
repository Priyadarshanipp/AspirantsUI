package com.example.dell.myapplication;
import android.view.LayoutInflater;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;
/**
 * Created by Dell on 27-Sep-17.
 */

public class hprofile extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hprofile, container, false);
        return rootView;
    }

}
