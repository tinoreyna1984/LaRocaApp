package com.tino.larocaapp.fragments.tab01_nosotros;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tino.larocaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab01ItemHistoria extends Fragment {

    private TextView textHistoria;

    public Tab01ItemHistoria() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab01_item_historia, container, false);

        // Contenido a ser "inflado"
        textHistoria = (TextView)view.findViewById(R.id.textHistoria);

        return view;
    }

}
