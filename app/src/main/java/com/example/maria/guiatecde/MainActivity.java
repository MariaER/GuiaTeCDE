package com.example.maria.guiatecde;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.maria.guiatecde.fragmentos.EncuestaFrag;
import com.example.maria.guiatecde.fragmentos.FavoritosFrag;
import com.example.maria.guiatecde.fragmentos.PerfilFrag;
import com.example.maria.guiatecde.fragmentos.TopFrag;
import com.example.maria.guiatecde.adapter.ItemAdapter;
import com.example.maria.guiatecde.models.Categoria;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        getLista();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_main);
        recyclerView.setHasFixedSize(true);


    }

    private void getLista() {

        ArrayList<Categoria> categoriaArrayList = new ArrayList<>();
        Log.e("categoria", "categoria");
        categoriaArrayList = Categoria.getLista();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_main);
        ItemAdapter itemAdapter = new ItemAdapter(R.layout.item_categoria, categoriaArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());


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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_main);

        int id = item.getItemId();

        if (id == R.id.nav_home) {
            setContentView(R.layout.activity_main);

        } else if (id == R.id.nav_profile) {
            setFragment(1);
        } else if (id == R.id.nav_top) {
            setFragment(2);
        } else if (id == R.id.nav_favorite) {
            setFragment(3);
        } else if (id == R.id.nav_question) {
            setFragment(4);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setFragment(int position) {
        FragmentManager fragmentManager;
      //  FragmentManager fragmentManager = getFragmentManager();

        //TODO me da estos errores en los Frag
        switch (position) {
            case 1:

                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                PerfilFrag perFrag = new PerfilFrag();
                fragmentTransaction.replace(R.id.content_fragment, perFrag);
                fragmentTransaction.commit();
                break;
            case 2:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                TopFrag topFrag = new TopFrag();
                fragmentTransaction.replace(R.id.content_fragment, topFrag);
                fragmentTransaction.commit();
                break;
            case 3:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                FavoritosFrag favoritosFrag = new FavoritosFrag();
                fragmentTransaction.replace(R.id.content_fragment, favoritosFrag);
                fragmentTransaction.commit();
                break;
            case 4:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                EncuestaFrag encuestaFrag = new EncuestaFrag();
                fragmentTransaction.replace(R.id.content_fragment, encuestaFrag);
                fragmentTransaction.commit();
                break;
        }
    }
}



