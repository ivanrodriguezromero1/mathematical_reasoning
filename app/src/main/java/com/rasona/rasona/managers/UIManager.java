package com.rasona.rasona.managers;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.rasona.R;
import com.rasona.rasona.activities.MainActivity;
import com.rasona.rasona.models.output.ProblemGenerated;

public class UIManager {

    private final Context context;

    public UIManager(Context context) {
        this.context = context;
    }

    public void setupIconAndTitle() {
        ImageView iconImageView = ((AppCompatActivity) context).findViewById(R.id.iconImageView);
        TextView titleTextView = ((AppCompatActivity) context).findViewById(R.id.appBarTitle);
        Intent intent = ((AppCompatActivity) context).getIntent();
        iconImageView.setImageResource(intent.getIntExtra("resourceIcon", 0));
        titleTextView.setText(intent.getStringExtra("title"));
    }

    public void configureHomeButton(Context context) {
        LinearLayout btnHome = ((AppCompatActivity) context).findViewById(R.id.btn_home);
        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(context, MainActivity.class);
            context.startActivity(intent);
            ((AppCompatActivity) context).overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        });
    }

    public void displayProblem(ProblemGenerated problemGenerated) {
        TextView problemStatement = ((AppCompatActivity) context).findViewById(R.id.problemStatement);
        TextView preview = ((AppCompatActivity) context).findViewById(R.id.preview);
        problemStatement.setText(problemGenerated.getStatement());
        preview.setText(problemGenerated.getPreview());
    }
}
