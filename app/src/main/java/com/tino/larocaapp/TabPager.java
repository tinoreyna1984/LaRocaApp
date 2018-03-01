package com.tino.larocaapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import android.view.View;

import com.tino.larocaapp.fragments.Tab01Nosotros;
import com.tino.larocaapp.fragments.Tab02Recursos;
import com.tino.larocaapp.fragments.Tab03Ministerios;
import com.tino.larocaapp.fragments.Tab04Contacto;

/**
 * Created by Tino on 28/02/2018.
 */

public class TabPager extends FragmentStatePagerAdapter {
    public TabPager(FragmentManager fm) {
        super(fm);
    }

    String titulos[] =
            new String[]{"Nosotros", "Recursos", "Ministerios", "Contacto"};

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Tab01Nosotros tab01Nosotros = new Tab01Nosotros();
                return tab01Nosotros;
            case 1:
                Tab02Recursos tab02Recursos = new Tab02Recursos();
                return tab02Recursos;
            case 2:
                Tab03Ministerios tab03Ministerios = new Tab03Ministerios();
                return tab03Ministerios;
            case 3:
                Tab04Contacto tab04Contacto = new Tab04Contacto();
                return tab04Contacto;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
