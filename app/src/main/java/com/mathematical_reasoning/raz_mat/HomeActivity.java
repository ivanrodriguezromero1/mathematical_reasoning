package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mathematical_reasoning.raz_mat.models.input.MathematicalReasoning;
import com.mathematical_reasoning.raz_mat.utils.FileUtils;
import com.mathematical_reasoning.raz_mat.utils.TopicUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1_layout_main);
        MathematicalReasoning reasoning = (MathematicalReasoning) getIntent().getSerializableExtra("reasoning");
        // Configurar RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Habilitar scroll vertical y evitar que se desvanezca
        recyclerView.setVerticalScrollBarEnabled(true);
        recyclerView.setScrollBarFadeDuration(0);

        // Map para los títulos y los íconos de la izquierda
        Map<String, Integer> topicMap = TopicUtils.createTopicMap(reasoning, this);

// Listado de íconos adicionales (libro y resolver)
        int[] itemIconsRight1 = new int[topicMap.size()];
        int[] itemIconsRight2 = new int[topicMap.size()];

// Rellenar los arrays de íconos adicionales con el mismo ícono para cada entrada
        Arrays.fill(itemIconsRight1, R.drawable.ic_book);
        Arrays.fill(itemIconsRight2, R.drawable.ic_resolver);

// Ahora puedes utilizar el Map para acceder a los títulos y los íconos
        List<String> itemTitles = new ArrayList<>(topicMap.keySet());
        List<Integer> itemIconsLeft = new ArrayList<>(topicMap.values());

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

            }
        });

        // Configurar listener para el botón de Opciones
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción para abrir la actividad de opciones
                Intent intent = new Intent(HomeActivity.this, OptionsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}
