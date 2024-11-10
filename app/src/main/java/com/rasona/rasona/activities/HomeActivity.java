package com.rasona.rasona.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.rasona.rasona.R;
import com.rasona.rasona.models.input.MathematicalReasoning;
import com.rasona.rasona.utils.TopicUtils;
import com.rasona.rasona.utils.billing.BillingManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

    private BillingManager billingManager;
    private boolean isSubscribed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1_layout_main);

        billingManager = new BillingManager(this);
        isSubscribed = billingManager.isSubscribed();

        MathematicalReasoning reasoning = (MathematicalReasoning) getIntent().getSerializableExtra("reasoning");
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

        ItemAdapter adapter = new ItemAdapter(this, itemTitles, itemIconsLeft, itemIconsRight1, itemIconsRight2);
        recyclerView.setAdapter(adapter);

        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnPremium = findViewById(R.id.btn_premium);
        LinearLayout btnShare = findViewById(R.id.btn_share);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });

        btnPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                billingManager.startSubscription(HomeActivity.this);
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
