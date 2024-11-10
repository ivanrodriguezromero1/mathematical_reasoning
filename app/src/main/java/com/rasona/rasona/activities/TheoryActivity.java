package com.rasona.rasona.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.rasona.rasona.R;

public class TheoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l2_layout_theory);

        ImageView iconImageView = findViewById(R.id.iconImageView);
        TextView appBarTitle = findViewById(R.id.appBarTitle);
        TextView contentTextView = findViewById(R.id.theoryContent);

        Intent intent = getIntent();
        int iconResource = intent.getIntExtra("iconResource", 0);
        String title = intent.getStringExtra("title");

        iconImageView.setImageResource(iconResource);
        appBarTitle.setText(title);

        LinearLayout btnHome = findViewById(R.id.btn_home);
        ImageView homeIcon = btnHome.findViewById(R.id.btn_home_icon);
        TextView homeText = btnHome.findViewById(R.id.btn_home_text);
        homeIcon.setColorFilter(Color.WHITE);
        homeText.setTextColor(Color.WHITE);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheoryActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }
}
