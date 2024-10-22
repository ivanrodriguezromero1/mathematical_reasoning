package com.mathematical_reasoning.raz_mat.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mathematical_reasoning.raz_mat.models.input.*;
import com.mathematical_reasoning.raz_mat.models.output.ProblemGenerated;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemGenerator {

    public static ProblemGenerated generateProblem(Problem problem) {
        Map<String, String> variableValues = new HashMap<>();
        Random random = new Random();

        for (Variable variable : problem.getVariables()) {
            String varName = variable.getName();
            String varType = variable.getVariableType();
            Range range = variable.getRange();

            if ("int".equalsIgnoreCase(varType)) {
                int value = random.nextInt(range.getMax() - range.getMin() + 1) + range.getMin();
                variableValues.put(varName, String.valueOf(value));

            } else if ("double".equalsIgnoreCase(varType)) {
                double value = range.getMin() + (range.getMax() - range.getMin()) * random.nextDouble();
                variableValues.put(varName, String.format(Locale.getDefault(), "%.2f", value)); // Redondear a 2 decimales

            }
        }

        // Reemplazar variables en el enunciado
        String statement = problem.getStatement();
        for (Map.Entry<String, String> entry : variableValues.entrySet()) {
            String varPlaceholder = "\\$\\{" + entry.getKey() + "\\}";
            statement = statement.replaceAll(varPlaceholder, entry.getValue());
        }

        // Crear instancia de ProblemGenerated con el enunciado modificado
        ProblemGenerated generatedProblem = new ProblemGenerated();
        generatedProblem.setStatement(statement);

        return generatedProblem;
    }

}

