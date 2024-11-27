package com.rasona.app.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.app.R;

public class SolutionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l4_layout_solution);

        TextView solutionContent = findViewById(R.id.solutionContent);

        try {
            Intent intent = getIntent();
            String solution = intent.getStringExtra("solution");

            if (solution != null) {
                solutionContent.setText(solution);
            } else {
                Log.w("SolutionActivity", "No solution data found in intent");
                Toast.makeText(this, "No solution data available.", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            Log.e("SolutionActivity", "Error retrieving solution data", e);
            Toast.makeText(this, "An error occurred while retrieving the solution.", Toast.LENGTH_SHORT).show();
        }
    }

    public void goBackToProblem(View view) {
        try {
            finish();
            overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);
        } catch (Exception e) {
            Log.e("SolutionActivity", "Error navigating back to ProblemsActivity", e);
            Toast.makeText(this, "An error occurred while navigating back.", Toast.LENGTH_SHORT).show();
        }
    }
}
