package com.rasona.rasona.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.*;
import com.rasona.rasona.R;

import java.util.List;

public class DialogAlert {

    public static void showTipDialog(Context context, String tipContent) {
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
    }

    public static void showSelectorDialog(Context context, String title, List<String> options, TextView textView, int index, int[] difficulty, int[] selectedOptionIndex) {
        View dialogView = LayoutInflater.from(context).inflate(R.layout.selector_dialog, null);

        TextView selectorTitle = dialogView.findViewById(R.id.selector_title);
        RadioGroup selectorRadioGroup = dialogView.findViewById(R.id.selector_radio_group);
        ScrollView selectorScrollView = dialogView.findViewById(R.id.selector_scroll_view);
        Button closeButton = dialogView.findViewById(R.id.close_button);

        selectorScrollView.setVerticalScrollBarEnabled(true);
        selectorScrollView.setScrollBarFadeDuration(0);

        selectorTitle.setText(title);

        createRadioButtons(context, selectorRadioGroup, options, textView, index, difficulty, selectedOptionIndex);

        ((RadioButton) selectorRadioGroup.getChildAt(selectedOptionIndex[index])).setChecked(true);

        AlertDialog dialog = new AlertDialog.Builder(context)
                .setView(dialogView)
                .create();

        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        adjustDialogWidth(dialog, context);

        limitScrollViewHeight(selectorScrollView, 600);

        closeButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
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
        int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        int margin = (int) (30 * context.getResources().getDisplayMetrics().density);

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = screenWidth - (2 * margin);

        dialog.getWindow().setAttributes(layoutParams);
    }

    private static void createRadioButtons(Context context, RadioGroup radioGroup, List<String> options, TextView textView, int index, int[] difficulty, int[] selectedOptionIndex) {
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
    }
}
