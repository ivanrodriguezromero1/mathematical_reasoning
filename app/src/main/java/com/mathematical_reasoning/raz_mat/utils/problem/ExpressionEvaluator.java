package com.mathematical_reasoning.raz_mat.utils.problem;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Map;

public class ExpressionEvaluator {

    public double evaluateExpression(String expression, Map<String, String> variableValues) {
        try {
            ExpressionBuilder expressionBuilder = new ExpressionBuilder(expression);
            for (String variable : variableValues.keySet()) {
                expressionBuilder.variable(variable);
            }
            Expression exp = expressionBuilder.build();
            for (Map.Entry<String, String> entry : variableValues.entrySet()) {
                if (entry.getValue().matches("-?\\d+(\\.\\d+)?")) {
                    exp.setVariable(entry.getKey(), Double.parseDouble(entry.getValue()));
                }
            }
            return exp.evaluate();
        } catch (Exception e) {
            throw new IllegalArgumentException("Error evaluating the expression: " + expression, e);
        }
    }
}
