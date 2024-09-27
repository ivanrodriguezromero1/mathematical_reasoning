package com.mathematical_reasoning.raz_mat;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Cargar la librería nativa en lib.cpp
    static {
        System.loadLibrary("lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Usar el método de lib.cpp
        TextView textView = findViewById(R.id.text_view);
        textView.setText(stringFromJNI());
    }

    // Declarar el método que será implementado en C++
    public native String stringFromJNI();
}
