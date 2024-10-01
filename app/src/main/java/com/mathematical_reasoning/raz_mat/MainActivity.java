package com.mathematical_reasoning.raz_mat;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Cargar la biblioteca nativa
    static {
        System.loadLibrary("lib");
    }

    // Funciones nativas declaradas
    public native String stringFromHome();
    public native String stringFromSettings();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Títulos e íconos de los ítems
        String[] itemTitles = {"Series", "Edades", "Móviles", "Cronometría", "Probabilidades"};
        int[] itemIconsLeft = {R.drawable.ic_series, R.drawable.ic_edades, R.drawable.ic_moviles,
                R.drawable.ic_cronometro, R.drawable.ic_probabilidades};
        int[] itemIconsRight1 = {R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book}; // Íconos de libro
        int[] itemIconsRight2 = {R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver}; // Íconos de editar

        // Setear Adapter pasando los íconos de la izquierda y derecha
        MyAdapter adapter = new MyAdapter(this, itemTitles, itemIconsLeft, itemIconsRight1, itemIconsRight2);
        recyclerView.setAdapter(adapter);

        // Configurar Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.bottom_nav_home) {
                    // Lógica para Home
                    Toast.makeText(MainActivity.this, stringFromHome(), Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.bottom_nav_settings) {
                    // Lógica para Settings
                    Toast.makeText(MainActivity.this, stringFromSettings(), Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }
}
