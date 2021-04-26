package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentVolunteenHeader extends Fragment {



    public FragmentVolunteenHeader() {
        // Required empty public constructor
    }

    public static FragmentVolunteenHeader newInstance(String param1, String param2) {
        FragmentVolunteenHeader fragment = new FragmentVolunteenHeader();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_volunteen_header, container, false);
    }
}