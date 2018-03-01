package com.tino.larocaapp.fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tino.larocaapp.R;
import com.tino.larocaapp.fragments.tab02_recursos.Tab02Pager;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab02Recursos extends Fragment {

    private TabLayout tab02Recursos;
    private ViewPager vpRecursos;

    public Tab02Recursos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab02_recursos, container, false);

        // contenido de lo "inflado"
        tab02Recursos = (TabLayout)view.findViewById(R.id.tab02Recursos);
        vpRecursos = (ViewPager)view.findViewById(R.id.vpRecursos);
        Tab02Pager tab02Pager = new Tab02Pager(getChildFragmentManager());
        vpRecursos.setAdapter(tab02Pager);
        tab02Recursos.setupWithViewPager(vpRecursos);

        return view;
    }

}
