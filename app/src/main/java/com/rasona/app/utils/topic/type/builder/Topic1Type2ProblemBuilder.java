package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic1Type2ProblemBuilder {
    @Getter
    public static final List<Problem> topic1Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the value of (${a} / ${b}) * ${c}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100))
                        ))
                        .tip("To solve, first divide ${a} by ${b} and then multiply the result by ${c}.")
                        .preview(Arrays.asList(
                                "(${a} / ${b}) * ${c}",
                                "#{a / b} * ${c}"
                        ))
                        .answer("#{(a / b) * c}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} / ${b}) * ${c}",
                                "Step 2: #{a / b} * ${c}",
                                "Step 3: The result is #{(a / b) * c}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the result of dividing (${a} * ${b}) by ${c} and multiplying by ${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${a} by ${b}, then divide the result by ${c}, and finally multiply this result by ${d}.")
                        .preview(Arrays.asList(
                                "((${a} * ${b}) / ${c}) * ${d}",
                                "(#{a * b} / ${c}) * ${d}"
                        ))
                        .answer("#{((a * b) / c) * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: ((${a} * ${b}) / ${c}) * ${d}",
                                "Step 2: (#{a * b} / ${c}) * ${d}",
                                "Step 3: #{(a * b) / c} * ${d}",
                                "Step 4: The result is #{((a * b) / c) * d}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate (${a} / ${b}) * (${c} * ${d}).")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve, first divide ${a} by ${b}, then multiply the result by the product of ${c} and ${d}.")
                        .preview(Arrays.asList(
                                "(${a} / ${b}) * (${c} * ${d})",
                                "#{a / b} * (#{c * d})"
                        ))
                        .answer("#{(a / b) * (c * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} / ${b}) * (${c} * ${d})",
                                "Step 2: #{a / b} * (${c} * ${d})",
                                "Step 3: #{a / b} * #{c * d}",
                                "Step 4: The result is #{(a / b) * (c * d)}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Solve (${a} * ${b}) / (${c} * ${d}).")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${a} by ${b} and ${c} by ${d}. Then, divide the first result by the second.")
                        .preview(Arrays.asList(
                                "(${a} * ${b}) / (${c} * ${d})",
                                "#{a * b} / #{c * d}"
                        ))
                        .answer("#{(a * b) / (c * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} * ${b}) / (${c} * ${d})",
                                "Step 2: #{a * b} / (${c} * ${d})",
                                "Step 3: #{a * b} / #{c * d}",
                                "Step 4: The result is #{(a * b) / (c * d)}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of (${a} * ${b}) * (${c} / ${d}) / ${e}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${a} by ${b}. Then, divide ${c} by ${d}, multiply both results, and finally divide the result by ${e}.")
                        .preview(Arrays.asList(
                                "(${a} * ${b}) * (${c} / ${d}) / ${e}",
                                "#{a * b} * (#{c / d}) / ${e}"
                        ))
                        .answer("#{((a * b) * (c / d)) / e}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} * ${b}) * (${c} / ${d}) / ${e}",
                                "Step 2: #{a * b} * (${c} / ${d}) / ${e}",
                                "Step 3: #{a * b} * #{c / d} / ${e}",
                                "Step 4: The result is #{((a * b) * (c / d)) / e}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate (${a} / ${b}) * (${c} * ${d}) * ${e}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100))
                        ))
                        .tip("To solve, first divide ${a} by ${b}, then multiply the result by the product of ${c} and ${d}, and finally multiply that result by ${e}.")
                        .preview(Arrays.asList(
                                "(${a} / ${b}) * (${c} * ${d}) * ${e}",
                                "#{a / b} * #{c * d} * ${e}"
                        ))
                        .answer("#{((a / b) * (c * d)) * e}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} / ${b}) * (${c} * ${d}) * ${e}",
                                "Step 2: #{a / b} * (${c} * ${d}) * ${e}",
                                "Step 3: #{a / b} * #{c * d} * ${e}",
                                "Step 4: The result is #{((a / b) * (c * d)) * e}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Solve (${a} * ${b} / ${c}) * (${d} / ${e}).")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${a} by ${b} and then divide the result by ${c}. Next, divide ${d} by ${e} and multiply both results.")
                        .preview(Arrays.asList(
                                "(${a} * ${b} / ${c}) * (${d} / ${e})",
                                "#{a * b / c} * #{d / e}"
                        ))
                        .answer("#{((a * b / c) * (d / e))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} * ${b}) / ${c} * (${d} / ${e})",
                                "Step 2: #{a * b} / ${c} * (${d} / ${e})",
                                "Step 3: #{a * b / c} * #{d / e}",
                                "Step 4: The result is #{((a * b / c) * (d / e))}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${a} * ${b} / ${c}) * (${d} * ${e} / ${f}).")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${a} by ${b} and divide the result by ${c}. Then, multiply ${d} by ${e} and divide this result by ${f}. Finally, multiply both obtained results.")
                        .preview(Arrays.asList(
                                "(${a} * ${b} / ${c}) * (${d} * ${e} / ${f})",
                                "#{a * b / c} * #{d * e / f}"
                        ))
                        .answer("#{((a * b / c) * (d * e / f))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} * ${b}) / ${c} * (${d} * ${e}) / ${f}",
                                "Step 2: #{a * b} / ${c} * (${d} * ${e}) / ${f}",
                                "Step 3: #{a * b / c} * #{d * e} / ${f}",
                                "Step 4: #{a * b / c} * #{d * e / f}",
                                "Step 5: The result is #{((a * b / c) * (d * e / f))}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of (${a} * ${b}) / (${c} * ${d}) * (${e} / ${f}).")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${a} by ${b} and ${c} by ${d}. Then, divide the first result by the second and multiply the result by ${e} divided by ${f}.")
                        .preview(Arrays.asList(
                                "(${a} * ${b}) / (${c} * ${d}) * (${e} / ${f})",
                                "#{a * b} / #{c * d} * #{e / f}"
                        ))
                        .answer("#{((a * b) / (c * d)) * (e / f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} * ${b}) / (${c} * ${d}) * (${e} / ${f})",
                                "Step 2: #{a * b} / #{c * d} * (${e} / ${f})",
                                "Step 3: #{a * b / (c * d)} * #{e / f}",
                                "Step 4: The result is #{((a * b) / (c * d)) * (e / f)}"
                        ))
                        .build());
        topic1Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${a} * ${b}) * (${c} / ${d}) / (${e} * ${f}).")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${a} by ${b} and divide ${c} by ${d}. Then, multiply the first result by the second and divide the product by (${e} * ${f}).")
                        .preview(Arrays.asList(
                                "(${a} * ${b}) * (${c} / ${d}) / (${e} * ${f})",
                                "#{a * b} * #{c / d} / #{e * f}"
                        ))
                        .answer("#{((a * b) * (c / d)) / (e * f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} * ${b}) * (${c} / ${d}) / (${e} * ${f})",
                                "Step 2: #{a * b} * #{c / d} / (${e} * ${f})",
                                "Step 3: #{a * b * (c / d)} / #{e * f}",
                                "Step 4: The result is #{((a * b) * (c / d)) / (e * f)}"
                        ))
                        .build());
    }
}
