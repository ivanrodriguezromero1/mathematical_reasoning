package com.rasona.rasona.managers;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.rasona.R;
import com.rasona.rasona.activities.ProblemsActivity;
import com.rasona.rasona.activities.SolutionActivity;
import com.rasona.rasona.models.output.ProblemGenerated;
import com.rasona.rasona.utils.RadioButtonManager;
import com.rasona.rasona.utils.DialogAlert;

public class ButtonManager {

    private final Context context;
    private boolean isCheckMode = true;
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

    public void setupCheckButton(ProblemGenerated problemGenerated) {
        LinearLayout checkButtonLayout = ((AppCompatActivity) context).findViewById(R.id.checkButtonLayout);
        checkButtonLayout.setOnClickListener(v -> {
            if (isCheckMode) {
                handleCheckButton(problemGenerated);
            } else {
                handleViewSolution(problemGenerated);
            }
        });
    }

    public void setupNewButton(int currentPosition, int[] difficulty, int[] problemType) {
        LinearLayout newButtonLayout = ((AppCompatActivity) context).findViewById(R.id.newButtonLayout);
        newButtonLayout.setOnClickListener(v -> {
            LinearLayout contentBlock = ((AppCompatActivity) context).findViewById(R.id.contentBlock);
            contentBlock.startAnimation(android.view.animation.AnimationUtils.loadAnimation(context, R.anim.rotate_page));

            new android.os.Handler().postDelayed(() -> {
                ProblemGenerated newProblemGenerated = ((ProblemsActivity) context).regenerateProblem(currentPosition, difficulty, problemType);
                ((ProblemsActivity) context).displayNewProblem(newProblemGenerated);

                contentBlock.startAnimation(android.view.animation.AnimationUtils.loadAnimation(context, R.anim.rotate_page_in));

                enableHelpButtons();

                resetRadioButtons();

                ImageView resultIcon = ((AppCompatActivity) context).findViewById(R.id.answerResultImage);
                resultIcon.setVisibility(View.GONE);

                TextView previewText = ((AppCompatActivity) context).findViewById(R.id.preview);
                previewText.setVisibility(View.GONE);

                LinearLayout checkButtonLayout = ((AppCompatActivity) context).findViewById(R.id.checkButtonLayout);
                TextView checkText = checkButtonLayout.findViewById(R.id.checkText);
                checkText.setText(context.getString(R.string.check));
                isCheckMode = true;

                String newTip = newProblemGenerated.getTip();
                if (newTip != null && !newTip.isEmpty()) {
                    setupTipsButton(newProblemGenerated);
                }
                String newSolution = newProblemGenerated.getSolution();
                if (newSolution != null && !newSolution.isEmpty()) {
                    setupCheckButton(newProblemGenerated);
                }

                setupCrossOutButton(newProblemGenerated);

            }, 300);
        });
    }

    private void enableHelpButtons() {
        ImageButton btnCrossOut = ((AppCompatActivity) context).findViewById(R.id.btnCrossOut);
        ImageButton btnTips = ((AppCompatActivity) context).findViewById(R.id.btnTips);
        ImageButton btnPreview = ((AppCompatActivity) context).findViewById(R.id.btnPreview);

        btnCrossOut.setEnabled(true);
        btnTips.setEnabled(true);
        btnPreview.setEnabled(true);

        btnCrossOut.setAlpha(1.0f);
        btnTips.setAlpha(1.0f);
        btnPreview.setAlpha(1.0f);
    }

    private void resetRadioButtons() {
        RadioGroup answersRadioGroup = ((AppCompatActivity) context).findViewById(R.id.answersRadioGroup);
        answersRadioGroup.clearCheck();
        for (int i = 0; i < answersRadioGroup.getChildCount(); i++) {
            View child = answersRadioGroup.getChildAt(i);
            if (child instanceof RadioButton) {
                child.setEnabled(true);
                ((RadioButton) child).setChecked(false);
            }
        }
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

        for (int i = 0; i < answersRadioGroup.getChildCount(); i++) {
            View child = answersRadioGroup.getChildAt(i);
            if (child instanceof RadioButton) {
                child.setEnabled(false);
            }
        }

        LinearLayout checkButtonLayout = ((AppCompatActivity) context).findViewById(R.id.checkButtonLayout);
        TextView checkText = checkButtonLayout.findViewById(R.id.checkText);
        checkText.setText(context.getString(R.string.view_solution));
        isCheckMode = false;
        disableButton(((AppCompatActivity) context).findViewById(R.id.btnCrossOut));
        disableButton(((AppCompatActivity) context).findViewById(R.id.btnPreview));
        disableButton(((AppCompatActivity) context).findViewById(R.id.btnTips));
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
