package com.rasona.app.utils;

import android.graphics.Paint;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadioButtonManager {

    private static final String TAG = "RadioButtonManager";

    public static void disableTwoIncorrectOptions(RadioGroup radioGroup, List<String> alternatives, int correctAnswerIndex) {
        try {
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
                if (radioButton != null) {
                    if (radioButton.isChecked()) {
                        radioButton.setChecked(false);
                        radioGroup.clearCheck();
                    }
                    radioButton.setEnabled(false);
                    radioButton.setTextColor(ContextCompat.getColor(radioButton.getContext(), android.R.color.darker_gray));
                    radioButton.setPaintFlags(radioButton.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error disabling incorrect options: " + e.getMessage(), e);
        }
    }
}
