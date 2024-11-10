package com.rasona.rasona.utils;

import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rasona.rasona.models.input.MathematicalReasoning;

import java.io.IOException;
import java.io.InputStream;

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

