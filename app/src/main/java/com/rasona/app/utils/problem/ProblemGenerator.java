package com.rasona.app.utils.problem;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.output.ProblemGenerated;
import com.rasona.app.utils.NumberUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProblemGenerator {

    private final ProblemVariableGenerator variableGenerator;
    private final ExpressionReplacer replacer;
    private final AlternativeGenerator alternativeGenerator;

    public ProblemGenerator() {
        this.variableGenerator = new ProblemVariableGenerator();
        this.replacer = new ExpressionReplacer(new ExpressionEvaluator());
        this.alternativeGenerator = new AlternativeGenerator();
    }

    public ProblemGenerated generateProblem(Problem problem) {
        try {
            Map<String, String> variableValues = variableGenerator.generateVariableValues(problem.getVariables());

            String statement = replacer.replaceAndEvaluateExpressions(problem.getStatement(), variableValues);
            String processedTip = replacer.replaceAndEvaluateExpressions(problem.getTip(), variableValues);
            List<String> precalculateSteps = replaceAndEvaluateList(problem.getPreview(), variableValues);
            String answer = replacer.replaceAndEvaluateExpressions(problem.getAnswer(), variableValues);
            answer = NumberUtils.isInteger(answer) ? NumberUtils.transformIfNotDouble(answer) : answer;
            answer = NumberUtils.isDouble(answer) ? NumberUtils.formatToTwoDecimalsIfDouble(answer) : answer;
            List<String> solutionList = replaceAndEvaluateList(problem.getStepByStepSolution(), variableValues);
            List<String> alternatives = alternativeGenerator.generateAlternatives(answer);

            return buildProblemGenerated(statement, precalculateSteps, answer, solutionList, alternatives, processedTip);
        } catch (Exception e) {
            System.err.println("Error generating problem: " + e.getMessage());
            return createDefaultProblemGenerated();
        }
    }

    private List<String> replaceAndEvaluateList(List<String> inputList, Map<String, String> variableValues) {
        List<String> result = new ArrayList<>();
        for (String input : inputList) {
            try {
                result.add(replacer.replaceAndEvaluateExpressions(input, variableValues));
            } catch (Exception e) {
                System.err.println("Error replacing and evaluating input list item: " + e.getMessage());
                result.add("Error");
            }
        }
        return result;
    }

    private ProblemGenerated buildProblemGenerated(String statement, List<String> precalculateSteps, String answer,
                                                   List<String> solutionList, List<String> alternatives, String tip) {
        ProblemGenerated generatedProblem = new ProblemGenerated();
        generatedProblem.setStatement(statement);
        generatedProblem.setAlternatives(alternatives);
        generatedProblem.setCorrectKeyIndex(alternatives.indexOf(String.valueOf(answer)));
        generatedProblem.setPreview(String.join("\n", precalculateSteps));
        generatedProblem.setSolution(String.join("\n", solutionList));
        generatedProblem.setTip(tip);
        generatedProblem.setAnswer(answer);
        return generatedProblem;
    }

    private ProblemGenerated createDefaultProblemGenerated() {
        ProblemGenerated defaultProblem = new ProblemGenerated();
        defaultProblem.setStatement("An error occurred while generating the problem.");
        defaultProblem.setAlternatives(new ArrayList<>());
        defaultProblem.setCorrectKeyIndex(-1);
        defaultProblem.setPreview("");
        defaultProblem.setSolution("");
        defaultProblem.setTip("No tips available.");
        defaultProblem.setAnswer("N/A");
        return defaultProblem;
    }
}
