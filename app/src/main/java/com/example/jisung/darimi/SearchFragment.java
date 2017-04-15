package com.example.jisung.darimi;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jisung on 2017-04-15.
 */

public class SearchFragment extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragview = inflater.inflate(R.layout.select_fragment,container,false);//container 어디에 붙일지
        return fragview;
    }

    @Override
    public void onClick(View v) {

    }
}
