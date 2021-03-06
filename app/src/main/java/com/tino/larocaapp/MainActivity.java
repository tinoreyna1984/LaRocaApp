package com.tino.larocaapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 *
 * Metodología para el app:
 *
 * - El proyecto creado por la IDE es, por defecto, con vista de navegación,
 *   la cual contendrá vista de tabulaciones.
 * - Se crea un TabLayout principal, el cual será rellenado por un objeto de la clase
 *   ViewPager, el cual a su vez tomará una instancia de una clase TabPager, derivada de
 *   FragmentStatePageAdapter
 * - La lógica anterior se repite para los subconjuntos agrupados en vista tabular como
 *   la tabulación principal.
 *
 * */

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //empalma el xml del layout con el TabPager
        //a fin de entrelazar contenido
        TabLayout tabLayout = findViewById(R.id.tab_principal);
        ViewPager viewPager = findViewById(R.id.viewPager);
        TabPager tabPager = new TabPager(getSupportFragmentManager());
        viewPager.setAdapter(tabPager);
        tabLayout.setupWithViewPager(viewPager);

        //Componentes por defecto
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.acerca_de) {
            // Acerca del app: genera un cuadro de diálogo
            final AlertDialog.Builder cuadro = new AlertDialog.Builder(MainActivity.this);
            cuadro.setMessage(R.string.dialog_message).setTitle(R.string.acerca_del_app).
                    setPositiveButton(R.string.hecho, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            cuadro.setCancelable(true);
                        }
                    });
            AlertDialog dialogo = cuadro.create();
            dialogo.setIcon(R.drawable.logo_pag_facebook);
            dialogo.show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
