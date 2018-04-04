package com.tino.larocaapp.fragments.tab02_recursos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tino.larocaapp.R;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab02ItemDevocional extends Fragment {

    private TextView textDevocional;
    private TextView textLink;
    private String TAG = "DEB";

    public Tab02ItemDevocional() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab02_item_devocional, container, false);

        // Contenido a ser "inflado"
        GregorianCalendar calendar = new GregorianCalendar();
        Date date = Calendar.getInstance().getTime();
        calendar.setTime(date);
        Log.i(TAG, "Fecha: " + date.toString());


        String link = "http://es.gospeltranslations.org/wiki/La_Chequera_del_Banco_de_la_Fe/"
                + String.valueOf(calendar.get(GregorianCalendar.DATE)) + "_de_"
                + obtieneMes(calendar.get(GregorianCalendar.MONTH));
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
            case 0:
                strMes = "Enero";
                break;
            case 1:
                strMes = "Febrero";
            break;
            case 2:
                strMes = "Marzo";
            break;
            case 3:
                strMes = "Abril";
            break;
            case 4:
                strMes = "Mayo";
            break;
            case 5:
                strMes = "Junio";
            break;
            case 6:
                strMes = "Julio";
            break;
            case 7:
                strMes = "Agosto";
            break;
            case 8:
                strMes = "Septiembre";
            break;
            case 9:
                strMes = "Octubre";
            break;
            case 10:
                strMes = "Noviembre";
            break;
            case 11:
                strMes = "Diciembre";
            break;
        }

        return strMes;
    }

}
