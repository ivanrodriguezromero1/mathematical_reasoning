package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic4Type2ProblemBuilder {
    @Getter
    public static final List<Problem> topic4Type2ProblemsBuilder = new ArrayList<>();

    static{
        topic4Type2ProblemsBuilder.add(Problem.builder()
                .statement("Calculate how much ${a}/${b} of ${c} ${d}/${e} is expressed as a fraction.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a", new Range(1, 10)),
                        new Variable("b", new Range(1, 10)),
                        new Variable("c", new Range(1, 10)),
                        new Variable("d", new Range(1, 10)),
                        new Variable("e", new Range(1, 10))
                ))
                .tip("Convert the mixed number to a fraction and then multiply by ${a}/${b}.")
                .preview(Arrays.asList(
                        "(${a}/${b}) * (${c} ${d}/${e})",
                        "#{a * ((c * e) + d)} / (#{b * e})"
                ))
                .answer("#{(a * ((c * e) + d)) / (b * e)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Convert the mixed number ${c} ${d}/${e} to an improper fraction: (#{(c * e) + d}) / ${e}.",
                        "Step 2: Multiply ${a}/${b} by the fraction obtained in Step 1.",
                        "Step 3: Multiply the numerators: ${a} * (#{(c * e) + d}) = #{a * ((c * e) + d)}.",
                        "Step 4: Multiply the denominators: ${b} * ${e} = #{b * e}.",
                        "Step 5: Express the result as a fraction: #{(a * ((c * e) + d)) / (b * e)}.",
                        "Step 6: Simplify the fraction if possible.",
                        "Step 7: The result is #{(a * ((c * e) + d)) / (b * e)}."
                ))
                .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate how much ${a}/${b} of ${c} ${d}/${e} is expressed as a fraction.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10)),
                                new Variable("d", new Range(1, 10)),
                                new Variable("e", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to a fraction and then multiply by ${a}/${b}.")
                        .preview(Arrays.asList(
                                "(${a}/${b}) * (${c} ${d}/${e})",
                                "#{a * ((c * e) + d)} / (#{b * e})"
                        ))
                        .answer("#{(a * ((c * e) + d)) / (b * e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${c} ${d}/${e} to an improper fraction: (#{(c * e) + d}) / ${e}.",
                                "Step 2: Multiply ${a}/${b} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${a} * (#{(c * e) + d}) = #{a * ((c * e) + d)}.",
                                "Step 4: Multiply the denominators: ${b} * ${e} = #{b * e}.",
                                "Step 5: Express the result as a fraction: #{(a * ((c * e) + d)) / (b * e)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(a * ((c * e) + d)) / (b * e)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the fraction that represents ${a}/${b} of the mixed number ${c} ${d}/${e}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10)),
                                new Variable("d", new Range(1, 10)),
                                new Variable("e", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${a}/${b}.")
                        .preview(Arrays.asList(
                                "${a}/${b} of ${c} ${d}/${e}",
                                "(#{a * ((c * e) + d)}) / (#{b * e})"
                        ))
                        .answer("#{(a * ((c * e) + d)) / (b * e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${c} ${d}/${e} to an improper fraction: (#{(c * e) + d}) / ${e}.",
                                "Step 2: Multiply ${a}/${b} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${a} * (#{(c * e) + d}) = #{a * ((c * e) + d)}.",
                                "Step 4: Multiply the denominators: ${b} * ${e} = #{b * e}.",
                                "Step 5: Express the result as a fraction: #{(a * ((c * e) + d)) / (b * e)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(a * ((c * e) + d)) / (b * e)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Determine how much ${a}/${b} of ${c} ${d}/${e} is and express it as a fraction.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10)),
                                new Variable("d", new Range(1, 10)),
                                new Variable("e", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${a}/${b}.")
                        .preview(Arrays.asList(
                                "${a}/${b} of ${c} ${d}/${e}",
                                "(#{a * ((c * e) + d)}) / (#{b * e})"
                        ))
                        .answer("#{(a * ((c * e) + d)) / (b * e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${c} ${d}/${e} to an improper fraction: (#{(c * e) + d}) / ${e}.",
                                "Step 2: Multiply ${a}/${b} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${a} * (#{(c * e) + d}) = #{a * ((c * e) + d)}.",
                                "Step 4: Multiply the denominators: ${b} * ${e} = #{b * e}.",
                                "Step 5: Express the result as a fraction: #{(a * ((c * e) + d)) / (b * e)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(a * ((c * e) + d)) / (b * e)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the resulting fraction of ${a}/${b} of ${c} ${d}/${e}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10)),
                                new Variable("d", new Range(1, 10)),
                                new Variable("e", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${a}/${b}.")
                        .preview(Arrays.asList(
                                "${a}/${b} of ${c} ${d}/${e}",
                                "(#{a * ((c * e) + d)}) / (#{b * e})"
                        ))
                        .answer("#{(a * ((c * e) + d)) / (b * e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${c} ${d}/${e} to an improper fraction: (#{(c * e) + d}) / ${e}.",
                                "Step 2: Multiply ${a}/${b} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${a} * (#{(c * e) + d}) = #{a * ((c * e) + d)}.",
                                "Step 4: Multiply the denominators: ${b} * ${e} = #{b * e}.",
                                "Step 5: Express the result as a fraction: #{(a * ((c * e) + d)) / (b * e)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(a * ((c * e) + d)) / (b * e)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Determine how much ${f}/${g} of ${a} ${b}/${c} is in fractional form.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("f", new Range(1, 10)),
                                new Variable("g", new Range(1, 10)),
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${f}/${g}.")
                        .preview(Arrays.asList(
                                "${f}/${g} of ${a} ${b}/${c}",
                                "(#{f * ((a * c) + b)}) / (#{g * c})"
                        ))
                        .answer("#{(f * ((a * c) + b)) / (g * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${a} ${b}/${c} to an improper fraction: (#{(a * c) + b}) / ${c}.",
                                "Step 2: Multiply ${f}/${g} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${f} * (#{(a * c) + b}) = #{f * ((a * c) + b)}.",
                                "Step 4: Multiply the denominators: ${g} * ${c} = #{g * c}.",
                                "Step 5: Express the result as a fraction: #{(f * ((a * c) + b)) / (g * c)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(f * ((a * c) + b)) / (g * c)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the fraction resulting from ${f}/${g} of ${a} ${b}/${c}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("f", new Range(1, 10)),
                                new Variable("g", new Range(1, 10)),
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${f}/${g}.")
                        .preview(Arrays.asList(
                                "${f}/${g} of ${a} ${b}/${c}",
                                "(#{f * ((a * c) + b)}) / (#{g * c})"
                        ))
                        .answer("#{(f * ((a * c) + b)) / (g * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${a} ${b}/${c} to an improper fraction: (#{(a * c) + b}) / ${c}.",
                                "Step 2: Multiply ${f}/${g} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${f} * (#{(a * c) + b}) = #{f * ((a * c) + b)}.",
                                "Step 4: Multiply the denominators: ${g} * ${c} = #{g * c}.",
                                "Step 5: Express the result as a fraction: #{(f * ((a * c) + b)) / (g * c)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(f * ((a * c) + b)) / (g * c)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of ${f}/${g} of ${a} ${b}/${c} as a simplified fraction.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("f", new Range(1, 10)),
                                new Variable("g", new Range(1, 10)),
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${f}/${g}.")
                        .preview(Arrays.asList(
                                "${f}/${g} of ${a} ${b}/${c}",
                                "(#{f * ((a * c) + b)}) / (#{g * c})"
                        ))
                        .answer("#{(f * ((a * c) + b)) / (g * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${a} ${b}/${c} to an improper fraction: (#{(a * c) + b}) / ${c}.",
                                "Step 2: Multiply ${f}/${g} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${f} * (#{(a * c) + b}) = #{f * ((a * c) + b)}.",
                                "Step 4: Multiply the denominators: ${g} * ${c} = #{g * c}.",
                                "Step 5: Express the result as a fraction: #{(f * ((a * c) + b)) / (g * c)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(f * ((a * c) + b)) / (g * c)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the fraction that represents ${h}/${i} of ${f} ${g}/${j}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("h", new Range(1, 10)),
                                new Variable("i", new Range(1, 10)),
                                new Variable("f", new Range(1, 10)),
                                new Variable("g", new Range(1, 10)),
                                new Variable("j", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${h}/${i}.")
                        .preview(Arrays.asList(
                                "${h}/${i} of ${f} ${g}/${j}",
                                "(#{h * ((f * j) + g)}) / (#{i * j})"
                        ))
                        .answer("#{(h * ((f * j) + g)) / (i * j)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${f} ${g}/${j} to an improper fraction: (#{(f * j) + g}) / ${j}.",
                                "Step 2: Multiply ${h}/${i} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${h} * (#{(f * j) + g}) = #{h * ((f * j) + g)}.",
                                "Step 4: Multiply the denominators: ${i} * ${j} = #{i * j}.",
                                "Step 5: Express the result as a fraction: #{(h * ((f * j) + g)) / (i * j)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(h * ((f * j) + g)) / (i * j)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the value of ${h}/${i} of ${f} ${g}/${j} and express it as a fraction.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("h", new Range(1, 10)),
                                new Variable("i", new Range(1, 10)),
                                new Variable("f", new Range(1, 10)),
                                new Variable("g", new Range(1, 10)),
                                new Variable("j", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${h}/${i}.")
                        .preview(Arrays.asList(
                                "${h}/${i} of ${f} ${g}/${j}",
                                "(#{h * ((f * j) + g)}) / (#{i * j})"
                        ))
                        .answer("#{(h * ((f * j) + g)) / (i * j)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${f} ${g}/${j} to an improper fraction: (#{(f * j) + g}) / ${j}.",
                                "Step 2: Multiply ${h}/${i} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${h} * (#{(f * j) + g}) = #{h * ((f * j) + g)}.",
                                "Step 4: Multiply the denominators: ${i} * ${j} = #{i * j}.",
                                "Step 5: Express the result as a fraction: #{(h * ((f * j) + g)) / (i * j)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(h * ((f * j) + g)) / (i * j)}."
                        ))
                        .build());
        topic4Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of ${h}/${i} of ${f} ${g}/${j} in its simplified fraction form.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("h", new Range(1, 10)),
                                new Variable("i", new Range(1, 10)),
                                new Variable("f", new Range(1, 10)),
                                new Variable("g", new Range(1, 10)),
                                new Variable("j", new Range(1, 10))
                        ))
                        .tip("Convert the mixed number to an improper fraction before multiplying by ${h}/${i}.")
                        .preview(Arrays.asList(
                                "${h}/${i} of ${f} ${g}/${j}",
                                "(#{h * ((f * j) + g)}) / (#{i * j})"
                        ))
                        .answer("#{(h * ((f * j) + g)) / (i * j)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the mixed number ${f} ${g}/${j} to an improper fraction: (#{(f * j) + g}) / ${j}.",
                                "Step 2: Multiply ${h}/${i} by the fraction obtained in Step 1.",
                                "Step 3: Multiply the numerators: ${h} * (#{(f * j) + g}) = #{h * ((f * j) + g)}.",
                                "Step 4: Multiply the denominators: ${i} * ${j} = #{i * j}.",
                                "Step 5: Express the result as a fraction: #{(h * ((f * j) + g)) / (i * j)}.",
                                "Step 6: Simplify the fraction if possible.",
                                "Step 7: The result is #{(h * ((f * j) + g)) / (i * j)}."
                        ))
                        .build());
    }
}
