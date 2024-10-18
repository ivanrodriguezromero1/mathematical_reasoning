package com.mathematical_reasoning.raz_mat.utils;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtils {

    // Método para obtener el contenido de un archivo raw
    public static String getTextFromRaw(Context context, int resourceId) {
        StringBuilder text = new StringBuilder();
        InputStream inputStream = context.getResources().openRawResource(resourceId);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                text.append(line);
                if (reader.ready()) {
                    text.append("\n"); // Solo agrega salto de línea si hay más líneas
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }

}

