package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic2Type1ProblemBuilder {
    @Getter
    public static final List<Problem> topic2Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic2Type1ProblemsBuilder.add(Problem.builder()
                .statement("Calculate the value of (${a}+${b})^${c}.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a", new Range(1, 10)),
                        new Variable("b", new Range(1, 10)),
                        new Variable("c", new Range(1, 4))
                ))
                .tip("To calculate (${a}+${b})^${c}, multiply (${a}+${b}) by itself ${c} times.")
                .preview(Arrays.asList(
                        "(${a}+${b})^${c}",
                        "#{a+b}^${c}"
                ))
                .answer("#{(a+b)^c}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: (${a}+${b})^${c}",
                        "Step 2: (#{a+b})^${c}",
                        "Step 3: The result is #{(a+b)^c}"
                ))
                .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Solve ${a}^${b} * ${c}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 5))
                        ))
                        .tip("First, calculate ${a}^${b} and then multiply the result by ${c}.")
                        .preview(Arrays.asList(
                                "${a}^${b} * ${c}",
                                "#{a}^{b} * ${c}"
                        ))
                        .answer("#{(a^b) * c}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: ${a}^${b} * ${c}",
                                "Step 2: (#{a^b}) * ${c}",
                                "Step 3: The result is #{(a^b) * c}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of (${a}^${b}) / ${c}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 5)),
                                new Variable("c", new Range(1, 100))
                        ))
                        .tip("First, calculate ${a}^${b} and then divide the result by ${c}.")
                        .preview(Arrays.asList(
                                "(${a}^${b}) / ${c}",
                                "#{a^b} / ${c}"
                        ))
                        .answer("#{(a^b) / c}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a}^${b}) / ${c}",
                                "Step 2: (#{a^b}) / ${c}",
                                "Step 3: The result is #{(a^b) / c}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${a}^${b}) / (${c}^${d}).")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 5)),
                                new Variable("c", new Range(1, 10)),
                                new Variable("d", new Range(1, 5))
                        ))
                        .tip("First, calculate ${a}^${b} and ${c}^${d} separately, then divide the first result by the second.")
                        .preview(Arrays.asList(
                                "(${a}^${b}) / (${c}^${d})",
                                "#{a^b} / #{c^d}"
                        ))
                        .answer("#{(a^b) / (c^d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a}^${b}) / (${c}^${d})",
                                "Step 2: (#{a^b}) / (#{c^d})",
                                "Step 3: The result is #{(a^b) / (c^d)}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of the square root of (${a}^${b} * ${c}).")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 5)),
                                new Variable("c", new Range(1, 100))
                        ))
                        .tip("First, calculate ${a}^${b}, then multiply the result by ${c}, and finally find the square root of the product.")
                        .preview(Arrays.asList(
                                "√((${a}^${b}) * ${c})",
                                "√(#{a^b} * ${c})"
                        ))
                        .answer("#{sqrt((a^b) * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: √((${a}^${b}) * ${c})",
                                "Step 2: √(#{a^b} * ${c})",
                                "Step 3: √(#{(a^b) * c})",
                                "Step 4: The result is #{sqrt((a^b) * c)}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the square root of (${a} * ${b})^${c}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 5))
                        ))
                        .tip("First, multiply ${a} by ${b}, then raise the result to the power of ${c}, and finally calculate the square root of the result.")
                        .preview(Arrays.asList(
                                "√((${a} * ${b})^${c})",
                                "#{sqrt((a * b))^{c})"
                        ))
                        .answer("#{sqrt((a * b)^c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: √((${a} * ${b})^${c})",
                                "Step 2: √(#{(a * b)^c})",
                                "Step 3: The result is #{sqrt((a * b)^c)}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate (${a}^(1/2) * ${b}) / ${c}^${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 10)),
                                new Variable("d", new Range(1, 5))
                        ))
                        .tip("First, calculate the square root of ${a}, then multiply the result by ${b}. Next, calculate ${c}^${d} and finally divide the obtained product by the result of the power.")
                        .preview(Arrays.asList(
                                "(√${a} * ${b}) / ${c}^${d}",
                                "({sqrt(a) * b)} / (${c}^{d})"
                        ))
                        .answer("#{(sqrt(a) * b) / (c^d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (√${a} * ${b}) / ${c}^${d}",
                                "Step 2: (√#{a} * ${b}) / (#{c^d})",
                                "Step 3: The result is #{(sqrt(a) * b) / (c^d)}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the value of the square root of (${a}^${b} * ${c}^${d}) / ${e}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 5)),
                                new Variable("c", new Range(1, 10)),
                                new Variable("d", new Range(1, 5)),
                                new Variable("e", new Range(1, 100))
                        ))
                        .tip("First, calculate ${a}^${b} and ${c}^${d}, then multiply both results. Divide the obtained product by ${e} and finally calculate the square root of the result.")
                        .preview(Arrays.asList(
                                "√(((${a}^${b}) * (${c}^${d})) / ${e})",
                                "√((#{a^b} * #{c^d}) / ${e})"
                        ))
                        .answer("#{sqrt((a^b * c^d) / e)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: √(((${a}^${b}) * (${c}^${d})) / ${e})",
                                "Step 2: √((#{a^b} * #{c^d}) / ${e})",
                                "Step 3: √((#{(a^b) * (c^d)}) / ${e})",
                                "Step 4: (#{sqrt((a^b) * (c^d))}) / ${e}",
                                "Step 5: The result is #{sqrt((a^b * c^d) / e)}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the result of (${a}^${b} * ${c})^(1/2) / (${d} * ${e}^${f}).")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 10)),
                                new Variable("b", new Range(1, 5)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 10)),
                                new Variable("e", new Range(1, 10)),
                                new Variable("f", new Range(1, 5))
                        ))
                        .tip("First, calculate ${a}^${b} and multiply it by ${c}. Then, find the square root of the obtained product. Next, calculate ${e}^${f} and multiply it by ${d}. Finally, divide the first result by the second.")
                        .preview(Arrays.asList(
                                "√(((${a}^${b}) * ${c}) / (${d} * ${e}^${f}))",
                                "√((#{a^b} * ${c}) / (${d} * #{e^f}))"
                        ))
                        .answer("#{sqrt((a^b * c) / (d * e^f))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: √(((${a}^${b}) * ${c}) / (${d} * ${e}^${f}))",
                                "Step 2: √((#{a^b} * ${c}) / (${d} * #{e^f}))",
                                "Step 3: √((#{(a^b) * c}) / (${d} * #{e^f}))",
                                "Step 4: √((#{(a^b) * c}) / (#{d * (e^f)}))",
                                "Step 5: (#{sqrt((a^b) * c)}) / (#{d * (e^f)})",
                                "Step 6: The result is #{sqrt((a^b * c) / (d * e^f))}"
                        ))
                        .build());
        topic2Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate (${a}^(1/2) * ${b}^${c}) / (${d}^(1/2) * ${e}^${f}).")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 5)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 10)),
                                new Variable("f", new Range(1, 5))
                        ))
                        .tip("First, calculate the square root of ${a}, then raise ${b} to the power of ${c} and multiply both results. Do the same with ${d} and ${e}, calculating the square root of ${d} and multiplying the result by ${e}^${f}. Finally, divide the first product by the second.")
                        .preview(Arrays.asList(
                                "(${a}^(1/2) * ${b}^${c}) / (${d}^(1/2) * ${e}^${f})",
                                "(#{sqrt(a)} * #{b^c}) / (#{sqrt(d)} * #{e^f})"
                        ))
                        .answer("#{(sqrt(a) * (b^c)) / (sqrt(d) * (e^f))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a}^(1/2) * ${b}^${c}) / (${d}^(1/2) * ${e}^${f})",
                                "Step 2: (#{sqrt(a)} * #{b^c}) / (#{sqrt(d)} * #{e^f})",
                                "Step 3: (#{sqrt(a) * (b^c)}) / (#{sqrt(d) * (e^f)})",
                                "Step 4: The result is #{(sqrt(a) * (b^c)) / (sqrt(d) * (e^f))}"
                        ))
                        .build());
    }
}
