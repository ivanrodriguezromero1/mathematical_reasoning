package com.rasona.app.utils;

import android.content.Context;
import android.util.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rasona.app.models.input.MathematicalReasoning;

import java.io.IOException;
import java.io.InputStream;

public class FileUtils {

    private static final String TAG = "FileUtils";

    public static MathematicalReasoning readJsonFromRaw(Context context, int resourceId) {
        ObjectMapper objectMapper = new ObjectMapper();
        MathematicalReasoning reasoning = null;

        try {
            InputStream inputStream = context.getResources().openRawResource(resourceId);
            reasoning = objectMapper.readValue(inputStream, MathematicalReasoning.class);
        } catch (IOException ex) {
            Log.e(TAG, "Error reading JSON from raw resource: " + resourceId, ex);
        }

        return reasoning;
    }
}
