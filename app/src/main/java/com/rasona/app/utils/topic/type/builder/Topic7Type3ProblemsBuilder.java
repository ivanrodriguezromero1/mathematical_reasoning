package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic7Type3ProblemsBuilder {
    @Getter
    public static final List<Problem> topic7Type3ProblemsBuilder = new ArrayList<>();

    static {
        topic7Type3ProblemsBuilder.add(Problem.builder()
                .statement("If Pedro's age is ${age_pedro}, how old was he ${years_past} years ago?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("age_pedro", new Range(10, 100)),
                        new Variable("years_past", new Range(1, 50))
                ))
                .tip("Subtract the indicated number of years from Pedro's current age to find his age ${years_past} years ago.")
                .preview(Arrays.asList(
                        "Pedro's current age = ${age_pedro}",
                        "Pedro's age ${years_past} years ago = ${age_pedro} - ${years_past}"
                ))
                .answer("#{age_pedro - years_past}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Pedro's current age = ${age_pedro}.",
                        "Step 2: Calculate Pedro's age ${years_past} years ago by subtracting ${years_past} from his current age.",
                        "Step 3: Perform the calculation: ${age_pedro} - ${years_past} = #{age_pedro - years_past}.",
                        "Step 4: The result is that Pedro's age ${years_past} years ago was #{age_pedro - years_past}."
                ))
                .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Carla is ${age_carla} years old. How old was she ${years_past} years ago?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_carla", new Range(10, 100)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("Subtract the indicated number of years from Carla's current age to find her age ${years_past} years ago.")
                        .preview(Arrays.asList(
                                "Carla's current age = ${age_carla}",
                                "Carla's age ${years_past} years ago = ${age_carla} - ${years_past}"
                        ))
                        .answer("#{age_carla - years_past}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Carla's current age = ${age_carla}.",
                                "Step 2: Calculate Carla's age ${years_past} years ago by subtracting ${years_past} from her current age.",
                                "Step 3: Perform the calculation: ${age_carla} - ${years_past} = #{age_carla - years_past}.",
                                "Step 4: The result is that Carla's age ${years_past} years ago was #{age_carla - years_past}."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("If Sofía's age is ${age_sofia}, how old was she ${years_past} years ago?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_sofia", new Range(10, 100)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("Subtract the indicated number of years from Sofía's current age to find her age ${years_past} years ago.")
                        .preview(Arrays.asList(
                                "Sofía's current age = ${age_sofia}",
                                "Sofía's age ${years_past} years ago = ${age_sofia} - ${years_past}"
                        ))
                        .answer("#{age_sofia - years_past}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Sofía's current age = ${age_sofia}.",
                                "Step 2: Calculate Sofía's age ${years_past} years ago by subtracting ${years_past} from her current age.",
                                "Step 3: Perform the calculation: ${age_sofia} - ${years_past} = #{age_sofia - years_past}.",
                                "Step 4: The result is that Sofía's age ${years_past} years ago was #{age_sofia - years_past}."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Luis is currently ${age_luis} years old. How old was he ${years_past} years ago?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_luis", new Range(10, 100)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("Subtract the indicated number of years from Luis' current age to find his age ${years_past} years ago.")
                        .preview(Arrays.asList(
                                "Luis' current age = ${age_luis}",
                                "Luis' age ${years_past} years ago = ${age_luis} - ${years_past}"
                        ))
                        .answer("#{age_luis - years_past}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Luis' current age = ${age_luis}.",
                                "Step 2: Calculate Luis' age ${years_past} years ago by subtracting ${years_past} from his current age.",
                                "Step 3: Perform the calculation: ${age_luis} - ${years_past} = #{age_luis - years_past}.",
                                "Step 4: The result is that Luis' age ${years_past} years ago was #{age_luis - years_past}."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Ana's age is ${age_ana} years. What was her age ${years_past} years ago, if she is currently twice her sister's age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_ana", new Range(20, 80)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("Subtract the indicated number of years from Ana's current age to find her age ${years_past} years ago.")
                        .preview(Arrays.asList(
                                "Ana's current age = ${age_ana}",
                                "Ana's age ${years_past} years ago = ${age_ana} - ${years_past}"
                        ))
                        .answer("#{age_ana - years_past}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Ana's current age = ${age_ana}.",
                                "Step 2: Subtract ${years_past} from Ana's current age to calculate her age ${years_past} years ago.",
                                "Step 3: Perform the calculation: ${age_ana} - ${years_past} = #{age_ana - years_past}.",
                                "Step 4: The result is that Ana's age ${years_past} years ago was #{age_ana - years_past}."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("If Claudia is ${age_claudia} years old and her grandmother is ${age_abuela} years old, how old was Claudia ${years_past} years ago?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_claudia", new Range(5, 20)),
                                new Variable("age_abuela", new Range(50, 100)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("To calculate Claudia's age ${years_past} years ago, subtract that number from her current age.")
                        .preview(Arrays.asList(
                                "Claudia's current age = ${age_claudia}",
                                "Claudia's age ${years_past} years ago = ${age_claudia} - ${years_past}"
                        ))
                        .answer("#{age_claudia - years_past}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Claudia's current age = ${age_claudia}.",
                                "Step 2: Subtract ${years_past} from Claudia's current age to find her age in the past.",
                                "Step 3: Perform the calculation: ${age_claudia} - ${years_past} = #{age_claudia - years_past}.",
                                "Step 4: The result is that Claudia's age ${years_past} years ago was #{age_claudia - years_past}."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Marta's current age is ${age_marta} years and her mother's age is ${age_madre} years. How old was Marta ${years_past} years ago?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_marta", new Range(5, 25)),
                                new Variable("age_madre", new Range(50, 100)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("To find Marta's age ${years_past} years ago, subtract that number from her current age.")
                        .preview(Arrays.asList(
                                "Marta's current age = ${age_marta}",
                                "Marta's age ${years_past} years ago = ${age_marta} - ${years_past}"
                        ))
                        .answer("#{age_marta - years_past}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Marta's current age = ${age_marta}.",
                                "Step 2: Subtract ${years_past} from Marta's current age to find her age in the past.",
                                "Step 3: Perform the calculation: ${age_marta} - ${years_past} = #{age_marta - years_past}.",
                                "Step 4: The result is that Marta's age ${years_past} years ago was #{age_marta - years_past}."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Jorge's current age is ${age_jorge}. If ${years_past} years ago, Jorge was half the age he is now, how old was Jorge then?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_jorge", new Range(10, 100)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("To calculate Jorge's age ${years_past} years ago, remember that it was half of his current age.")
                        .preview(Arrays.asList(
                                "Jorge's current age = ${age_jorge}",
                                "Jorge's age ${years_past} years ago = ${age_jorge} / 2"
                        ))
                        .answer("#{age_jorge / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Jorge's current age = ${age_jorge}.",
                                "Step 2: According to the statement, ${years_past} years ago, Jorge was half his current age.",
                                "Step 3: Calculate half of Jorge's current age: ${age_jorge} / 2.",
                                "Step 4: Perform the calculation: #{age_jorge / 2}.",
                                "Step 5: The result is that Jorge was #{age_jorge / 2} years old ${years_past} years ago."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Carla's age is ${age_carla} years and the age difference between her and her sister is ${diff} years. How old was Carla ${years_past} years ago?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_carla", new Range(10, 100)),
                                new Variable("diff", new Range(1, 10)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("To calculate Carla's age ${years_past} years ago, simply subtract ${years_past} from her current age.")
                        .preview(Arrays.asList(
                                "Carla's current age = ${age_carla}",
                                "Carla's age ${years_past} years ago = ${age_carla} - ${years_past}"
                        ))
                        .answer("#{age_carla - years_past}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Carla's current age = ${age_carla}.",
                                "Step 2: To find Carla's age ${years_past} years ago, subtract ${years_past} from her current age.",
                                "Step 3: Perform the operation: ${age_carla} - ${years_past}.",
                                "Step 4: The result is that Carla's age ${years_past} years ago was #{age_carla - years_past}."
                        ))
                        .build());
        topic7Type3ProblemsBuilder.add(Problem.builder()
                        .statement("Pablo's age is ${age_pablo} years. If ${years_past} years ago he was a quarter of his current age, how old was Pablo then?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_pablo", new Range(20, 100)),
                                new Variable("years_past", new Range(1, 50))
                        ))
                        .tip("To find Pablo's age ${years_past} years ago, use the relationship between his current age and the fraction mentioned in the statement.")
                        .preview(Arrays.asList(
                                "Pablo's current age = ${age_pablo}",
                                "Pablo's age ${years_past} years ago = ${age_pablo} / 4"
                        ))
                        .answer("#{age_pablo / 4}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Pablo's current age = ${age_pablo}.",
                                "Step 2: According to the statement, ${years_past} years ago, Pablo was a quarter of his current age.",
                                "Step 3: Calculate a quarter of Pablo's current age: ${age_pablo} / 4.",
                                "Step 4: The result is that ${years_past} years ago, Pablo was #{age_pablo / 4} years old."
                        ))
                        .build());
    }

}
