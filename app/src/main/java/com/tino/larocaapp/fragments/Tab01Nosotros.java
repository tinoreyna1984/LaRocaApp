package com.tino.larocaapp.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tino.larocaapp.R;
import com.tino.larocaapp.fragments.tab01_nosotros.Tab01Pager;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab01Nosotros extends Fragment {

    private TabLayout tab01Nosotros;
    private ViewPager vpNosotros;

    public Tab01Nosotros() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab01_nosotros, container, false);

        // contenido de lo "inflado"
        tab01Nosotros = (TabLayout)view.findViewById(R.id.tab01Nosotros);
        vpNosotros = (ViewPager)view.findViewById(R.id.vpNosotros);
        Tab01Pager tab01Pager = new Tab01Pager(getChildFragmentManager());
        vpNosotros.setAdapter(tab01Pager);
        tab01Nosotros.setupWithViewPager(vpNosotros);

        return view;
    }

}
