package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OptionsActivity extends AppCompatActivity {

    private RadioGroup difficultyRadioGroup;
    private RadioButton radioEasy, radioNormal, radioHard;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l2_layout_options);

        // Inicializar los componentes
        difficultyRadioGroup = findViewById(R.id.difficultyRadioGroup);
        radioEasy = findViewById(R.id.radio_easy);
        radioNormal = findViewById(R.id.radio_normal);
        radioHard = findViewById(R.id.radio_hard);

        // Obtener SharedPreferences
        sharedPreferences = getSharedPreferences("OptionsPrefs", MODE_PRIVATE);

        // Recuperar la selección de la dificultad al iniciar la actividad
        int selectedDifficulty = sharedPreferences.getInt("selected_difficulty", 0);
        if (selectedDifficulty == 1) {
            radioEasy.setChecked(true);
        } else if (selectedDifficulty == 2) {
            radioNormal.setChecked(true);
        } else if (selectedDifficulty == 3) {
            radioHard.setChecked(true);
        }

        // Manejar selección de dificultad y guardar la selección
        difficultyRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if (checkedId == R.id.radio_easy) {
                    editor.putInt("selected_difficulty", 1);
                } else if (checkedId == R.id.radio_normal) {
                    editor.putInt("selected_difficulty", 2);
                } else if (checkedId == R.id.radio_hard) {
                    editor.putInt("selected_difficulty", 3);
                }
                editor.apply();  // Guardar la selección en SharedPreferences
            }
        });

        // Configurar Bottom Navigation
        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnOptions = findViewById(R.id.btn_options);

        // Configurar listener para el botón de Inicio
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción cuando se presiona "Inicio"
                Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right); // Aplicar animación
            }
        });

        // Configurar listener para el botón de Opciones
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para abrir la actividad de opciones
            }
        });
    }
}
