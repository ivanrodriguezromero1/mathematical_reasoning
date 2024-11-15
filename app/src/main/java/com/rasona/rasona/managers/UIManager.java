package com.rasona.rasona.managers;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.rasona.R;
import com.rasona.rasona.activities.HomeActivity;
import com.rasona.rasona.activities.TheoryActivity;
import com.rasona.rasona.models.output.ProblemGenerated;

import java.util.List;

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

    public void displayProblem(ProblemGenerated problemGenerated) {
        TextView problemStatement = ((AppCompatActivity) context).findViewById(R.id.problemStatement);
        TextView preview = ((AppCompatActivity) context).findViewById(R.id.preview);
        RadioGroup answersRadioGroup = ((AppCompatActivity) context).findViewById(R.id.answersRadioGroup);
        problemStatement.setText(problemGenerated.getStatement());
        preview.setText(problemGenerated.getPreview());
        answersRadioGroup.removeAllViews();
        List<String> alternatives = problemGenerated.getAlternatives();
        for (int i = 0; i < alternatives.size(); i++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(alternatives.get(i));
            radioButton.setId(i);
            answersRadioGroup.addView(radioButton);
        }

    }

}
