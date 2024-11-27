package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic8Type1ProblemsBuilder {
    @Getter
    public static final List<Problem> topic8Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic8Type1ProblemsBuilder.add(Problem.builder()
                .statement("Carla is ${age_carla} years old and her cousin is ${age_primo} years old. How old will Carla be when her cousin reaches Carla's current age?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("age_carla", new Range(10, 50)),
                        new Variable("age_primo", new Range(5, 45))

                ))
                .tip("Find the age difference between Carla and her cousin to determine how many years it will take for her cousin to reach Carla's current age.")
                .preview(Arrays.asList(
                        "Carla's current age = ${age_carla}",
                        "Cousin's current age = ${age_primo}",
                        "Age difference = ${age_carla} - ${age_primo}"
                ))
                .answer("#{age_carla + (age_carla - age_primo)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Carla's current age = ${age_carla}.",
                        "Step 2: Cousin's current age = ${age_primo}.",
                        "Step 3: Calculate the age difference between Carla and her cousin: ${age_carla} - ${age_primo} = #{age_carla - age_primo}.",
                        "Step 4: This difference represents the years until her cousin reaches Carla's current age.",
                        "Step 5: Calculate Carla's age at that time: ${age_carla} + #{age_carla - age_primo}.",
                        "Step 6: The result is that Carla will be #{age_carla + (age_carla - age_primo)} years old when her cousin reaches Carla's current age."
                ))
                .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Luis is ${age_luis} years old and his mother is ${age_madre} years old. How old will Luis be when his mother is three times Luis' current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_luis", new Range(5, 20)),
                                new Variable("age_primo", new Range(40, 60))
                        ))
                        .tip("Find how many years it will take for Luis' mother to be three times Luis' current age, and add that number to Luis' current age.")
                        .preview(Arrays.asList(
                                "Luis' current age = ${age_luis}",
                                "Mother's current age = ${age_madre}",
                                "Triple of Luis' current age = #{3 * age_luis}"
                        ))
                        .answer("#{age_luis + (3 * age_luis - age_madre)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Luis' current age = ${age_luis}.",
                                "Step 2: Mother's current age = ${age_madre}.",
                                "Step 3: Calculate three times Luis' current age: 3 * ${age_luis} = #{3 * age_luis}.",
                                "Step 4: Find how many years it will take for the mother to reach this age: #{3 * age_luis} - ${age_madre} = #{3 * age_luis - age_madre}.",
                                "Step 5: Add this number to Luis' current age: ${age_luis} + #{3 * age_luis - age_madre}.",
                                "Step 6: The result is that Luis will be #{age_luis + (3 * age_luis - age_madre)} years old when his mother is three times his current age."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("If Laura is ${age_laura} years old and her sister is ${age_hermana} years old, how old will Laura be when her sister reaches Laura's current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_laura", new Range(5, 20)),
                                new Variable("age_hermana", new Range(1, 18))
                        ))
                        .tip("Calculate the age difference between Laura and her sister, and add that number to Laura's current age to get the result.")
                        .preview(Arrays.asList(
                                "Laura's current age = ${age_laura}",
                                "Sister's current age = ${age_hermana}",
                                "Age difference between Laura and her sister = #{age_laura - age_hermana}"
                        ))
                        .answer("#{age_laura + (age_laura - age_hermana)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Laura's current age = ${age_laura}.",
                                "Step 2: Sister's current age = ${age_hermana}.",
                                "Step 3: Calculate the age difference between Laura and her sister: ${age_laura} - ${age_hermana} = #{age_laura - age_hermana}.",
                                "Step 4: Add this difference to Laura's current age: ${age_laura} + #{age_laura - age_hermana}.",
                                "Step 5: The result is that Laura will be #{age_laura + (age_laura - age_hermana)} years old when her sister reaches Laura's current age."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Pedro is ${age_pedro} years old and his father is ${age_padre} years old. How old will Pedro be when his father is twice Pedro's current age?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("age_pedro", new Range(5, 20)),
                                new Variable("age_padre", new Range(40, 60))
                        ))
                        .tip("Calculate how many years must pass for Pedro's father to reach twice Pedro's current age.")
                        .preview(Arrays.asList(
                                "Pedro's current age = ${age_pedro}",
                                "Father's current age = ${age_padre}",
                                "Goal: Father's age = 2 * ${age_pedro} = #{2 * age_pedro}"
                        ))
                        .answer("#{age_pedro + (2 * age_pedro - age_padre)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Pedro's current age = ${age_pedro}.",
                                "Step 2: Father's current age = ${age_padre}.",
                                "Step 3: Determine the target age for the father: 2 * ${age_pedro} = #{2 * age_pedro}.",
                                "Step 4: Calculate how many years must pass for the father to reach this age: #{2 * age_pedro} - ${age_padre} = #{2 * age_pedro - age_padre}.",
                                "Step 5: Add this time to Pedro's current age: ${age_pedro} + #{2 * age_pedro - age_padre}.",
                                "Step 6: The result is that Pedro will be #{age_pedro + (2 * age_pedro - age_padre)} years old when his father is twice Pedro's current age."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Sofía is ${age_sofia} years old and her brother is ${age_hermano} years old. How old will Sofía be when her brother is twice Sofía's current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_sofia", new Range(5, 20)),
                                new Variable("age_hermano", new Range(10, 30))
                        ))
                        .tip("Calculate how many years must pass for Sofía's brother to reach twice Sofía's current age.")
                        .preview(Arrays.asList(
                                "Sofía's current age = ${age_sofia}",
                                "Brother's current age = ${age_hermano}",
                                "Goal: Brother's age = 2 * ${age_sofia} = #{2 * age_sofia}"
                        ))
                        .answer("#{age_sofia + (2 * age_sofia - age_hermano)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Sofía's current age = ${age_sofia}.",
                                "Step 2: Brother's current age = ${age_hermano}.",
                                "Step 3: Determine the target age for the brother: 2 * ${age_sofia} = #{2 * age_sofia}.",
                                "Step 4: Calculate how many years must pass for the brother to reach this age: #{2 * age_sofia} - ${age_hermano} = #{2 * age_sofia - age_hermano}.",
                                "Step 5: Add this time to Sofía's current age: ${age_sofia} + #{2 * age_sofia - age_hermano}.",
                                "Step 6: The result is that Sofía will be #{age_sofia + (2 * age_sofia - age_hermano)} years old when her brother is twice her current age."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Clara is ${age_clara} years old and her mother is ${age_madre} years old. How old will Clara be when her mother is three times Clara's current age?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_clara", new Range(5, 20)),
                                new Variable("age_madre", new Range(40, 50))
                        ))
                        .tip("Calculate how many years must pass for Clara's mother to reach three times Clara's current age.")
                        .preview(Arrays.asList(
                                "Clara's current age = ${age_clara}",
                                "Mother's current age = ${age_madre}",
                                "Goal: Mother's age = 3 * ${age_clara} = #{3 * age_clara}"
                        ))
                        .answer("#{age_clara + (3 * age_clara - age_madre)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Clara's current age = ${age_clara}.",
                                "Step 2: Mother's current age = ${age_madre}.",
                                "Step 3: Determine the target age for the mother: 3 * ${age_clara} = #{3 * age_clara}.",
                                "Step 4: Calculate how many years must pass for the mother to reach this age: #{3 * age_clara} - ${age_madre} = #{3 * age_clara - age_madre}.",
                                "Step 5: Add this time to Clara's current age: ${age_clara} + #{3 * age_clara - age_madre}.",
                                "Step 6: The result is that Clara will be #{age_clara + (3 * age_clara - age_madre)} years old when her mother is three times Clara's current age."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Pablo is ${age_pablo} years old and his sister is ${age_hermana} years old. How old will Pablo be when his sister is twice the age Pablo was ${years_past} years ago?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("age_pablo", new Range(5, 20)),
                                new Variable("age_hermana", new Range(5, 20)),
                                new Variable("years_past", new Range(1, 10))
                        ))
                        .tip("Calculate Pablo's age ${years_past} years ago and then double that value to know when his sister will reach that age.")
                        .preview(Arrays.asList(
                                "Pablo's current age = ${age_pablo}",
                                "Pablo's age ${years_past} years ago = ${age_pablo} - ${years_past} = #{age_pablo - years_past}",
                                "Goal: Sister's age = 2 * #{age_pablo - years_past}"
                        ))
                        .answer("#{age_pablo + (2 * (age_pablo - years_past) - age_hermana)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Pablo's current age = ${age_pablo}.",
                                "Step 2: Pablo's sister's current age = ${age_hermana}.",
                                "Step 3: Calculate Pablo's age ${years_past} years ago: ${age_pablo} - ${years_past} = #{age_pablo - years_past}.",
                                "Step 4: Calculate twice the age Pablo was ${years_past} years ago: 2 * #{age_pablo - years_past} = #{2 * (age_pablo - years_past)}.",
                                "Step 5: Determine how many years must pass for the sister to reach that age: #{2 * (age_pablo - years_past)} - ${age_hermana} = #{2 * (age_pablo - years_past) - age_hermana}.",
                                "Step 6: Add this time to Pablo's current age: ${age_pablo} + #{2 * (age_pablo - years_past) - age_hermana}.",
                                "Step 7: The result is that Pablo will be #{age_pablo + (2 * (age_pablo - years_past) - age_hermana)} years old when his sister is twice the age he was ${years_past} years ago."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Carla's current age is ${age_carla} years and her brother is ${age_hermano} years old. How old will Carla be when her brother is three times the age Carla was ${years_past} years ago?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_carla", new Range(5, 20)),
                                new Variable("age_hermano", new Range(5, 20)),
                                new Variable("years_past", new Range(1, 10))
                        ))
                        .tip("Calculate Carla's age ${years_past} years ago and then triple that value to find when her brother reaches that age.")
                        .preview(Arrays.asList(
                                "Carla's current age = ${age_carla}",
                                "Carla's age ${years_past} years ago = ${age_carla} - ${years_past} = #{age_carla - years_past}",
                                "Goal: Brother's age = 3 * #{age_carla - years_past}"
                        ))
                        .answer("#{age_carla + (3 * (age_carla - years_past) - age_hermano)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Carla's current age = ${age_carla}.",
                                "Step 2: Carla's brother's current age = ${age_hermano}.",
                                "Step 3: Calculate Carla's age ${years_past} years ago: ${age_carla} - ${years_past} = #{age_carla - years_past}.",
                                "Step 4: Calculate three times the age Carla was ${years_past} years ago: 3 * #{age_carla - years_past} = #{3 * (age_carla - years_past)}.",
                                "Step 5: Determine how many years must pass for the brother to reach that age: #{3 * (age_carla - years_past)} - ${age_hermano} = #{3 * (age_carla - years_past) - age_hermano}.",
                                "Step 6: Add this time to Carla's current age: ${age_carla} + #{3 * (age_carla - years_past) - age_hermano}.",
                                "Step 7: The result is that Carla will be #{age_carla + (3 * (age_carla - years_past) - age_hermano)} years old when her brother is three times the age she was ${years_past} years ago."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("Javier's age is ${age_javier} years and his sister is ${age_hermana} years old. How old will Javier be when his sister is twice the age Javier was ${years_past} years ago?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_javier", new Range(5, 20)),
                                new Variable("age_hermana", new Range(5, 20)),
                                new Variable("years_past", new Range(1, 10))
                        ))
                        .tip("First calculate Javier's age ${years_past} years ago, then double that value to find his sister's target age.")
                        .preview(Arrays.asList(
                                "Javier's current age = ${age_javier}",
                                "Javier's age ${years_past} years ago = ${age_javier} - ${years_past} = #{age_javier - years_past}",
                                "Goal: Sister's age = 2 * #{age_javier - years_past}"
                        ))
                        .answer("#{age_javier + (2 * (age_javier - years_past) - age_hermana)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Javier's current age = ${age_javier}.",
                                "Step 2: Javier's sister's current age = ${age_hermana}.",
                                "Step 3: Calculate Javier's age ${years_past} years ago: ${age_javier} - ${years_past} = #{age_javier - years_past}.",
                                "Step 4: Calculate twice the age Javier was ${years_past} years ago: 2 * #{age_javier - years_past} = #{2 * (age_javier - years_past)}.",
                                "Step 5: Determine how many years must pass for the sister to reach that age: #{2 * (age_javier - years_past)} - ${age_hermana} = #{2 * (age_javier - years_past) - age_hermana}.",
                                "Step 6: Add this time to Javier's current age: ${age_javier} + #{2 * (age_javier - years_past) - age_hermana}.",
                                "Step 7: The result is that Javier will be #{age_javier + (2 * (age_javier - years_past) - age_hermana)} years old when his sister is twice the age he was ${years_past} years ago."
                        ))
                        .build());
        topic8Type1ProblemsBuilder.add(Problem.builder()
                        .statement("If Andrés is ${age_andres} years old and his grandfather is ${age_abuelo} years old, how old will Andrés be when his grandfather is four times Andrés' current age?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("age_andres", new Range(5, 20)),
                                new Variable("age_abuelo", new Range(6, 100))
                        ))
                        .tip("First calculate what four times Andrés' current age would be, then determine how many years must pass for his grandfather to reach that age.")
                        .preview(Arrays.asList(
                                "Andrés' current age = ${age_andres}",
                                "Four times Andrés' age = 4 * ${age_andres} = #{4 * age_andres}"
                        ))
                        .answer("#{age_andres + (4 * age_andres - age_abuelo)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Andrés' current age = ${age_andres}.",
                                "Step 2: Andrés' grandfather's current age = ${age_abuelo}.",
                                "Step 3: Calculate four times Andrés' current age: 4 * ${age_andres} = #{4 * age_andres}.",
                                "Step 4: Determine how many years must pass for the grandfather to reach this age: #{4 * age_andres} - ${age_abuelo} = #{4 * age_andres - age_abuelo}.",
                                "Step 5: Add this time to Andrés' current age: ${age_andres} + #{4 * age_andres - age_abuelo}.",
                                "Step 6: The result is that Andrés will be #{age_andres + (4 * age_andres - age_abuelo)} years old when his grandfather is four times Andrés' current age."
                        ))
                        .build());
    }
}
