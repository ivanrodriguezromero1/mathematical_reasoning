package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic3Type1ProblemBuilder {
    @Getter
    public static final List<Problem> topic3Type1ProblemsBuilder = new ArrayList<>();

    static {

        topic3Type1ProblemsBuilder.add(Problem.builder()
                .statement("Add the fractions ${a}/${b}, ${c}/${d}, and ${e}/${f} and simplify the result.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a", new Range(1, 20)),
                        new Variable("b", new Range(1, 20)),
                        new Variable("c", new Range(1, 20)),
                        new Variable("d", new Range(1, 20)),
                        new Variable("e", new Range(1, 20)),
                        new Variable("f", new Range(1, 20))
                ))
                .tip("To solve this problem, find a common denominator among ${b}, ${d}, and ${f}, adjust each fraction, add the numerators, and simplify the result if possible.")
                .preview(Arrays.asList(
                        "${a}/${b} + ${c}/${d} + ${e}/${f}",
                        "Adjusted sum: ((#{a * (d * f)}) + (#{c * (b * f)}) + (#{e * (b * d)})) / (#{b * d * f})"
                ))
                .answer("#{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Find a common denominator by multiplying ${b} * ${d} * ${f}, resulting in #{b * d * f}.",
                        "Step 2: Adjust the first fraction by multiplying ${a} by #{d * f}, resulting in #{a * (d * f)}.",
                        "Step 3: Adjust the second fraction by multiplying ${c} by #{b * f}, resulting in #{c * (b * f)}.",
                        "Step 4: Adjust the third fraction by multiplying ${e} by #{b * d}, resulting in #{e * (b * d)}.",
                        "Step 5: Add the adjusted numerators: #{a * (d * f)} + #{c * (b * f)} + #{e * (b * d)}.",
                        "Step 6: The numerator over the common denominator is #{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}.",
                        "Step 7: Simplify the result, if possible, by dividing the numerator and denominator by their greatest common divisor.",
                        "Step 8: The simplified result is #{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}."
                ))
                .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the sum of ${a}/${b}, ${c}/${d}, and ${e}/${f} and express it in its simplest form.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Find a common denominator for the fractions, adjust each fraction, add the numerators, and simplify the result.")
                        .preview(Arrays.asList(
                                "${a}/${b} + ${c}/${d} + ${e}/${f}",
                                "Adjusted sum: ((#{a * (d * f)}) + (#{c * (b * f)}) + (#{e * (b * d)})) / (#{b * d * f})"
                        ))
                        .answer("#{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Find a common denominator by multiplying ${b} * ${d} * ${f}, resulting in #{b * d * f}.",
                                "Step 2: Adjust the first fraction by multiplying ${a} by #{d * f}, resulting in #{a * (d * f)}.",
                                "Step 3: Adjust the second fraction by multiplying ${c} by #{b * f}, resulting in #{c * (b * f)}.",
                                "Step 4: Adjust the third fraction by multiplying ${e} by #{b * d}, resulting in #{e * (b * d)}.",
                                "Step 5: Add the adjusted numerators: #{a * (d * f)} + #{c * (b * f)} + #{e * (b * d)}.",
                                "Step 6: The numerator over the common denominator is #{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 8: The simplified result is #{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}."
                        ))
                        .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the simplified value of the sum ${a}/${b} + ${c}/${d} + ${e}/${f}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Find a common denominator to add the fractions, then simplify the result if possible.")
                        .preview(Arrays.asList(
                                "${a}/${b} + ${c}/${d} + ${e}/${f}",
                                "((#{a} * #{d * f}) + (#{c} * #{b * f}) + (#{e} * #{b * d})) / (#{b * d * f})"
                        ))
                        .answer("#{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the common denominator by multiplying ${b} * ${d} * ${f}, resulting in #{b * d * f}.",
                                "Step 2: Adjust the first fraction by multiplying ${a} by #{d * f}, resulting in #{a * (d * f)}.",
                                "Step 3: Adjust the second fraction by multiplying ${c} by #{b * f}, resulting in #{c * (b * f)}.",
                                "Step 4: Adjust the third fraction by multiplying ${e} by #{b * d}, resulting in #{e * (b * d)}.",
                                "Step 5: Add the adjusted numerators: #{a * (d * f)} + #{c * (b * f)} + #{e * (b * d)}.",
                                "Step 6: Place the sum obtained over the common denominator #{b * d * f}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 8: The simplified value of the sum is #{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}."
                        ))
                        .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Add ${a}/${b}, ${c}/${d}, and ${e}/${f}, and simplify the result.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Find a common denominator, adjust each fraction, sum the numerators, and simplify the result.")
                        .preview(Arrays.asList(
                                "${a}/${b} + ${c}/${d} + ${e}/${f}",
                                "((#{a} * #{d * f}) + (#{c} * #{b * f}) + (#{e} * #{b * d})) / (#{b * d * f})"
                        ))
                        .answer("#{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Find a common denominator by multiplying ${b} * ${d} * ${f}, resulting in #{b * d * f}.",
                                "Step 2: Adjust the first fraction by multiplying ${a} by #{d * f}, resulting in #{a * (d * f)}.",
                                "Step 3: Adjust the second fraction by multiplying ${c} by #{b * f}, resulting in #{c * (b * f)}.",
                                "Step 4: Adjust the third fraction by multiplying ${e} by #{b * d}, resulting in #{e * (b * d)}.",
                                "Step 5: Sum the adjusted numerators: #{a * (d * f)} + #{c * (b * f)} + #{e * (b * d)}.",
                                "Step 6: Place the obtained sum over the common denominator #{b * d * f}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by the greatest common divisor, if possible.",
                                "Step 8: The simplified result is #{((a * (d * f)) + (c * (b * f)) + (e * (b * d))) / (b * d * f)}."
                        ))
                        .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the sum of the fractions ${g}/${h}, ${a}/${b}, and ${e}/${f} and simplify the result.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Find a common denominator for the fractions, adjust each one, add the numerators, and simplify the result if possible.")
                        .preview(Arrays.asList(
                                "${g}/${h} + ${a}/${b} + ${e}/${f}",
                                "((#{g} * #{b * f}) + (#{a} * #{h * f}) + (#{e} * #{h * b})) / (#{h * b * f})"
                        ))
                        .answer("#{((g * (b * f)) + (a * (h * f)) + (e * (h * b))) / (h * b * f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the common denominator by multiplying ${h} * ${b} * ${f}, resulting in #{h * b * f}.",
                                "Step 2: Adjust the first fraction by multiplying ${g} by #{b * f}, resulting in #{g * (b * f)}.",
                                "Step 3: Adjust the second fraction by multiplying ${a} by #{h * f}, resulting in #{a * (h * f)}.",
                                "Step 4: Adjust the third fraction by multiplying ${e} by #{h * b}, resulting in #{e * (h * b)}.",
                                "Step 5: Add the adjusted numerators: #{g * (b * f)} + #{a * (h * f)} + #{e * (h * b)}.",
                                "Step 6: Place the sum obtained over the common denominator #{h * b * f}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by the greatest common divisor, if possible.",
                                "Step 8: The simplified result is #{((g * (b * f)) + (a * (h * f)) + (e * (h * b))) / (h * b * f)}."
                        ))
                        .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the simplified sum of ${g}/${h} + ${a}/${b} + ${c}/${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 10)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Find a common denominator, adjust each fraction to the common denominator, add the numerators, and simplify the result if possible.")
                        .preview(Arrays.asList(
                                "${g}/${h} + ${a}/${b} + ${c}/${d}",
                                "((#{g} * #{b * d}) + (#{a} * #{h * d}) + (#{c} * #{h * b})) / (#{h * b * d})"
                        ))
                        .answer("#{((g * (b * d)) + (a * (h * d)) + (c * (h * b))) / (h * b * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the common denominator by multiplying ${h} * ${b} * ${d}, resulting in #{h * b * d}.",
                                "Step 2: Adjust the first fraction by multiplying ${g} by #{b * d}, resulting in #{g * (b * d)}.",
                                "Step 3: Adjust the second fraction by multiplying ${a} by #{h * d}, resulting in #{a * (h * d)}.",
                                "Step 4: Adjust the third fraction by multiplying ${c} by #{h * b}, resulting in #{c * (h * b)}.",
                                "Step 5: Add the adjusted numerators: #{g * (b * d)} + #{a * (h * d)} + #{c * (h * b)}.",
                                "Step 6: Place the sum obtained over the common denominator #{h * b * d}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 8: The simplified value of the sum is #{((g * (b * d)) + (a * (h * d)) + (c * (h * b))) / (h * b * d)}."
                        ))
                        .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the sum of ${i}/${j}, ${a}/${b}, and ${g}/${h} in its simplest form.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("i", new Range(1, 20)),
                                new Variable("j", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20))
                        ))
                        .tip("Find a common denominator, adjust each fraction to the common denominator, sum the numerators, and simplify the result if possible.")
                        .preview(Arrays.asList(
                                "${i}/${j} + ${a}/${b} + ${g}/${h}",
                                "((#{i} * #{b * h}) + (#{a} * #{j * h}) + (#{g} * #{j * b})) / (#{j * b * h})"
                        ))
                        .answer("#{((i * (b * h)) + (a * (j * h)) + (g * (j * b))) / (j * b * h)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the common denominator by multiplying ${j} * ${b} * ${h}, resulting in #{j * b * h}.",
                                "Step 2: Adjust the first fraction by multiplying ${i} by #{b * h}, resulting in #{i * (b * h)}.",
                                "Step 3: Adjust the second fraction by multiplying ${a} by #{j * h}, resulting in #{a * (j * h)}.",
                                "Step 4: Adjust the third fraction by multiplying ${g} by #{j * b}, resulting in #{g * (j * b)}.",
                                "Step 5: Sum the adjusted numerators: #{i * (b * h)} + #{a * (j * h)} + #{g * (j * b)}.",
                                "Step 6: Place the sum obtained over the common denominator #{j * b * h}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 8: The simplified result of the sum is #{((i * (b * h)) + (a * (j * h)) + (g * (j * b))) / (j * b * h)}."
                        ))
                        .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the simplified sum of ${i}/${j} + ${g}/${h} + ${e}/${f}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("i", new Range(1, 20)),
                                new Variable("j", new Range(1, 20)),
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Find a common denominator, adjust each fraction to the common denominator, sum the numerators, and simplify the result if possible.")
                        .preview(Arrays.asList(
                                "${i}/${j} + ${g}/${h} + ${e}/${f}",
                                "((#{i} * #{h * f}) + (#{g} * #{j * f}) + (#{e} * #{j * h})) / (#{j * h * f})"
                        ))
                        .answer("#{((i * (h * f)) + (g * (j * f)) + (e * (j * h))) / (j * h * f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the common denominator by multiplying ${j} * ${h} * ${f}, resulting in #{j * h * f}.",
                                "Step 2: Adjust the first fraction by multiplying ${i} by #{h * f}, resulting in #{i * (h * f)}.",
                                "Step 3: Adjust the second fraction by multiplying ${g} by #{j * f}, resulting in #{g * (j * f)}.",
                                "Step 4: Adjust the third fraction by multiplying ${e} by #{j * h}, resulting in #{e * (j * h)}.",
                                "Step 5: Sum the adjusted numerators: #{i * (h * f)} + #{g * (j * f)} + #{e * (j * h)}.",
                                "Step 6: Place the sum over the common denominator #{j * h * f}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 8: The simplified result of the sum is #{((i * (h * f)) + (g * (j * f)) + (e * (j * h))) / (j * h * f)}."
                        ))
                        .build());
        topic3Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the simplified form of the sum ${i}/${j} + ${a}/${b} + ${c}/${d}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("i", new Range(1, 20)),
                                new Variable("j", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Find a common denominator, adjust each fraction to the common denominator, sum the numerators, and simplify the result if possible.")
                        .preview(Arrays.asList(
                                "${i}/${j} + ${a}/${b} + ${c}/${d}",
                                "((#{i} * #{b * d}) + (#{a} * #{j * d}) + (#{c} * #{j * b})) / (#{j * b * d})"
                        ))
                        .answer("#{((i * (b * d)) + (a * (j * d)) + (c * (j * b))) / (j * b * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the common denominator by multiplying ${j} * ${b} * ${d}, resulting in #{j * b * d}.",
                                "Step 2: Adjust the first fraction by multiplying ${i} by #{b * d}, resulting in #{i * (b * d)}.",
                                "Step 3: Adjust the second fraction by multiplying ${a} by #{j * d}, resulting in #{a * (j * d)}.",
                                "Step 4: Adjust the third fraction by multiplying ${c} by #{j * b}, resulting in #{c * (j * b)}.",
                                "Step 5: Sum the adjusted numerators: #{i * (b * d)} + #{a * (j * d)} + #{c * (j * b)}.",
                                "Step 6: Place the sum over the common denominator #{j * b * d}.",
                                "Step 7: Simplify the result by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 8: The simplified result of the sum is #{((i * (b * d)) + (a * (j * d)) + (c * (j * b))) / (j * b * d)}."
                        ))
                        .build());


    }
}
