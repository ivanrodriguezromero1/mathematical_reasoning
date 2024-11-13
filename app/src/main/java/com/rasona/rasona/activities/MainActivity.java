package com.rasona.rasona.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.rasona.R;
import com.rasona.rasona.models.input.MathematicalReasoning;
import com.rasona.rasona.utils.FileUtils;
import com.rasona.rasona.utils.SharedData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l0_layout_splash);
        MathematicalReasoning reasoning = FileUtils.readJsonFromRaw(this, R.raw.mathematical_reasoning);
        SharedData.getInstance().setReasoning(reasoning);

        int SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.grow_in, R.anim.fade_out);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
