package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic7Type1ProblemBuilder {
    @Getter
    public static final List<Problem> topic7Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("If the age difference between Marta and Andrés is ${diff} years and Andrés is ${age_andres} years old, and Marta is older than Andrés, how old is Marta currently?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(1, 20)),
                                new Variable("age_andres", new Range(10, 70))
                        ))
                        .tip("To find Marta's age, add the age difference to Andrés' age.")
                        .preview(Arrays.asList(
                                "Marta's age = Andrés' age + Age difference",
                                "Marta's age = ${age_andres} + ${diff}"
                        ))
                        .answer("#{age_andres + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Marta's age = Andrés' age + Age difference.",
                                "Step 2: Replacing the values: Marta's age = ${age_andres} + ${diff}.",
                                "Step 3: Marta's age = #{age_andres + diff}.",
                                "Step 4: The final answer is #{age_andres + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("If the age difference between Sofía and Javier is ${diff} years and Javier is ${age_javier} years old, and Sofía is older than Javier, what is Sofía's current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(1, 20)),
                                new Variable("age_javier", new Range(10, 70))
                        ))
                        .tip("To find Sofía's age, add the age difference to Javier's age.")
                        .preview(Arrays.asList(
                                "Sofía's age = Javier's age + Age difference",
                                "Sofía's age = ${age_javier} + ${diff}"
                        ))
                        .answer("#{age_javier + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Sofía's age = Javier's age + Age difference.",
                                "Step 2: Replacing the values: Sofía's age = ${age_javier} + ${diff}.",
                                "Step 3: Sofía's age = #{age_javier + diff}.",
                                "Step 4: The final answer is #{age_javier + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Ana is ${diff} years older than her brother. If her brother is ${age_hermano} years old, what is Ana's current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(1, 20)),
                                new Variable("age_hermano", new Range(5, 70))
                        ))
                        .tip("To find Ana's age, add the age difference to her brother's age.")
                        .preview(Arrays.asList(
                                "Ana's age = Her brother's age + Age difference",
                                "Ana's age = ${age_hermano} + ${diff}"
                        ))
                        .answer("#{age_hermano + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Ana's age = Her brother's age + Age difference.",
                                "Step 2: Replacing the values: Ana's age = ${age_hermano} + ${diff}.",
                                "Step 3: Perform the addition: #{age_hermano} + #{diff}.",
                                "Step 4: Ana's current age is #{age_hermano + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The age difference between Laura and Tomás is ${diff} years. If Tomás is ${age_tomas} years old, and Laura is older than Tomás, how old is Laura currently?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(1, 20)),
                                new Variable("age_tomas", new Range(5, 70))
                        ))
                        .tip("To find Laura's age, add the age difference to Tomás' age.")
                        .preview(Arrays.asList(
                                "Laura's age = Tomás' age + Age difference",
                                "Laura's age = ${age_tomas} + ${diff}"
                        ))
                        .answer("#{age_tomas + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Laura's age = Tomás' age + Age difference.",
                                "Step 2: Replacing the values: Laura's age = ${age_tomas} + ${diff}.",
                                "Step 3: Laura's age = #{age_tomas + diff}.",
                                "Step 4: The final answer is #{age_tomas + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Ana is ${diff} years older than Sofía. ${years} years ago, Ana was three times Sofía's age. What is Ana's current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(1, 20)),
                                new Variable("years", new Range(1, 20))
                        ))
                        .tip("Use the current age relationship and the condition from ${years} years ago to form two equations.")
                        .preview(Arrays.asList(
                                "Ana's age = Sofía's age + ${diff}",
                                "${years} years ago: Ana's age = 3 * Sofía's age"
                        ))
                        .answer("#{3 * (years + diff) / 2 + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let x be Sofía's current age.",
                                "Step 2: Then, Ana's current age is x + ${diff}.",
                                "Step 3: ${years} years ago, Ana's age was (x + ${diff} - ${years}) and Sofía's age was (x - ${years}).",
                                "Step 4: According to the condition, ${years} years ago, Ana was three times Sofía's age, so (x + ${diff} - ${years}) = 3 * (x - ${years}).",
                                "Step 5: Solve the equation for x.",
                                "Step 6: Once x is found, calculate Ana's current age as x + ${diff}.",
                                "Step 7: The result is #{3 * (years + diff) / 2 + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The age difference between Marta and her father is ${diff} years. ${years} years ago, Marta's father was three times Marta's age. How old is Marta currently?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(20, 50)),
                                new Variable("years", new Range(1, 20))
                        ))
                        .tip("Use the current age relationship and the condition from ${years} years ago to form two equations.")
                        .preview(Arrays.asList(
                                "Father's age = Marta's age + ${diff}",
                                "${years} years ago: Father's age = 3 * Marta's age"
                        ))
                        .answer("#{(3 * years + diff) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let x be Marta's current age.",
                                "Step 2: Then, Marta's father's current age is x + ${diff}.",
                                "Step 3: ${years} years ago, the father's age was (x + ${diff} - ${years}) and Marta's age was (x - ${years}).",
                                "Step 4: According to the condition, ${years} years ago, the father was three times Marta's age, so (x + ${diff} - ${years}) = 3 * (x - ${years}).",
                                "Step 5: Solve the equation for x.",
                                "Step 6: Once x is found, you have Marta's current age.",
                                "Step 7: The result is #{(3 * years + diff) / 2}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("If ${years} years ago, Carlos was twice his brother's age and the age difference between them is ${diff} years, what is Carlos' current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(2, 20)),
                                new Variable("years", new Range(1, 20))
                        ))
                        .tip("Formulate an equation for the age relationship ${years} years ago and use the age difference to solve.")
                        .preview(Arrays.asList(
                                "Carlos' current age = Brother's age + ${diff}",
                                "${years} years ago: Carlos' age = 2 * Brother's age"
                        ))
                        .answer("#{2 * years + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let x be Carlos' brother's current age.",
                                "Step 2: Carlos' current age is x + ${diff}.",
                                "Step 3: ${years} years ago, Carlos' age was (x + ${diff} - ${years}) and his brother's age was (x - ${years}).",
                                "Step 4: According to the condition, ${years} years ago, Carlos was twice his brother's age: (x + ${diff} - ${years}) = 2 * (x - ${years}).",
                                "Step 5: Solve this equation to find the value of x.",
                                "Step 6: Carlos' current age is x + ${diff}.",
                                "Step 7: The result is #{2 * years + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("If ${years} years ago, Carlos was twice his brother's age and the age difference between them is ${diff} years, what is Carlos' current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(2, 20)),
                                new Variable("years", new Range(1, 20))
                        ))
                        .tip("Formulate an equation for the age relationship ${years} years ago and use the age difference to solve.")
                        .preview(Arrays.asList(
                                "Carlos' current age = Brother's age + ${diff}",
                                "${years} years ago: Carlos' age = 2 * Brother's age"
                        ))
                        .answer("#{2 * years + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let x be Carlos' brother's current age.",
                                "Step 2: Carlos' current age is x + ${diff}.",
                                "Step 3: ${years} years ago, Carlos' age was (x + ${diff} - ${years}) and his brother's age was (x - ${years}).",
                                "Step 4: According to the condition, ${years} years ago, Carlos was twice his brother's age: (x + ${diff} - ${years}) = 2 * (x - ${years}).",
                                "Step 5: Solve this equation to find the value of x.",
                                "Step 6: Carlos' current age is x + ${diff}.",
                                "Step 7: The result is #{2 * years + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("${years} years ago, Andrés was five times his brother's age and the age difference between them is ${diff} years. What is Andrés' current age?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(2, 50)),
                                new Variable("years", new Range(1, 20))
                        ))
                        .tip("Formulate an equation for the age relationship ${years} years ago, and use the age difference to solve.")
                        .preview(Arrays.asList(
                                "Andrés' current age = Brother's age + ${diff}",
                                "${years} years ago: Andrés' age = 5 * Brother's age"
                        ))
                        .answer("#{5 * years + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let x be Andrés' brother's current age.",
                                "Step 2: Andrés' current age is x + ${diff}.",
                                "Step 3: ${years} years ago, Andrés' age was (x + ${diff} - ${years}) and his brother's age was (x - ${years}).",
                                "Step 4: According to the condition, ${years} years ago, Andrés was five times his brother's age: (x + ${diff} - ${years}) = 5 * (x - ${years}).",
                                "Step 5: Solve this equation to find the value of x.",
                                "Step 6: Calculate Andrés' current age as x + ${diff}.",
                                "Step 7: The result is #{5 * years + diff}."
                        ))
                        .build());
        topic7Type1ProblemsBuilder.add(Problem.builder()
                        .statement("If the age difference between Claudia and her cousin is ${diff} years and ${years} years ago Claudia was twice her cousin's age, what is Claudia's current age?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("diff", new Range(1, 50)),
                                new Variable("years", new Range(1, 20))
                        ))
                        .tip("Use the current age difference and the condition from ${years} years ago to establish an equation.")
                        .preview(Arrays.asList(
                                "Claudia's current age = Cousin's age + ${diff}",
                                "${years} years ago: Claudia's age = 2 * Cousin's age"
                        ))
                        .answer("#{2 * years + diff}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let x be Claudia's cousin's current age.",
                                "Step 2: Claudia's current age is x + ${diff}.",
                                "Step 3: ${years} years ago, Claudia's age was (x + ${diff} - ${years}) and her cousin's age was (x - ${years}).",
                                "Step 4: According to the condition, ${years} years ago, Claudia was twice her cousin's age: (x + ${diff} - ${years}) = 2 * (x - ${years}).",
                                "Step 5: Solve this equation to find the value of x.",
                                "Step 6: Calculate Claudia's current age as x + ${diff}.",
                                "Step 7: The result is #{2 * years + diff}."
                        ))
                        .build());
    }
}
