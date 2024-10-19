package com.mathematical_reasoning.raz_mat.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.*;
import com.mathematical_reasoning.raz_mat.R;

public class DialogAlert {

    public static void showTipDialog(Context context, String tipContent) {
        // Inflar el layout personalizado del diálogo
        View dialogView = LayoutInflater.from(context).inflate(R.layout.tip_dialog, null);

        // Obtener referencias a los componentes del layout
        TextView tipTitle = dialogView.findViewById(R.id.tipTitle);
        TextView tipMessage = dialogView.findViewById(R.id.tipMessage);
        ScrollView tipScrollView = dialogView.findViewById(R.id.tipScrollView);
        Button closeButton = dialogView.findViewById(R.id.closeButton);

        // Configurar el contenido del diálogo
        tipTitle.setText(R.string.tip_title);
        tipMessage.setText(tipContent);

        // Crear y mostrar el diálogo
        AlertDialog dialog = new AlertDialog.Builder(context)
                .setView(dialogView)
                .create();

        // Ajustar el fondo y tamaño del diálogo
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        adjustDialogWidth(dialog, context);

        // Ajustar la altura del ScrollView si es necesario
        limitScrollViewHeight(tipScrollView, 600);

        // Configurar el botón de cerrar
        closeButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }

    private static final int[] selectedOptionIndex = {0,0};
    public static void showSelectorDialog(Context context, String title, String[] opciones, TextView textView, int index, int[] dificultad) {
        // Inflar el layout personalizado del diálogo
        View dialogView = LayoutInflater.from(context).inflate(R.layout.selector_dialog, null);

        // Obtener referencias a los componentes del layout
        TextView selectorTitle = dialogView.findViewById(R.id.selector_title);
        RadioGroup selectorRadioGroup = dialogView.findViewById(R.id.selector_radio_group);
        ScrollView selectorScrollView = dialogView.findViewById(R.id.selector_scroll_view);
        Button closeButton = dialogView.findViewById(R.id.close_button);

        // Configurar el título del selector
        selectorTitle.setText(title);

        // Crear los RadioButtons de las opciones programáticamente
        createRadioButtons(context, selectorRadioGroup, opciones, textView, index, dificultad);

        // Marcar el RadioButton previamente seleccionado
        ((RadioButton) selectorRadioGroup.getChildAt(selectedOptionIndex[index])).setChecked(true);

        // Crear y mostrar el diálogo
        AlertDialog dialog = new AlertDialog.Builder(context)
                .setView(dialogView)
                .create();

        // Ajustar el fondo y tamaño del diálogo
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        adjustDialogWidth(dialog, context);

        // Limitar la altura del ScrollView si es necesario
        limitScrollViewHeight(selectorScrollView, 600);

        // Configurar el botón de cerrar
        closeButton.setOnClickListener(v -> dialog.dismiss());

        dialog.show();
    }

    // Método para limitar la altura del ScrollView
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

    // Método para ajustar el ancho del diálogo
    private static void adjustDialogWidth(AlertDialog dialog, Context context) {
        int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
        int margin = (int) (30 * context.getResources().getDisplayMetrics().density); // Convertir 30dp a píxeles

        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(dialog.getWindow().getAttributes());
        layoutParams.width = screenWidth - (2 * margin);

        dialog.getWindow().setAttributes(layoutParams);
    }

    // Método para crear los RadioButtons de las opciones
    private static void createRadioButtons(Context context, RadioGroup radioGroup, String[] opciones, TextView textView, int index, int[] dificultad) {
        for (int i = 0; i < opciones.length; i++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setText(opciones[i]);
            radioButton.setId(i);
            radioGroup.addView(radioButton);
        }

        // Manejar la selección de una opción
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton selectedRadioButton = group.findViewById(checkedId);
            if (selectedRadioButton != null) {
                selectedOptionIndex[index] = checkedId;
                textView.setText(opciones[checkedId]);
                dificultad[0] = checkedId;
            }
        });
    }

}

