package com.mathematical_reasoning.raz_mat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l0_layout_splash);

        int SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Inicia la pantalla de inicio
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);
                // Aplica la animación personalizada
                overridePendingTransition(R.anim.grow_in, R.anim.fade_out);  // Animaciones de entrada y salida
                finish(); // Finalizar el Splash Activity para evitar regresar a él
            }
        }, SPLASH_TIME_OUT);
    }
}
