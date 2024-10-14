package com.mathematical_reasoning.raz_mat;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import com.mathematical_reasoning.raz_mat.models.Problema;
import com.mathematical_reasoning.raz_mat.utils.RadioButtonManager;
import com.mathematical_reasoning.raz_mat.utils.RadioButtonUtils;
import java.util.List;


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

        // Obtener los datos del Intent
        Intent intent = getIntent();
        int iconResource = intent.getIntExtra("iconResource", 0);
        String title = intent.getStringExtra("title");
        int currentPosition = intent.getIntExtra("currentPosition",0);

        // Configurar el icono y el título
        iconImageView.setImageResource(iconResource);
        titleTextView.setText(title);

        // Obtener SharedPreferences para la dificultad
        sharedPreferences = getSharedPreferences("OptionsPrefs", MODE_PRIVATE);
        int dificultad = sharedPreferences.getInt("selected_difficulty", 1); // 1: Fácil, 2: Normal, 3: Difícil

        // Generar y mostrar el enunciado dinámico de series
        Problema problema = new Problema();
        if (currentPosition == 0) {
            problema = ProblemSucesionesSeriesFactory.createProblemSucesionesSeries(this, dificultad);
            problemStatement.setText(problema.getEnunciado());
            RadioButtonManager.setupRadioButtons(this, answersRadioGroup, problema.getAlternativas());
        }

        // Referencias a los botones
        LinearLayout btnComprobar = findViewById(R.id.comprobarLayout);
        LinearLayout btnNuevo = findViewById(R.id.nuevoLayout);

        // Configurar Bottom Navigation
        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnOptions = findViewById(R.id.btn_options);

        // Button filter and button tips
        ImageButton btnFilter = findViewById(R.id.btnFilter);
        ImageButton btnTips = findViewById(R.id.btnTips);

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

        // Acción filtro
        btnFilter.setOnClickListener(v -> {

        });
        // Acción tips
        btnTips.setOnClickListener(v -> {

        });

        // Acción de comprobar respuesta
        btnComprobar.setOnClickListener(v -> {
            // Lógica para verificar la respuesta seleccionada
        });

        // Acción de nuevo problema
        btnNuevo.setOnClickListener(v -> {
            // Lógica para cargar un nuevo problema
        });


    }

}
