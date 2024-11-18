package com.rasona.app.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.app.R;
import com.rasona.app.models.input.MathematicalReasoning;
import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.ProblemType;
import com.rasona.app.models.input.Topic;
import com.rasona.app.models.output.ProblemGenerated;
import com.rasona.app.utils.DialogAlert;
import com.rasona.app.utils.FileUtils;
import com.rasona.app.utils.billing.BillingManager;
import com.rasona.app.utils.problem.ProblemGenerator;
import com.rasona.app.managers.ButtonManager;
import com.rasona.app.managers.UIManager;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemsActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private ProblemGenerated problemGenerated;
    private ButtonManager buttonManager;
    private UIManager uiManager;
    private BillingManager billingManager;
    private static final String EASY = "Easy";
    private static final String NORMAL = "Normal";
    private static final String HARD = "Hard";
    @Setter
    private int currentSelectedDifficultyIndex = 0;
    @Setter
    private int currentSelectedProblemTypeIndex = 0;
    private int currentPosition;
    private MathematicalReasoning reasoning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l3_layout_problems);

        billingManager = new BillingManager(this);
        buttonManager = new ButtonManager(this);
        uiManager = new UIManager(this);

        try {
            Intent intent = getIntent();
            currentPosition = intent.getIntExtra("currentPosition", 0);
            reasoning = FileUtils.readJsonFromRaw(this, R.raw.mathematical_reasoning);

            initializeUIComponents();
            int[] difficulty = {0};
            int[] problemType = {0};

            TextView difficultyTextView = findViewById(R.id.text_view_select_difficulty);
            difficultyTextView.setText(EASY);

            TextView problemTypeTextView = findViewById(R.id.text_view_select_problem_type);
            if (!reasoning.getTopics().isEmpty() && !reasoning.getTopics().get(currentPosition).getProblemTypes().isEmpty()) {
                problemTypeTextView.setText(reasoning.getTopics().get(currentPosition).getProblemTypes().get(0).getType());
            }

            setupProblemGeneration(reasoning, currentPosition, difficulty, problemType);

            LinearLayout btnSelectDifficulty = findViewById(R.id.btn_select_difficulty);
            btnSelectDifficulty.setOnClickListener(v -> {
                try {
                    List<String> difficultyOptions = Arrays.asList(EASY, NORMAL, HARD);
                    DialogAlert.showSelectorDifficultyDialog(this, getString(R.string.label_difficulty), difficultyOptions,
                            (TextView) findViewById(R.id.text_view_select_difficulty), 0, difficulty, new int[]{currentSelectedDifficultyIndex}, new int[]{currentSelectedProblemTypeIndex});
                } catch (Exception e) {
                    Log.e("ProblemsActivity", "Error showing difficulty selector dialog", e);
                    Toast.makeText(this, "Failed to open difficulty selection.", Toast.LENGTH_SHORT).show();
                }
            });

            LinearLayout btnSelectProblemType = findViewById(R.id.btn_select_problem_type);
            btnSelectProblemType.setOnClickListener(v -> {
                try {
                    Topic topic = reasoning.getTopics().get(currentPosition);
                    List<String> problemTypeOptions = new ArrayList<>();
                    for (ProblemType type : topic.getProblemTypes()) {
                        problemTypeOptions.add(type.getType());
                    }

                    DialogAlert.showSelectorProblemTypeDialog(this, getString(R.string.label_problem_type), problemTypeOptions,
                            (TextView) findViewById(R.id.text_view_select_problem_type), 0, problemType, new int[]{currentSelectedDifficultyIndex}, new int[]{currentSelectedProblemTypeIndex});
                } catch (Exception e) {
                    Log.e("ProblemsActivity", "Error showing problem type selector dialog", e);
                    Toast.makeText(this, "Failed to open problem type selection.", Toast.LENGTH_SHORT).show();
                }
            });

            setupButtonListeners(difficulty, problemType);

            setupNavigationButtons();
        } catch (Exception e) {
            Log.e("ProblemsActivity", "Initialization error", e);
            Toast.makeText(this, "An error occurred during initialization.", Toast.LENGTH_SHORT).show();
        }
    }

    private void initializeUIComponents() {
        try {
            uiManager.setupIconAndTitle();
        } catch (Exception e) {
            Log.e("ProblemsActivity", "Error initializing UI components", e);
        }
    }

    private void setupProblemGeneration(MathematicalReasoning reasoning, int currentPosition, int[] difficulty, int[] problemType) {
        try {
            ProblemGenerator problemGenerator = new ProblemGenerator();
            Topic topic = reasoning.getTopics().get(currentPosition);
            ProblemType selectedProblemType = topic.getProblemTypes().get(problemType[0]);
            List<Problem> problemsMatchingDifficulty = new ArrayList<>();
            for (Problem problem : selectedProblemType.getProblems()) {
                if (problem.getDifficulty() == difficulty[0]) {
                    problemsMatchingDifficulty.add(problem);
                }
            }
            Problem selectedProblem = !problemsMatchingDifficulty.isEmpty()
                    ? problemsMatchingDifficulty.get(0)
                    : selectedProblemType.getProblems().get(0);

            problemGenerated = problemGenerator.generateProblem(selectedProblem);

            uiManager.displayProblem(problemGenerated);
        } catch (Exception e) {
            Log.e("ProblemsActivity", "Error generating problems", e);
            Toast.makeText(this, "Problem generation failed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setupButtonListeners(int[] difficulty, int[] problemType) {
        try {
            buttonManager.setupCrossOutButton(problemGenerated);
            buttonManager.setupTipsButton(problemGenerated);
            buttonManager.setupCheckButton(problemGenerated);
            buttonManager.setupNewButton(currentPosition, difficulty, problemType);
            buttonManager.setupPreviewButton();
            buttonManager.setupSendProblemButton(problemGenerated);
            buttonManager.setupSelectorDialogs();
        } catch (Exception e) {
            Log.e("ProblemsActivity", "Error setting up button listeners", e);
            Toast.makeText(this, "Failed to set up button actions.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setupNavigationButtons() {
        LinearLayout btnHome = findViewById(R.id.btn_home);
        LinearLayout btnPremium = findViewById(R.id.btn_premium);
        LinearLayout btnShare = findViewById(R.id.btn_share);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(ProblemsActivity.this, HomeActivity.class);
                    ActivityOptions options = ActivityOptions.makeCustomAnimation(
                            ProblemsActivity.this,
                            R.anim.slide_in_left,
                            R.anim.slide_out_right
                    );
                    startActivity(intent, options.toBundle());
                } catch (Exception e) {
                    Log.e("ProblemsActivity", "Error navigating to HomeActivity", e);
                    Toast.makeText(ProblemsActivity.this, "Navigation failed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    billingManager.startSubscription(ProblemsActivity.this);
                } catch (Exception e) {
                    Log.e("BillingError", "Subscription process encountered an error.", e);
                    Toast.makeText(ProblemsActivity.this, "Subscription is not available at the moment.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String shareMessage = "Boost your math skills with this interesting app! Check it out: https://play.google.com/store/apps/details?id=" + getPackageName();
                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    shareIntent.setType("text/plain");
                    startActivity(Intent.createChooser(shareIntent, "Choose how to share"));
                } catch (Exception e) {
                    Log.e("ProblemsActivity", "Error during sharing", e);
                    Toast.makeText(ProblemsActivity.this, "Sharing failed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public ProblemGenerated regenerateProblem(int currentPosition, int[] difficulty, int[] problemType) {
        try {
            ProblemGenerator problemGenerator = new ProblemGenerator();
            Topic topic = reasoning.getTopics().get(currentPosition);
            ProblemType selectedProblemType = topic.getProblemTypes().get(problemType[0]);
            List<Problem> problemsMatchingDifficulty = new ArrayList<>();
            for (Problem problem : selectedProblemType.getProblems()) {
                if (problem.getDifficulty() == difficulty[0]) {
                    problemsMatchingDifficulty.add(problem);
                }
            }
            Problem selectedProblem = !problemsMatchingDifficulty.isEmpty()
                    ? problemsMatchingDifficulty.get(0)
                    : selectedProblemType.getProblems().get(0);

            return problemGenerator.generateProblem(selectedProblem);
        } catch (Exception e) {
            Log.e("ProblemsActivity", "Error regenerating problem", e);
            Toast.makeText(this, "Problem regeneration failed.", Toast.LENGTH_SHORT).show();
            return null;
        }
    }

    public void displayNewProblem(ProblemGenerated newProblemGenerated) {
        try {
            this.problemGenerated = newProblemGenerated;
            uiManager.displayProblem(newProblemGenerated);
        } catch (Exception e) {
            Log.e("ProblemsActivity", "Error displaying new problem", e);
            Toast.makeText(this, "Failed to display the new problem.", Toast.LENGTH_SHORT).show();
        }
    }
}
