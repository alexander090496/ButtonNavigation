package com.example.aula7.buttonnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        como hacer referencia a un componente de mi vista desde la clase  java
        BottomNavigationView bnv= (BottomNavigationView) findViewById(R.id.b_n_v1);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    //optiene el nombre de los item
                    case R.id.item1:
                        //cargar lista de la nueva activity

                        UnoFragment pantalla1= new UnoFragment();
                        //bincula un activity dentro de mi frame layout
                        getSupportFragmentManager()
                                //abrir el proceso
                                .beginTransaction()
                                //a mi frame layout le ponga la pantalla
                                .replace(R.id.f_l1,pantalla1)
                                //efecto de aparecer lentamente
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                               //cada vaz que vaaya a cargar el proyecto
                                .addToBackStack(null)
                                .commit();

                        Toast.makeText(MainActivity.this, "Item 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item2:

                        DosFragment pantalla2= new DosFragment();
                        //bincula un activity dentro de mi frame layout
                        getSupportFragmentManager()
                                //abrir el proceso
                                .beginTransaction()
                                //a mi frame layout le ponga la pantalla
                                .replace(R.id.f_l1,pantalla2)
                                //efecto de aparecer lentamente
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                //cada vaz que vaaya a cargar el proyecto
                                .addToBackStack(null)
                                .commit();

                        Toast.makeText(MainActivity.this, "Item 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item3:
                        Toast.makeText(MainActivity.this, "Item 3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

    }
}
//como crear un activity de tipo fracmen ::
//hubicarnos en java
//seleccionar new fragment y fragment(blank)