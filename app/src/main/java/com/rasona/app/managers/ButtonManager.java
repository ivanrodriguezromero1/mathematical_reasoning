package com.rasona.app.managers;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.app.R;
import com.rasona.app.activities.ProblemsActivity;
import com.rasona.app.activities.SolutionActivity;
import com.rasona.app.models.output.ProblemGenerated;
import com.rasona.app.utils.RadioButtonManager;
import com.rasona.app.utils.DialogAlert;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ButtonManager {

    private final Context context;
    private boolean isCheckMode = true;

    public ButtonManager(Context context) {
        this.context = context;
    }

    public void setupCrossOutButton(ProblemGenerated problemGenerated) {
        try {
            ImageButton btnCrossOut = ((AppCompatActivity) context).findViewById(R.id.btnCrossOut);
            RadioGroup answersRadioGroup = ((AppCompatActivity) context).findViewById(R.id.answersRadioGroup);

            btnCrossOut.setOnClickListener(v -> {
                int correctAnswerIndex = problemGenerated.getCorrectKeyIndex();
                RadioButtonManager.disableTwoIncorrectOptions(answersRadioGroup, problemGenerated.getAlternatives(), correctAnswerIndex);
                disableButton(btnCrossOut);
            });
        } catch (Exception e) {
            Toast.makeText(context, "An error occurred with the Cross Out button.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setupTipsButton(ProblemGenerated problemGenerated) {
        try {
            ImageButton btnTips = ((AppCompatActivity) context).findViewById(R.id.btnTips);
            btnTips.setOnClickListener(v -> {
                try {
                    DialogAlert.showTipDialog(context, problemGenerated.getTip());
                } catch (Exception ex) {
                    Toast.makeText(context, "Error showing tip.", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(context, "An error occurred with the Tips button.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setupCheckButton(ProblemGenerated problemGenerated) {
        try {
            LinearLayout checkButtonLayout = ((AppCompatActivity) context).findViewById(R.id.checkButtonLayout);
            checkButtonLayout.setOnClickListener(v -> {
                try {
                    if (isCheckMode) {
                        handleCheckButton(problemGenerated);
                    } else {
                        handleViewSolution(problemGenerated);
                    }
                } catch (Exception e) {
                    Toast.makeText(context, "An error occurred while checking the solution.", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(context, "An error occurred with the Check button.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setupNewButton(int currentPosition, int[] difficulty, int[] problemType) {
        try {
            LinearLayout newButtonLayout = ((AppCompatActivity) context).findViewById(R.id.newButtonLayout);
            newButtonLayout.setOnClickListener(v -> {
                try {
                    LinearLayout contentBlock = ((AppCompatActivity) context).findViewById(R.id.contentBlock);
                    contentBlock.startAnimation(android.view.animation.AnimationUtils.loadAnimation(context, R.anim.rotate_page));

                    new android.os.Handler().postDelayed(() -> {
                        try {
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
                            setupSendProblemButton(newProblemGenerated);
                        } catch (Exception e) {
                            Toast.makeText(context, "An error occurred while generating a new problem.", Toast.LENGTH_SHORT).show();
                        }
                    }, 300);
                } catch (Exception e) {
                    Toast.makeText(context, "Error handling New button action.", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(context, "An error occurred with the New button.", Toast.LENGTH_SHORT).show();
        }
    }

    private void enableHelpButtons() {
        try {
            ImageButton btnCrossOut = ((AppCompatActivity) context).findViewById(R.id.btnCrossOut);
            ImageButton btnTips = ((AppCompatActivity) context).findViewById(R.id.btnTips);
            ImageButton btnPreview = ((AppCompatActivity) context).findViewById(R.id.btnPreview);
            ImageButton btnSendProblem = ((AppCompatActivity) context).findViewById(R.id.btnSendProblem);

            btnCrossOut.setEnabled(true);
            btnTips.setEnabled(true);
            btnPreview.setEnabled(true);
            btnSendProblem.setEnabled(true);

            btnCrossOut.setAlpha(1.0f);
            btnTips.setAlpha(1.0f);
            btnPreview.setAlpha(1.0f);
            btnSendProblem.setAlpha(1.0f);
        } catch (Exception e) {
            Toast.makeText(context, "Error enabling help buttons.", Toast.LENGTH_SHORT).show();
        }
    }

    private void resetRadioButtons() {
        try {
            RadioGroup answersRadioGroup = ((AppCompatActivity) context).findViewById(R.id.answersRadioGroup);
            answersRadioGroup.clearCheck();
            for (int i = 0; i < answersRadioGroup.getChildCount(); i++) {
                View child = answersRadioGroup.getChildAt(i);
                if (child instanceof RadioButton) {
                    child.setEnabled(true);
                    ((RadioButton) child).setChecked(false);
                }
            }
        } catch (Exception e) {
            Toast.makeText(context, "Error resetting radio buttons.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setupPreviewButton() {
        try {
            ImageButton btnPreview = ((AppCompatActivity) context).findViewById(R.id.btnPreview);
            TextView preview = ((AppCompatActivity) context).findViewById(R.id.preview);
            btnPreview.setOnClickListener(v -> {
                try {
                    preview.setVisibility(View.VISIBLE);
                    disableButton(btnPreview);
                } catch (Exception e) {
                    Toast.makeText(context, "Error showing preview.", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(context, "An error occurred with the Preview button.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setupSendProblemButton(ProblemGenerated problemGenerated) {
        try {
            ImageButton btnSendProblem = ((AppCompatActivity) context).findViewById(R.id.btnSendProblem);
            btnSendProblem.setOnClickListener(v -> {
                try {
                    StringBuilder problemContent = getStringBuilder(problemGenerated);

                    Intent sendIntent = new Intent(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT, problemContent.toString());

                    Intent shareIntent = Intent.createChooser(sendIntent, "Choose an app to share the problem");
                    context.startActivity(shareIntent);
                    disableButton(btnSendProblem);
                } catch (Exception e) {
                    Toast.makeText(context, "Error sending the problem.", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Toast.makeText(context, "An error occurred with the Send Problem button.", Toast.LENGTH_SHORT).show();
        }
    }

    private static @NotNull StringBuilder getStringBuilder(ProblemGenerated problemGenerated) {
        StringBuilder problemContent = new StringBuilder();
        problemContent.append("Here's a problem I'm working on:\n\n");
        problemContent.append("Problem Statement:\n").append(problemGenerated.getStatement()).append("\n\n");
        problemContent.append("Alternatives:\n");

        List<String> alternatives = problemGenerated.getAlternatives();
        for (int i = 0; i < alternatives.size(); i++) {
            problemContent.append((char) ('A' + i)).append(". ").append(alternatives.get(i)).append("\n");
        }
        return problemContent;
    }

    public void setupSelectorDialogs() {
    }

    private void handleCheckButton(ProblemGenerated problemGenerated) {
        try {
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
        } catch (Exception e) {
            Toast.makeText(context, "Error checking the answer.", Toast.LENGTH_SHORT).show();
        }
    }

    private void handleViewSolution(ProblemGenerated problemGenerated) {
        try {
            Intent solutionIntent = new Intent(context, SolutionActivity.class);
            solutionIntent.putExtra("solution", problemGenerated.getSolution());
            if (context instanceof AppCompatActivity) {
                ActivityOptions options = ActivityOptions.makeCustomAnimation(
                        context,
                        R.anim.slide_in_top,
                        R.anim.slide_out_bottom
                );
                ((AppCompatActivity) context).startActivity(solutionIntent, options.toBundle());
            } else {
                context.startActivity(solutionIntent);
            }
        } catch (Exception e) {
            Toast.makeText(context, "Error navigating to the solution.", Toast.LENGTH_SHORT).show();
        }
    }

    private void disableButton(View button) {
        try {
            button.setEnabled(false);
            button.setAlpha(0.5f);
        } catch (Exception e) {
            Toast.makeText(context, "Error disabling the button.", Toast.LENGTH_SHORT).show();
        }
    }
}
