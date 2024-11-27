package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic1Type3ProblemBuilder {
    @Getter
    public static final List<Problem> topic1Type3ProblemsBuilder = new ArrayList<>();

    static {
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${x} + ${y}) * ${z} - ${w}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${x} and ${y}, then multiply the result by ${z}, and finally subtract ${w}.")
                        .preview(Arrays.asList(
                                "(${x} + ${y}) * ${z} - ${w}",
                                "#{x + y} * ${z} - ${w}"
                        ))
                        .answer("#{((x + y) * z) - w}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} + ${y}) * ${z} - ${w}",
                                "Step 2: #{x + y} * ${z} - ${w}",
                                "Step 3: #{(x + y) * z} - ${w}",
                                "Step 4: The result is #{((x + y) * z) - w}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of (${x} * ${y}) + ${z} - ${w}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${x} by ${y}, then add the result to ${z}, and finally subtract ${w}.")
                        .preview(Arrays.asList(
                                "(${x} * ${y}) + ${z} - ${w}",
                                "#{x * y} + ${z} - ${w}"
                        ))
                        .answer("#{((x * y) + z) - w}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} * ${y}) * ${z} - ${w}",
                                "Step 2: #{x * y} * ${z} - ${w}",
                                "Step 3: #{(x * y) * z} - ${w}",
                                "Step 4: The result is #{((x * y) * z) - w}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Solve the operation (${x} + ${y}) / ${z} + ${w}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${x} and ${y}, then divide the result by ${z}, and finally add ${w}.")
                        .preview(Arrays.asList(
                                "(${x} + ${y}) / ${z} + ${w}",
                                "#{x + y} / ${z} + ${w}"
                        ))
                        .answer("#{((x + y) / z) + w}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} + ${y}) / ${z} + ${w}",
                                "Step 2: #{x + y} / ${z} + ${w}",
                                "Step 3: #{(x + y) / z} + ${w}",
                                "Step 4: The result is #{((x + y) / z) + w}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${x} + ${y} - ${z}) * ${w}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${x} and ${y}, then subtract ${z} from the result, and finally multiply by ${w}.")
                        .preview(Arrays.asList(
                                "(${x} + ${y} - ${z}) * ${w}",
                                "#{x + y - z} * ${w}"
                        ))
                        .answer("#{((x + y - z) * w)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} + ${y} - ${z}) * ${w}",
                                "Step 2: #{x + y} - ${z} * ${w}",
                                "Step 3: #{(x + y - z) * w}",
                                "Step 4: The result is #{((x + y - z) * w)}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${x} + ${y} - ${z}) * (${w} / ${v}) + ${u}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100)),
                                new Variable("v", new Range(1, 100)),
                                new Variable("u", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${x} and ${y}, then subtract ${z}. Next, divide ${w} by ${v}, multiply both results, and finally add ${u}.")
                        .preview(Arrays.asList(
                                "(${x} + ${y} - ${z}) * (${w} / ${v}) + ${u}",
                                "#{x + y - z} * #{w / v} + ${u}"
                        ))
                        .answer("#{((x + y - z) * (w / v)) + u}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} + ${y} - ${z}) * (${w} / ${v}) + ${u}",
                                "Step 2: #{x + y - z} * (${w} / ${v}) + ${u}",
                                "Step 3: #{(x + y - z) * (w / v)} + ${u}",
                                "Step 4: The result is #{((x + y - z) * (w / v)) + u}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value of the expression (${x} - ${y}) * (${z} + ${w}) - ${u}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100)),
                                new Variable("u", new Range(1, 100))
                        ))
                        .tip("To solve, first subtract ${y} from ${x}. Then add ${z} and ${w}, multiply both results, and finally subtract ${u}.")
                        .preview(Arrays.asList(
                                "(${x} - ${y}) * (${z} + ${w}) - ${u}",
                                "#{x - y} * #{z + w} - ${u}"
                        ))
                        .answer("#{((x - y) * (z + w)) - u}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} - ${y}) * (${z} + ${w}) - ${u}",
                                "Step 2: #{x - y} * (${z} + ${w}) - ${u}",
                                "Step 3: #{(x - y) * (z + w)} - ${u}",
                                "Step 4: The result is #{((x - y) * (z + w)) - u}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Solve the operation (${x} * ${y}) - (${z} / ${w}) + ${u} * ${v}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100)),
                                new Variable("u", new Range(1, 100)),
                                new Variable("v", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${x} by ${y}. Then divide ${z} by ${w}, subtract this result from the initial product, and finally add the result of multiplying ${u} by ${v}.")
                        .preview(Arrays.asList(
                                "(${x} * ${y}) - (${z} / ${w}) + ${u} * ${v}",
                                "#{x * y} - #{z / w} + #{u * v}"
                        ))
                        .answer("#{((x * y) - (z / w)) + (u * v)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} * ${y}) - (${z} / ${w}) + (${u} * ${v})",
                                "Step 2: #{x * y} - (${z} / ${w}) + (${u} * ${v})",
                                "Step 3: #{x * y} - #{z / w} + (${u} * ${v})",
                                "Step 4: #{x * y - (z / w)} + #{u * v}",
                                "Step 5: The result is #{((x * y) - (z / w)) + (u * v)}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of (${x} * ${y} + ${z}) - (${w} / ${v} * ${u}) + ${t}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100)),
                                new Variable("v", new Range(1, 100)),
                                new Variable("u", new Range(1, 100)),
                                new Variable("t", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${x} by ${y} and add ${z}. Then divide ${w} by ${v} and multiply the result by ${u}. Subtract the result of this operation from the first sum and finally add ${t}.")
                        .preview(Arrays.asList(
                                "(${x} * ${y} + ${z}) - (${w} / ${v} * ${u}) + ${t}",
                                "#{x * y + z} - (#{w / v * u}) + ${t}"
                        ))
                        .answer("#{((x * y + z) - ((w / v) * u)) + t}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} * ${y} + ${z}) - ((${w} / ${v}) * ${u}) + ${t}",
                                "Step 2: #{x * y} + ${z} - ((${w} / ${v}) * ${u}) + ${t}",
                                "Step 3: #{x * y + z} - #{(w / v) * u} + ${t}",
                                "Step 4: The result is #{((x * y + z) - ((w / v) * u)) + t}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Solve the operation (${x} * ${y}) - (${z} + ${w}) / (${v} - ${u}) + ${t}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100)),
                                new Variable("v", new Range(1, 100)),
                                new Variable("u", new Range(1, 100)),
                                new Variable("t", new Range(1, 100))
                        ))
                        .tip("To solve, first multiply ${x} by ${y}. Then add ${z} and ${w}, and divide the result by (${v} - ${u}). Subtract this result from the initial multiplication and finally add ${t}.")
                        .preview(Arrays.asList(
                                "(${x} * ${y}) - (${z} + ${w}) / (${v} - ${u}) + ${t}",
                                "#{x * y} - (#{z + w}) / (#{v - u}) + ${t}"
                        ))
                        .answer("#{((x * y) - ((z + w) / (v - u))) + t}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} * ${y}) - ((${z} + ${w}) / (${v} - ${u})) + ${t}",
                                "Step 2: #{x * y} - ((${z} + ${w}) / #{v - u}) + ${t}",
                                "Step 3: #{x * y} - #{(z + w) / (v - u)} + ${t}",
                                "Step 4: The result is #{((x * y) - ((z + w) / (v - u))) + t}"
                        ))
                        .build());
        topic1Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the value of (${x} + ${y}) * (${z} - ${w}) / (${v} + ${u} - ${t}).")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("x", new Range(1, 100)),
                                new Variable("y", new Range(1, 100)),
                                new Variable("z", new Range(1, 100)),
                                new Variable("w", new Range(1, 100)),
                                new Variable("v", new Range(1, 100)),
                                new Variable("u", new Range(1, 100)),
                                new Variable("t", new Range(1, 100))
                        ))
                        .tip("To solve, first add ${x} and ${y}, and then subtract ${w} from ${z}. Next, divide the product of these results by (${v} + ${u} - ${t}).")
                        .preview(Arrays.asList(
                                "(${x} + ${y}) * (${z} - ${w}) / (${v} + ${u} - ${t})",
                                "#{x + y} * #{z - w} / #{v + u - t}"
                        ))
                        .answer("#{((x + y) * (z - w)) / (v + u - t)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: (${x} + ${y}) * (${z} - ${w}) / (${v} + ${u} - ${t})",
                                "Step 2: #{x + y} * #{z - w} / (${v} + ${u} - ${t})",
                                "Step 3: #{(x + y) * (z - w)} / #{v + u - t}",
                                "Step 4: The result is #{((x + y) * (z - w)) / (v + u - t)}"
                        ))
                        .build());
    }
}
