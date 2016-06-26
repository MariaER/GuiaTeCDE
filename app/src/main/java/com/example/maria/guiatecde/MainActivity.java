package com.example.maria.guiatecde;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

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

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setList();
    }

    private void setList() {

        ArrayList<Categoria> categoriaArrayList = new ArrayList<Categoria>();

        Categoria categoria1 = new Categoria();
        categoria1.setNombre("Hoteles");
        categoriaArrayList.add(categoria1);

        Categoria categoria2 = new Categoria();
        categoria2.setNombre("Hosteles");
        categoriaArrayList.add(categoria2);

        Categoria categoria3 = new Categoria();
        categoria3.setNombre("Restaurantes");
        categoriaArrayList.add(categoria3);

        Categoria categoria4 = new Categoria();
        categoria4.setNombre("Bares");
        categoriaArrayList.add(categoria4);

        Categoria categoria5 = new Categoria();
        categoria5.setNombre("Cines");
        categoriaArrayList.add(categoria5);

        Categoria categoria6 = new Categoria();
        categoria6.setNombre("Shopping");
        categoriaArrayList.add(categoria6);

        Categoria categoria7 = new Categoria();
        categoria7.setNombre("Casinos");
        categoriaArrayList.add(categoria7);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.my_recycler_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new ItemAdapter(categoriaArrayList, R.layout.item_categoria));
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
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_top) {

        } else if (id == R.id.nav_favorite) {

        } else if (id == R.id.nav_profile) {

        } else if (id == R.id.nav_question) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
