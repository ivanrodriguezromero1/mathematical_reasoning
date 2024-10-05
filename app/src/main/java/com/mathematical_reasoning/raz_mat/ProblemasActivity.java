package com.mathematical_reasoning.raz_mat;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.content.Intent;
import android.widget.ImageView;
import com.mathematical_reasoning.raz_mat.utils.RadioButtonUtils;


public class ProblemasActivity extends AppCompatActivity {

    private TextView timerTextView;
    private Handler timerHandler = new Handler();
    private long startTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problemas);
        // Referencias a los componentes del layout
        ImageView iconImageView = findViewById(R.id.iconImageView);
        TextView titleTextView = findViewById(R.id.appBarTitle);

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

        // Referencias a los componentes
//        timerTextView = findViewById(R.id.timerTextView);
//        ImageButton restartButton = findViewById(R.id.restartButton);
        Button checkButton = findViewById(R.id.comprobarButton);
        Button newButton = findViewById(R.id.nuevoButton);

//        // Iniciar el temporizador
//        startTime = System.currentTimeMillis();
//        timerHandler.postDelayed(timerRunnable, 0);

        // Reiniciar el temporizador al hacer clic en el botón de reinicio
//        restartButton.setOnClickListener(v -> resetTimer());

        // Configurar Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_nav_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.bottom_nav_home) {
                    startActivity(new Intent(ProblemasActivity.this, MainActivity.class));
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    return true;
                } else if (itemId == R.id.bottom_nav_options) {
                    Intent intent = new Intent(ProblemasActivity.this, OptionsActivity.class);
                    intent.putExtra("fromActivity", "ProblemasActivity");  // Pasar información de qué actividad proviene
                    intent.putExtra("iconResource", getIntent().getIntExtra("iconResource", 0)); // Pasar el ícono correspondiente
                    intent.putExtra("title", getIntent().getStringExtra("title")); // Pasar el título correspondiente
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return true;
                }
                return false;
            }
        });

        // Acción de comprobar respuesta
        checkButton.setOnClickListener(v -> {
            // Lógica para verificar la respuesta seleccionada
        });

        // Acción de nuevo problema
        newButton.setOnClickListener(v -> {
            // Lógica para cargar un nuevo problema
        });
    }

    // Reiniciar el temporizador
//    private void resetTimer() {
//        startTime = System.currentTimeMillis();
//        timerHandler.postDelayed(timerRunnable, 0);
//    }

    // Runnable para actualizar el temporizador cada segundo
//    private Runnable timerRunnable = new Runnable() {
//        @Override
//        public void run() {
//            long millis = System.currentTimeMillis() - startTime;
//            int seconds = (int) (millis / 1000);
//            int minutes = seconds / 60;
//            seconds = seconds % 60;
//
//            timerTextView.setText(String.format("%02d:%02d:%02d", minutes / 60, minutes % 60, seconds));
//
//            // Actualizar cada segundo
//            timerHandler.postDelayed(this, 1000);
//        }
//    };
}
