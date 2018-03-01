package com.tino.larocaapp.fragments.tab01_nosotros;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tino.larocaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab01ItemDeclaracion extends Fragment {


    public Tab01ItemDeclaracion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab01_item_declaracion, container, false);

        // Contenido a ser "inflado"
        /*textBienvenida = (TextView)view.findViewById(R.id.tv_bienvenida);
        textBienvenida.setVisibility(View.VISIBLE);*/

        return view;
    }

}
