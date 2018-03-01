package com.tino.larocaapp.fragments.tab03_ministerios;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tino.larocaapp.fragments.tab01_nosotros.Tab01ItemBienvenida;
import com.tino.larocaapp.fragments.tab01_nosotros.Tab01ItemDeclaracion;
import com.tino.larocaapp.fragments.tab01_nosotros.Tab01ItemHistoria;
import com.tino.larocaapp.fragments.tab01_nosotros.Tab01ItemVisionMision;

/**
 * Created by Tino on 28/02/2018.
 */

/*
*
* Pager para los items del menú Nosotros
*
*/

public class Tab03Pager extends FragmentStatePagerAdapter {

    String titulos[] =
            new String[]{"Cultos dominicales",      "Escuela Dominical",    "Oansa",
                         "70 veces 7",              "Trascender",           "Impacta",
                         "Varones de la Palabra",   "Damas",                "Misioneros",
                         "Matrimonios"};

    public Tab03Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


            switch(position){
                case 0:
                    Tab03ItemCultos tab03ItemCultos = new Tab03ItemCultos();
                    return tab03ItemCultos;
                case 1:
                    Tab03ItemEscuelaDominical tab03ItemEscuelaDominical = new Tab03ItemEscuelaDominical();
                    return tab03ItemEscuelaDominical;
                case 2:
                    Tab03ItemOansa tab03ItemOansa = new Tab03ItemOansa();
                    return tab03ItemOansa;
                case 3:
                    Tab03Item70x7 tab03Item70x7 = new Tab03Item70x7();
                    return tab03Item70x7;
                case 4:
                    Tab03ItemTrascender tab03ItemTrascender = new Tab03ItemTrascender();
                    return tab03ItemTrascender;
                case 5:
                    Tab03ItemImpacta tab03ItemImpacta = new Tab03ItemImpacta();
                    return tab03ItemImpacta;
                case 6:
                    Tab03ItemVarones tab03ItemVarones = new Tab03ItemVarones();
                    return tab03ItemVarones;
                case 7:
                    Tab03ItemDamas tab03ItemDamas = new Tab03ItemDamas();
                    return tab03ItemDamas;
                case 8:
                    Tab03ItemMisioneros tab03ItemMisioneros = new Tab03ItemMisioneros();
                    return tab03ItemMisioneros;
                case 9:
                    Tab03ItemMatrimonios tab03ItemMatrimonios = new Tab03ItemMatrimonios();
                    return tab03ItemMatrimonios;
                default:
                    return null;
            }
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos[position];
    }
}
