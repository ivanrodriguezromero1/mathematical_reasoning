package com.mathematical_reasoning.raz_mat;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.content.Intent;
import com.mathematical_reasoning.raz_mat.utils.RadioButtonUtils;


public class ProblemasActivity extends AppCompatActivity {

    private TextView timerTextView;
    private Handler timerHandler = new Handler();
    private long startTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l4_layout_problemas);
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
        LinearLayout comprobarButton = findViewById(R.id.comprobarLayout);
        LinearLayout newButton = findViewById(R.id.nuevoLayout);

        // Configurar Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setItemIconTintList(ColorStateList.valueOf(Color.WHITE));
        bottomNavigationView.setItemTextColor(ColorStateList.valueOf(Color.WHITE));
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
        comprobarButton.setOnClickListener(v -> {
            // Lógica para verificar la respuesta seleccionada
        });

        // Acción de nuevo problema
        newButton.setOnClickListener(v -> {
            // Lógica para cargar un nuevo problema
        });
    }

}
