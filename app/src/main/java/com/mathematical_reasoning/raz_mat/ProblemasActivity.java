package com.mathematical_reasoning.raz_mat;

import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.content.Intent;
import com.mathematical_reasoning.raz_mat.utils.RadioButtonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class ProblemasActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l4_layout_problemas);

        // Referencias a los componentes del layout
        ImageView iconImageView = findViewById(R.id.iconImageView);
        TextView titleTextView = findViewById(R.id.appBarTitle);
        TextView problemStatement = findViewById(R.id.problemStatement);  // Referencia al TextView del enunciado

        // Encuentra el RadioGroup en el layout
        RadioGroup answersRadioGroup = findViewById(R.id.answersRadioGroup);

        // Usar el método de RadioButtonUtils para cambiar el estilo de texto
        RadioButtonUtils.setBoldWhenChecked(answersRadioGroup);

        // Obtener los datos del Intent
        Intent intent = getIntent();
        int iconResource = intent.getIntExtra("iconResource", 0);
        String title = intent.getStringExtra("title");

        // Configurar el icono y el título
        iconImageView.setImageResource(iconResource);
        titleTextView.setText(title);

        // Obtener SharedPreferences para la dificultad
        sharedPreferences = getSharedPreferences("OptionsPrefs", MODE_PRIVATE);
        int dificultad = sharedPreferences.getInt("selected_difficulty", 1); // 1: Fácil, 2: Normal, 3: Difícil

        // Generar y mostrar el enunciado dinámico de series
        String enunciadoFinal = "";
        if (title.equals("Sucesiones y Series")) {
            String enunciadoBase = getEnunciadoFromRaw(R.raw.series_enunciado);  // Cargar el archivo raw
            enunciadoFinal = generarEnunciadoSeries(enunciadoBase, dificultad);
        }

        problemStatement.setText(enunciadoFinal);  // Mostrar en el TextView

        // Referencias a los botones
        LinearLayout comprobarButton = findViewById(R.id.comprobarLayout);
        LinearLayout newButton = findViewById(R.id.nuevoLayout);

        // Configurar Bottom Navigation
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
                Intent intent = new Intent(ProblemasActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        // Configurar listener para el botón de Opciones
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para abrir la actividad de OptionsActivity
                Intent intent = new Intent(ProblemasActivity.this, OptionsActivity.class);
                intent.putExtra("fromActivity", "TeoriaActivity");  // Pasar información de qué actividad proviene
                intent.putExtra("iconResource", getIntent().getIntExtra("iconResource", 0)); // Pasar el ícono correspondiente
                intent.putExtra("title", getIntent().getStringExtra("title")); // Pasar el título correspondiente
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

        // Acción de comprobar respuesta
        comprobarButton.setOnClickListener(v -> {
            // Lógica para verificar la respuesta seleccionada
        });

        // Acción de nuevo problema
        newButton.setOnClickListener(v -> {
            // Lógica para cargar un nuevo problema
        });
    }

    // Función para cargar el contenido desde un archivo en raw
    private String getEnunciadoFromRaw(int resourceId) {
        StringBuilder enunciado = new StringBuilder();
        InputStream inputStream = getResources().openRawResource(resourceId);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        try {
            while ((line = reader.readLine()) != null) {
                enunciado.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return enunciado.toString();
    }

    // Generar el enunciado dinámico de series basado en la dificultad
    private String generarEnunciadoSeries(String enunciado, int dificultad) {
        Random random = new Random();
        int a = random.nextInt(8) + 1; // Generar el valor de 'a'
        int r = random.nextInt(8) + 2; // Generar la razón 'r'
        int n = (dificultad + 1) * 5 + random.nextInt(5);  // Generar 'n' basado en la dificultad
        String serie = a + ", " + (a + r) + ", " + (a + 2 * r) + ", ...";

        // Reemplazar los placeholders en el enunciado
        enunciado = enunciado.replace("_n_", String.valueOf(n))
                .replace("_serie_", serie);

        return enunciado;
    }
}
