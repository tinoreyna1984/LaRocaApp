package com.tino.larocaapp.fragments.tab02_recursos;

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

public class Tab02Pager extends FragmentStatePagerAdapter {

    String titulos[] =
            new String[]{"Sermones", "Devocional", "La Hora Silenciosa"};

    public Tab02Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
            switch(position){
                case 0:
                    Tab02ItemSermones tab02ItemSermones = new Tab02ItemSermones();
                    return tab02ItemSermones;
                case 1:
                    Tab02ItemDevocional tab02ItemDevocional = new Tab02ItemDevocional();
                    return tab02ItemDevocional;
                case 2:
                    Tab02ItemLaHoraSilenciosa tab02ItemLaHoraSilenciosa = new Tab02ItemLaHoraSilenciosa();
                    return tab02ItemLaHoraSilenciosa;
                default:
                    return null;
            }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos[position];
    }
}
