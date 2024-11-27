package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic7Type2ProblemsBuilder {
    @Getter
    public static final List<Problem> topic7Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic7Type2ProblemsBuilder.add(Problem.builder()
                .statement("If Pedro's age is ${age_pedro}, what will his age be in ${years} years?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("age_pedro", new Range(1, 100)),
                        new Variable("years", new Range(1, 50))
                ))
                .tip("To find Pedro's future age, add his current age to the number of additional years.")
                .preview(Arrays.asList(
                        "Pedro's current age = ${age_pedro}",
                        "Pedro's age in ${years} years = ${age_pedro} + ${years}"
                ))
                .answer("#{age_pedro + years}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Pedro's current age = ${age_pedro}.",
                        "Step 2: Years to add = ${years}.",
                        "Step 3: Add Pedro's current age to the additional years: ${age_pedro} + ${years}.",
                        "Step 4: The result is #{age_pedro + years}."
                ))
                .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Carla is ${age_carla} years old. How old will she be in ${years} years?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_carla", new Range(1, 100)),
                                new Variable("years", new Range(1, 50))
                        ))
                        .tip("To find Carla's future age, add her current age to the additional years.")
                        .preview(Arrays.asList(
                                "Carla's current age = ${age_carla}",
                                "Carla's age in ${years} years = ${age_carla} + ${years}"
                        ))
                        .answer("#{age_carla + years}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Carla's current age = ${age_carla}.",
                                "Step 2: Years to add = ${years}.",
                                "Step 3: Add Carla's current age to the additional years: ${age_carla} + ${years}.",
                                "Step 4: The result is #{age_carla + years}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("If Sofía's age is ${age_sofia} years, how old will she be in ${years} years?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_sofia", new Range(1, 100)),
                                new Variable("years", new Range(1, 50))
                        ))
                        .tip("To calculate Sofía's future age, add her current age to the additional years.")
                        .preview(Arrays.asList(
                                "Sofía's current age = ${age_sofia}",
                                "Sofía's age in ${years} years = ${age_sofia} + ${years}"
                        ))
                        .answer("#{age_sofia + years}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Sofía's current age = ${age_sofia}.",
                                "Step 2: Years to add = ${years}.",
                                "Step 3: Add Sofía's current age to the additional years: ${age_sofia} + ${years}.",
                                "Step 4: The result is #{age_sofia + years}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Luis is currently ${age_luis} years old. How old will he be in ${years} years?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_luis", new Range(1, 100)),
                                new Variable("years", new Range(1, 50))
                        ))
                        .tip("To calculate Luis' future age, add his current age to the additional years.")
                        .preview(Arrays.asList(
                                "Luis' current age = ${age_luis}",
                                "Luis' age in ${years} years = ${age_luis} + ${years}"
                        ))
                        .answer("#{age_luis + years}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Luis' current age = ${age_luis}.",
                                "Step 2: Years to add = ${years}.",
                                "Step 3: Add Luis' current age to the additional years: ${age_luis} + ${years}.",
                                "Step 4: The result is #{age_luis + years}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Ana's age is ${age_ana} years. What will her age be in ${years} years, if she is currently twice her sister's age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_ana", new Range(1, 100)),
                                new Variable("years", new Range(1, 50))
                        ))
                        .tip("To find Ana's future age, add her current age to the additional years. Also, remember that her sister's age is half of Ana's age.")
                        .preview(Arrays.asList(
                                "Ana's current age = ${age_ana}",
                                "Ana's age in ${years} years = ${age_ana} + ${years}"
                        ))
                        .answer("#{age_ana + years}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Ana's current age = ${age_ana}.",
                                "Step 2: Years to add = ${years}.",
                                "Step 3: Calculate Ana's age in ${years} years by adding: ${age_ana} + ${years}.",
                                "Step 4: The result is #{age_ana + years}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("If Claudia is ${age_claudia} years old and her grandmother is ${age_abuela}, how old will Claudia be in ${years} years?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_claudia", new Range(1, 50)),
                                new Variable("age_abuela", new Range(55, 100)),
                                new Variable("years", new Range(1, 50))
                        ))
                        .tip("To find Claudia's age in the future, add her current age to the specified additional years.")
                        .preview(Arrays.asList(
                                "Claudia's current age = ${age_claudia}",
                                "Claudia's age in ${years} years = ${age_claudia} + ${years}"
                        ))
                        .answer("#{age_claudia + years}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Claudia's current age = ${age_claudia}.",
                                "Step 2: Years to add = ${years}.",
                                "Step 3: Calculate Claudia's age in ${years} years by adding: ${age_claudia} + ${years}.",
                                "Step 4: The result is #{age_claudia + years}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Marta's current age is ${age_marta} years and her mother's age is ${age_madre}. How old will Marta be in ${years} years?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_marta", new Range(1, 50)),
                                new Variable("age_madre", new Range(55, 100)),
                                new Variable("years", new Range(1, 50))
                        ))
                        .tip("To find Marta's future age, add the specified years to her current age.")
                        .preview(Arrays.asList(
                                "Marta's current age = ${age_marta}",
                                "Marta's age in ${years} years = ${age_marta} + ${years}"
                        ))
                        .answer("#{age_marta + years}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Marta's current age = ${age_marta}.",
                                "Step 2: Years to add = ${years}.",
                                "Step 3: Calculate Marta's age in ${years} years by adding: ${age_marta} + ${years}.",
                                "Step 4: The result is #{age_marta + years}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Jorge's current age is ${age_jorge}. If in ${years_future} years he will be twice the age he was ${years_past} years ago, how old will Jorge be in ${years_future} years?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_jorge", new Range(1, 100)),
                                new Variable("years_future", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("First find Jorge's age ${years_past} years ago and compare it with his age in ${years_future} years to solve.")
                        .preview(Arrays.asList(
                                "Jorge's current age = ${age_jorge}",
                                "Jorge's age ${years_past} years ago = ${age_jorge} - ${years_past}",
                                "Jorge's age in ${years_future} years = ${age_jorge} + ${years_future}"
                        ))
                        .answer("#{age_jorge + years_future}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Jorge's current age = ${age_jorge}.",
                                "Step 2: Calculate Jorge's age ${years_past} years ago: ${age_jorge} - ${years_past} = #{age_jorge - years_past}.",
                                "Step 3: Calculate twice Jorge's age ${years_past} years ago: 2 * #{age_jorge - years_past} = #{2 * (age_jorge - years_past)}.",
                                "Step 4: Calculate Jorge's age in ${years_future} years: ${age_jorge} + ${years_future} = #{age_jorge + years_future}.",
                                "Step 5: Verify that Jorge's age in ${years_future} years matches twice his age ${years_past} years ago.",
                                "Step 6: The result is #{age_jorge + years_future}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("If Carla's current age is ${age_carla} years and the age difference between her and her sister is ${diff} years, how old will Carla be in ${years_future} years?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_carla", new Range(1, 100)),
                                new Variable("diff", new Range(1, 50)),
                                new Variable("years_future", new Range(1, 50))
                        ))
                        .tip("First calculate Carla's age in ${years_future} years by adding the years to her current age.")
                        .preview(Arrays.asList(
                                "Carla's current age = ${age_carla}",
                                "Carla's age in ${years_future} years = ${age_carla} + ${years_future}"
                        ))
                        .answer("#{age_carla + years_future}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Carla's current age = ${age_carla}.",
                                "Step 2: Add ${years_future} years to Carla's current age: ${age_carla} + ${years_future}.",
                                "Step 3: Perform the sum calculation: #{age_carla} + #{years_future} = #{age_carla + years_future}.",
                                "Step 4: The result is that Carla's age in ${years_future} years will be #{age_carla + years_future}."
                        ))
                        .build());
        topic7Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Pablo's age is ${age_pablo} years. If ${years_past} years ago he was half his current age, how old will he be in ${years_future} years?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_pablo", new Range(10, 100)),
                                new Variable("years_past", new Range(1, 50)),
                                new Variable("years_future", new Range(1, 50))
                        ))
                        .tip("Check if the given relationship between Pablo's age ${years_past} years ago and his current age is correct before calculating his future age.")
                        .preview(Arrays.asList(
                                "Pablo's current age = ${age_pablo}",
                                "Pablo's age ${years_past} years ago = ${age_pablo} - ${years_past}",
                                "Pablo's age in ${years_future} years = ${age_pablo} + ${years_future}"
                        ))
                        .answer("#{age_pablo + years_future}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Pablo's current age = ${age_pablo}.",
                                "Step 2: Calculate Pablo's age ${years_past} years ago: ${age_pablo} - ${years_past}.",
                                "Step 3: According to the statement, ${years_past} years ago he was half his current age, that is, #{age_pablo / 2}.",
                                "Step 4: Confirm that ${age_pablo} - ${years_past} = #{age_pablo / 2}.",
                                "Step 5: Calculate Pablo's age in ${years_future} years by adding ${years_future} to his current age: ${age_pablo} + ${years_future}.",
                                "Step 6: Perform the calculation: #{age_pablo} + #{years_future} = #{age_pablo + years_future}.",
                                "Step 7: The result is that Pablo's age in ${years_future} years will be #{age_pablo + years_future}."
                        ))
                        .build());
    }

}
