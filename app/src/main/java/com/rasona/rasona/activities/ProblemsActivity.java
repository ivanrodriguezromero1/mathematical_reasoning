package com.rasona.rasona.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.rasona.rasona.R;
import com.rasona.rasona.models.input.MathematicalReasoning;
import com.rasona.rasona.models.input.Problem;
import com.rasona.rasona.models.input.ProblemType;
import com.rasona.rasona.models.input.Topic;
import com.rasona.rasona.models.output.ProblemGenerated;
import com.rasona.rasona.utils.DialogAlert;
import com.rasona.rasona.utils.FileUtils;
import com.rasona.rasona.utils.problem.ProblemGenerator;
import com.rasona.rasona.managers.ButtonManager;
import com.rasona.rasona.managers.UIManager;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProblemsActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferences;
    private ProblemGenerated problemGenerated;
    private ButtonManager buttonManager;
    private UIManager uiManager;
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

        buttonManager = new ButtonManager(this);
        uiManager = new UIManager(this);

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
            List<String> difficultyOptions = Arrays.asList(EASY, NORMAL, HARD);
            DialogAlert.showSelectorDifficultyDialog(this, getString(R.string.label_difficulty), difficultyOptions,
                    (TextView) findViewById(R.id.text_view_select_difficulty), 0, difficulty, new int[]{currentSelectedDifficultyIndex}, new int[]{currentSelectedProblemTypeIndex} );
        });
        LinearLayout btnSelectProblemType = findViewById(R.id.btn_select_problem_type);
        btnSelectProblemType.setOnClickListener(v -> {
            Topic topic = reasoning.getTopics().get(currentPosition);
            List<String> problemTypeOptions = new ArrayList<>();
            for (ProblemType type : topic.getProblemTypes()) {
                problemTypeOptions.add(type.getType());
            }

            DialogAlert.showSelectorProblemTypeDialog(this, getString(R.string.label_problem_type), problemTypeOptions,
                    (TextView) findViewById(R.id.text_view_select_problem_type), 0, problemType, new int[]{currentSelectedDifficultyIndex}, new int[]{currentSelectedProblemTypeIndex});
        });
        setupButtonListeners(difficulty, problemType);
    }

    private void initializeUIComponents() {
        uiManager.setupIconAndTitle();
        uiManager.configureHomeButton(this);
    }

    private void setupProblemGeneration(MathematicalReasoning reasoning, int currentPosition, int[] difficulty, int[] problemType) {
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
    }

    public void setupButtonListeners(int[] difficulty, int[] problemType) {
        buttonManager.setupCrossOutButton(problemGenerated);
        buttonManager.setupTipsButton(problemGenerated);
        buttonManager.setupCheckButton(problemGenerated);
        buttonManager.setupNewButton(currentPosition, difficulty, problemType);
        buttonManager.setupPreviewButton();
        buttonManager.setupSendProblemButton(problemGenerated);
        buttonManager.setupSelectorDialogs();
    }

    public ProblemGenerated regenerateProblem(int currentPosition, int[] difficulty, int[] problemType) {
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
    }

    public void displayNewProblem(ProblemGenerated newProblemGenerated) {
        this.problemGenerated = newProblemGenerated;
        uiManager.displayProblem(newProblemGenerated);
    }

}
