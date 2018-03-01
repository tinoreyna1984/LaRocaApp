package com.tino.larocaapp.fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tino.larocaapp.R;
import com.tino.larocaapp.fragments.tab04_contacto.Tab04Pager;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab04Contacto extends Fragment {

    private TabLayout tab04Contacto;
    private ViewPager vpContacto;

    public Tab04Contacto() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab04_contacto, container, false);

        // contenido de lo "inflado"
        tab04Contacto = (TabLayout)view.findViewById(R.id.tab04Contacto);
        vpContacto = (ViewPager)view.findViewById(R.id.vpContacto);
        Tab04Pager tab04Pager = new Tab04Pager(getChildFragmentManager());
        vpContacto.setAdapter(tab04Pager);
        tab04Contacto.setupWithViewPager(vpContacto);

        return view;
    }

}
