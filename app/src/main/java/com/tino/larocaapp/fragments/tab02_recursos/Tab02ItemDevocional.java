package com.tino.larocaapp.fragments.tab02_recursos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tino.larocaapp.R;

import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab02ItemDevocional extends Fragment {

    private TextView textDevocional;
    private TextView textLink;

    public Tab02ItemDevocional() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab02_item_devocional, container, false);

        // Contenido a ser "inflado"
        Date date = new Date();

        String link = "http://es.gospeltranslations.org/wiki/La_Chequera_del_Banco_de_la_Fe/"
                + String.valueOf(date.getDate()) + "_de_" + obtieneMes(date.getMonth());
        String mensajeDevocional =  "La Chequera del Banco de la Fe,\n" +
                                    "de Charles H. Spurgeon (1834-1892)\n\n" +
                                    "Puede visualizar el devocional del día aquí:\n";
        textDevocional = (TextView)view.findViewById(R.id.textDevocional);
        textDevocional.setText(mensajeDevocional);
        textLink = (TextView)view.findViewById(R.id.textLink);
        textLink.setText(link);
        textLink.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }

    private String obtieneMes(int mes){

        String strMes = new String();

        switch(mes){
            case 1:
                strMes = "Enero";
                break;
            case 2:
                strMes = "Febrero";
            break;
            case 3:
                strMes = "Marzo";
            break;
            case 4:
                strMes = "Abril";
            break;
            case 5:
                strMes = "Mayo";
            break;
            case 6:
                strMes = "Junio";
            break;
            case 7:
                strMes = "Julio";
            break;
            case 8:
                strMes = "Agosto";
            break;
            case 9:
                strMes = "Septiembre";
            break;
            case 10:
                strMes = "Octubre";
            break;
            case 11:
                strMes = "Noviembre";
            break;
            case 12:
                strMes = "Diciembre";
            break;
        }

        return strMes;
    }

}
