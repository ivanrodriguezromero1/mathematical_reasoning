package com.mathematical_reasoning.raz_mat.utils;

import android.graphics.Typeface;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioButtonUtils {

    public static void setBoldWhenChecked(RadioGroup radioGroup) {
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            for (int i = 0; i < group.getChildCount(); i++) {
                RadioButton button = (RadioButton) group.getChildAt(i);
                if (button.getId() == checkedId) {
                    button.setTypeface(null, Typeface.BOLD);
                } else {
                    button.setTypeface(null, Typeface.NORMAL);
                }
            }
        });
    }
}
