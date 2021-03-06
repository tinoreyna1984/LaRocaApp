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
public class Tab01ItemVisionMision extends Fragment {

    private TextView textVisionMision;
    private String vision_mision = new String();

    public Tab01ItemVisionMision() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab01_item_vision_mision, container, false);

        vision_mision =
                "Visión de la iglesia: reflejar a Cristo en Su\n" +
                "amor, en la unidad de fe, bautismo y Señorío\n" +
                "de Jesucristo en la tierra (Efesios 4:1-6, Juan\n" +
                "17:20-21).\n\n" +
                "Misión de la iglesia: cumplir la gran comisión\n" +
                "de Nuestro Señor Jesucristo: ir y hacer\n" +
                "discípulos (Mateo 28:19-20).";

        // Contenido a ser "inflado"
        textVisionMision = (TextView)view.findViewById(R.id.textoVisionMision);
        textVisionMision.setText(vision_mision);

        return view;
    }

}
