package com.mathematical_reasoning.raz_mat.utils;

import com.mathematical_reasoning.raz_mat.models.input.*;
import com.mathematical_reasoning.raz_mat.models.output.ProblemGenerated;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemGenerator {

    public static ProblemGenerated generateProblem(Problem problem) {
        Map<String, String> variableValues = new HashMap<>();
        Random random = new Random();

        // Generar valores aleatorios para las variables del problema
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
        String statement = reemplazarYCalcularExpresiones(problem.getStatement(), variableValues);

        // Reemplazar variables y evaluar expresiones en la lista de precálculos
        List<String> precalculateSteps = new ArrayList<>();
        for (String precalculateStep : problem.getPreview()) {
            precalculateStep = reemplazarYCalcularExpresiones(precalculateStep, variableValues);
            precalculateSteps.add(precalculateStep);
        }

        // Evaluar la expresión de la respuesta
        String respuesta = reemplazarYCalcularExpresiones(problem.getAnswer(), variableValues);

        // Reemplazar variables y evaluar expresiones en la solución paso a paso
        List<String> solutionList = new ArrayList<>();
        for (String step : problem.getStepByStepSolution()) {
            step = reemplazarYCalcularExpresiones(step, variableValues);
            solutionList.add(step);
        }

        // Generar alternativas a partir de la respuesta evaluada
        List<String> alternativas = generateAlternatives(respuesta);

        // Crear instancia de ProblemGenerated con todos los campos
        ProblemGenerated generatedProblem = new ProblemGenerated();
        generatedProblem.setStatement(statement);
        generatedProblem.setAlternatives(alternativas);
        generatedProblem.setCorrectKeyIndex(alternativas.indexOf(String.valueOf(respuesta)));
        generatedProblem.setPrecalculate(String.join("\n", precalculateSteps));
        generatedProblem.setSolution(String.join("\n", solutionList));
        generatedProblem.setTip(problem.getTip());

        return generatedProblem;
    }

    // Método para reemplazar variables y evaluar expresiones en una cadena
    private static String reemplazarYCalcularExpresiones(String input, Map<String, String> variableValues) {
        // Reemplazar variables
        for (Map.Entry<String, String> entry : variableValues.entrySet()) {
            String varPlaceholder = "\\$\\{" + entry.getKey() + "\\}";
            input = input.replaceAll(varPlaceholder, entry.getValue());
        }

        // Evaluar expresiones encerradas en #{}
        Pattern pattern = Pattern.compile("#\\{([^}]+)\\}");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String expresion = matcher.group(1); // Extraer la expresión dentro de #{}
            String resultadoEvaluado = String.valueOf(evaluarExpresion(expresion, variableValues)); // Evaluar la expresión
            input = input.replace("#{" + expresion + "}", resultadoEvaluado); // Reemplazar la expresión con el resultado
        }

        return input;
    }

    // Método para evaluar una expresión matemática con exp4j y usando variables
    private static double evaluarExpresion(String expresion, Map<String, String> variableValues) {
        try {
            ExpressionBuilder expressionBuilder = new ExpressionBuilder(expresion);

            // Añadir variables a la expresión
            for (Map.Entry<String, String> entry : variableValues.entrySet()) {
                expressionBuilder.variable(entry.getKey());
            }

            Expression expression = expressionBuilder.build();

            // Asignar valores a las variables
            for (Map.Entry<String, String> entry : variableValues.entrySet()) {
                if (entry.getValue().matches("-?\\d+(\\.\\d+)?")) { // Verificar si el valor es numérico
                    expression.setVariable(entry.getKey(), Double.parseDouble(entry.getValue()));
                }
            }

            return expression.evaluate(); // Evaluar la expresión
        } catch (Exception e) {
            throw new IllegalArgumentException("Error al evaluar la expresión: " + expresion, e);
        }
    }

    // Método para generar alternativas que maneja tanto enteros como decimales
    public static List<String> generateAlternatives(String respuesta) {
        Random random = new Random();
        List<String> alternativas = new ArrayList<>();
        alternativas.add(respuesta); // Agregar la respuesta correcta

        // Detectar si la respuesta es un int o un double
        boolean isDouble;
        double rptaDouble = 0;
        int rptaInt = 0;

        try {
            rptaInt = Integer.parseInt(respuesta);
            isDouble = false;
        } catch (NumberFormatException e) {
            try {
                rptaDouble = Double.parseDouble(respuesta);
                isDouble = true;
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("La respuesta debe ser un número entero o decimal.");
            }
        }

        // Generar 3 alternativas incorrectas
        for (int i = 0; i < 3; i++) {
            String alternativa;

            if (isDouble) {
                // Generar alternativas para double
                double altDouble = random.nextInt(2) == 0
                        ? rptaDouble + random.nextDouble() * (random.nextInt(5) + 1)
                        : rptaDouble - random.nextDouble() * (random.nextInt(3) + 1);

                altDouble = Math.round(altDouble * 100.0) / 100.0; // Redondear a 2 decimales
                alternativa = String.format(Locale.getDefault(), "%.2f", altDouble);
            } else {
                // Generar alternativas para int
                int altInt = random.nextInt(2) == 0
                        ? rptaInt + random.nextInt(5) + 1
                        : rptaInt - random.nextInt(3) - 1;

                alternativa = String.valueOf(altInt);
            }

            // Asegurarse de que la alternativa no esté duplicada
            while (alternativas.contains(alternativa)) {
                if (isDouble) {
                    double altDouble = random.nextInt(2) == 0
                            ? rptaDouble + random.nextDouble() * (random.nextInt(5) + 1)
                            : rptaDouble - random.nextDouble() * (random.nextInt(3) + 1);

                    altDouble = Math.round(altDouble * 100.0) / 100.0; // Redondear a 2 decimales
                    alternativa = String.format(Locale.getDefault(), "%.2f", altDouble);
                } else {
                    int altInt = random.nextInt(2) == 0
                            ? rptaInt + random.nextInt(5) + 1
                            : rptaInt - random.nextInt(3) - 1;

                    alternativa = String.valueOf(altInt);
                }
            }

            alternativas.add(alternativa);
        }

        // Mezclar las alternativas
        Collections.shuffle(alternativas);

        return alternativas;
    }
}
