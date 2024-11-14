package com.rasona.rasona.utils.problem;

import com.rasona.rasona.models.input.Problem;
import com.rasona.rasona.models.output.ProblemGenerated;
import com.rasona.rasona.utils.NumberUtils;

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
        Map<String, String> variableValues = variableGenerator.generateVariableValues(problem.getVariables());

        String statement = replacer.replaceAndEvaluateExpressions(problem.getStatement(), variableValues);
        String processedTip = replacer.replaceAndEvaluateExpressions(problem.getTip(), variableValues);
        List<String> precalculateSteps = replaceAndEvaluateList(problem.getPreview(), variableValues);
        String answer = replacer.replaceAndEvaluateExpressions(problem.getAnswer(), variableValues);
        answer = NumberUtils.isInteger(answer)?NumberUtils.transformIfNotDouble(answer):answer;
        answer = NumberUtils.isDouble(answer)? NumberUtils.formatToTwoDecimalsIfDouble(answer):answer;
        List<String> solutionList = replaceAndEvaluateList(problem.getStepByStepSolution(), variableValues);
        List<String> alternatives = alternativeGenerator.generateAlternatives(answer);

        return buildProblemGenerated(statement, precalculateSteps, answer, solutionList, alternatives, processedTip);
    }


    private List<String> replaceAndEvaluateList(List<String> inputList, Map<String, String> variableValues) {
        List<String> result = new ArrayList<>();
        for (String input : inputList) {
            result.add(replacer.replaceAndEvaluateExpressions(input, variableValues));
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
}
