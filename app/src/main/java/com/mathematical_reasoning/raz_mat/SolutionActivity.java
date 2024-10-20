package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SolutionActivity extends AppCompatActivity {

    private TextView solutionContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l5_layout_solution);  // Enlazar con el layout de solución

        // Obtener referencias a los elementos de la interfaz
        solutionContent = findViewById(R.id.solutionContent);

        // Obtener la solución del Intent
        Intent intent = getIntent();
        String solution = intent.getStringExtra("solution");

        // Establecer el contenido de la solución en el TextView
        if (solution != null) {
            solutionContent.setText(solution);
        }
    }

    // Método para manejar el click en la barra inferior "Atrás"
    public void goBackToProblem(View view) {
        // Volver a la pantalla del problema sin modificar nada
        Intent intent = new Intent(SolutionActivity.this, ProblemsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);  // Mantener el estado
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);
        finish();
    }
}
