package com.rasona.rasona.managers;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.rasona.R;
import com.rasona.rasona.activities.SolutionActivity;
import com.rasona.rasona.models.output.ProblemGenerated;
import com.rasona.rasona.utils.RadioButtonManager;
import com.rasona.rasona.utils.DialogAlert;

public class ButtonManager {

    private final Context context;

    public ButtonManager(Context context) {
        this.context = context;
    }

    public void setupCrossOutButton(ProblemGenerated problemGenerated) {
        ImageButton btnCrossOut = ((AppCompatActivity) context).findViewById(R.id.btnCrossOut);
        RadioGroup answersRadioGroup = ((AppCompatActivity) context).findViewById(R.id.answersRadioGroup);

        btnCrossOut.setOnClickListener(v -> {
            int correctAnswerIndex = problemGenerated.getCorrectKeyIndex();
            RadioButtonManager.disableTwoIncorrectOptions(answersRadioGroup, problemGenerated.getAlternatives(), correctAnswerIndex);
            disableButton(btnCrossOut);
        });
    }

    public void setupTipsButton(ProblemGenerated problemGenerated) {
        ImageButton btnTips = ((AppCompatActivity) context).findViewById(R.id.btnTips);
        btnTips.setOnClickListener(v -> DialogAlert.showTipDialog(context, problemGenerated.getTip()));
    }

    public void setupCheckButton(ProblemGenerated problemGenerated, boolean isCheckMode) {
        LinearLayout checkButtonLayout = ((AppCompatActivity) context).findViewById(R.id.checkButtonLayout);
        checkButtonLayout.setOnClickListener(v -> {
            if (isCheckMode) {
                handleCheckButton(problemGenerated);
            } else {
                handleViewSolution(problemGenerated);
            }
        });
    }

    public void setupNewButton(ProblemGenerated problemGenerated) {
        LinearLayout newButtonLayout = ((AppCompatActivity) context).findViewById(R.id.newButtonLayout);
        newButtonLayout.setOnClickListener(v -> {
        });
    }

    public void setupPreviewButton() {
        ImageButton btnPreview = ((AppCompatActivity) context).findViewById(R.id.btnPreview);
        TextView preview = ((AppCompatActivity) context).findViewById(R.id.preview);
        btnPreview.setOnClickListener(v -> {
            preview.setVisibility(View.VISIBLE);
            disableButton(btnPreview);
        });
    }

    public void setupSendProblemButton() {
        ImageButton btnSendProblem = ((AppCompatActivity) context).findViewById(R.id.btnSendProblem);
        btnSendProblem.setOnClickListener(v -> {
        });
    }

    public void setupSelectorDialogs() {
    }

    private void handleCheckButton(ProblemGenerated problemGenerated) {
        RadioGroup answersRadioGroup = ((AppCompatActivity) context).findViewById(R.id.answersRadioGroup);
        int selectedId = answersRadioGroup.getCheckedRadioButtonId();

        if (selectedId == -1) {
            Toast.makeText(context, context.getString(R.string.select_option), Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton selectedRadioButton = ((AppCompatActivity) context).findViewById(selectedId);
        String selectedText = selectedRadioButton.getText().toString();

        ImageView resultIcon = ((AppCompatActivity) context).findViewById(R.id.answerResultImage);
        if (selectedText.equals(problemGenerated.getAlternatives().get(problemGenerated.getCorrectKeyIndex()))) {
            resultIcon.setImageResource(R.drawable.image_correct);
        } else {
            resultIcon.setImageResource(R.drawable.image_error);
        }
        resultIcon.setVisibility(View.VISIBLE);
    }

    private void handleViewSolution(ProblemGenerated problemGenerated) {
        Intent solutionIntent = new Intent(context, SolutionActivity.class);
        solutionIntent.putExtra("solution", problemGenerated.getSolution());
        context.startActivity(solutionIntent);
        ((AppCompatActivity) context).overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
    }

    private void disableButton(View button) {
        button.setEnabled(false);
        button.setAlpha(0.5f);
    }
}
