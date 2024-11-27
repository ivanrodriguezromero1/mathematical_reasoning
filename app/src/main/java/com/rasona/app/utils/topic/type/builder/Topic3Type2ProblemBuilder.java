package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic3Type2ProblemBuilder {
    @Getter
    public static final List<Problem> topic3Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic3Type2ProblemsBuilder.add(Problem.builder()
                .statement("Determine the value of ${d} ${e}/${f} minus ${a} ${b}/${c}.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("d", new Range(1, 20)),
                        new Variable("e", new Range(1, 20)),
                        new Variable("f", new Range(1, 20)),
                        new Variable("a", new Range(1, 20)),
                        new Variable("b", new Range(1, 20)),
                        new Variable("c", new Range(1, 20))
                ))
                .tip("Convert both mixed numbers to improper fractions, perform the subtraction, and simplify the result.")
                .preview(Arrays.asList(
                        "${d} ${e}/${f} - ${a} ${b}/${c}",
                        "((#{d * f + e}) / #{f}) - ((#{a * c + b}) / #{c})"
                ))
                .answer("#{((d * f + e) * c - (a * c + b) * f) / (f * c)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Convert ${d} ${e}/${f} to an improper fraction by multiplying ${d} by ${f} and adding ${e}, resulting in #{d * f + e} over ${f}.",
                        "Step 2: Convert ${a} ${b}/${c} to an improper fraction by multiplying ${a} by ${c} and adding ${b}, resulting in #{a * c + b} over ${c}.",
                        "Step 3: Find a common denominator by multiplying ${f} by ${c}, resulting in #{f * c}.",
                        "Step 4: Adjust the first fraction by multiplying the numerator #{d * f + e} by ${c}, resulting in #{(d * f + e) * c}.",
                        "Step 5: Adjust the second fraction by multiplying the numerator #{a * c + b} by ${f}, resulting in #{(a * c + b) * f}.",
                        "Step 6: Subtract the adjusted numerators: #{(d * f + e) * c} - #{(a * c + b) * f}.",
                        "Step 7: Place the result of the subtraction over the common denominator #{f * c}.",
                        "Step 8: Simplify the resulting fraction by dividing the numerator and denominator by their greatest common divisor, if possible.",
                        "Step 9: The simplified result of the subtraction is #{((d * f + e) * c - (a * c + b) * f) / (f * c)}."
                ))
                .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the difference ${d} ${e}/${f} - ${a} ${b}/${c}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${d} ${e}/${f} - ${a} ${b}/${c}",
                                "((#{d * f + e}) / #{f}) - ((#{a * c + b}) / #{c})"
                        ))
                        .answer("#{((d * f + e) * c - (a * c + b) * f) / (f * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${d} ${e}/${f} to an improper fraction by multiplying ${d} by ${f} and adding ${e}, resulting in #{d * f + e} over ${f}.",
                                "Step 2: Convert ${a} ${b}/${c} to an improper fraction by multiplying ${a} by ${c} and adding ${b}, resulting in #{a * c + b} over ${c}.",
                                "Step 3: Find a common denominator by multiplying ${f} by ${c}, resulting in #{f * c}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{d * f + e} by ${c}, resulting in #{(d * f + e) * c}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{a * c + b} by ${f}, resulting in #{(a * c + b) * f}.",
                                "Step 6: Subtract the adjusted numerators: #{(d * f + e) * c} - #{(a * c + b) * f}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{f * c}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((d * f + e) * c - (a * c + b) * f) / (f * c)}."
                        ))
                        .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the simplified value of ${d} ${e}/${f} minus ${a} ${b}/${c}.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${d} ${e}/${f} - ${a} ${b}/${c}",
                                "((#{d * f + e}) / #{f}) - ((#{a * c + b}) / #{c})"
                        ))
                        .answer("#{((d * f + e) * c - (a * c + b) * f) / (f * c)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${d} ${e}/${f} to an improper fraction by multiplying ${d} by ${f} and adding ${e}, resulting in #{d * f + e} over ${f}.",
                                "Step 2: Convert ${a} ${b}/${c} to an improper fraction by multiplying ${a} by ${c} and adding ${b}, resulting in #{a * c + b} over ${c}.",
                                "Step 3: Find a common denominator by multiplying ${f} by ${c}, resulting in #{f * c}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{d * f + e} by ${c}, resulting in #{(d * f + e) * c}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{a * c + b} by ${f}, resulting in #{(a * c + b) * f}.",
                                "Step 6: Subtract the adjusted numerators: #{(d * f + e) * c} - #{(a * c + b) * f}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{f * c}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((d * f + e) * c - (a * c + b) * f) / (f * c)}."
                        ))
                        .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Subtract the mixed fraction ${g} ${h}/${i} from ${d} ${e}/${f} and simplify the result.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("i", new Range(1, 20)),
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${d} ${e}/${f} - ${g} ${h}/${i}",
                                "((#{d * f + e}) / #{f}) - ((#{g * i + h}) / #{i})"
                        ))
                        .answer("#{((d * f + e) * i - (g * i + h) * f) / (f * i)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${d} ${e}/${f} to an improper fraction by multiplying ${d} by ${f} and adding ${e}, resulting in #{d * f + e} over ${f}.",
                                "Step 2: Convert ${g} ${h}/${i} to an improper fraction by multiplying ${g} by ${i} and adding ${h}, resulting in #{g * i + h} over ${i}.",
                                "Step 3: Find a common denominator by multiplying ${f} by ${i}, resulting in #{f * i}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{d * f + e} by ${i}, resulting in #{(d * f + e) * i}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{g * i + h} by ${f}, resulting in #{(g * i + h) * f}.",
                                "Step 6: Subtract the adjusted numerators: #{(d * f + e) * i} - #{(g * i + h) * f}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{f * i}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((d * f + e) * i - (g * i + h) * f) / (f * i)}."
                        ))
                        .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the difference ${d} ${e}/${f} - ${g} ${h}/${i}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("i", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${d} ${e}/${f} - ${g} ${h}/${i}",
                                "((#{d * f + e}) / ${f}) - ((#{g * i + h}) / ${i})"
                        ))
                        .answer("#{((d * f + e) * i - (g * i + h) * f) / (f * i)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${d} ${e}/${f} to an improper fraction by multiplying ${d} by ${f} and adding ${e}, resulting in #{d * f + e} over ${f}.",
                                "Step 2: Convert ${g} ${h}/${i} to an improper fraction by multiplying ${g} by ${i} and adding ${h}, resulting in #{g * i + h} over ${i}.",
                                "Step 3: Find a common denominator by multiplying ${f} by ${i}, resulting in #{f * i}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{d * f + e} by ${i}, resulting in #{(d * f + e) * i}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{g * i + h} by ${f}, resulting in #{(g * i + h) * f}.",
                                "Step 6: Subtract the adjusted numerators: #{(d * f + e) * i} - #{(g * i + h) * f}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{f * i}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and the denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((d * f + e) * i - (g * i + h) * f) / (f * i)}."
                        ))
                        .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Find the simplified value of ${a} ${b}/${c} minus ${g} ${h}/${i}.")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("i", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${a} ${b}/${c} - ${g} ${h}/${i}",
                                "((#{a * c + b}) / #{c}) - ((#{g * i + h}) / #{i})"
                        ))
                        .answer("#{((a * c + b) * i - (g * i + h) * c) / (c * i)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${a} ${b}/${c} to an improper fraction by multiplying ${a} by ${c} and adding ${b}, resulting in #{a * c + b} over ${c}.",
                                "Step 2: Convert ${g} ${h}/${i} to an improper fraction by multiplying ${g} by ${i} and adding ${h}, resulting in #{g * i + h} over ${i}.",
                                "Step 3: Find a common denominator by multiplying ${c} by ${i}, resulting in #{c * i}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{a * c + b} by ${i}, resulting in #{(a * c + b) * i}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{g * i + h} by ${c}, resulting in #{(g * i + h) * c}.",
                                "Step 6: Subtract the adjusted numerators: #{(a * c + b) * i} - #{(g * i + h) * c}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{c * i}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and the denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((a * c + b) * i - (g * i + h) * c) / (c * i)}."
                        ))
                        .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Determine the value of ${a} ${b}/${c} minus ${j} ${k}/${l}.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("a", new Range(1, 20)),
                                new Variable("b", new Range(1, 20)),
                                new Variable("c", new Range(1, 20)),
                                new Variable("j", new Range(1, 20)),
                                new Variable("k", new Range(1, 20)),
                                new Variable("l", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${a} ${b}/${c} - ${j} ${k}/${l}",
                                "((#{a * c + b}) / #{c}) - ((#{j * l + k}) / #{l})"
                        ))
                        .answer("#{((a * c + b) * l - (j * l + k) * c) / (c * l)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${a} ${b}/${c} to an improper fraction by multiplying ${a} by ${c} and adding ${b}, resulting in #{a * c + b} over ${c}.",
                                "Step 2: Convert ${j} ${k}/${l} to an improper fraction by multiplying ${j} by ${l} and adding ${k}, resulting in #{j * l + k} over ${l}.",
                                "Step 3: Find a common denominator by multiplying ${c} by ${l}, resulting in #{c * l}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{a * c + b} by ${l}, resulting in #{(a * c + b) * l}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{j * l + k} by ${c}, resulting in #{(j * l + k) * c}.",
                                "Step 6: Subtract the adjusted numerators: #{(a * c + b) * l} - #{(j * l + k) * c}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{c * l}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and the denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((a * c + b) * l - (j * l + k) * c) / (c * l)}."
                        ))
                        .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Subtract the mixed fraction ${j} ${k}/${l} from ${g} ${h}/${i} and simplify the result.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("g", new Range(1, 20)),
                                new Variable("h", new Range(1, 20)),
                                new Variable("i", new Range(1, 20)),
                                new Variable("j", new Range(1, 20)),
                                new Variable("k", new Range(1, 20)),
                                new Variable("l", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${g} ${h}/${i} - ${j} ${k}/${l}",
                                "((#{g * i + h}) / #{i}) - ((#{j * l + k}) / #{l})"
                        ))
                        .answer("#{((g * i + h) * l - (j * l + k) * i) / (i * l)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${g} ${h}/${i} to an improper fraction by multiplying ${g} by ${i} and adding ${h}, resulting in #{g * i + h} over ${i}.",
                                "Step 2: Convert ${j} ${k}/${l} to an improper fraction by multiplying ${j} by ${l} and adding ${k}, resulting in #{j * l + k} over ${l}.",
                                "Step 3: Find a common denominator by multiplying ${i} by ${l}, resulting in #{i * l}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{g * i + h} by ${l}, resulting in #{(g * i + h) * l}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{j * l + k} by ${i}, resulting in #{(j * l + k) * i}.",
                                "Step 6: Subtract the adjusted numerators: #{(g * i + h) * l} - #{(j * l + k) * i}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{i * l}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and the denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((g * i + h) * l - (j * l + k) * i) / (i * l)}."
                        ))
                        .build());
        topic3Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Calculate the difference ${d} ${e}/${f} - ${j} ${k}/${l} and simplify.")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("d", new Range(1, 20)),
                                new Variable("e", new Range(1, 20)),
                                new Variable("f", new Range(1, 20)),
                                new Variable("j", new Range(1, 20)),
                                new Variable("k", new Range(1, 20)),
                                new Variable("l", new Range(1, 20))
                        ))
                        .tip("Convert both mixed fractions to improper fractions, perform the subtraction, and simplify the result.")
                        .preview(Arrays.asList(
                                "${d} ${e}/${f} - ${j} ${k}/${l}",
                                "((#{d * f + e}) / #{f}) - ((#{j * l + k}) / #{l})"
                        ))
                        .answer("#{((d * f + e) * l - (j * l + k) * f) / (f * l)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert ${d} ${e}/${f} to an improper fraction by multiplying ${d} by ${f} and adding ${e}, resulting in #{d * f + e} over ${f}.",
                                "Step 2: Convert ${j} ${k}/${l} to an improper fraction by multiplying ${j} by ${l} and adding ${k}, resulting in #{j * l + k} over ${l}.",
                                "Step 3: Find a common denominator by multiplying ${f} by ${l}, resulting in #{f * l}.",
                                "Step 4: Adjust the first fraction by multiplying the numerator #{d * f + e} by ${l}, resulting in #{(d * f + e) * l}.",
                                "Step 5: Adjust the second fraction by multiplying the numerator #{j * l + k} by ${f}, resulting in #{(j * l + k) * f}.",
                                "Step 6: Subtract the adjusted numerators: #{(d * f + e) * l} - #{(j * l + k) * f}.",
                                "Step 7: Place the result of the subtraction over the common denominator #{f * l}.",
                                "Step 8: Simplify the resulting fraction by dividing the numerator and the denominator by their greatest common divisor, if possible.",
                                "Step 9: The simplified value of the difference is #{((d * f + e) * l - (j * l + k) * f) / (f * l)}."
                        ))
                        .build());
    }
}
