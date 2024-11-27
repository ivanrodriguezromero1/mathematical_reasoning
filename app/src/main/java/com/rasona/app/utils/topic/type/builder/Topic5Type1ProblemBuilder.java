package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic5Type1ProblemBuilder {
    @Getter
    public static final List<Problem> topic5Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic5Type1ProblemsBuilder.add(Problem.builder()
                .statement("Calculate the term at position ${n} of the following first-order arithmetic sequence: ${a1}, #{a1+d}, #{a1+2*d} ...")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("n", new Range(1, 100)),
                        new Variable("a1", new Range(1, 100)),
                        new Variable("d", new Range(1, 50))
                ))
                .tip("To find the term at position ${n} of an arithmetic sequence, use the general formula: aₙ = a₁ + (n - 1) * d.")
                .preview(Arrays.asList(
                        "${a1}, #{a1 + d}, #{a1 + 2 * d}, ...",
                        "aₙ = ${a1} + (${n} - 1) * ${d}"
                ))
                .answer("#{a1 + (n - 1) * d}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Note that the general formula for the term at position ${n} is aₙ = a₁ + (n - 1) * d.",
                        "Step 2: Substitute the value of a₁ into the formula: aₙ = ${a1} + (n - 1) * ${d}.",
                        "Step 3: Substitute the value of n into the formula: aₙ = ${a1} + (${n} - 1) * ${d}.",
                        "Step 4: Perform the multiplication: (${n} - 1) * ${d} = #{(n - 1) * d}.",
                        "Step 5: Add ${a1} to the result of the multiplication.",
                        "Step 6: The result is #{a1 + (n - 1) * d}."
                ))
                .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} for an arithmetic sequence with an initial term ${a1} and a common difference equal to half of ${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To find the term at position ${n}, use the general formula: aₙ = a₁ + (n - 1) * (d / 2).")
                        .preview(Arrays.asList(
                                "${a1}, #{a1 + (d / 2)}, #{a1 + 2 * (d / 2)}, ...",
                                "aₙ = ${a1} + (${n} - 1) * (${d} / 2)"
                        ))
                        .answer("#{a1 + (n - 1) * (d / 2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The general formula for the term at position ${n} is aₙ = a₁ + (n - 1) * (d / 2).",
                                "Step 2: Substitute the value of a₁: aₙ = ${a1} + (n - 1) * (${d} / 2).",
                                "Step 3: Substitute the value of n: aₙ = ${a1} + (${n} - 1) * (${d} / 2).",
                                "Step 4: Perform the multiplication: (${n} - 1) * (${d} / 2) = #{(n - 1) * (d / 2)}.",
                                "Step 5: Add ${a1} to the result of the multiplication.",
                                "Step 6: The result is #{a1 + (n - 1) * (d / 2)}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} for an arithmetic sequence defined by the terms ${a1}, #{a1 - d}, #{a1 - 2 * d}, ..., in a decreasing progression.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To find the term at position ${n} in a decreasing sequence, use the general formula: aₙ = a₁ - (n - 1) * d.")
                        .preview(Arrays.asList(
                                "${a1}, #{a1 - d}, #{a1 - 2 * d}, ...",
                                "aₙ = ${a1} - (${n} - 1) * ${d}"
                        ))
                        .answer("#{a1 - (n - 1) * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The general formula for the term at position ${n} is aₙ = a₁ - (n - 1) * d.",
                                "Step 2: Substitute the value of a₁: aₙ = ${a1} - (n - 1) * ${d}.",
                                "Step 3: Substitute the value of n: aₙ = ${a1} - (${n} - 1) * ${d}.",
                                "Step 4: Perform the multiplication: (${n} - 1) * ${d} = #{(n - 1) * d}.",
                                "Step 5: Subtract the result of the multiplication from ${a1}.",
                                "Step 6: The result is #{a1 - (n - 1) * d}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the term at position ${n} in a first-order arithmetic sequence, where the initial term is the negative number ${a1} and the difference is the positive number ${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("Use the general formula for an arithmetic sequence: aₙ = a₁ + (n - 1) * d.")
                        .preview(Arrays.asList(
                                "${a1}, #{a1 + d}, #{a1 + 2 * d}, ...",
                                "aₙ = ${a1} + (${n} - 1) * ${d}"
                        ))
                        .answer("#{a1 + (n - 1) * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The general formula for the term at position ${n} is aₙ = a₁ + (n - 1) * d.",
                                "Step 2: Substitute the value of a₁: aₙ = ${a1} + (n - 1) * ${d}.",
                                "Step 3: Substitute the value of n: aₙ = ${a1} + (${n} - 1) * ${d}.",
                                "Step 4: Perform the multiplication: (${n} - 1) * ${d} = #{(n - 1) * d}.",
                                "Step 5: Add the result of the multiplication to the value of ${a1}.",
                                "Step 6: The result is #{a1 + (n - 1) * d}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} of the following second-order arithmetic sequence: ${a1}, #{a1+d1}, #{a1+2*d1+d2}, #{a1+3*d1+3*d2} ...")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(1, 100)),
                                new Variable("d1", new Range(1, 100)),
                                new Variable("d2", new Range(1, 100))
                        ))
                        .tip("For a second-order arithmetic sequence, the term at position n is calculated as aₙ = a₁ + (n - 1) * d₁ + (n - 1) * (n - 2) * d₂ / 2.")
                        .preview(Arrays.asList(
                                "${a1}, #{a1 + d1}, #{a1 + 2 * d1 + d2}, #{a1 + 3 * d1 + 3 * d2}, ...",
                                "aₙ = ${a1} + (${n} - 1) * ${d1} + ((${n} - 1) * (${n} - 2) * ${d2}) / 2"
                        ))
                        .answer("#{a1 + (n - 1) * d1 + ((n - 1) * (n - 2) * d2) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the general formula for a second-order arithmetic sequence: aₙ = a₁ + (n - 1) * d₁ + (n - 1) * (n - 2) * d₂ / 2.",
                                "Step 2: Substitute the value of a₁: aₙ = ${a1} + (n - 1) * ${d1} + (n - 1) * (n - 2) * ${d2} / 2.",
                                "Step 3: Substitute the value of n: aₙ = ${a1} + (${n} - 1) * ${d1} + ((${n} - 1) * (${n} - 2) * ${d2}) / 2.",
                                "Step 4: Calculate the first part: (${n} - 1) * ${d1} = #{(n - 1) * d1}.",
                                "Step 5: Calculate the second part: ((${n} - 1) * (${n} - 2) * ${d2}) / 2 = #{((n - 1) * (n - 2) * d2) / 2}.",
                                "Step 6: Add the results to the initial value ${a1} to obtain the term at position ${n}.",
                                "Step 7: The result is #{a1 + (n - 1) * d1 + ((n - 1) * (n - 2) * d2) / 2}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} for an arithmetic sequence where the first term is ${a1} and the sum of the first ${n} terms is ${sum}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(1, 100)),
                                new Variable("sum", new Range(1, 1000))
                        ))
                        .tip("To calculate the term at position n, use the formula for the sum of the first n terms: Sₙ = n * (2a₁ + (n - 1) * d) / 2 and solve for d. Then use the general formula for the nth term.")
                        .preview(Arrays.asList(
                                "Sum of the first ${n} terms = ${sum}",
                                "aₙ = a₁ + (n - 1) * d"
                        ))
                        .answer("#{a1 + (n - 1) * ((2 * (sum / n) - 2 * a1) / (n - 1))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the sum of the first ${n} terms: Sₙ = n * (2 * a₁ + (n - 1) * d) / 2.",
                                "Step 2: Substitute the value of the sum: ${sum} = ${n} * (2 * ${a1} + (${n} - 1) * d) / 2.",
                                "Step 3: Solve for d: d = (2 * (${sum} / ${n}) - 2 * ${a1}) / (${n} - 1).",
                                "Step 4: Substitute d into the nth term formula: aₙ = ${a1} + (${n} - 1) * #{(2 * (sum / n) - 2 * a1) / (n - 1)}.",
                                "Step 5: Simplify to find the term at position ${n}.",
                                "Step 6: The result is #{a1 + (n - 1) * ((2 * (sum / n) - 2 * a1) / (n - 1))}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} in a first-order arithmetic sequence where the term at position ${m} is ${am} and the difference is ${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("m", new Range(1, 100)),
                                new Variable("am", new Range(-1000, 1000)),
                                new Variable("d", new Range(-100, 100))
                        ))
                        .tip("To find the term at position n, use the relationship between terms at different positions: aₙ = aₘ + (n - m) * d.")
                        .preview(Arrays.asList(
                                "aₙ = aₘ + (n - m) * d",
                                "aₙ = ${am} + (${n} - ${m}) * ${d}"
                        ))
                        .answer("#{am + (n - m) * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the term at position n based on the term at position m: aₙ = aₘ + (n - m) * d.",
                                "Step 2: Substitute the value of aₘ: aₙ = ${am} + (${n} - ${m}) * ${d}.",
                                "Step 3: Calculate the difference between the positions: ${n} - ${m} = #{n - m}.",
                                "Step 4: Multiply the position difference by the common difference: #{n - m} * ${d} = #{(n - m) * d}.",
                                "Step 5: Add the result to the term aₘ to find aₙ.",
                                "Step 6: The result is #{am + (n - m) * d}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} of the following third-order arithmetic sequence: ${a1}, #{a1+d1}, #{a1+2*d1+d2}, #{a1+3*d1+3*d2+d3}, #{a1+4*d1+6*d2+4*d3} ...")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(-100, 100)),
                                new Variable("d1", new Range(-100, 100)),
                                new Variable("d2", new Range(-100, 100)),
                                new Variable("d3", new Range(-100, 100))
                        ))
                        .tip("To find the term at position n, apply the pattern of the sequence and use the corresponding combinatorial coefficients for each difference.")
                        .preview(Arrays.asList(
                                "aₙ = ${a1} + n * ${d1} + (n * (n - 1) / 2) * ${d2} + (n * (n - 1) * (n - 2) / 6) * ${d3}",
                                "aₙ = ${a1} + ${n} * ${d1} + (${n} * (${n} - 1) / 2) * ${d2} + (${n} * (${n} - 1) * (${n} - 2) / 6) * ${d3}"
                        ))
                        .answer("#{a1 + n * d1 + (n * (n - 1) / 2) * d2 + (n * (n - 1) * (n - 2) / 6) * d3}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: aₙ = ${a1} + n * ${d1} + (n * (n - 1) / 2) * ${d2} + (n * (n - 1) * (n - 2) / 6) * ${d3}.",
                                "Step 2: Calculate n * ${d1} = #{n * d1}.",
                                "Step 3: Calculate (n * (n-1) / 2) * ${d2} = #{(n * (n - 1) / 2) * d2}.",
                                "Step 4: Calculate (n * (n-1) * (n-2) / 6) * ${d3} = #{(n * (n - 1) * (n - 2) / 6) * d3}.",
                                "Step 5: Add the terms: #{a1 + n * d1 + (n * (n - 1) / 2) * d2 + (n * (n - 1) * (n - 2) / 6) * d3}.",
                                "Step 6: The result is #{a1 + n * d1 + (n * (n - 1) / 2) * d2 + (n * (n - 1) * (n - 2) / 6) * d3}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} in a second-order arithmetic sequence, given that the first term is ${a1}, the first difference is ${d1}, and the sum of the first ${m} terms is ${sum}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(1, 100)),
                                new Variable("d1", new Range(1, 100)),
                                new Variable("m", new Range(1, 100)),
                                new Variable("sum", new Range(10, 1000))
                        ))
                        .tip("To find the term at position n in a second-order sequence, use the formula involving both the first difference d₁ and the second difference as a function of the position.")
                        .preview(Arrays.asList(
                                "aₙ = a₁ + (n - 1) * d₁ + (n - 1) * (n - 2) / 2 * d₂",
                                "aₙ = ${a1} + (${n} - 1) * ${d1} + ((${n} - 1) * (${n} - 2) / 2) * d₂"
                        ))
                        .answer("#{a1 + (n - 1) * d1 + ((n - 1) * (n - 2) / 2) * d2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the first part of the formula: aₙ = a₁ + (n - 1) * d₁ + ((n - 1) * (n - 2) / 2) * d₂.",
                                "Step 2: Substitute a₁ with ${a1}.",
                                "Step 3: Calculate (n - 1) * d₁ with n = ${n} and d₁ = ${d1}, resulting in #{(n - 1) * d1}.",
                                "Step 4: Substitute and simplify the expression: ${a1} + #{(n - 1) * d1}.",
                                "Step 5: Calculate (n - 1) * (n - 2) / 2 for the quadratic term, resulting in #{(n - 1) * (n - 2) / 2}.",
                                "Step 6: Multiply the previous result by d₂ to obtain #{((n - 1) * (n - 2) / 2) * d2}.",
                                "Step 7: Substitute and add all parts of the formula: ${a1} + #{(n - 1) * d1} + #{((n - 1) * (n - 2) / 2) * d2}.",
                                "Step 8: Perform the final addition to find aₙ.",
                                "Step 9: The result is #{a1 + (n - 1) * d1 + ((n - 1) * (n - 2) / 2) * d2}."
                        ))
                        .build());
        topic5Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the term at position ${n} for a first-order arithmetic sequence where the first term is ${a1} and the sum of the first n terms is ${sn}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("n", new Range(1, 100)),
                                new Variable("a1", new Range(-100, 100)),
                                new Variable("sn", new Range(-1000, 1000))
                        ))
                        .tip("To find the term at position n, use the relationship between the sum of the first n terms and the n-th term in an arithmetic sequence.")
                        .preview(Arrays.asList(
                                "aₙ = 2 * Sₙ / n - a₁",
                                "aₙ = 2 * ${sn} / ${n} - ${a1}"
                        ))
                        .answer("#{2 * sn / n - a1}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the n-th term: aₙ = 2 * Sₙ / n - a₁.",
                                "Step 2: Substitute Sₙ with ${sn} and a₁ with ${a1}.",
                                "Step 3: Calculate 2 * Sₙ, resulting in #{2 * sn}.",
                                "Step 4: Divide the result from Step 3 by n (${n}), resulting in #{2 * sn / n}.",
                                "Step 5: Subtract a₁ (${a1}) from the result obtained in Step 4.",
                                "Step 6: The term aₙ at position ${n} is #{2 * sn / n - a1}."
                        ))
                        .build());
    }

}
