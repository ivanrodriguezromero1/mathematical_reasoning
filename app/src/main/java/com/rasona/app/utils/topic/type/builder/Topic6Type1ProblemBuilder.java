package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic6Type1ProblemBuilder {
    @Getter
    public static final List<Problem> topic6Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic6Type1ProblemsBuilder.add(Problem.builder()
                .statement("Find the common ratio of a geometric sequence where the first term is ${a1} and the product of the first ${m} terms is ${product}.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a1", new Range(1, 100)),
                        new Variable("m", new Range(2, 10)),
                        new Variable("product", new Range(1, 100000))
                ))
                .tip("To find the common ratio, use the formula for the product of the first m terms in a geometric sequence.")
                .preview(Arrays.asList(
                        "P = a₁ * r^(m-1)",
                        "${product} = ${a1} * r^(${m} - 1)"
                ))
                .answer("#{(product / a1)^(1 / (m - 1))}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Use the formula for the product of the first ${m} terms: P = ${a1} * r^(${m} - 1).",
                        "Step 2: Substitute the value of the product: ${product} = ${a1} * r^(${m} - 1).",
                        "Step 3: Isolate the common ratio r by dividing both sides by ${a1}.",
                        "Step 4: Solve for r by raising both sides to the power of 1 / (${m} - 1).",
                        "Step 5: The common ratio r is #{(product / a1)^(1 / (m - 1))}."
                ))
                .build());
        topic6Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the common ratio in a decreasing geometric sequence where the first term is ${a1} and the term at position ${m} is ${am}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(1, 100)),
                                new Variable("m", new Range(1, 10)),
                                new Variable("am", new Range(1, 1000))
                        ))
                        .tip("To find the common ratio in a geometric sequence, use the general term formula.")
                        .preview(Arrays.asList(
                                "aₘ = a₁ * r^(m-1)",
                                "${am} = ${a1} * r^(${m} - 1)"
                        ))
                        .answer("#{(am / a1)^(1 / (m - 1))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for the term at position ${m}: aₘ = ${a1} * r^(${m} - 1).",
                                "Step 2: Substitute the value of aₘ: ${am} = ${a1} * r^(${m} - 1).",
                                "Step 3: Isolate the common ratio r by dividing both sides by ${a1}.",
                                "Step 4: Raise both sides to the power of 1 / (${m} - 1) to solve for r.",
                                "Step 5: The common ratio r is #{(am / a1)^(1 / (m - 1))}."
                        ))
                        .build());
        topic6Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common ratio in a geometric sequence defined by the first three terms: ${a1}, #{a1*r}, #{a1*r^2}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(1, 100)),
                                new Variable("r", new Range(1, 10))
                        ))
                        .tip("To find the common ratio in a geometric sequence, observe the relationship between consecutive terms.")
                        .preview(Arrays.asList(
                                "a₂ = a₁ * r",
                                "a₃ = a₁ * r^2"
                        ))
                        .answer("#{(a2 / a1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Observe that a₂ = a₁ * r and a₃ = a₁ * r^2.",
                                "Step 2: Use the relationship between a₁ and a₂ to find r: r = a₂ / a₁.",
                                "Step 3: Verify using a₃ to confirm that r = #{a2 / a1}.",
                                "Step 4: The common ratio r is #{a2 / a1}."
                        ))
                        .build());
        topic6Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common ratio in a geometric sequence defined by the initial term ${a1} and the term at position ${p} equal to ${ap}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(1, 100)),
                                new Variable("ap", new Range(1, 1000)),
                                new Variable("p", new Range(2, 10))
                        ))
                        .tip("Use the formula for the general term of a geometric sequence: aₙ = a₁ * r^(n-1), and substitute the values of a₁ and aₚ.")
                        .preview(Arrays.asList(
                                "Term at position p: aₚ = a₁ * r^(p-1)",
                                "Substituting values: ${ap} = ${a1} * r^(#{p-1})"
                        ))
                        .answer("#{(ap / a1)^(1/(p-1))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Express the term at position p using the general term formula: aₚ = ${a1} * r^(#{p-1}).",
                                "Step 2: Substitute the value of aₚ with ${ap}: ${ap} = ${a1} * r^(#{p-1}).",
                                "Step 3: Isolate r by raising both sides to the inverse power of (#{p-1}): r = #{(ap / a1)^(1/(p-1))}.",
                                "Step 4: The result is the common ratio r = #{(ap / a1)^(1/(p-1))}."
                        ))
                        .build());
        topic6Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common ratio in a geometric sequence where the first term is ${a1} and the sum of the terms at positions ${p} and ${q} is ${sum}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(1, 100)),
                                new Variable("p", new Range(2, 10)),
                                new Variable("q", new Range(2, 10)),
                                new Variable("sum", new Range(1, 1000))
                        ))
                        .tip("Use the formula for terms in a geometric sequence for terms at positions p and q: aₚ = a₁ * r^(p-1) and a_q = a₁ * r^(q-1).")
                        .preview(Arrays.asList(
                                "Sum of terms at p and q: ${sum} = ${a1} * r^(#{p-1}) + ${a1} * r^(#{q-1})",
                                "Substituting values: ${sum} = ${a1} * (r^(#{p-1}) + r^(#{q-1}))"
                        ))
                        .answer("#{((sum / a1) - r^(q-p))^(1/(p-1))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Express the terms at positions p and q in terms of r: aₚ = ${a1} * r^(#{p-1}) and a_q = ${a1} * r^(#{q-1}).",
                                "Step 2: Set up the sum of the terms at positions p and q: ${sum} = ${a1} * r^(#{p-1}) + ${a1} * r^(#{q-1}).",
                                "Step 3: Factor out ${a1} on the right-hand side: ${sum} = ${a1} * (r^(#{p-1}) + r^(#{q-1})).",
                                "Step 4: Isolate r by dividing both sides by ${a1} and simplify.",
                                "Step 5: Solve for r using the resulting equation.",
                                "Step 6: The value of the common ratio is #{((sum / a1) - r^(q-p))^(1/(p-1))}."
                        ))
                        .build());
        topic6Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common ratio in a geometric sequence where the second term is ${a2} and the term at position ${n} is ${an}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a2", new Range(1, 100)),
                                new Variable("n", new Range(3, 10)),
                                new Variable("an", new Range(1, 1000))
                        ))
                        .tip("Use the formula for terms in a geometric sequence, where a₂ = a₁ * r and aₙ = a₁ * r^(n-1).")
                        .preview(Arrays.asList(
                                "Express the second term: ${a2} = a₁ * r",
                                "Express the term at position ${n}: ${an} = a₁ * r^(#{n-1})"
                        ))
                        .answer("#{(an / a2)^(1/(n-2))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Express the second term using the common ratio r: a₂ = a₁ * r.",
                                "Step 2: Isolate a₁ in terms of a₂ and r: a₁ = ${a2} / r.",
                                "Step 3: Use the term at position ${n}: ${an} = a₁ * r^(#{n-1}).",
                                "Step 4: Substitute a₁ into the equation from step 3: ${an} = (${a2} / r) * r^(#{n-1}).",
                                "Step 5: Simplify the expression and isolate r: r = #{(an / a2)^(1/(n-2))}.",
                                "Step 6: The value of the common ratio is #{(an / a2)^(1/(n-2))}."
                        ))
                        .build());
        topic6Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the common ratio in a geometric sequence with alternating positive and negative terms, starting with ${a1}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(1, 100)),
                                new Variable("n", new Range(2, 10)),
                                new Variable("an", new Range(-1000, 1000))
                        ))
                        .tip("Remember that in a geometric sequence with alternating signs, the common ratio r will be negative.")
                        .preview(Arrays.asList(
                                "Express the first term: ${a1}",
                                "Express the term at position ${n} in terms of r: aₙ = a₁ * (-r)^{n-1}"
                        ))
                        .answer("#{(an / a1)^(1/(n-1)) * (-1)^(n-1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Identify the first term: ${a1}.",
                                "Step 2: Express the term at position ${n} using the common ratio r and alternating signs: aₙ = a₁ * (-r)^{n-1}.",
                                "Step 3: Isolate r from the equation: (-r)^{n-1} = ${an} / ${a1}.",
                                "Step 4: Calculate r by solving: r = #{(an / a1)^(1/(n-1)) * (-1)^(n-1)}.",
                                "Step 5: The common ratio is #{(an / a1)^(1/(n-1)) * (-1)^(n-1)}."
                        ))
                        .build());
        topic6Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Find the common ratio in a geometric sequence where the product of the terms at positions ${m} and ${n} is ${product}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a1", new Range(1, 100)),
                                new Variable("m", new Range(1, 10)),
                                new Variable("product", new Range(1, 10000))
                        ))
                        .tip("Remember that the product of two terms at specific positions in a geometric sequence equals the square of the first term multiplied by the ratio raised to the sum of the corresponding exponents.")
                        .preview(Arrays.asList(
                                "Product of terms: aₘ * aₙ = a₁^2 * r^{m + n - 2}",
                                "r = √(product / a₁^2)^{1 / (m + n - 2)}"
                        ))
                        .answer("#{(product / (a1^2))^(1 / (m + n - 2))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Express the term at position ${m} as aₘ = ${a1} * r^{m-1}.",
                                "Step 2: Express the term at position ${n} as aₙ = ${a1} * r^{n-1}.",
                                "Step 3: Multiply both terms: aₘ * aₙ = (${a1} * r^{m-1}) * (${a1} * r^{n-1}).",
                                "Step 4: Simplify the product: aₘ * aₙ = ${a1}^2 * r^{(m-1) + (n-1)} = ${a1}^2 * r^{m + n - 2}.",
                                "Step 5: Equate it to the given product: ${a1}^2 * r^{m + n - 2} = ${product}.",
                                "Step 6: Isolate r: r^{m + n - 2} = #{product} / (${a1}^2).",
                                "Step 7: Calculate the root: r = (#{product} / (${a1}^2))^(1 / (m + n - 2)).",
                                "Step 8: The result is r = #{(product / (a1^2))^(1 / (m + n - 2))}."
                        ))
                        .build());
    }
}
