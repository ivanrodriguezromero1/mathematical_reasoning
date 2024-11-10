package com.mathematical_reasoning.raz_mat.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mathematical_reasoning.raz_mat.R;
import com.mathematical_reasoning.raz_mat.models.input.MathematicalReasoning;
import com.mathematical_reasoning.raz_mat.utils.TopicUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1_layout_main);
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

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
