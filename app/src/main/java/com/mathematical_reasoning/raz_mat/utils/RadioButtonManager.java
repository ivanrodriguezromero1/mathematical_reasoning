package com.mathematical_reasoning.raz_mat.utils;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.content.ContextCompat;
import com.mathematical_reasoning.raz_mat.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RadioButtonManager {

    // Método estático para configurar los RadioButtons dinámicamente
    public static void setupRadioButtons(Context context, RadioGroup radioGroup, List<String> alternatives) {
        // Limpiar el RadioGroup antes de añadir nuevas opciones
        radioGroup.removeAllViews();

        // Crear parámetros de diseño para los RadioButtons
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(0, 0, 0, 8);  // Añadir margen inferior de 16dp

        // Generar dinámicamente los RadioButtons con estilo
        for (int i = 0; i < alternatives.size(); i++) {
            // Crear un nuevo RadioButton
            RadioButton radioButton = new RadioButton(context);

            radioButton.setText(alternatives.get(i));  // Establecer el texto de la alternativa
            radioButton.setId(View.generateViewId());  // Generar un ID único automáticamente

            // Aplicar estilos al RadioButton
            radioButton.setTextSize(15);
            radioButton.setTextColor(ContextCompat.getColorStateList(context, R.color.radio_button_selector));  // Color del texto
            radioButton.setButtonTintList(ContextCompat.getColorStateList(context, R.color.radio_button_selector));  // Color del botón
            radioButton.setLayoutParams(layoutParams);  // Aplicar los parámetros de diseño (márgenes)

            // Añadir el RadioButton al RadioGroup
            radioGroup.addView(radioButton);
        }

        // Configurar el estilo de RadioButton (poner en negrita cuando está seleccionado)
        RadioButtonUtils.setBoldWhenChecked(radioGroup);
    }

    // Método para inhabilitar dos alternativas incorrectas
    public static void disableTwoIncorrectOptions(RadioGroup radioGroup, List<String> alternatives, int correctAnswerIndex) {
        List<Integer> incorrectIndexes = new ArrayList<>();

        // Recoger los índices de las alternativas incorrectas
        for (int i = 0; i < alternatives.size(); i++) {
            if (i != correctAnswerIndex) {
                incorrectIndexes.add(i);
            }
        }

        // Mezclar los índices incorrectos y seleccionar dos
        Collections.shuffle(incorrectIndexes);
        List<Integer> selectedIndexes = incorrectIndexes.subList(0, 2);

        // Aplicar el estilo de deshabilitado a las dos alternativas seleccionadas
        for (int index : selectedIndexes) {
            RadioButton radioButton = (RadioButton) radioGroup.getChildAt(index);
            if (radioButton.isChecked()) {
                radioButton.setChecked(false);
                radioGroup.clearCheck();
            }
            radioButton.setEnabled(false);  // Deshabilitar el RadioButton
            radioButton.setTextColor(radioButton.getContext().getResources().getColor(android.R.color.darker_gray));  // Cambiar color a gris
            radioButton.setPaintFlags(radioButton.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);  // Subrayar el texto (tachado)
        }
    }

}
