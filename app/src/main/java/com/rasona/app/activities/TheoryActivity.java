package com.rasona.app.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.rasona.app.R;
import com.rasona.app.models.input.MathematicalReasoning;
import com.rasona.app.models.input.Topic;
import com.rasona.app.utils.FileUtils;
import com.rasona.app.utils.billing.BillingManager;

import java.util.List;

public class TheoryActivity extends AppCompatActivity {

    private static final String REFERENCES = "References";
    private static final String TOPIC_INFORMATION_NOT_AVAILABLE = "Topic information not available.";
    private BillingManager billingManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l2_layout_theory);

        try {
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

            if (topic != null) {
                sb.append(topic.getTheory()).append(System.lineSeparator());
                sb.append(System.lineSeparator()).append(System.lineSeparator());
                sb.append(REFERENCES).append(System.lineSeparator()).append(System.lineSeparator());

                List<String> references = topic.getReferences();
                for (int i = 0; i < Math.min(references.size(), 3); i++) {
                    sb.append(references.get(i)).append(System.lineSeparator());
                }
                contentTextView.setText(sb.toString());
            } else {
                contentTextView.setText(TOPIC_INFORMATION_NOT_AVAILABLE);
                Toast.makeText(this, "Topic data could not be loaded.", Toast.LENGTH_SHORT).show();
            }

            btnHome.setOnClickListener(v -> {
                try {
                    Intent intent1 = new Intent(TheoryActivity.this, HomeActivity.class);
                    ActivityOptions options = ActivityOptions.makeCustomAnimation(
                            TheoryActivity.this,
                            R.anim.slide_in_left,
                            R.anim.slide_out_right
                    );
                    startActivity(intent1, options.toBundle());
                } catch (Exception e) {
                    Log.e("NavigationError", "Error navigating to HomeActivity", e);
                    Toast.makeText(TheoryActivity.this, "Navigation error occurred.", Toast.LENGTH_SHORT).show();
                }
            });

            btnPremium.setOnClickListener(v -> {
                try {
                    billingManager.startSubscription(TheoryActivity.this);
                } catch (Exception e) {
                    Log.e("BillingError", "Subscription process encountered an error.", e);
                    Toast.makeText(TheoryActivity.this, "Subscription is not available at the moment.", Toast.LENGTH_SHORT).show();
                }
            });

            btnShare.setOnClickListener(v -> {
                try {
                    String shareMessage = "Boost your math skills with this interesting app! Check it out: https://play.google.com/store/apps/details?id=" + getPackageName();
                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    shareIntent.setType("text/plain");
                    startActivity(Intent.createChooser(shareIntent, "Choose how to share"));
                } catch (Exception e) {
                    Log.e("ShareError", "Error during sharing process", e);
                    Toast.makeText(TheoryActivity.this, "An error occurred while sharing.", Toast.LENGTH_SHORT).show();
                }
            });
        } catch (Exception e) {
            Log.e("InitializationError", "Error initializing TheoryActivity", e);
            Toast.makeText(this, "An error occurred during initialization.", Toast.LENGTH_SHORT).show();
        }
    }
}
