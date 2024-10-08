package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

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
        setContentView(R.layout.l1_layout_main);

        // Configurar RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Habilitar scroll vertical y evitar que se desvanezca
        recyclerView.setVerticalScrollBarEnabled(true);
        recyclerView.setScrollBarFadeDuration(0);

        // Lista actualizada con todos los temas solicitados
        String[] itemTitles = {
                "Razonamiento lógico",
                "Verdades y mentiras",
                "Distribuciones numéricas",
                "Ordenamiento de información",
                "Lógica proposicional",
                "Lógica inferencial",
                "Razonamiento inductivo",
                "Razonamiento deductivo",
                "Planteo de ecuaciones",
                "Ecuaciones diofánticas",
                "Problemas sobre edades",
                "Problemas sobre móviles",
                "Cronometría",
                "Operaciones matemáticas",
                "Comparación de magnitudes",
                "Fracciones",
                "Tanto por cuanto",
                "Sucesiones",
                "Series",
                "Conteo de figuras",
                "Sucesos mínimos",
                "Introducción al análisis combinatorio",
                "Áreas y perímetros de regiones sombreadas"
        };

        // Íconos seleccionados de Google Fonts para cada tema
        int[] itemIconsLeft = {
                R.drawable.symbols_cognition,   // Razonamiento lógico
                R.drawable.symbols_balance,           // Verdades y mentiras
                R.drawable.symbols_pin,  // Distribuciones numéricas
                R.drawable.symbols_sort,            // Ordenamiento de información
                R.drawable.symbols_arrow_forward, // Lógica proposicional
                R.drawable.symbols_manage_search,   // Lógica inferencial
                R.drawable.symbols_trending_up,     // Razonamiento inductivo
                R.drawable.symbols_fact_check,      // Razonamiento deductivo
                R.drawable.symbols_cancel_presentation,  // Planteo de ecuaciones
                R.drawable.symbols_numbers,         // Ecuaciones diofánticas
                R.drawable.symbols_face_4,   // Problemas sobre edades
                R.drawable.symbols_directions_car,  // Problemas sobre móviles
                R.drawable.symbols_timer,           // Cronometría
                R.drawable.symbols_calculate,             // Operaciones matemáticas
                R.drawable.symbols_scale,           // Comparación de magnitudes
                R.drawable.symbols_incomplete_circle, // Fracciones
                R.drawable.symbols_percent,         // Tanto por cuanto
                R.drawable.symbols_123,             // Sucesiones
                R.drawable.symbols_exposure_plus,   // Series
                R.drawable.symbols_grid_on,         // Conteo de figuras
                R.drawable.symbols_linear_scale,    // Sucesos mínimos
                R.drawable.symbols_bar_chart,       // Introducción al análisis combinatorio
                R.drawable.symbols_square_foot      // Áreas y perímetros de regiones sombreadas
        };

        // Íconos adicionales (libro y resolver)
        int[] itemIconsRight1 = {
                R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book,
                R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book,
                R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book,
                R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book,
                R.drawable.ic_book, R.drawable.ic_book, R.drawable.ic_book
        };

        int[] itemIconsRight2 = {
                R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver,
                R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver,
                R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver,
                R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver,
                R.drawable.ic_resolver, R.drawable.ic_resolver, R.drawable.ic_resolver
        };

        // Setear el Adapter con los nuevos temas e íconos
        MyAdapter adapter = new MyAdapter(this, itemTitles, itemIconsLeft, itemIconsRight1, itemIconsRight2);
        recyclerView.setAdapter(adapter);

        // Configurar Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.bottom_nav_home) {
                    return true;
                } else if (id == R.id.bottom_nav_options) {
                    Intent intent = new Intent(MainActivity.this, OptionsActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // Aplicar animación
                    return true;
                }
                return false;
            }
        });
    }
}
