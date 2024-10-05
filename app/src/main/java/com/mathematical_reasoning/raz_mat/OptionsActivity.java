package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OptionsActivity extends AppCompatActivity {

    private RadioGroup difficultyRadioGroup;
    private RadioButton radioEasy, radioNormal, radioHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        // Inicializar los componentes
        difficultyRadioGroup = findViewById(R.id.difficultyRadioGroup);
        radioEasy = findViewById(R.id.radio_easy);
        radioNormal = findViewById(R.id.radio_normal);
        radioHard = findViewById(R.id.radio_hard);

        // Manejar selección de dificultad
        difficultyRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_easy) {
                    Toast.makeText(OptionsActivity.this, "Dificultad: Fácil", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_normal) {
                    Toast.makeText(OptionsActivity.this, "Dificultad: Normal", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radio_hard) {
                    Toast.makeText(OptionsActivity.this, "Dificultad: Difícil", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Configurar Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_nav_options);

        // Obtener la información de qué actividad proviene y los datos del ícono y título
        String fromActivity = getIntent().getStringExtra("fromActivity");
        int iconResource = getIntent().getIntExtra("iconResource", 0);
        String title = getIntent().getStringExtra("title");

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.bottom_nav_home) {
                    Intent intent = new Intent(OptionsActivity.this, MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    return true;
                } else if (id == R.id.bottom_nav_options) {
                    // Verificar si se debe volver a TeoriaActivity u otra actividad
                    if (fromActivity != null && fromActivity.equals("TeoriaActivity")) {
                        Intent intent = new Intent(OptionsActivity.this, TeoriaActivity.class);
                        intent.putExtra("iconResource", iconResource); // Restaurar el ícono
                        intent.putExtra("title", title); // Restaurar el título
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);  // Transición inversa
                        return true;
                    } else if (fromActivity != null && fromActivity.equals("ProblemasActivity")) {
                        Intent intent = new Intent(OptionsActivity.this, ProblemasActivity.class);
                        intent.putExtra("iconResource", iconResource); // Restaurar el ícono
                        intent.putExtra("title", title); // Restaurar el título
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);  // Transición inversa
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
