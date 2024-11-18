package com.rasona.app.utils.problem;

import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class ProblemVariableGenerator {

    private final Random random = new Random();

    public Map<String, String> generateVariableValues(Iterable<Variable> variables) {
        Map<String, String> variableValues = new HashMap<>();
        for (Variable variable : variables) {
            try {
                String varName = variable.getName();
                String varType = variable.getVariableType();
                Range range = variable.getRange();

                if ("int".equalsIgnoreCase(varType)) {
                    int value = random.nextInt(range.getMax() - range.getMin() + 1) + range.getMin();
                    variableValues.put(varName, String.valueOf(value));
                } else if ("double".equalsIgnoreCase(varType)) {
                    double value = range.getMin() + (range.getMax() - range.getMin()) * random.nextDouble();
                    variableValues.put(varName, String.format(Locale.US, "%.2f", value));
                }
            } catch (Exception e) {
                System.err.println("Error generating value for variable: " + e.getMessage());
            }
        }
        return variableValues;
    }
}
