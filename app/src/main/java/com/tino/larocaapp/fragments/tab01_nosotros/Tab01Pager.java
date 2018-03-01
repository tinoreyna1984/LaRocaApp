package com.tino.larocaapp.fragments.tab01_nosotros;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Tino on 28/02/2018.
 */

/*
*
* Pager para los items del menú Nosotros
*
*/

public class Tab01Pager extends FragmentStatePagerAdapter {

    String titulos[] =
            new String[]{"Bienvenida", "Historia", "Visión y Misión", "Declaración de fe"};

    public Tab01Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {


            switch(position){
                case 0:
                    Tab01ItemBienvenida tab01ItemBienvenida = new Tab01ItemBienvenida();
                    return tab01ItemBienvenida;
                case 1:
                    Tab01ItemHistoria tab01ItemHistoria = new Tab01ItemHistoria();
                    return tab01ItemHistoria;
                case 2:
                    Tab01ItemVisionMision tab01ItemVisionMision = new Tab01ItemVisionMision();
                    return tab01ItemVisionMision;
                case 3:
                    Tab01ItemDeclaracion tab01ItemDeclaracion = new Tab01ItemDeclaracion();
                    return tab01ItemDeclaracion;
                default:
                    return null;
            }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos[position];
    }
}
