package com.rasona.app.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.app.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l0_layout_splash);

        int SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    ActivityOptions options = ActivityOptions.makeCustomAnimation(
                            MainActivity.this,
                            R.anim.grow_in,
                            R.anim.fade_out
                    );
                    startActivity(i, options.toBundle());
                    finish();
                } catch (Exception e) {
                    Log.e("MainActivity", "Error while starting HomeActivity", e);
                    Toast.makeText(MainActivity.this, "An error occurred while opening the app.", Toast.LENGTH_SHORT).show();
                }
            }
        }, SPLASH_TIME_OUT);
    }
}
