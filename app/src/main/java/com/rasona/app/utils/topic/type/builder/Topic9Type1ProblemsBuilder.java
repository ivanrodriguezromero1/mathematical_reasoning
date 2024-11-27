package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic9Type1ProblemsBuilder {
    @Getter
    public static final List<Problem> topic9Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic9Type1ProblemsBuilder.add(Problem.builder()
                .statement("A bus travels at a constant speed of ${speed} km/h for ${time} hours. What is the total distance traveled?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("speed", new Range(40, 120)),
                        new Variable("time", new Range(1, 10))
                ))
                .tip("To calculate the total distance traveled, multiply the speed by the travel time.")
                .preview(Arrays.asList(
                        "Distance = speed * time",
                        "Distance = ${speed} * ${time}"
                ))
                .answer("#{speed * time}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Bus speed = ${speed} km/h.",
                        "Step 2: Travel time = ${time} hours.",
                        "Step 3: Apply the formula for distance: distance = speed * time.",
                        "Step 4: Substitute the values: distance = ${speed} * ${time}.",
                        "Step 5: Calculate the distance: #{speed * time}.",
                        "Step 6: The total distance traveled is #{speed * time} km."
                ))
                .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed} km/h for ${time} hours. What distance does it cover?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(500, 900)),
                                new Variable("time", new Range(1, 15))
                        ))
                        .tip("To calculate the distance covered, multiply the speed by the flight time.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Airplane speed = ${speed} km/h.",
                                "Step 2: Flight time = ${time} hours.",
                                "Step 3: Use the formula to calculate the distance: distance = speed * time.",
                                "Step 4: Substitute the values: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance: #{speed * time}.",
                                "Step 6: The total distance traveled by the airplane is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A motorcyclist travels at a constant speed of ${speed} km/h for ${time} hours. How many kilometers does he cover?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(40, 120)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the distance covered, multiply the speed by the travel time.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Motorcyclist speed = ${speed} km/h.",
                                "Step 2: Travel time = ${time} hours.",
                                "Step 3: Use the formula for distance: distance = speed * time.",
                                "Step 4: Substitute the values: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance: #{speed * time}.",
                                "Step 6: The total distance covered by the motorcyclist is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A runner maintains a speed of ${speed} km/h for ${time} hours. What is the distance covered?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(5, 20)),
                                new Variable("time", new Range(1, 5))
                        ))
                        .tip("To calculate the distance covered, multiply the speed by the time.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Runner's speed = ${speed} km/h.",
                                "Step 2: Running time = ${time} hours.",
                                "Step 3: Use the formula to calculate the distance: distance = speed * time.",
                                "Step 4: Substitute the values: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance: #{speed * time}.",
                                "Step 6: The total distance covered by the runner is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A bus travels at ${speed} km/h for ${time} hours and then stops for an hour. What is the distance traveled before stopping?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(40, 20)),
                                new Variable("time", new Range(1, 5))
                        ))
                        .tip("To calculate the distance traveled, multiply the speed by the travel time before the stop.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Bus speed = ${speed} km/h.",
                                "Step 2: Travel time before stopping = ${time} hours.",
                                "Step 3: Use the formula for distance: distance = speed * time.",
                                "Step 4: Substitute the values: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance traveled: #{speed * time}.",
                                "Step 6: The distance traveled by the bus before stopping is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed} km/h for ${time} hours and then reduces its speed by 40%. What distance is covered before the speed reduction?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(200, 900)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the distance covered before the speed reduction, multiply the initial speed by the flight time.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Initial speed of the airplane = ${speed} km/h.",
                                "Step 2: Flight time before the speed reduction = ${time} hours.",
                                "Step 3: Use the formula for distance: distance = speed * time.",
                                "Step 4: Substitute the values: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance: #{speed * time}.",
                                "Step 6: The distance covered by the airplane before the speed reduction is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A motorcyclist travels at ${speed} km/h for ${time} hours and then takes a two-hour break. How many kilometers does he cover before the break?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(50, 200)),
                                new Variable("time", new Range(1, 8))
                        ))
                        .tip("To calculate the distance covered before the break, multiply the speed by the travel time before stopping.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Motorcyclist speed = ${speed} km/h.",
                                "Step 2: Travel time before the break = ${time} hours.",
                                "Step 3: Use the formula for distance: distance = speed * time.",
                                "Step 4: Substitute the values: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance covered before the break: #{speed * time}.",
                                "Step 6: The total distance covered by the motorcyclist before the break is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A train travels at ${speed} km/h for ${time} hours, stops for an hour, and then resumes travel at the same speed. What is the distance covered before the stop?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(60, 150)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the distance covered before the stop, multiply the speed by the travel time before the stop.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Train speed = ${speed} km/h.",
                                "Step 2: Travel time before the stop = ${time} hours.",
                                "Step 3: Use the formula for distance: distance = speed * time.",
                                "Step 4: Substitute the values in the formula: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance covered before the stop: #{speed * time}.",
                                "Step 6: The total distance covered by the train before the stop is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A cyclist pedals at ${speed} km/h for ${time} hours, takes a 30-minute break, and then continues at the same speed. What is the distance covered before the break?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(10, 40)),
                                new Variable("time", new Range(1, 5))
                        ))
                        .tip("To calculate the distance covered before the break, multiply the speed by the travel time before the pause.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Cyclist's speed = ${speed} km/h.",
                                "Step 2: Pedaling time before the break = ${time} hours.",
                                "Step 3: Use the formula for distance: distance = speed * time.",
                                "Step 4: Substitute the values in the formula: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance covered before the break: #{speed * time}.",
                                "Step 6: The total distance covered by the cyclist before the break is #{speed * time} km."
                        ))
                        .build());
        topic9Type1ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed} km/h for ${time} hours and then reduces its speed by 30%, traveling for 2 more hours. What is the distance covered before the speed reduction?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(500, 900)),
                                new Variable("time", new Range(1, 8))
                        ))
                        .tip("To calculate the distance before the speed reduction, multiply the initial speed by the flight time before the speed change.")
                        .preview(Arrays.asList(
                                "Distance = speed * time",
                                "Distance = ${speed} * ${time}"
                        ))
                        .answer("#{speed * time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Initial speed of the airplane = ${speed} km/h.",
                                "Step 2: Flight time at the initial speed = ${time} hours.",
                                "Step 3: Use the formula for distance: distance = speed * time.",
                                "Step 4: Substitute the values in the formula: distance = ${speed} * ${time}.",
                                "Step 5: Calculate the distance covered before the speed reduction: #{speed * time}.",
                                "Step 6: The total distance covered by the airplane before the speed reduction is #{speed * time} km."
                        ))
                        .build());
    }
}
