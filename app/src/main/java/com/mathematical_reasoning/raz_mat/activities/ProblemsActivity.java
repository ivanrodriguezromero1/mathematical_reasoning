package com.mathematical_reasoning.raz_mat.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.mathematical_reasoning.raz_mat.R;
import com.mathematical_reasoning.raz_mat.models.input.MathematicalReasoning;
import com.mathematical_reasoning.raz_mat.models.output.ProblemGenerated;
import com.mathematical_reasoning.raz_mat.utils.FileUtils;
import com.mathematical_reasoning.raz_mat.utils.problem.ProblemGenerator;
import com.mathematical_reasoning.raz_mat.managers.ButtonManager;
import com.mathematical_reasoning.raz_mat.managers.UIManager;


public class ProblemsActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private ProblemGenerated problemGenerated;
    private boolean isCheckMode = true;
    private ButtonManager buttonManager;
    private UIManager uiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l3_layout_problems);

        buttonManager = new ButtonManager(this);
        uiManager = new UIManager(this);

        initializeUIComponents();
        setupProblemGeneration();
        setupButtonListeners();
    }

    private void initializeUIComponents() {
        uiManager.setupIconAndTitle();
        uiManager.configureHomeButton(this);
    }

    private void setupProblemGeneration() {
        MathematicalReasoning reasoning = FileUtils.readJsonFromRaw(this, R.raw.mathematical_reasoning);
        ProblemGenerator problemGenerator = new ProblemGenerator();
        problemGenerated = problemGenerator.generateProblem(reasoning.getTopics().get(0).getProblemTypes().get(0).getProblems().get(0));

        uiManager.displayProblem(problemGenerated);
    }

    private void setupButtonListeners() {
        buttonManager.setupCrossOutButton(problemGenerated);
        buttonManager.setupTipsButton(problemGenerated);
        buttonManager.setupCheckButton(problemGenerated, isCheckMode);
        buttonManager.setupNewButton(problemGenerated);
        buttonManager.setupPreviewButton();
        buttonManager.setupSendProblemButton();
        buttonManager.setupSelectorDialogs();
    }
}
