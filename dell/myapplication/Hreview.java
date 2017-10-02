package com.example.dell.myapplication;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;

/**
 * Created by Dell on 27-Sep-17.
 */

public class Hreview extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hreview, container, false);
        return rootView;
    }

}
