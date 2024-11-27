package com.rasona.app.utils.problem;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionReplacer {

    private final ExpressionEvaluator evaluator;

    public ExpressionReplacer(ExpressionEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    public String replaceAndEvaluateExpressions(String input, Map<String, String> variableValues) {
        try {
            for (Map.Entry<String, String> entry : variableValues.entrySet()) {
                String varPlaceholder = "\\$\\{" + entry.getKey() + "\\}";
                input = input.replaceAll(varPlaceholder, entry.getValue());
            }

            Pattern pattern = Pattern.compile("#\\{([^}]+)\\}");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                try {
                    String expression = matcher.group(1);
                    String evaluatedResult = String.valueOf(evaluator.evaluateExpression(expression, variableValues));
                    input = input.replace("#{" + expression + "}", evaluatedResult);
                } catch (Exception e) {
                    System.err.println("Error evaluating expression: " + matcher.group(1) + ". Message: " + e.getMessage());
                    input = input.replace("#{" + matcher.group(1) + "}", "0"); // Default replacement for failed expressions
                }
            }

        } catch (Exception e) {
            System.err.println("Error during expression replacement: " + e.getMessage());
            input = "Error processing input"; // Return a default error message
        }

        return input;
    }
}
