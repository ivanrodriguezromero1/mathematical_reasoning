package com.mathematical_reasoning.raz_mat.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import com.mathematical_reasoning.raz_mat.R;

public class DialogAlert {

    public static void showTipDialog(Context context, String tipContent) {
        // Crear el diálogo
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        // Usar un LayoutInflater para inflar el layout personalizado del diálogo
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.dialog_tip, null);  // Usar un layout personalizado
        builder.setView(dialogView);

        // Obtener referencias de los componentes dentro del layout del diálogo
        TextView tipTitle = dialogView.findViewById(R.id.tipTitle);  // El título del modal
        TextView tipMessage = dialogView.findViewById(R.id.tipMessage);  // El contenido del tip
        Button closeButton = dialogView.findViewById(R.id.closeButton);  // Botón de cerrar

        // Configurar el contenido del diálogo
        tipTitle.setText(context.getString(R.string.tip_title));  // El título lo puedes definir en strings.xml como "Consejo"
        tipMessage.setText(tipContent);  // Mostrar el tip pasado como parámetro

        // Utilizar el ViewTreeObserver para asegurarse de que el ScrollView ya esté completamente inflado
        ScrollView tipScrollView = dialogView.findViewById(R.id.tipScrollView);
        ViewTreeObserver viewTreeObserver = tipScrollView.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                // Obtener la altura real del contenido del ScrollView
                int height = tipScrollView.getChildAt(0).getHeight();

                // Si el contenido es mayor que 300dp, limitar la altura a 300dp
                if (height > 600) {
                    tipScrollView.getLayoutParams().height = 600;
                    tipScrollView.requestLayout();  // Actualizar el layout después del cambio
                }

                // Remover el listener para evitar que se llame varias veces
                tipScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });

        // Crear el diálogo antes de cerrar en el botón de cerrar
        AlertDialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();
        // Configurar el botón de cerrar
        closeButton.setOnClickListener(v -> {
            // Cerrar el diálogo
            dialog.dismiss();
        });
        // Ajustar el tamaño del diálogo para que no ocupe todo el ancho y tenga margen
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

        // Obtener el ancho de la pantalla
        int width = context.getResources().getDisplayMetrics().widthPixels;

        // Configurar el ancho del diálogo restando los márgenes (30dp en cada lado)
        int margin = (int) (30 * context.getResources().getDisplayMetrics().density); // Convertir 20dp a píxeles
        layoutParams.copyFrom(dialog.getWindow().getAttributes()); // Copiar los parámetros del diálogo actual
        layoutParams.width = width - (2 * margin); // Restar los márgenes al ancho total

        // Aplicar los nuevos parámetros al diálogo
        dialog.getWindow().setAttributes(layoutParams);


    }
}
