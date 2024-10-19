package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.*;

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

        // Map para los títulos y los íconos de la izquierda
        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("Sucesiones y Series", R.drawable.symbols_123);
        itemMap.put("Problemas sobre edades", R.drawable.symbols_face_4);
        itemMap.put("Problemas sobre móviles", R.drawable.symbols_directions_car);
        itemMap.put("Cronometría", R.drawable.symbols_timer);
        itemMap.put("Probabilidades", R.drawable.symbols_casino);
        itemMap.put("Razonamiento lógico", R.drawable.symbols_cognition);
        itemMap.put("Verdades y mentiras", R.drawable.symbols_balance);
        itemMap.put("Distribuciones numéricas", R.drawable.symbols_pin);
        itemMap.put("Ordenamiento de información", R.drawable.symbols_sort);
        itemMap.put("Lógica proposicional", R.drawable.symbols_arrow_forward);
        itemMap.put("Lógica inferencial", R.drawable.symbols_quick_reference_all);
        itemMap.put("Razonamiento inductivo", R.drawable.symbols_trending_up);
        itemMap.put("Razonamiento deductivo", R.drawable.symbols_fact_check);
        itemMap.put("Planteo de ecuaciones", R.drawable.symbols_cancel_presentation);
        itemMap.put("Ecuaciones diofánticas", R.drawable.symbols_numbers);
        itemMap.put("Operaciones matemáticas", R.drawable.symbols_calculate);
        itemMap.put("Comparación de magnitudes", R.drawable.symbols_scale);
        itemMap.put("Fracciones", R.drawable.symbols_incomplete_circle);
        itemMap.put("Tanto por cuanto", R.drawable.symbols_percent);
        itemMap.put("Conteo de figuras", R.drawable.symbols_grid_on);
        itemMap.put("Sucesos mínimos", R.drawable.symbols_linear_scale);
        itemMap.put("Introducción al análisis combinatorio", R.drawable.symbols_bar_chart);
        itemMap.put("Áreas y perímetros de regiones sombreadas", R.drawable.symbols_square_foot);

// Listado de íconos adicionales (libro y resolver)
        int[] itemIconsRight1 = new int[itemMap.size()];
        int[] itemIconsRight2 = new int[itemMap.size()];

// Rellenar los arrays de íconos adicionales con el mismo ícono para cada entrada
        Arrays.fill(itemIconsRight1, R.drawable.ic_book);
        Arrays.fill(itemIconsRight2, R.drawable.ic_resolver);

// Ahora puedes utilizar el Map para acceder a los títulos y los íconos
        List<String> itemTitles = new ArrayList<>(itemMap.keySet());
        List<Integer> itemIconsLeft = new ArrayList<>(itemMap.values());

        // Setear el Adapter con los nuevos temas e íconos
        MyAdapter adapter = new MyAdapter(this, itemTitles, itemIconsLeft, itemIconsRight1, itemIconsRight2);
        recyclerView.setAdapter(adapter);

        // Configurar Bottom Navigation
        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnOptions = findViewById(R.id.btn_options);

        // Configurar listener para el botón de Inicio
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción cuando se presiona "Inicio"
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left); // Aplicar animación
            }
        });

        // Configurar listener para el botón de Opciones
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para abrir la actividad de opciones
                Intent intent = new Intent(MainActivity.this, OptionsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}
