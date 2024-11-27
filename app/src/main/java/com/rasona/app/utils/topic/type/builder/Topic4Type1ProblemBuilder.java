package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic4Type1ProblemBuilder {
    @Getter
    public static final List<Problem> topic4Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic4Type1ProblemsBuilder.add(Problem.builder()
                .statement("Determine the simplified value of ${a}/${b} divided by ${c}/${d}.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a", new Range(1, 20)),
                        new Variable("b", new Range(1, 20)),
                        new Variable("c", new Range(1, 20)),
                        new Variable("d", new Range(1, 20))
                ))
                .tip("Remember that dividing by a fraction is the same as multiplying by its reciprocal.")
                .preview(Arrays.asList(
                        "(${a}/${b}) ÷ (${c}/${d})",
                        "(#{a * d}) / (#{b * c})"
                ))
                .answer("#{(a * d) / (b * c)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Rewrite the division ${a}/${b} ÷ ${c}/${d} as a multiplication by the reciprocal.",
                        "Step 2: Invert the second fraction to get ${a}/${b} * ${d}/${c}.",
                        "Step 3: Multiply the numerators ${a} and ${d} to get #{a * d}.",
                        "Step 4: Multiply the denominators ${b} and ${c} to get #{b * c}.",
                        "Step 5: The result is #{(a * d) / (b * c)}."
                ))
                .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Divide ${a}/${b} by ${c}/${d} and express the result in its simplest form.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Remember that dividing by a fraction is the same as multiplying by its reciprocal.")
                        .preview(Arrays.asList(
                                "(${a}/${b}) ÷ (${c}/${d})",
                                "(#{a * d}) / (#{b * c})"
                        ))
                        .answer("#{(a * d) / (b * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Change the division operation to a multiplication by the reciprocal, converting ${a}/${b} ÷ ${c}/${d} to ${a}/${b} * ${d}/${c}.",
                                "Step 2: Multiply the numerators ${a} and ${d} to get #{a * d}.",
                                "Step 3: Multiply the denominators ${b} and ${c} to get #{b * c}.",
                                "Step 4: The result is #{(a * d) / (b * c)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Divide ${a}/${b} by ${c}/${d} and express the result in its simplest form.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("To divide fractions, multiply the first fraction by the reciprocal of the second.")
                        .preview(Arrays.asList(
                                "(${a}/${b}) ÷ (${c}/${d})",
                                "(#{a * d}) / (#{b * c})"
                        ))
                        .answer("#{(a * d) / (b * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Change the division ${a}/${b} ÷ ${c}/${d} to a multiplication by the reciprocal of the second fraction.",
                                "Step 2: Invert the second fraction to get ${a}/${b} * ${d}/${c}.",
                                "Step 3: Multiply the numerators ${a} and ${d} to get #{a * d}.",
                                "Step 4: Multiply the denominators ${b} and ${c} to get #{b * c}.",
                                "Step 5: The result is #{(a * d) / (b * c)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate and simplify ${a}/${b} divided by ${c}/${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Remember that dividing by a fraction is the same as multiplying by its reciprocal.")
                        .preview(Arrays.asList(
                                "(${a}/${b}) ÷ (${c}/${d})",
                                "(#{a * d}) / (#{b * c})"
                        ))
                        .answer("#{(a * d) / (b * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the division ${a}/${b} ÷ ${c}/${d} into a multiplication by the reciprocal.",
                                "Step 2: Invert the second fraction to get ${a}/${b} * ${d}/${c}.",
                                "Step 3: Multiply the numerators ${a} and ${d} to get #{a * d}.",
                                "Step 4: Multiply the denominators ${b} and ${c} to get #{b * c}.",
                                "Step 5: Simplify the resulting fraction if possible.",
                                "Step 6: The result is #{(a * d) / (b * c)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Divide ${e}/${f} by ${a}/${b} and simplify the result.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20))
                        ))
                        .tip("To divide fractions, multiply the first fraction by the reciprocal of the second.")
                        .preview(Arrays.asList(
                                "(${e}/${f}) ÷ (${a}/${b})",
                                "(#{e * b}) / (#{f * a})"
                        ))
                        .answer("#{(e * b) / (f * a)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the division ${e}/${f} ÷ ${a}/${b} into a multiplication by the reciprocal.",
                                "Step 2: Invert the second fraction to get ${e}/${f} * ${b}/${a}.",
                                "Step 3: Multiply the numerators ${e} and ${b} to get #{e * b}.",
                                "Step 4: Multiply the denominators ${f} and ${a} to get #{f * a}.",
                                "Step 5: Simplify the resulting fraction if possible.",
                                "Step 6: The result is #{(e * b) / (f * a)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the simplified value of the division ${e}/${f} ÷ ${a}/${b}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20))
                        ))
                        .tip("Remember that dividing fractions is the same as multiplying by the reciprocal of the second fraction.")
                        .preview(Arrays.asList(
                                "(${e}/${f}) ÷ (${a}/${b})",
                                "(#{e * b}) / (#{f * a})"
                        ))
                        .answer("#{(e * b) / (f * a)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the division ${e}/${f} ÷ ${a}/${b} into a multiplication by the reciprocal.",
                                "Step 2: Invert the second fraction to get ${e}/${f} * ${b}/${a}.",
                                "Step 3: Multiply the numerators ${e} and ${b} to get #{e * b}.",
                                "Step 4: Multiply the denominators ${f} and ${a} to get #{f * a}.",
                                "Step 5: Simplify the resulting fraction if possible.",
                                "Step 6: The result is #{(e * b) / (f * a)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate and simplify ${e}/${f} divided by ${a}/${b}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20))
                        ))
                        .tip("Dividing fractions is the same as multiplying the first fraction by the reciprocal of the second.")
                        .preview(Arrays.asList(
                                "(${e}/${f}) ÷ (${a}/${b})",
                                "(#{e * b}) / (#{f * a})"
                        ))
                        .answer("#{(e * b) / (f * a)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Change the division ${e}/${f} ÷ ${a}/${b} to a multiplication by the reciprocal.",
                                "Step 2: Invert the second fraction, obtaining ${e}/${f} * ${b}/${a}.",
                                "Step 3: Multiply the numerators ${e} and ${b} to get #{e * b}.",
                                "Step 4: Multiply the denominators ${f} and ${a} to get #{f * a}.",
                                "Step 5: Simplify the resulting fraction if possible.",
                                "Step 6: The result is #{(e * b) / (f * a)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the simplified value of ${g}/${h} divided by ${e}/${f}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Remember that dividing fractions is equivalent to multiplying the first fraction by the reciprocal of the second.")
                        .preview(Arrays.asList(
                                "(${g}/${h}) ÷ (${e}/${f})",
                                "(#{g * f}) / (#{h * e})"
                        ))
                        .answer("#{(g * f) / (h * e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Change the division ${g}/${h} ÷ ${e}/${f} to a multiplication by the reciprocal.",
                                "Step 2: Invert the second fraction, obtaining ${g}/${h} * ${f}/${e}.",
                                "Step 3: Multiply the numerators ${g} and ${f} to get #{g * f}.",
                                "Step 4: Multiply the denominators ${h} and ${e} to get #{h * e}.",
                                "Step 5: Simplify the resulting fraction if possible.",
                                "Step 6: The result is #{(g * f) / (h * e)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Divide ${g}/${h} by ${e}/${f} and simplify the result.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("To divide fractions, multiply the first fraction by the reciprocal of the second.")
                        .preview(Arrays.asList(
                                "(${g}/${h}) ÷ (${e}/${f})",
                                "(#{g * f}) / (#{h * e})"
                        ))
                        .answer("#{(g * f) / (h * e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the division ${g}/${h} ÷ ${e}/${f} into a multiplication by the reciprocal.",
                                "Step 2: Invert the second fraction, obtaining ${g}/${h} * ${f}/${e}.",
                                "Step 3: Multiply the numerators ${g} and ${f} to get #{g * f}.",
                                "Step 4: Multiply the denominators ${h} and ${e} to get #{h * e}.",
                                "Step 5: Simplify the resulting fraction if possible.",
                                "Step 6: The result is #{(g * f) / (h * e)}."
                        ))
                        .build());
        topic4Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate and simplify ${g}/${h} divided by ${e}/${f}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Remember that dividing fractions is equivalent to multiplying the first fraction by the reciprocal of the second.")
                        .preview(Arrays.asList(
                                "(${g}/${h}) ÷ (${e}/${f})",
                                "(#{g * f}) / (#{h * e})"
                        ))
                        .answer("#{(g * f) / (h * e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Change the division ${g}/${h} ÷ ${e}/${f} into a multiplication by the reciprocal.",
                                "Step 2: Invert the second fraction, resulting in ${g}/${h} * ${f}/${e}.",
                                "Step 3: Multiply the numerators ${g} and ${f} to get #{g * f}.",
                                "Step 4: Multiply the denominators ${h} and ${e} to get #{h * e}.",
                                "Step 5: Simplify the resulting fraction if possible.",
                                "Step 6: The result is #{(g * f) / (h * e)}."
                        ))
                        .build());
    }
}
