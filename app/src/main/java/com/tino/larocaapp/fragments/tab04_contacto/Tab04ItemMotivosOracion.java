package com.tino.larocaapp.fragments.tab04_contacto;


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
public class Tab04ItemMotivosOracion extends Fragment {

    private TextView textMotivosOracion;

    public Tab04ItemMotivosOracion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab04_item_motivos_oracion, container, false);

        textMotivosOracion = (TextView)view.findViewById(R.id.textMotivosOracion);

        return view;
    }

}
