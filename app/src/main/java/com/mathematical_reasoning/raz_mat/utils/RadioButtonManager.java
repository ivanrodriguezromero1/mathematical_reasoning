package com.mathematical_reasoning.raz_mat.utils;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.content.ContextCompat;
import com.mathematical_reasoning.raz_mat.R;

import java.util.List;

public class RadioButtonManager {

    // Método estático para configurar los RadioButtons dinámicamente
    public static void setupRadioButtons(Context context, RadioGroup radioGroup, List<String> alternativas) {
        // Limpiar el RadioGroup antes de añadir nuevas opciones
        radioGroup.removeAllViews();

        // Crear parámetros de diseño para los RadioButtons
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
        );
        layoutParams.setMargins(0, 0, 0, 16);  // Añadir margen inferior de 16dp

        // Generar dinámicamente los RadioButtons con estilo
        for (int i = 0; i < alternativas.size(); i++) {
            // Crear un nuevo RadioButton
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(alternativas.get(i));  // Establecer el texto de la alternativa
            radioButton.setId(View.generateViewId());  // Generar un ID único automáticamente

            // Aplicar estilos al RadioButton
            radioButton.setTextSize(18);  // Texto de 18sp
            radioButton.setTextColor(ContextCompat.getColorStateList(context, R.color.radio_button_selector));  // Color del texto
            radioButton.setButtonTintList(ContextCompat.getColorStateList(context, R.color.radio_button_selector));  // Color del botón
            radioButton.setLayoutParams(layoutParams);  // Aplicar los parámetros de diseño (márgenes)

            // Añadir el RadioButton al RadioGroup
            radioGroup.addView(radioButton);
        }

        // Configurar el estilo de RadioButton (poner en negrita cuando está seleccionado)
        RadioButtonUtils.setBoldWhenChecked(radioGroup);
    }
}
