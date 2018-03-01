package com.tino.larocaapp.fragments.tab04_contacto;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tino.larocaapp.fragments.tab02_recursos.Tab02ItemDevocional;
import com.tino.larocaapp.fragments.tab02_recursos.Tab02ItemLaHoraSilenciosa;
import com.tino.larocaapp.fragments.tab02_recursos.Tab02ItemSermones;

/**
 * Created by Tino on 28/02/2018.
 */

/*
*
* Pager para los items del menú Nosotros
*
*/

public class Tab04Pager extends FragmentStatePagerAdapter {

    String titulos[] =
            new String[]{"Motivos de Oración", "Formas de Contacto"};

    public Tab04Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
            switch(position){
                case 0:
                    Tab04ItemMotivosOracion tab04ItemMotivosOracion = new Tab04ItemMotivosOracion();
                    return tab04ItemMotivosOracion;
                case 1:
                    Tab04ItemFormasContacto tab04ItemFormasContacto = new Tab04ItemFormasContacto();
                    return tab04ItemFormasContacto;
                default:
                    return null;
            }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos[position];
    }
}
