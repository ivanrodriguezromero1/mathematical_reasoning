package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
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
        setContentView(R.layout.activity_teoria);

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
        if (title.equals("Series")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.series_teoria));  // Contenido para "Series"
        } else if (title.equals("Edades")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.edades_teoria));  // Contenido para "Edades"
        } else if (title.equals("Móviles")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.moviles_teoria));  // Contenido para "Móviles"
        } else if (title.equals("Cronometría")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.cronometra_teoria));  // Contenido para "Cronometría"
        } else if (title.equals("Probabilidades")) {
            contentTextView.setText(getTeoriaFromFile(R.raw.probabilidades_teoria));  // Contenido para "Probabilidades"
        }

        // Configurar Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_nav_home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.bottom_nav_home) {
                    startActivity(new Intent(TeoriaActivity.this, MainActivity.class));
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    return true;
                } else if (itemId == R.id.bottom_nav_options) {
                    Intent intent = new Intent(TeoriaActivity.this, OptionsActivity.class);
                    intent.putExtra("fromActivity", "TeoriaActivity");  // Pasar información de qué actividad proviene
                    intent.putExtra("iconResource", getIntent().getIntExtra("iconResource", 0)); // Pasar el ícono correspondiente
                    intent.putExtra("title", getIntent().getStringExtra("title")); // Pasar el título correspondiente
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return true;
                }
                return false;
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
