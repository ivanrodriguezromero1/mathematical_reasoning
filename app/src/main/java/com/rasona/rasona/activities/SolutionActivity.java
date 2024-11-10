package com.rasona.rasona.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.rasona.R;

public class SolutionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l4_layout_solution);

        TextView solutionContent = findViewById(R.id.solutionContent);

        Intent intent = getIntent();
        String solution = intent.getStringExtra("solution");

        if (solution != null) {
            solutionContent.setText(solution);
        }
    }

    public void goBackToProblem(View view) {
        Intent intent = new Intent(SolutionActivity.this, ProblemsActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);
        finish();
    }
}
