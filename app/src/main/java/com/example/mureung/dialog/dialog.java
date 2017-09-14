package com.example.mureung.dialog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mureung on 2017-09-14.
 */

public class dialog extends Fragment {
    AlertDialog.Builder ab;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.test1, container, false);

        ab = new AlertDialog.Builder(getActivity());
        ab.setTitle( "연료분사경고" )
        .setMessage( "P102-연료분사")
        .setNeutralButton("확인1",null)
        .setPositiveButton("확인2",null)
        .setNegativeButton("확인3",null);

        ab.show();

        return view;
    }
}
