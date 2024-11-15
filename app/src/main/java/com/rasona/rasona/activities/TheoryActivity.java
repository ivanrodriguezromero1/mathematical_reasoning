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
import com.rasona.rasona.models.input.MathematicalReasoning;
import com.rasona.rasona.models.input.Topic;
import com.rasona.rasona.utils.FileUtils;
import com.rasona.rasona.utils.billing.BillingManager;

public class TheoryActivity extends AppCompatActivity {

    private static final String REFERENCES = "References";
    private BillingManager billingManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l2_layout_theory);
        MathematicalReasoning reasoning = FileUtils.readJsonFromRaw(this, R.raw.mathematical_reasoning);
        billingManager = new BillingManager(this);
        ImageView iconImageView = findViewById(R.id.iconImageView);
        TextView appBarTitle = findViewById(R.id.appBarTitle);
        TextView contentTextView = findViewById(R.id.theoryContent);

        Intent intent = getIntent();
        int resourceIcon = intent.getIntExtra("resourceIcon", 0);
        String title = intent.getStringExtra("title");
        int currentPosition = intent.getIntExtra("currentPosition", 0);

        iconImageView.setImageResource(resourceIcon);
        appBarTitle.setText(title);

        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnPremium = findViewById(R.id.btn_premium);
        LinearLayout btnShare = findViewById(R.id.btn_share);
        ImageView homeIcon = btnHome.findViewById(R.id.btn_home_icon);
        TextView homeText = btnHome.findViewById(R.id.btn_home_text);
        homeIcon.setColorFilter(Color.WHITE);
        homeText.setTextColor(Color.WHITE);

        StringBuilder sb = new StringBuilder();
        Topic topic = reasoning.getTopics().get(currentPosition);
        sb.append(topic.getTheory()).append(System.lineSeparator());
        sb.append(System.lineSeparator()).append(System.lineSeparator());
        sb.append(REFERENCES);
        sb.append(System.lineSeparator()).append(System.lineSeparator());
        sb.append(topic.getReferences().get(0)).append(System.lineSeparator());
        sb.append(topic.getReferences().get(1)).append(System.lineSeparator());
        sb.append(topic.getReferences().get(2));
        contentTextView.setText(sb.toString());

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TheoryActivity.this, HomeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });

        btnPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                billingManager.startSubscription(TheoryActivity.this);
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareMessage = "Boost your math skills with this interesting app! Check it out: https://play.google.com/store/apps/details?id=" + getPackageName();
                Intent shareIntent = new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                shareIntent.setType("text/plain");
                startActivity(Intent.createChooser(shareIntent, "Choose how to share"));
            }
        });
    }
}
