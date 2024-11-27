package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic5Type2ProblemBuilder {
    @Getter
    public static final List<Problem> topic5Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic5Type2ProblemsBuilder.add(Problem.builder()
                .statement("Find the common difference of a first-order arithmetic sequence where the first term is ${a1} and the sum of the first ${m} terms is ${sum}.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a1", new Range(-100, 100)),
                        new Variable("m", new Range(1, 100)),
                        new Variable("sum", new Range(-1000, 1000))
                ))
                .tip("To find the common difference, use the formula for the sum of the first m terms in an arithmetic sequence.")
                .preview(Arrays.asList(
                        "Sₘ = m/2 * (2a₁ + (m - 1)d)",
                        "${sum} = ${m} / 2 * (2 * ${a1} + (${m} - 1)d)"
                ))
                .answer("#{(2 * sum / m - 2 * a1) / (m - 1)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Use the formula for the sum of the first m terms: Sₘ = m/2 * (2a₁ + (m - 1)d).",
                        "Step 2: Substitute Sₘ with ${sum}, m with ${m}, and a₁ with ${a1}.",
                        "Step 3: Multiply both sides of the equation by 2/m, obtaining #{2 * sum / m} = 2 * ${a1} + (${m} - 1)d.",
                        "Step 4: Subtract 2 * ${a1} from both sides of the equation, obtaining #{2 * sum / m - 2 * a1} = (m - 1)d.",
                        "Step 5: Divide the result from Step 4 by (m - 1) to isolate d.",
                        "Step 6: The common difference d is #{(2 * sum / m - 2 * a1) / (m - 1)}."
                ))
                .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the common difference in a first-order decreasing arithmetic sequence where the first term is ${a1} and the term at position ${m} is ${am}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(-100, 100)),
                                new Variable("m", new Range(1, 100)),
                                new Variable("am", new Range(-1000, 1000))
                        ))
                        .tip("Use the formula for the general term of a decreasing arithmetic sequence to calculate the common difference.")
                        .preview(Arrays.asList(
                                "aₘ = a₁ + (m - 1) * d",
                                "${am} = ${a1} + (${m} - 1) * d"
                        ))
                        .answer("#{(am - a1) / (m - 1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the term at position m in an arithmetic sequence: aₘ = a₁ + (m - 1) * d.",
                                "Step 2: Substitute aₘ with ${am}, a₁ with ${a1}, and m with ${m}.",
                                "Step 3: Subtract ${a1} from both sides of the equation: #{am - a1} = (m - 1) * d.",
                                "Step 4: Divide both sides by (m - 1) to isolate d.",
                                "Step 5: The common difference d is #{(am - a1) / (m - 1)}."
                        ))
                        .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the common difference of a first-order arithmetic sequence where the sum of the terms at positions ${m} and ${n} is equal to ${sum}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("m", new Range(1, 100)),
                                new Variable("n", new Range(1, 100)),
                                new Variable("sum", new Range(-1000, 1000))
                        ))
                        .tip("Use the relationship between terms of an arithmetic sequence at different positions to calculate the common difference.")
                        .preview(Arrays.asList(
                                "aₘ + aₙ = ${sum}",
                                "aₘ = a₁ + (m - 1) * d, aₙ = a₁ + (n - 1) * d"
                        ))
                        .answer("#{(sum - 2 * a1) / (m + n - 2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Express terms aₘ and aₙ using the formula for the sequence: aₘ = a₁ + (m - 1) * d and aₙ = a₁ + (n - 1) * d.",
                                "Step 2: The sum of the terms at positions ${m} and ${n} is aₘ + aₙ = ${sum}.",
                                "Step 3: Substitute aₘ and aₙ in the equation: (${a1} + (m - 1) * d) + (${a1} + (n - 1) * d) = ${sum}.",
                                "Step 4: Simplify the equation: 2 * ${a1} + (m + n - 2) * d = ${sum}.",
                                "Step 5: Subtract 2 * ${a1} from both sides of the equation: (m + n - 2) * d = ${sum - 2 * a1}.",
                                "Step 6: Divide both sides by (m + n - 2) to isolate d.",
                                "Step 7: The common difference d is #{(sum - 2 * a1) / (m + n - 2)}."
                        ))
                        .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common difference in a first-order arithmetic sequence defined by the initial term ${a1} and the term at position ${p} equal to ${ap}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(-1000, 1000)),
                                new Variable("p", new Range(2, 100)),
                                new Variable("ap", new Range(-1000, 1000))
                        ))
                        .tip("Use the general formula for the term in an arithmetic sequence to set up an equation and solve for the common difference.")
                        .preview(Arrays.asList(
                                "aₚ = a₁ + (p - 1) * d",
                                "${ap} = ${a1} + (${p} - 1) * d"
                        ))
                        .answer("#{(ap - a1) / (p - 1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the general formula for the term at position p: aₚ = a₁ + (p - 1) * d.",
                                "Step 2: Substitute the given values into the equation: ${ap} = ${a1} + (${p} - 1) * d.",
                                "Step 3: Subtract ${a1} from both sides of the equation: ${ap} - ${a1} = (${p} - 1) * d.",
                                "Step 4: Divide both sides by (${p} - 1) to isolate d.",
                                "Step 5: The common difference d is #{(ap - a1) / (p - 1)}."
                        ))
                        .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the common difference in a first-order arithmetic sequence where the sum of the first ${p} terms is ${sum}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("p", new Range(2, 100)),
                                new Variable("sum", new Range(-10000, 10000)),
                                new Variable("a1", new Range(-1000, 1000))
                        ))
                        .tip("Use the formula for the sum of the first p terms of an arithmetic sequence to set up an equation and solve for the common difference.")
                        .preview(Arrays.asList(
                                "Sₚ = p/2 * (2 * a₁ + (p - 1) * d)",
                                "${sum} = ${p}/2 * (2 * ${a1} + (${p} - 1) * d)"
                        ))
                        .answer("#{(2 * sum / p - 2 * a1) / (p - 1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the sum of the first p terms: Sₚ = p/2 * (2 * a₁ + (p - 1) * d).",
                                "Step 2: Substitute the given values into the equation: ${sum} = ${p}/2 * (2 * ${a1} + (${p} - 1) * d).",
                                "Step 3: Multiply both sides of the equation by 2/${p} to isolate the term with d: 2 * ${sum} / ${p} = 2 * ${a1} + (${p} - 1) * d.",
                                "Step 4: Subtract 2 * ${a1} from both sides: (2 * ${sum} / ${p}) - 2 * ${a1} = (${p} - 1) * d.",
                                "Step 5: Divide both sides by (${p} - 1) to solve for d.",
                                "Step 6: The common difference d is #{(2 * sum / p - 2 * a1) / (p - 1)}."
                        ))
                        .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common difference in a first-order arithmetic sequence where the first term is ${a1} and the sum of the terms at positions ${p} and ${q} is ${sum}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(-1000, 1000)),
                                new Variable("p", new Range(1, 100)),
                                new Variable("q", new Range(1, 100)),
                                new Variable("sum", new Range(-10000, 10000))
                        ))
                        .tip("Use the formulas for the terms at positions p and q, and then set up an equation with their sum to find the common difference.")
                        .preview(Arrays.asList(
                                "aₚ = a₁ + (p - 1) * d and a_q = a₁ + (q - 1) * d",
                                "aₚ + a_q = ${sum}"
                        ))
                        .answer("#{(sum - 2 * a1) / (p + q - 2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formulas for the terms at positions p and q: aₚ = a₁ + (p - 1) * d and a_q = a₁ + (q - 1) * d.",
                                "Step 2: Set up the sum equation: aₚ + a_q = ${sum}.",
                                "Step 3: Substitute the known values: (${a1} + (p - 1) * d) + (${a1} + (q - 1) * d) = ${sum}.",
                                "Step 4: Simplify the equation: 2 * ${a1} + (p + q - 2) * d = ${sum}.",
                                "Step 5: Subtract 2 * ${a1} from both sides: (p + q - 2) * d = ${sum} - 2 * ${a1}.",
                                "Step 6: Divide both sides by (p + q - 2) to find d.",
                                "Step 7: The common difference d is #{(sum - 2 * a1) / (p + q - 2)}."
                        ))
                        .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common difference in a first-order arithmetic sequence where the second term is ${a2} and the term at position ${n} is ${an}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a2", new Range(-1000, 1000)),
                                new Variable("n", new Range(2, 100)),
                                new Variable("an", new Range(-10000, 10000))
                        ))
                        .tip("Use the formula for the term at position n and the relationship between the second term and the common difference to find d.")
                        .preview(Arrays.asList(
                                "a₂ = a₁ + d and aₙ = a₁ + (n - 1) * d",
                                "${a2} = a₁ + d and ${an} = a₁ + (n - 1) * d"
                        ))
                        .answer("#{(an - a2) / (n - 2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formulas for the second term and the term at position n: a₂ = a₁ + d and aₙ = a₁ + (n - 1) * d.",
                                "Step 2: Set up the equations: ${a2} = a₁ + d and ${an} = a₁ + (n - 1) * d.",
                                "Step 3: Subtract the two equations: (${an} - ${a2}) = ((n - 1) * d - d).",
                                "Step 4: Simplify the equation: ${an} - ${a2} = (n - 2) * d.",
                                "Step 5: Solve for d by dividing both sides by (n - 2): d = #{(an - a2) / (n - 2)}.",
                                "Step 6: The common difference d is #{(an - a2) / (n - 2)}."
                        ))
                        .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the common difference in a first-order arithmetic sequence with alternating positive and negative terms, starting with ${a1}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(-1000, 1000)),
                                new Variable("n", new Range(2, 100)),
                                new Variable("an", new Range(-10000, 10000))
                        ))
                        .tip("Note that the terms alternate in sign due to the common difference. Use the position and value of the term to determine d.")
                        .preview(Arrays.asList(
                                "a₂ = a₁ - d, a₃ = a₁ - 2d if terms alternate in sign",
                                "${a1}, #{a1 - d}, #{a1 - 2d}, ..."
                        ))
                        .answer("#{2 * (a1 - an) / (n - 1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Given that the terms alternate in sign, consider that the second term is #{a1 - d} and the third term is #{a1 - 2d}.",
                                "Step 2: Generalize the term at position n for this alternating sequence: aₙ = a₁ - (n - 1) * d.",
                                "Step 3: Set up the equation using the term at position n: ${an} = ${a1} - (n - 1) * d.",
                                "Step 4: Isolate the common difference d by rearranging the equation: d = #{(a1 - an) / (n - 1)}.",
                                "Step 5: Consider the effect of the alternating sign and adjust d if necessary.",
                                "Step 6: The common difference d is #{2 * (a1 - an) / (n - 1)}."
                        ))
                        .build());
        topic5Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common difference in a first-order arithmetic sequence where the product of the terms at positions ${m} and ${n} is ${product}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(-1000, 1000)),
                                new Variable("m", new Range(1, 100)),
                                new Variable("n", new Range(1, 100)),
                                new Variable("product", new Range(-100000, 100000))
                        ))
                        .tip("Use positions ${m} and ${n} to express the corresponding terms in terms of the common difference and the first term.")
                        .preview(Arrays.asList(
                                "aₘ = a₁ + (m - 1) * d, aₙ = a₁ + (n - 1) * d",
                                "aₘ * aₙ = ${product}"
                        ))
                        .answer("#{(product / (a1 + (m - 1) * d)) / (a1 + (n - 1) * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Represent the term at position ${m} as aₘ = ${a1} + (m - 1) * d.",
                                "Step 2: Represent the term at position ${n} as aₙ = ${a1} + (n - 1) * d.",
                                "Step 3: Use the given product: (${a1} + (m - 1) * d) * (${a1} + (n - 1) * d) = ${product}.",
                                "Step 4: Expand and simplify the equation to isolate d in terms of ${product}.",
                                "Step 5: Solve for the common difference d using the obtained equation.",
                                "Step 6: The common difference d is #{(product / (a1 + (m - 1) * d)) / (a1 + (n - 1) * d)}."
                        ))
                        .build());
    }
}
