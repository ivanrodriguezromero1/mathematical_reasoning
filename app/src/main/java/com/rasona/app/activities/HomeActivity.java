package com.rasona.app.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.rasona.app.R;
import com.rasona.app.models.input.MathematicalReasoning;
import com.rasona.app.utils.FileUtils;
import com.rasona.app.utils.TopicUtils;
import com.rasona.app.utils.billing.BillingManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

    private BillingManager billingManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1_layout_main);

        boolean isSubscribed;
        try {
            billingManager = new BillingManager(this);
            isSubscribed = billingManager.isSubscribed();
        } catch (Exception e) {
            Log.e("BillingInitError", "Error initializing BillingManager", e);
            Toast.makeText(this, "Billing system initialization failed.", Toast.LENGTH_SHORT).show();
            isSubscribed = false;
        }

        try {
            MathematicalReasoning reasoning = FileUtils.readJsonFromRaw(this, R.raw.mathematical_reasoning);
            RecyclerView recyclerView = findViewById(R.id.recyclerView);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            recyclerView.setVerticalScrollBarEnabled(true);
            recyclerView.setScrollBarFadeDuration(0);

            Map<String, Integer> topicMap = TopicUtils.createTopicMap(reasoning);

            int[] itemIconsRight1 = new int[topicMap.size()];
            int[] itemIconsRight2 = new int[topicMap.size()];

            Arrays.fill(itemIconsRight1, R.drawable.ic_book);
            Arrays.fill(itemIconsRight2, R.drawable.ic_solve);

            List<String> itemTitles = new ArrayList<>(topicMap.keySet());
            List<Integer> itemIconsLeft = new ArrayList<>(topicMap.values());

            ItemAdapter adapter = new ItemAdapter(this, itemTitles, itemIconsLeft, itemIconsRight1, itemIconsRight2, isSubscribed);
            recyclerView.setAdapter(adapter);
        } catch (Exception e) {
            Log.e("SetupError", "Error setting up the topic view", e);
            Toast.makeText(this, "Failed to load topics. Please try again.", Toast.LENGTH_SHORT).show();
        }

        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnPremium = findViewById(R.id.btn_premium);
        LinearLayout btnShare = findViewById(R.id.btn_share);

        btnHome.setOnClickListener(v -> {
            try {
                View rootView = findViewById(android.R.id.content);

                ObjectAnimator moveLeft = ObjectAnimator.ofFloat(rootView, "translationX", -30f);
                moveLeft.setDuration(100);

                ObjectAnimator moveRight = ObjectAnimator.ofFloat(rootView, "translationX", 30f);
                moveRight.setDuration(100);

                ObjectAnimator moveBack = ObjectAnimator.ofFloat(rootView, "translationX", 0f);
                moveBack.setDuration(100);

                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(moveLeft, moveRight, moveBack);
                animatorSet.start();
            } catch (Exception e) {
                Log.e("AnimationError", "Error performing home button animation", e);
                Toast.makeText(HomeActivity.this, "Failed to perform animation.", Toast.LENGTH_SHORT).show();
            }
        });

        btnPremium.setOnClickListener(v -> {
            try {
                billingManager.startSubscription(HomeActivity.this);
            } catch (Exception e) {
                Log.e("BillingError", "Subscription process encountered an error.", e);
                Toast.makeText(HomeActivity.this, "Subscription is not available at the moment.", Toast.LENGTH_SHORT).show();
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
                Log.e("ShareError", "Error during sharing intent", e);
                Toast.makeText(HomeActivity.this, "Failed to share the message.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
