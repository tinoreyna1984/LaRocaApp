package com.tino.larocaapp.fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tino.larocaapp.R;
import com.tino.larocaapp.fragments.tab03_ministerios.Tab03Pager;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab03Ministerios extends Fragment {

    private TabLayout tab03Ministerios;
    private ViewPager vpMinisterios;

    public Tab03Ministerios() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab03_ministerios, container, false);

        // contenido de lo "inflado"
        tab03Ministerios = (TabLayout)view.findViewById(R.id.tab03Ministerios);
        vpMinisterios = (ViewPager)view.findViewById(R.id.vpMinisterios);
        Tab03Pager tab03Pager = new Tab03Pager(getChildFragmentManager());
        vpMinisterios.setAdapter(tab03Pager);
        tab03Ministerios.setupWithViewPager(vpMinisterios);

        return view;
    }

}
