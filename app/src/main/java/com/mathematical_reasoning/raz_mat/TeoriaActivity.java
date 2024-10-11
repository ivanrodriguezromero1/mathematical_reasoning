package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TeoriaActivity extends AppCompatActivity {

    private ImageView iconImageView;
    private TextView titleTextView, contentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l3_layout_teoria);

        // Referencias a los componentes del layout
        iconImageView = findViewById(R.id.iconImageView);
        titleTextView = findViewById(R.id.appBarTitle);
        contentTextView = findViewById(R.id.teoriaContent);

        // Obtener los datos pasados desde el RecyclerView
        Intent intent = getIntent();
        int iconResource = intent.getIntExtra("iconResource", 0);
        String title = intent.getStringExtra("title");

        // Configurar el icono y el título
        iconImageView.setImageResource(iconResource);
        titleTextView.setText(title);

        // Configurar el contenido de la teoría según el título
        if (title.equals("Sucesiones y Series")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.series_teoria));  // Contenido para "Series"
        } else if (title.equals("Problemas sobre edades")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.edades_teoria));  // Contenido para "Edades"
        } else if (title.equals("Problemas sobre móviles")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.moviles_teoria));  // Contenido para "Móviles"
        } else if (title.equals("Cronometría")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.cronometra_teoria));  // Contenido para "Cronometría"
        } else if (title.equals("Probabilidades")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.probabilidades_teoria));  // Contenido para "Probabilidades"
        }

        // Configurar botones del LinearLayout
        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnOptions = findViewById(R.id.btn_options);

        // Cambiar color de los íconos y textos a blanco
        ImageView iconHome = btnHome.findViewById(R.id.btn_home_icon);
        TextView textHome = btnHome.findViewById(R.id.btn_home_text);
        iconHome.setColorFilter(Color.WHITE);  // Cambia el color del ícono
        textHome.setTextColor(Color.WHITE);    // Cambia el color del texto

        ImageView iconOptions = btnOptions.findViewById(R.id.btn_options_icon);
        TextView textOptions = btnOptions.findViewById(R.id.btn_options_text);
        iconOptions.setColorFilter(Color.WHITE);  // Cambia el color del ícono
        textOptions.setTextColor(Color.WHITE);    // Cambia el color del texto

        // Configurar listener para el botón de Inicio
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para abrir la actividad de MainActivity
                Intent intent = new Intent(TeoriaActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        // Configurar listener para el botón de Opciones
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para abrir la actividad de OptionsActivity
                Intent intent = new Intent(TeoriaActivity.this, OptionsActivity.class);
                intent.putExtra("fromActivity", "TeoriaActivity");  // Pasar información de qué actividad proviene
                intent.putExtra("iconResource", getIntent().getIntExtra("iconResource", 0)); // Pasar el ícono correspondiente
                intent.putExtra("title", getIntent().getStringExtra("title")); // Pasar el título correspondiente
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

    }

    private String getTeoriaFromFile(int rawResourceId) {
        StringBuilder teoria = new StringBuilder();
        InputStream inputStream = getResources().openRawResource(rawResourceId);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                teoria.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return teoria.toString();
    }

}
