package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic2Type2ProblemBuilder {
    @Getter
    public static final List<Problem> topic2Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic2Type2ProblemsBuilder.add(Problem.builder()
                .statement("Calculate ${a}% of ${b}% * ${c}.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a", new Range(1, 100)),
                        new Variable("b", new Range(1, 100)),
                        new Variable("c", new Range(1, 100))
                ))
                .tip("To calculate ${a}% of ${b} * ${c}, first calculate the product of ${b} and ${c}, then find ${a}% of the result by dividing it by 100 and multiplying by ${a}.")
                .preview(Arrays.asList(
                        "(${a}% of ${b}% * ${c})",
                        "(#{a / 100} * (#{b / 100} * ${c}))"
                ))
                .answer("#{(a / 100) * (b / 100) * c}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Calculate ${a}% as #{a / 100}.",
                        "Step 2: Calculate ${b}% as #{b / 100}.",
                        "Step 3: Multiply #{b / 100} by ${c} to obtain #{(b / 100) * c}.",
                        "Step 4: Multiply #{a / 100} by the result from step 3.",
                        "Step 5: The result is #{(a / 100) * (b / 100) * c}"
                ))
                .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the value that represents ${a}% of (${b} + ${c}).")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100))
                        ))
                        .tip("To calculate ${a}% of (${b} + ${c}), first add ${b} and ${c}, then find ${a}% of the result by dividing it by 100 and multiplying by ${a}.")
                        .preview(Arrays.asList(
                                "${a}% of (${b} + ${c})",
                                "(#{a / 100} * (${b} + ${c}))"
                        ))
                        .answer("#{(a / 100) * (b + c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the percentage ${a}% as #{a / 100}.",
                                "Step 2: Add ${b} and ${c} to obtain #{b + c}.",
                                "Step 3: Multiply the result of ${a}% by the sum obtained in step 2.",
                                "Step 4: The result is #{(a / 100) * (b + c)}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the value that represents ${a}% of ${b}^${c}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 10)),
                                new Variable("c", new Range(1, 5))
                        ))
                        .tip("To calculate ${a}% of ${b}^${c}, first compute ${b} raised to the power of ${c}, then find ${a}% of the result by dividing it by 100 and multiplying by ${a}.")
                        .preview(Arrays.asList(
                                "${a}% of ${b}^${c}",
                                "(#{a / 100} * #{b^c})"
                        ))
                        .answer("#{(a / 100) * (b^c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the percentage ${a}% as #{a / 100}.",
                                "Step 2: Calculate ${b}^${c} as #{b^c}.",
                                "Step 3: Multiply the result of ${a}% by the value obtained in step 2.",
                                "Step 4: The result is #{(a / 100) * (b^c)}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the percentage that ${a} represents over the product of ${b} * ${c} * ${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To calculate the percentage that ${a} represents over the product of ${b} * ${c} * ${d}, first calculate the product of ${b}, ${c}, and ${d}, then divide ${a} by the result and multiply by 100 to obtain the percentage.")
                        .preview(Arrays.asList(
                                "(${a} / (${b} * ${c} * ${d})) * 100",
                                "#{a} over (${b} * ${c} * ${d})"
                        ))
                        .answer("#{(a / (b * c * d)) * 100}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the value of ${b} * ${c} as #{b * c}.",
                                "Step 2: Multiply the result from step 1 by ${d} to obtain #{b * c * d}.",
                                "Step 3: Now we have the total product in the denominator: #{b * c * d}.",
                                "Step 4: Divide ${a} by the result obtained in step 3, yielding #{a / (b * c * d)}.",
                                "Step 5: This quotient represents the fraction of ${a} relative to the product of ${b}, ${c}, and ${d}.",
                                "Step 6: Multiply the result from step 4 by 100.",
                                "Step 7: This converts the quotient into a percentage, yielding #{(a / (b * c * d)) * 100}.",
                                "Step 8: The result is #{(a / (b * c * d)) * 100}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of increasing ${a}% of ${b} added to ${c}% of ${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve this problem, calculate ${a}% of ${b} and ${c}% of ${d} separately and then add both results.")
                        .preview(Arrays.asList(
                                "(${a}% of ${b}) + (${c}% of ${d})",
                                "(#{a / 100} * ${b}) + (#{c / 100} * ${d})"
                        ))
                        .answer("#{((a / 100) * b) + ((c / 100) * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate ${a}% of ${b} as #{a / 100} * ${b}.",
                                "Step 2: The result of ${a}% of ${b} is #{(a / 100) * b}.",
                                "Step 3: Calculate ${c}% of ${d} as #{c / 100} * ${d}.",
                                "Step 4: The result of ${c}% of ${d} is #{(c / 100) * d}.",
                                "Step 5: Add the results obtained in steps 2 and 4.",
                                "Step 6: The sum of #{(a / 100) * b} and #{(c / 100) * d} is #{((a / 100) * b) + ((c / 100) * d)}.",
                                "Step 7: This sum represents the total increase requested.",
                                "Step 8: The result is #{((a / 100) * b) + ((c / 100) * d)}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the total value by adding ${a}% of ${b} and ${c}% of ${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To find the total value, calculate ${a}% of ${b} and ${c}% of ${d} separately, then add the results.")
                        .preview(Arrays.asList(
                                "(${a}% of ${b}) + (${c}% of ${d})",
                                "(#{a / 100} * ${b}) + (#{c / 100} * ${d})"
                        ))
                        .answer("#{((a / 100) * b) + ((c / 100) * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate ${a}% of ${b} as #{a / 100} * ${b}.",
                                "Step 2: The result of ${a}% of ${b} is #{(a / 100) * b}.",
                                "Step 3: Calculate ${c}% of ${d} as #{c / 100} * ${d}.",
                                "Step 4: The result of ${c}% of ${d} is #{(c / 100) * d}.",
                                "Step 5: Add the results obtained in steps 2 and 4.",
                                "Step 6: The sum of #{(a / 100) * b} and #{(c / 100) * d} is #{((a / 100) * b) + ((c / 100) * d)}.",
                                "Step 7: This sum represents the total value requested.",
                                "Step 8: The result is #{((a / 100) * b) + ((c / 100) * d)}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the resulting value of reducing ${a}% of ${b} minus ${c}% of ${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve this problem, calculate ${a}% of ${b} and ${c}% of ${d} separately, and then subtract both results.")
                        .preview(Arrays.asList(
                                "(${a}% of ${b}) - (${c}% of ${d})",
                                "(#{a / 100} * ${b}) - (#{c / 100} * ${d})"
                        ))
                        .answer("#{((a / 100) * b) - ((c / 100) * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate ${a}% of ${b} as #{a / 100} * ${b}.",
                                "Step 2: The result of ${a}% of ${b} is #{(a / 100) * b}.",
                                "Step 3: Calculate ${c}% of ${d} as #{c / 100} * ${d}.",
                                "Step 4: The result of ${c}% of ${d} is #{(c / 100) * d}.",
                                "Step 5: Subtract the result of step 4 from the result of step 2.",
                                "Step 6: The difference between #{(a / 100) * b} and #{(c / 100) * d} is #{((a / 100) * b) - ((c / 100) * d)}.",
                                "Step 7: This difference represents the resulting value of the requested reduction.",
                                "Step 8: The result is #{((a / 100) * b) - ((c / 100) * d)}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the final percentage when ${a}% of ${b} is increased by ${c}% and then reduced by ${d}%.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve this problem, first calculate ${a}% of ${b}, then apply the ${c}% increase to the resulting value, and finally reduce the new value by ${d}%.")
                        .preview(Arrays.asList(
                                "(${a}% of ${b}) increased by ${c}% and then reduced by ${d}%",
                                "(#{a / 100} * ${b}) * (1 + #{c / 100}) * (1 - #{d / 100})"
                        ))
                        .answer("#{((a / 100) * b) * (1 + (c / 100)) * (1 - (d / 100))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate ${a}% of ${b} as #{a / 100} * ${b}.",
                                "Step 2: The result of ${a}% of ${b} is #{(a / 100) * b}.",
                                "Step 3: Increase the result from step 2 by ${c}% by multiplying it by (1 + #{c / 100}).",
                                "Step 4: The increased value is #{((a / 100) * b) * (1 + (c / 100))}.",
                                "Step 5: Reduce the result from step 4 by ${d}% by multiplying it by (1 - #{d / 100}).",
                                "Step 6: The reduced value is #{((a / 100) * b) * (1 + (c / 100)) * (1 - (d / 100))}.",
                                "Step 7: This value represents the requested final percentage.",
                                "Step 8: The result is #{((a / 100) * b) * (1 + (c / 100)) * (1 - (d / 100))}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the final value by adding ${a}% of ${b} plus half of ${c}% of ${d}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve this problem, calculate ${a}% of ${b} and then half of ${c}% of ${d}, and finally add both results.")
                        .preview(Arrays.asList(
                                "${a}% of ${b} + 0.5 * (${c}% of ${d})",
                                "(#{a / 100} * ${b}) + 0.5 * (#{c / 100} * ${d})"
                        ))
                        .answer("#{(a / 100 * b) + 0.5 * (c / 100 * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate ${a}% of ${b} as #{a / 100} * ${b}.",
                                "Step 2: The result of ${a}% of ${b} is #{(a / 100) * b}.",
                                "Step 3: Calculate ${c}% of ${d} as #{c / 100} * ${d}.",
                                "Step 4: Half of ${c}% of ${d} is #{0.5 * (c / 100 * d)}.",
                                "Step 5: Add the result from step 2 to the result from step 4.",
                                "Step 6: The final value is #{(a / 100 * b) + 0.5 * (c / 100 * d)}"
                        ))
                        .build());
        topic2Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the result of increasing ${a}% of ${b} by ${c}% of half of ${d}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 100)),
                                new Variable("b", new Range(1, 100)),
                                new Variable("c", new Range(1, 100)),
                                new Variable("d", new Range(1, 100))
                        ))
                        .tip("To solve this problem, first calculate ${a}% of ${b}, then ${c}% of half of ${d}, and finally add both results.")
                        .preview(Arrays.asList(
                                "${a}% of ${b} increased by ${c}% of half of ${d}",
                                "(#{a / 100} * ${b}) + (#{c / 100} * 0.5 * ${d})"
                        ))
                        .answer("#{(a / 100 * b) + (c / 100 * 0.5 * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate ${a}% of ${b} as #{a / 100} * ${b}.",
                                "Step 2: The result of ${a}% of ${b} is #{(a / 100) * b}.",
                                "Step 3: Calculate half of ${d} as #{0.5 * d}.",
                                "Step 4: Calculate ${c}% of half of ${d} as #{c / 100} * (0.5 * ${d}).",
                                "Step 5: The result of ${c}% of half of ${d} is #{(c / 100) * 0.5 * d}.",
                                "Step 6: Add the result from step 2 with the result from step 5.",
                                "Step 7: The final value is #{(a / 100 * b) + (c / 100 * 0.5 * d)}"
                        ))
                        .build());
    }
}
