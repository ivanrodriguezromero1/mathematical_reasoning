package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic6Type2ProblemBuilder {
    @Getter
    public static final List<Problem> topic6Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic6Type2ProblemsBuilder.add(Problem.builder()
                .statement("Find the first term of an arithmetic sequence in which the sum of the first ${m} terms is ${sum} and the common difference is ${d}.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("m", new Range(1, 20)),
                        new Variable("sum", new Range(1, 1000)),
                        new Variable("d", new Range(-10, 10))
                ))
                .tip("Remember that the formula for the sum of the first m terms of an arithmetic sequence is S = m/2 * (2a₁ + (m - 1) * d), where a₁ is the first term.")
                .preview(Arrays.asList(
                        "Sum of the first ${m} terms: Sₘ = m/2 * (2 * a₁ + (m - 1) * d)",
                        "Isolating a₁: a₁ = (2 * Sₘ / m - (m - 1) * d) / 2"
                ))
                .answer("#{((2 * sum / m) - (m - 1) * d) / 2}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Use the formula for the sum of the first m terms: Sₘ = m/2 * (2 * a₁ + (m - 1) * d).",
                        "Step 2: Substitute the sum and the value of m: ${sum} = ${m} / 2 * (2 * a₁ + (${m} - 1) * ${d}).",
                        "Step 3: Multiply both sides by 2/${m} to isolate the term with a₁: 2 * ${sum} / ${m} = 2 * a₁ + (${m} - 1) * ${d}.",
                        "Step 4: Subtract (${m} - 1) * ${d} from both sides: 2 * a₁ = #{(2 * sum / m) - ((m - 1) * d)}.",
                        "Step 5: Divide by 2 to find a₁: a₁ = #{((2 * sum / m) - (m - 1) * d) / 2}.",
                        "Step 6: The first term a₁ is #{((2 * sum / m) - (m - 1) * d) / 2}."
                ))
                .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the first term of a decreasing arithmetic sequence where the term in position ${m} is ${am} and the common difference is ${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("m", new Range(1, 20)),
                                new Variable("am", new Range(-100, 100)),
                                new Variable("d", new Range(-10, 10))
                        ))
                        .tip("Remember that the term in position m of an arithmetic sequence is given by aₘ = a₁ + (m - 1) * d. Isolate a₁ to find the first term.")
                        .preview(Arrays.asList(
                                "aₘ = a₁ + (m - 1) * d",
                                "a₁ = aₘ - (m - 1) * d"
                        ))
                        .answer("#{am - (m - 1) * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the term in position m: aₘ = a₁ + (m - 1) * d.",
                                "Step 2: Substitute aₘ, m, and d into the formula: ${am} = a₁ + (${m} - 1) * ${d}.",
                                "Step 3: Isolate a₁ by subtracting (m - 1) * d from both sides: a₁ = ${am} - (${m} - 1) * ${d}.",
                                "Step 4: Calculate (m - 1) * d: #{(m - 1) * d}.",
                                "Step 5: Subtract the result from step 4 from am: a₁ = #{am - (m - 1) * d}.",
                                "Step 6: The first term a₁ is #{am - (m - 1) * d}."
                        ))
                        .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the first term of an arithmetic sequence defined by the terms ${a3}, ${a4}, ${a5}, ... and the common difference ${d}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a3", new Range(-100, 100)),
                                new Variable("a4", new Range(-100, 100)),
                                new Variable("a5", new Range(-100, 100)),
                                new Variable("d", new Range(-10, 10))
                        ))
                        .tip("Remember that in an arithmetic sequence, the term at position n can be expressed as aₙ = a₁ + (n - 1) * d. Use the term a₃ to isolate the first term a₁.")
                        .preview(Arrays.asList(
                                "a₃ = a₁ + 2 * d",
                                "a₁ = a₃ - 2 * d"
                        ))
                        .answer("#{a3 - 2 * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the third term in an arithmetic sequence: a₃ = a₁ + 2 * d.",
                                "Step 2: Substitute a₃ and d into the formula: ${a3} = a₁ + 2 * ${d}.",
                                "Step 3: Isolate a₁ by subtracting 2 * d from both sides: a₁ = ${a3} - 2 * ${d}.",
                                "Step 4: Calculate 2 * d: #{2 * d}.",
                                "Step 5: Subtract the result from step 4 from a₃: a₁ = #{a3 - 2 * d}.",
                                "Step 6: The first term a₁ is #{a3 - 2 * d}."
                        ))
                        .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the first term of an arithmetic sequence defined by the term at position ${p} equal to ${ap} and the common difference ${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("p", new Range(2, 20)),
                                new Variable("ap", new Range(-100, 100)),
                                new Variable("d", new Range(-10, 10))
                        ))
                        .tip("Use the general formula of the arithmetic sequence, where the term at position n is aₙ = a₁ + (n - 1) * d. In this case, isolate a₁ using the term at position p.")
                        .preview(Arrays.asList(
                                "aₚ = a₁ + (p - 1) * d",
                                "a₁ = aₚ - (p - 1) * d"
                        ))
                        .answer("#{ap - (p - 1) * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the term at position p in an arithmetic sequence: aₚ = a₁ + (p - 1) * d.",
                                "Step 2: Substitute aₚ, p, and d into the formula: ${ap} = a₁ + (${p} - 1) * ${d}.",
                                "Step 3: Isolate a₁ by subtracting (p - 1) * d from both sides: a₁ = ${ap} - (${p} - 1) * ${d}.",
                                "Step 4: Calculate (p - 1): #{p - 1}.",
                                "Step 5: Multiply the result from step 4 by d: #{(p - 1) * d}.",
                                "Step 6: Subtract the result from step 5 from aₚ: a₁ = #{ap - (p - 1) * d}.",
                                "Step 7: The first term a₁ is #{ap - (p - 1) * d}."
                        ))
                        .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the first term of an arithmetic sequence where the sum of the first ${p} terms is ${sum} and the common difference is ${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("p", new Range(2, 20)),
                                new Variable("sum", new Range(-500, 500)),
                                new Variable("d", new Range(-10, 10))
                        ))
                        .tip("Use the formula for the sum of an arithmetic sequence Sₙ = (n/2) * (2a₁ + (n - 1) * d) and isolate a₁ to find the first term.")
                        .preview(Arrays.asList(
                                "Sₚ = (p / 2) * (2a₁ + (p - 1) * d)",
                                "a₁ = (2 * ${sum} / ${p} - (p - 1) * ${d}) / 2"
                        ))
                        .answer("#{(2 * sum / p - (p - 1) * d) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the sum of the first p terms: Sₚ = (p / 2) * (2a₁ + (p - 1) * d).",
                                "Step 2: Substitute Sₚ, p, and d into the formula: ${sum} = (${p} / 2) * (2a₁ + (${p} - 1) * ${d}).",
                                "Step 3: Multiply both sides of the equation by 2/p to isolate the term inside the parentheses: 2 * ${sum} / ${p} = 2a₁ + (${p} - 1) * ${d}.",
                                "Step 4: Subtract (p - 1) * d from both sides to isolate 2a₁: 2a₁ = #{(2 * sum / p) - ((p - 1) * d)}.",
                                "Step 5: Divide both sides by 2 to find a₁: a₁ = #{(2 * sum / p - (p - 1) * d) / 2}.",
                                "Step 6: The first term a₁ is #{(2 * sum / p - (p - 1) * d) / 2}."
                        ))
                        .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the first term of an arithmetic sequence where the sum of the terms at positions ${p} and ${q} is ${sum} and the common difference is ${d}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("p", new Range(1, 20)),
                                new Variable("q", new Range(2, 20)),
                                new Variable("sum", new Range(-500, 500)),
                                new Variable("d", new Range(-10, 10))
                        ))
                        .tip("Use the formula for the terms of an arithmetic sequence aₙ = a₁ + (n - 1) * d to express the terms at positions p and q, then add both equations.")
                        .preview(Arrays.asList(
                                "aₚ + aₓ = ${sum}",
                                "${a1} + (${p} - 1) * ${d} + (${a1} + (${q} - 1) * ${d}) = ${sum}"
                        ))
                        .answer("#{(sum - (p + q - 2) * d) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the term at position n: aₙ = a₁ + (n - 1) * d.",
                                "Step 2: Write the expression for the terms at positions p and q:",
                                "aₚ = a₁ + (${p} - 1) * ${d} and aₓ = a₁ + (${q} - 1) * ${d}.",
                                "Step 3: Add the terms at positions p and q:",
                                "aₚ + aₓ = (a₁ + (${p} - 1) * ${d}) + (a₁ + (${q} - 1) * ${d}).",
                                "Step 4: Simplify the sum: 2a₁ + (${p} + ${q} - 2) * ${d} = ${sum}.",
                                "Step 5: Isolate a₁ by dividing both sides by 2: a₁ = #{(sum - (p + q - 2) * d) / 2}.",
                                "Step 6: The first term a₁ is #{(sum - (p + q - 2) * d) / 2}."
                        ))
                        .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the first term of an arithmetic sequence where the second term is ${a2} and the term at position ${n} is ${an}, with a common difference ${d}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a2", new Range(-100, 100)),
                                new Variable("an", new Range(-100, 100)),
                                new Variable("n", new Range(3, 20)),
                                new Variable("d", new Range(-10, 10))
                        ))
                        .tip("Use the formula for the general term of an arithmetic sequence, and remember that the second term is a₂ = a₁ + d.")
                        .preview(Arrays.asList(
                                "aₙ = a₁ + (n - 1) * d",
                                "a₂ = ${a2} and aₙ = ${an}"
                        ))
                        .answer("#{a2 - d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the second term of the arithmetic sequence: a₂ = a₁ + d.",
                                "Step 2: Isolate the first term a₁ from this equation: a₁ = a₂ - d.",
                                "Step 3: Use the general term formula for the term at position n: aₙ = a₁ + (n - 1) * d.",
                                "Step 4: Substitute the value of a₁ into the formula: aₙ = (a₂ - d) + (n - 1) * d.",
                                "Step 5: Simplify the expression to verify that a₁ = #{a2 - d}.",
                                "Step 6: The first term a₁ is #{a2 - d}."
                        ))
                        .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the first term of an arithmetic sequence with alternating positive and negative terms and common difference ${d}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("d", new Range(-10, 10)),
                                new Variable("an", new Range(-100, 100)),
                                new Variable("n", new Range(1, 20))
                        ))
                        .tip("Use the formula for the general term of an arithmetic sequence and consider that terms alternate in sign due to the common difference.")
                        .preview(Arrays.asList(
                                "aₙ = a₁ + (n - 1) * d",
                                "Alternating signs imply: a₁, -a₂, a₃, ..."
                        ))
                        .answer("#{an - (n - 1) * d}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the general term of an arithmetic sequence: aₙ = a₁ + (n - 1) * d.",
                                "Step 2: Since the terms alternate in sign, adjust the difference for each position.",
                                "Step 3: For the term aₙ at position n, substituting values: aₙ = a₁ + (n - 1) * #{d}.",
                                "Step 4: Isolate the value of a₁ using the value of aₙ at position n.",
                                "Step 5: The value of the first term a₁ is #{an - (n - 1) * d}."
                        ))
                        .build());
        topic6Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the first term of an arithmetic sequence where the product of the terms at positions ${m} and ${n} is ${product}, with a common difference of ${d}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("m", new Range(1, 20)),
                                new Variable("n", new Range(1, 20)),
                                new Variable("d", new Range(-10, 10)),
                                new Variable("product", new Range(-1000, 1000))
                        ))
                        .tip("Use the formula for the general term of an arithmetic sequence and set up an equation for the product of the terms at positions m and n.")
                        .preview(Arrays.asList(
                                "aₘ = a₁ + (m - 1) * d",
                                "aₙ = a₁ + (n - 1) * d",
                                "Product = aₘ * aₙ"
                        ))
                        .answer("#{sqrt(product / ((a1 + (m - 1) * d) * (a1 + (n - 1) * d)))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the general formula for the terms at positions m and n: aₘ = a₁ + (m - 1) * d and aₙ = a₁ + (n - 1) * d.",
                                "Step 2: Set up the product equation: aₘ * aₙ = product.",
                                "Step 3: Substitute the values for aₘ and aₙ: (a₁ + (m - 1) * #{d}) * (a₁ + (n - 1) * #{d}) = #{product}.",
                                "Step 4: Isolate a₁ using the value of the product and the difference d.",
                                "Step 5: Calculate a₁ to obtain the first term of the sequence.",
                                "Step 6: The first term a₁ is #{sqrt(product / ((a1 + (m - 1) * d) * (a1 + (n - 1) * d)))}."
                        ))
                        .build());
    }
}
