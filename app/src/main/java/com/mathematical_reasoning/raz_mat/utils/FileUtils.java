package com.mathematical_reasoning.raz_mat.utils;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mathematical_reasoning.raz_mat.models.input.MathematicalReasoning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtils {

    public static MathematicalReasoning readJsonFromRaw(Context context, int resourceId) {
        ObjectMapper objectMapper = new ObjectMapper();
        MathematicalReasoning reasoning = null;

        try {
            InputStream inputStream = context.getResources().openRawResource(resourceId);
            reasoning = objectMapper.readValue(inputStream, MathematicalReasoning.class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return reasoning;
    }
}

