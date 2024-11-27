package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic1Type1ProblemBuilder {

    @Getter
    public static final List<Problem> topic1Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of ${a} + ${b} - ${c} + ${d} - ${e}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100))
                        ))
                        .tip("To solve, add ${a} and ${b}, then subtract ${c}, add ${d}, and finally subtract ${e} from the result.")
                        .preview(Arrays.asList(
                                "(${a} + ${b}) - ${c} + ${d} - ${e}",
                                "#{a + b} - ${c} + ${d} - ${e}"
                        ))
                        .answer("#{a + b - c + d - e}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b}) - ${c} + ${d} - ${e}",
                                "Step 2: #{a + b} - ${c} + ${d} - ${e}",
                                "Step 3: #{a + b - c} + ${d} - ${e}",
                                "Step 4: The result is: #{a + b - c + d - e}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of ${a} - ${b} + ${c} - ${d} + ${e}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100))
                        ))
                        .tip("To solve, subtract ${b} from ${a}, then add ${c}, subtract ${d}, and finally add ${e} to the result.")
                        .preview(Arrays.asList(
                                "(${a} - ${b}) + ${c} - ${d} + ${e}",
                                "#{a - b} + ${c} - ${d} + ${e}"
                        ))
                        .answer("#{a - b + c - d + e}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} - ${b}) + ${c} - ${d} + ${e}",
                                "Step 2: #{a - b} + ${c} - ${d} + ${e}",
                                "Step 3: #{a - b + c} - ${d} + ${e}",
                                "Step 4: #{a - b + c - d} + ${e}",
                                "Step 5: The result is: #{a - b + c - d + e}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Solve the expression (${a} + ${b}) - (${c} + ${d}) + ${e}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${a} and ${b}, then add ${c} and ${d}, subtract the second result from the first, and finally add ${e} to the result.")
                        .preview(Arrays.asList(
                                "(${a} + ${b}) - (${c} + ${d}) + ${e}",
                                "#{a + b} - #{c + d} + ${e}"
                        ))
                        .answer("#{(a + b) - (c + d) + e}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b}) - (${c} + ${d}) + ${e}",
                                "Step 2: #{a + b} - #{c + d} + ${e}",
                                "Step 3: #{(a + b) - (c + d)} + ${e}",
                                "Step 4: The result is: #{(a + b) - (c + d) + e}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the value of (${a} + ${b} + ${c}) - ${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve, add ${a}, ${b}, and ${c}, then subtract ${d} from the result.")
                        .preview(Arrays.asList(
                                "(${a} + ${b} + ${c}) - ${d}",
                                "(#{a + b} + ${c}) - ${d}"
                        ))
                        .answer("#{(a + b + c) - d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b} + ${c}) - ${d}",
                                "Step 2: (#{a + b} + ${c}) - ${d}",
                                "Step 3: #{a + b + c} - ${d}",
                                "Step 4: The result is: #{(a + b + c) - d}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate (${a} + ${b} - ${c}) - (${d} + ${e}) + ${f}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${a} and ${b} and subtract ${c}. Then, add ${d} and ${e} and subtract the result of the first operation. Finally, add ${f} to the result.")
                        .preview(Arrays.asList(
                                "(${a} + ${b} - ${c}) - (${d} + ${e}) + ${f}",
                                "#{a + b - c} - (#{d + e}) + ${f}"
                        ))
                        .answer("#{(a + b - c) - (d + e) + f}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b} - ${c}) - (${d} + ${e}) + ${f}",
                                "Step 2: #{a + b - c} - (#{d + e}) + ${f}",
                                "Step 3: #{(a + b - c) - (d + e)} + ${f}",
                                "Step 4: The result is: #{(a + b - c) - (d + e) + f}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Solve (${a} + ${b}) + (${c} - ${d}) - ${e} + ${f}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${a} and ${b}, then subtract ${d} from ${c}, add both results, subtract ${e}, and finally add ${f}.")
                        .preview(Arrays.asList(
                                "(${a} + ${b}) + (${c} - ${d}) - ${e} + ${f}",
                                "#{a + b} + (#{c - d}) - ${e} + ${f}"
                        ))
                        .answer("#{(a + b) + (c - d) - e + f}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b}) + (${c} - ${d}) - ${e} + ${f}",
                                "Step 2: #{a + b} + (#{c - d}) - ${e} + ${f}",
                                "Step 3: #{(a + b) + (c - d) - e} + ${f}",
                                "Step 4: The result is: #{(a + b) + (c - d) - e + f}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${a} + ${b}) + (${c} - ${d}) - (${e} + ${f}).")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${a} and ${b}, then subtract ${d} from ${c}, add both results, then add ${e} and ${f}, and finally subtract this last result.")
                        .preview(Arrays.asList(
                                "(${a} + ${b}) + (${c} - ${d}) - (${e} + ${f})",
                                "#{a + b} + (#{c - d}) - (#{e + f})"
                        ))
                        .answer("#{(a + b) + (c - d) - (e + f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b}) + (${c} - ${d}) - (${e} + ${f})",
                                "Step 2: #{a + b} + (#{c - d}) - (#{e + f})",
                                "Step 3: #{(a + b) + (c - d)} - (#{e + f})",
                                "Step 4: The result is: #{(a + b) + (c - d) - (e + f)}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${a} - ${b}) + (${c} + ${d} - ${e}) + ${f} - ${g}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100)),
                                new Variable("g", new Range(1, 100))
                        ))
                        .tip("To solve, first subtract ${b} from ${a}. Then add ${c} and ${d}, subtract ${e} from the result, and add this result to the first one. Finally, add ${f} and subtract ${g} from the total.")
                        .preview(Arrays.asList(
                                "(${a} - ${b}) + (${c} + ${d} - ${e}) + ${f} - ${g}",
                                "#{a - b} + (#{c + d - e}) + ${f} - ${g}"
                        ))
                        .answer("#{(a - b) + (c + d - e) + f - g}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} - ${b}) + (${c} + ${d} - ${e}) + ${f} - ${g}",
                                "Step 2: #{a - b} + (#{c + d - e}) + ${f} - ${g}",
                                "Step 3: #{(a - b) + (c + d - e) + f} - ${g}",
                                "Step 4: The result is: #{(a - b) + (c + d - e) + f - g}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of (${a} + ${b} - ${c}) - (${d} + ${e}) + ${f} - ${g}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100)),
                                new Variable("g", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${a} and ${b} and then subtract ${c}. Next, add ${d} and ${e}, subtract this result from the previous one, then add ${f}, and finally subtract ${g}.")
                        .preview(Arrays.asList(
                                "(${a} + ${b} - ${c}) - (${d} + ${e}) + ${f} - ${g}",
                                "#{a + b - c} - (#{d + e}) + ${f} - ${g}"
                        ))
                        .answer("#{(a + b - c) - (d + e) + f - g}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b} - ${c}) - (${d} + ${e}) + ${f} - ${g}",
                                "Step 2: #{a + b - c} - (#{d + e}) + ${f} - ${g}",
                                "Step 3: #{(a + b - c) - (d + e) + f} - ${g}",
                                "Step 4: The result is: #{(a + b - c) - (d + e) + f - g}"
                        ))
                        .build());
        topic1Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${a} + ${b}) - (${c} - ${d}) + (${e} - ${f}) + ${g}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100)),
                                new Variable("e", new Range(1, 100)),
                                new Variable("f", new Range(1, 100)),
                                new Variable("g", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${a} and ${b}. Then, subtract ${d} from ${c} and subtract this result from the first sum. Next, subtract ${f} from ${e} and add this result, and finally, add ${g}.")
                        .preview(Arrays.asList(
                                "(${a} + ${b}) - (${c} - ${d}) + (${e} - ${f}) + ${g}",
                                "#{a + b} - (#{c - d}) + (#{e - f}) + ${g}"
                        ))
                        .answer("#{(a + b) - (c - d) + (e - f) + g}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${a} + ${b}) - (${c} - ${d}) + (${e} - ${f}) + ${g}",
                                "Step 2: #{a + b} - (#{c - d}) + (#{e - f}) + ${g}",
                                "Step 3: #{(a + b) - (c - d) + (e - f)} + ${g}",
                                "Step 4: The result is: #{(a + b) - (c - d) + (e - f) + g}"
                        ))
                        .build());
    }
}
