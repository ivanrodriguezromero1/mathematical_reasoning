package com.rasona.rasona.utils.problem;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionReplacer {

    private final ExpressionEvaluator evaluator;

    public ExpressionReplacer(ExpressionEvaluator evaluator) {
        this.evaluator = evaluator;
    }

    public String replaceAndEvaluateExpressions(String input, Map<String, String> variableValues) {
        for (Map.Entry<String, String> entry : variableValues.entrySet()) {
            String varPlaceholder = "\\$\\{" + entry.getKey() + "\\}";
            input = input.replaceAll(varPlaceholder, entry.getValue());
        }

        Pattern pattern = Pattern.compile("#\\{([^}]+)\\}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String expression = matcher.group(1);
            String evaluatedResult = String.valueOf(evaluator.evaluateExpression(expression, variableValues));
            input = input.replace("#{" + expression + "}", evaluatedResult);
        }
        return input;
    }
}
