package com.rasona.app.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.*;
import com.rasona.app.R;
import com.rasona.app.activities.ProblemsActivity;

import java.util.List;

public class DialogAlert {

    public static void showTipDialog(Context context, String tipContent) {
        try {
            View dialogView = LayoutInflater.from(context).inflate(R.layout.tip_dialog, null);

            TextView tipTitle = dialogView.findViewById(R.id.tipTitle);
            TextView tipMessage = dialogView.findViewById(R.id.tipMessage);
            ScrollView tipScrollView = dialogView.findViewById(R.id.tipScrollView);
            Button closeButton = dialogView.findViewById(R.id.closeButton);

            tipScrollView.setVerticalScrollBarEnabled(true);
            tipScrollView.setScrollBarFadeDuration(0);

            tipTitle.setText(R.string.tip_title);
            tipMessage.setText(tipContent);

            AlertDialog dialog = new AlertDialog.Builder(context)
                    .setView(dialogView)
                    .create();

            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            adjustDialogWidth(dialog, context);

            limitScrollViewHeight(tipScrollView, 600);

            closeButton.setOnClickListener(v -> dialog.dismiss());

            dialog.show();
        } catch (Exception e) {
            Toast.makeText(context, "Error displaying tip dialog.", Toast.LENGTH_SHORT).show();
            Log.e("DialogAlert", "Error in showTipDialog", e);
        }
    }

    public static void showSelectorDifficultyDialog(Context context, String title, List<String> options, TextView textView, int index, int[] radioButtonValues, int[] selectedDifficultyIndex, int[] selectedProblemTypeIndex) {
        try {
            View dialogView = LayoutInflater.from(context).inflate(R.layout.selector_dialog, null);

            TextView selectorTitle = dialogView.findViewById(R.id.selector_title);
            RadioGroup selectorRadioGroup = dialogView.findViewById(R.id.selector_radio_group);
            ScrollView selectorScrollView = dialogView.findViewById(R.id.selector_scroll_view);
            Button closeButton = dialogView.findViewById(R.id.close_button);

            selectorScrollView.setVerticalScrollBarEnabled(true);
            selectorScrollView.setScrollBarFadeDuration(0);

            selectorTitle.setText(title);

            createRadioButtons(context, selectorRadioGroup, options, textView, index, radioButtonValues, selectedDifficultyIndex);

            ((RadioButton) selectorRadioGroup.getChildAt(selectedDifficultyIndex[index])).setChecked(true);

            AlertDialog dialog = new AlertDialog.Builder(context)
                    .setView(dialogView)
                    .create();

            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            adjustDialogWidth(dialog, context);

            limitScrollViewHeight(selectorScrollView, 700);

            closeButton.setOnClickListener(v -> dialog.dismiss());

            selectorRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
                RadioButton selectedRadioButton = group.findViewById(checkedId);
                if (selectedRadioButton != null) {
                    selectedDifficultyIndex[index] = checkedId;
                    textView.setText(options.get(checkedId));
                    radioButtonValues[0] = checkedId;

                    if (context instanceof ProblemsActivity) {
                        ((ProblemsActivity) context).setCurrentSelectedDifficultyIndex(checkedId);
                        ((ProblemsActivity) context).setupButtonListeners(selectedDifficultyIndex, selectedProblemTypeIndex);
                    }
                }
            });

            dialog.show();
        } catch (Exception e) {
            Toast.makeText(context, "Error displaying difficulty selector dialog.", Toast.LENGTH_SHORT).show();
             Log.e("DialogAlert", "Error in showSelectorDifficultyDialog", e);
        }
    }

    public static void showSelectorProblemTypeDialog(Context context, String title, List<String> options, TextView textView, int index, int[] radioButtonValues, int[] selectedDifficultyIndex, int[] selectedProblemTypeIndex) {
        try {
            View dialogView = LayoutInflater.from(context).inflate(R.layout.selector_dialog, null);

            TextView selectorTitle = dialogView.findViewById(R.id.selector_title);
            RadioGroup selectorRadioGroup = dialogView.findViewById(R.id.selector_radio_group);
            ScrollView selectorScrollView = dialogView.findViewById(R.id.selector_scroll_view);
            Button closeButton = dialogView.findViewById(R.id.close_button);

            selectorScrollView.setVerticalScrollBarEnabled(true);
            selectorScrollView.setScrollBarFadeDuration(0);

            selectorTitle.setText(title);

            createRadioButtons(context, selectorRadioGroup, options, textView, index, radioButtonValues, selectedProblemTypeIndex);

            ((RadioButton) selectorRadioGroup.getChildAt(selectedProblemTypeIndex[index])).setChecked(true);

            AlertDialog dialog = new AlertDialog.Builder(context)
                    .setView(dialogView)
                    .create();

            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            adjustDialogWidth(dialog, context);

            limitScrollViewHeight(selectorScrollView, 700);

            closeButton.setOnClickListener(v -> dialog.dismiss());

            selectorRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
                RadioButton selectedRadioButton = group.findViewById(checkedId);
                if (selectedRadioButton != null) {
                    selectedProblemTypeIndex[index] = checkedId;
                    textView.setText(options.get(checkedId));
                    radioButtonValues[0] = checkedId;

                    if (context instanceof ProblemsActivity) {
                        ((ProblemsActivity) context).setCurrentSelectedProblemTypeIndex(checkedId);
                        ((ProblemsActivity) context).setupButtonListeners(selectedDifficultyIndex, selectedProblemTypeIndex);
                    }
                }
            });

            dialog.show();
        } catch (Exception e) {
            Toast.makeText(context, "Error displaying problem type selector dialog.", Toast.LENGTH_SHORT).show();
            Log.e("DialogAlert", "Error in showSelectorProblemTypeDialog", e);
        }
    }

    private static void limitScrollViewHeight(ScrollView scrollView, int maxHeight) {
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int height = scrollView.getChildAt(0).getHeight();
                if (height > maxHeight) {
                    scrollView.getLayoutParams().height = maxHeight;
                    scrollView.requestLayout();
                }
                scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private static void adjustDialogWidth(AlertDialog dialog, Context context) {
        try {
            int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
            int margin = (int) (30 * context.getResources().getDisplayMetrics().density);

            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = screenWidth - (2 * margin);

            dialog.getWindow().setAttributes(layoutParams);
        } catch (Exception e) {
            Toast.makeText(context, "Error adjusting dialog width.", Toast.LENGTH_SHORT).show();
            Log.e("DialogAlert", "Error in adjustDialogWidth", e);
        }
    }

    private static void createRadioButtons(Context context, RadioGroup radioGroup, List<String> options, TextView textView, int index, int[] difficulty, int[] selectedOptionIndex) {
        try {
            for (int i = 0; i < options.size(); i++) {
                RadioButton radioButton = new RadioButton(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                layoutParams.setMargins(0, 0, 0, 40);
                radioButton.setLayoutParams(layoutParams);
                radioButton.setText(options.get(i));
                radioButton.setId(i);
                radioGroup.addView(radioButton);
            }

            radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
                RadioButton selectedRadioButton = group.findViewById(checkedId);
                if (selectedRadioButton != null) {
                    selectedOptionIndex[index] = checkedId;
                    textView.setText(options.get(checkedId));
                    difficulty[0] = checkedId;
                }
            });
        } catch (Exception e) {
            Toast.makeText(context, "Error creating radio buttons.", Toast.LENGTH_SHORT).show();
            Log.e("DialogAlert", "Error in createRadioButtons", e);
        }
    }
}
