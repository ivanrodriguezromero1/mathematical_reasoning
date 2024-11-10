package com.rasona.rasona.utils;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.content.ContextCompat;
import com.rasona.rasona.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadioButtonManager {

    public static void setupRadioButtons(Context context, RadioGroup radioGroup, List<String> alternatives) {
        radioGroup.removeAllViews();

        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(0, 0, 0, 8);

        for (int i = 0; i < alternatives.size(); i++) {
            RadioButton radioButton = new RadioButton(context);

            radioButton.setText(alternatives.get(i));
            radioButton.setId(View.generateViewId());

            radioButton.setTextSize(15);
            radioButton.setTextColor(ContextCompat.getColorStateList(context, R.color.rasonaBlue));
            radioButton.setButtonTintList(ContextCompat.getColorStateList(context, R.color.rasonaBlue));
            radioButton.setLayoutParams(layoutParams);

            radioGroup.addView(radioButton);
        }

        RadioButtonUtils.setBoldWhenChecked(radioGroup);
    }

    public static void disableTwoIncorrectOptions(RadioGroup radioGroup, List<String> alternatives, int correctAnswerIndex) {
        List<Integer> incorrectIndexes = new ArrayList<>();

        for (int i = 0; i < alternatives.size(); i++) {
            if (i != correctAnswerIndex) {
                incorrectIndexes.add(i);
            }
        }

        Collections.shuffle(incorrectIndexes);
        List<Integer> selectedIndexes = incorrectIndexes.subList(0, 2);

        for (int index : selectedIndexes) {
            RadioButton radioButton = (RadioButton) radioGroup.getChildAt(index);
            if (radioButton.isChecked()) {
                radioButton.setChecked(false);
                radioGroup.clearCheck();
            }
            radioButton.setEnabled(false);
            radioButton.setTextColor(radioButton.getContext().getResources().getColor(android.R.color.darker_gray));
            radioButton.setPaintFlags(radioButton.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
    }

}
