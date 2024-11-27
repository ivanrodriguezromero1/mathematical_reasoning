package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic8Type2ProblemsBuilder {
    @Getter
    public static final List<Problem> topic8Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic8Type2ProblemsBuilder.add(Problem.builder()
                .statement("Pedro was ${age_pedro_past} years old ${years_past} years ago and will be ${age_pedro_future} years old in ${years_future} years. What is his current age?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("age_pedro_past", new Range(1, 50)),
                        new Variable("years_past", new Range(1, 10)),
                        new Variable("years_future", new Range(1, 10)),
                        new Variable("age_pedro_future", new Range(20, 70))
                ))
                .tip("To find the current age, use the information about his age in the past and in the future to set up an equation.")
                .preview(Arrays.asList(
                        "Current age + ${years_past} = ${age_pedro_past}",
                        "Current age + ${years_future} = ${age_pedro_future}"
                ))
                .answer("#{(age_pedro_future + age_pedro_past + years_past - years_future) / 2}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Let Pedro's current age = x.",
                        "Step 2: According to the problem, x - ${years_past} = ${age_pedro_past}.",
                        "Step 3: Then, x + ${years_future} = ${age_pedro_future}.",
                        "Step 4: Rearranging both equations and adding: 2x = ${age_pedro_future} + ${age_pedro_past} + ${years_past} - ${years_future}.",
                        "Step 5: Divide both sides by 2 to find the current age: x = #{(age_pedro_future + age_pedro_past + years_past - years_future) / 2}.",
                        "Step 6: Pedro's current age is #{(age_pedro_future + age_pedro_past + years_past - years_future) / 2} years."
                ))
                .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Carla was ${age_carla_past} years old ${years_past} years ago and will be ${age_carla_future} years old in ${years_future} years. What is her current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_carla_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_carla_future", new Range(20, 70))
                        ))
                        .tip("Use the information about her age in the past and in the future to set up an equation and find her current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_carla_past}",
                                "Current age + ${years_future} = ${age_carla_future}"
                        ))
                        .answer("#{(age_carla_future + age_carla_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Carla's current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_carla_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_carla_future}.",
                                "Step 4: Adding both equations: 2x = ${age_carla_future} + ${age_carla_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_carla_future + age_carla_past + years_past - years_future) / 2}.",
                                "Step 6: Carla's current age is #{(age_carla_future + age_carla_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("If ${years_past} years ago, Luis was ${age_luis_past} years old and in ${years_future} years he will be ${age_luis_future} years old, what is his current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_luis_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_luis_future", new Range(20, 70))
                        ))
                        .tip("Use the information about his age in the past and in the future to set up an equation and find the current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_luis_past}",
                                "Current age + ${years_future} = ${age_luis_future}"
                        ))
                        .answer("#{(age_luis_future + age_luis_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Luis' current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_luis_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_luis_future}.",
                                "Step 4: Adding both equations: 2x = ${age_luis_future} + ${age_luis_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_luis_future + age_luis_past + years_past - years_future) / 2}.",
                                "Step 6: Luis' current age is #{(age_luis_future + age_luis_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Maria was ${age_maria_past} years old ${years_past} years ago and will be ${age_maria_future} years old in ${years_future} years. What is her current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_maria_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_maria_future", new Range(20, 70))
                        ))
                        .tip("Use the information about her age in the past and in the future to set up an equation and solve for her current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_maria_past}",
                                "Current age + ${years_future} = ${age_maria_future}"
                        ))
                        .answer("#{(age_maria_future + age_maria_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let María's current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_maria_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_maria_future}.",
                                "Step 4: Adding both equations: 2x = ${age_maria_future} + ${age_maria_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_maria_future + age_maria_past + years_past - years_future) / 2}.",
                                "Step 6: María's current age is #{(age_maria_future + age_maria_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Roberto was ${age_roberto_past} years old ${years_past} years ago and will be ${age_roberto_future} years old in ${years_future} years. What is his current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_roberto_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_roberto_future", new Range(20, 70))
                        ))
                        .tip("Set up an equation using the information about his past and future ages to solve for the current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_roberto_past}",
                                "Current age + ${years_future} = ${age_roberto_future}"
                        ))
                        .answer("#{(age_roberto_future + age_roberto_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Roberto's current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_roberto_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_roberto_future}.",
                                "Step 4: Adding both equations: 2x = ${age_roberto_future} + ${age_roberto_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_roberto_future + age_roberto_past + years_past - years_future) / 2}.",
                                "Step 6: Roberto's current age is #{(age_roberto_future + age_roberto_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("If Andrés was ${age_andres_past} years old ${years_past} years ago and will be ${age_andres_future} years old in ${years_future} years, what is his current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_andres_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_andres_future", new Range(20, 70))
                        ))
                        .tip("Use the information about his past and future ages to set up equations that help find the current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_andres_past}",
                                "Current age + ${years_future} = ${age_andres_future}"
                        ))
                        .answer("#{(age_andres_future + age_andres_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Andrés' current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_andres_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_andres_future}.",
                                "Step 4: Adding both equations: 2x = ${age_andres_future} + ${age_andres_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_andres_future + age_andres_past + years_past - years_future) / 2}.",
                                "Step 6: Andrés' current age is #{(age_andres_future + age_andres_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Javier was ${age_javier_past} years old ${years_past} years ago and in ${years_future} years will be ${age_javier_future} years old. What is his current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_javier_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_javier_future", new Range(20, 70))
                        ))
                        .tip("Use the information about his past and future ages to set up equations that help find the current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_javier_past}",
                                "Current age + ${years_future} = ${age_javier_future}"
                        ))
                        .answer("#{(age_javier_future + age_javier_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Javier's current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_javier_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_javier_future}.",
                                "Step 4: Adding both equations: 2x = ${age_javier_future} + ${age_javier_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_javier_future + age_javier_past + years_past - years_future) / 2}.",
                                "Step 6: Javier's current age is #{(age_javier_future + age_javier_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Andrés was ${age_andres_past} years old ${years_past} years ago and will be ${age_andres_future} years old in ${years_future} years. What is his current age?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_andres_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_andres_future", new Range(20, 70))
                        ))
                        .tip("Use the information about his past and future ages to set up equations that help find the current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_andres_past}",
                                "Current age + ${years_future} = ${age_andres_future}"
                        ))
                        .answer("#{(age_andres_future + age_andres_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Andrés' current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_andres_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_andres_future}.",
                                "Step 4: Adding both equations: 2x = ${age_andres_future} + ${age_andres_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_andres_future + age_andres_past + years_past - years_future) / 2}.",
                                "Step 6: Andrés' current age is #{(age_andres_future + age_andres_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("If ${years_past} years ago, Laura was ${age_laura_past} years old and in ${years_future} years she will be ${age_laura_future} years old, what is her current age?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_laura_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_laura_future", new Range(20, 70))
                        ))
                        .tip("Use the information about her past and future ages to set up equations that help find the current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_laura_past}",
                                "Current age + ${years_future} = ${age_laura_future}"
                        ))
                        .answer("#{(age_laura_future + age_laura_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Laura's current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_laura_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_laura_future}.",
                                "Step 4: Adding both equations: 2x = ${age_laura_future} + ${age_laura_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_laura_future + age_laura_past + years_past - years_future) / 2}.",
                                "Step 6: Laura's current age is #{(age_laura_future + age_laura_past + years_past - years_future) / 2} years."
                        ))
                        .build());
        topic8Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Roberto was ${age_roberto_past} years old ${years_past} years ago and will be ${age_roberto_future} years old in ${years_future} years. What is his current age?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_roberto_past", new Range(1, 50)),
                                new Variable("years_past", new Range(1, 10)),
                                new Variable("years_future", new Range(1, 10)),
                                new Variable("age_roberto_future", new Range(20, 70))
                        ))
                        .tip("Use the information about his past and future ages to set up equations that help find the current age.")
                        .preview(Arrays.asList(
                                "Current age - ${years_past} = ${age_roberto_past}",
                                "Current age + ${years_future} = ${age_roberto_future}"
                        ))
                        .answer("#{(age_roberto_future + age_roberto_past + years_past - years_future) / 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Let Roberto's current age = x.",
                                "Step 2: According to the problem, x - ${years_past} = ${age_roberto_past}.",
                                "Step 3: Also, x + ${years_future} = ${age_roberto_future}.",
                                "Step 4: Adding both equations: 2x = ${age_roberto_future} + ${age_roberto_past} + ${years_past} - ${years_future}.",
                                "Step 5: Divide both sides by 2 to find the current age: x = #{(age_roberto_future + age_roberto_past + years_past - years_future) / 2}.",
                                "Step 6: Roberto's current age is #{(age_roberto_future + age_roberto_past + years_past - years_future) / 2} years."
                        ))
                        .build());
    }
}
