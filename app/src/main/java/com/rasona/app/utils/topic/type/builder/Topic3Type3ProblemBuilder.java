package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic3Type3ProblemBuilder {
    @Getter
    public static final List<Problem> topic3Type3ProblemsBuilder = new ArrayList<>();

    static {
        topic3Type3ProblemsBuilder.add(Problem.builder()
                .statement("Determine the product of ${a}/${b} and ${c}/${d} and convert it into a mixed number.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("a", new Range(1, 20)),
                        new Variable("b", new Range(1, 20)),
                        new Variable("c", new Range(1, 20)),
                        new Variable("d", new Range(1, 20))
                ))
                .tip("Multiply the numerators and denominators. Then convert the result to a mixed fraction if possible.")
                .preview(Arrays.asList(
                        "(${a}/${b}) * (${c}/${d})",
                        "(#{a * c}) / (#{b * d})"
                ))
                .answer("#{(a * c) / (b * d)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Multiply the numerators ${a} and ${c}, resulting in #{a * c}.",
                        "Step 2: Multiply the denominators ${b} and ${d}, resulting in #{b * d}.",
                        "Step 3: Place the result of the numerator over the result of the denominator, resulting in the fraction #{(a * c) / (b * d)}.",
                        "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{a * c} by #{b * d}.",
                        "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                        "Step 6: The result is #{(a * c) / (b * d)}."
                ))
                .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Multiply the fractions ${a}/${b} and ${c}/${d} and express the result as a mixed number.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators and then the denominators. Convert the result to a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${a}/${b}) * (${c}/${d})",
                                "(#{a * c}) / (#{b * d})"
                        ))
                        .answer("#{(a * c) / (b * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${a} and ${c}, resulting in #{a * c}.",
                                "Step 2: Multiply the denominators ${b} and ${d}, resulting in #{b * d}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(a * c) / (b * d)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{a * c} by #{b * d}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(a * c) / (b * d)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the product of ${a}/${b} by ${c}/${d} and give the answer as a mixed number.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators together and the denominators together. Convert the result into a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${a}/${b}) * (${c}/${d})",
                                "(#{a * c}) / (#{b * d})"
                        ))
                        .answer("#{(a * c) / (b * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${a} and ${c} to get #{a * c}.",
                                "Step 2: Multiply the denominators ${b} and ${d} to get #{b * d}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(a * c) / (b * d)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{a * c} by #{b * d}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(a * c) / (b * d)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Find the product of ${a}/${b} * ${c}/${d} and convert it into a mixed number.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators and then the denominators. Convert the result into a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${a}/${b}) * (${c}/${d})",
                                "(#{a * c}) / (#{b * d})"
                        ))
                        .answer("#{(a * c) / (b * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${a} and ${c} to get #{a * c}.",
                                "Step 2: Multiply the denominators ${b} and ${d} to get #{b * d}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(a * c) / (b * d)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{a * c} by #{b * d}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(a * c) / (b * d)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Multiply the fractions ${e}/${f} and ${a}/${b} and express the result as a mixed number.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators together and the denominators together. Convert the result to a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${e}/${f}) * (${a}/${b})",
                                "(#{e * a}) / (#{f * b})"
                        ))
                        .answer("#{(e * a) / (f * b)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${e} and ${a} to get #{e * a}.",
                                "Step 2: Multiply the denominators ${f} and ${b} to get #{f * b}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(e * a) / (f * b)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{e * a} by #{f * b}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(e * a) / (f * b)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the product of ${e}/${f} by ${c}/${d} and give the answer in the form of a mixed number.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators together and the denominators together. Convert the result into a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${e}/${f}) * (${c}/${d})",
                                "(#{e * c}) / (#{f * d})"
                        ))
                        .answer("#{(e * c) / (f * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${e} and ${c} to get #{e * c}.",
                                "Step 2: Multiply the denominators ${f} and ${d} to get #{f * d}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(e * c) / (f * d)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{e * c} by #{f * d}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(e * c) / (f * d)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Find the product of ${e}/${f} * ${a}/${b} and convert it to a mixed number.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators and then the denominators. Convert the result to a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${e}/${f}) * (${a}/${b})",
                                "(#{e * a}) / (#{f * b})"
                        ))
                        .answer("#{(e * a) / (f * b)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${e} and ${a} to get #{e * a}.",
                                "Step 2: Multiply the denominators ${f} and ${b} to get #{f * b}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(e * a) / (f * b)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{e * a} by #{f * b}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(e * a) / (f * b)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the product of ${g}/${h} and ${c}/${d} and convert it to a mixed number.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("d", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators and then the denominators. Convert the result to a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${g}/${h}) * (${c}/${d})",
                                "(#{g * c}) / (#{h * d})"
                        ))
                        .answer("#{(g * c) / (h * d)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${g} and ${c} to get #{g * c}.",
                                "Step 2: Multiply the denominators ${h} and ${d} to get #{h * d}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(g * c) / (h * d)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{g * c} by #{h * d}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(g * c) / (h * d)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Multiply the fractions ${g}/${h} and ${e}/${f} and express the result as a mixed number.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators and then the denominators. Convert the result to a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${g}/${h}) * (${e}/${f})",
                                "(#{g * e}) / (#{h * f})"
                        ))
                        .answer("#{(g * e) / (h * f)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${g} and ${e} to get #{g * e}.",
                                "Step 2: Multiply the denominators ${h} and ${f} to get #{h * f}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(g * e) / (h * f)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{g * e} by #{h * f}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(g * e) / (h * f)}."
                        ))
                        .build());
        topic3Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the product of ${g}/${h} by ${a}/${b} and give the answer in mixed number form.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20))
                        ))
                        .tip("Multiply the numerators and then the denominators. Convert the result to a mixed number if necessary.")
                        .preview(Arrays.asList(
                                "(${g}/${h}) * (${a}/${b})",
                                "(#{g * a}) / (#{h * b})"
                        ))
                        .answer("#{(g * a) / (h * b)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Multiply the numerators ${g} and ${a} to get #{g * a}.",
                                "Step 2: Multiply the denominators ${h} and ${b} to get #{h * b}.",
                                "Step 3: Place the result of the numerator over the result of the denominator, forming the fraction #{(g * a) / (h * b)}.",
                                "Step 4: If the numerator is greater than the denominator, convert the fraction to a mixed number by dividing #{g * a} by #{h * b}.",
                                "Step 5: The result is a mixed number with the integer part and the remaining fraction, if possible.",
                                "Step 6: The result is #{(g * a) / (h * b)}."
                        ))
                        .build());
    }

}
