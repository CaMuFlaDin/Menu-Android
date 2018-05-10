package com.example.menututorial;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navView.setNavigationItemSelectedListener(this);
    }
    //Método implementado para o Navigation View
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        switch(id){
            case R.id.item1:
        //Faz algo quando clica no item 1
        break;
        case R.id.item2:
        //Faz algo quando clica no item 2
        break;
        case R.id.item3:
        //Faz algo quando clica no item 3
        break;
        default:
        //Faz algo quando clica nos demais itens
        break;
    }
        Toast.makeText(this, item.getTitle()+" selecionado", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //Método para criar o menu de opções
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.drawer_menu, menu);
        menu.removeGroup(R.id.drawer_only);

        //Caso retorne falso, não mostra o menu
        return true;
    }
    //Método para gerenciar cliques em itens
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch(id){
            case R.id.item1:
                //Faz algo quando clica no item 1
                break;
            case R.id.item2:
                //Faz algo quando clica no item 2
                break;
            case R.id.item3:
                //Faz algo quando clica no item 3
                break;
            default:
                //Faz algo quando clica nos demais itens
                break;
        }
        Toast.makeText(this, item.getTitle()+" selecionado", Toast.LENGTH_SHORT).show();
        return true;
    }
}
