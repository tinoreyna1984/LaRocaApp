package com.tino.larocaapp.fragments.tab01_nosotros;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tino.larocaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab01ItemBienvenida extends Fragment {

    private TextView textBienvenida;

    public Tab01ItemBienvenida() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String mensajeBienvenida = "Bienvenidos a nuestra iglesia.\n\n" +
                "Esperamos que sea de edificación y bendición para cada uno " +
                "de ustedes.\n\n" +
                "Para la gloria de Nuestro Señor Jesucristo y para ayudarles.";

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab01_item_bienvenida, container, false);

        // Contenido a ser "inflado"
        textBienvenida = (TextView)view.findViewById(R.id.textBienvenida);
        textBienvenida.setText(mensajeBienvenida);

        return view;
    }

}
