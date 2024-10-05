package com.mathematical_reasoning.raz_mat.utils;

import android.graphics.Typeface;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioButtonUtils {

    // Método estático para configurar el estilo de texto en los RadioButtons
    public static void setBoldWhenChecked(RadioGroup radioGroup) {
        // Listener que cambia el estilo de texto
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Iterar sobre los hijos del RadioGroup
                for (int i = 0; i < group.getChildCount(); i++) {
                    RadioButton button = (RadioButton) group.getChildAt(i);
                    if (button.getId() == checkedId) {
                        // Poner en negrita el RadioButton seleccionado
                        button.setTypeface(null, Typeface.BOLD);
                    } else {
                        // Poner en estilo normal los no seleccionados
                        button.setTypeface(null, Typeface.NORMAL);
                    }
                }
            }
        });
    }
}
