package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic9Type2ProblemsBuilder {
    @Getter
    public static final List<Problem> topic9Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic9Type2ProblemsBuilder.add(Problem.builder()
                .statement("A bus moves at a constant speed of ${speed} km/h to cover ${distance} km. How long does it take to reach its destination?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("speed", new Range(20, 120)),
                        new Variable("distance", new Range(50, 1000))
                ))
                .tip("Remember that time is equal to distance divided by speed.")
                .preview(Arrays.asList(
                        "Time = Distance / Speed",
                        "Time = ${distance} / ${speed}"
                ))
                .answer("#{distance / speed}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: The formula to calculate time is Time = Distance / Speed.",
                        "Step 2: Substitute the values: Time = ${distance} / ${speed}.",
                        "Step 3: Calculate the result: Time = #{distance / speed}.",
                        "Step 4: The time it takes to reach the destination is #{distance / speed} hours."
                ))
                .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed} km/h to cover a distance of ${distance} km. How long does it take to complete the flight?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(200, 900)),
                                new Variable("distance", new Range(500, 10000))
                        ))
                        .tip("Remember that time is equal to distance divided by speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The formula to calculate time is Time = Distance / Speed.",
                                "Step 2: Substitute the values: Time = ${distance} / ${speed}.",
                                "Step 3: Calculate the result: Time = #{distance / speed}.",
                                "Step 4: The time required to complete the flight is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A motorcyclist travels at ${speed} km/h and needs to cover a distance of ${distance} km. How long will it take to cover the distance?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(40, 200)),
                                new Variable("distance", new Range(50, 1000))
                        ))
                        .tip("Remember that time is equal to distance divided by speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The formula to calculate time is Time = Distance / Speed.",
                                "Step 2: Substitute the values: Time = ${distance} / ${speed}.",
                                "Step 3: Calculate the result: Time = #{distance / speed}.",
                                "Step 4: The time required to cover the distance is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A runner maintains a speed of ${speed} km/h while covering a distance of ${distance} km. How long does it take to complete the race?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(8, 25)),
                                new Variable("distance", new Range(1, 42))
                        ))
                        .tip("To calculate time, divide the distance by the speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The formula to calculate time is Time = Distance / Speed.",
                                "Step 2: Substitute the values: Time = ${distance} / ${speed}.",
                                "Step 3: Calculate the result: Time = #{distance / speed}.",
                                "Step 4: The time required to complete the race is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A bus moves at ${speed} km/h to cover ${distance} km before stopping for an hour. How long does it take to cover the distance before the stop?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(40, 120)),
                                new Variable("distance", new Range(50, 300))
                        ))
                        .tip("To calculate time, divide the distance by the speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The formula to calculate time is Time = Distance / Speed.",
                                "Step 2: Substitute the values: Time = ${distance} / ${speed}.",
                                "Step 3: Perform the division to find the time: Time = #{distance / speed}.",
                                "Step 4: The time required to cover the distance before the stop is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed} km/h to cover ${distance} km before reducing its speed by 30%. How long does it take before the speed reduction?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(200, 900)),
                                new Variable("distance", new Range(100, 3000))
                        ))
                        .tip("To calculate time, divide the distance by the speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The formula to calculate time is Time = Distance / Speed.",
                                "Step 2: Substitute the values in the formula: Time = ${distance} / ${speed}.",
                                "Step 3: Perform the division to find the time: Time = #{distance / speed}.",
                                "Step 4: The time required to cover the distance before the speed reduction is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A motorcyclist travels at ${speed} km/h to cover ${distance} km before taking a two-hour break. How long does it take to reach the break point?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(50, 150)),
                                new Variable("distance", new Range(100, 1000))
                        ))
                        .tip("To calculate time, divide the distance by the speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The formula to calculate time is Time = Distance / Speed.",
                                "Step 2: Substitute the values in the formula: Time = ${distance} / ${speed}.",
                                "Step 3: Perform the division to find the time: Time = #{distance / speed}.",
                                "Step 4: The time required to reach the break point is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A train moves at ${speed} km/h to cover ${distance} km before stopping for an hour and then resuming the journey. How long does it take to cover the distance before the stop?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(60, 200)),
                                new Variable("distance", new Range(100, 1500))
                        ))
                        .tip("To find the time, divide the distance by the speed of the train.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: The formula to calculate time is Time = Distance / Speed.",
                                "Step 2: Substitute the distance and speed values: Time = ${distance} / ${speed}.",
                                "Step 3: Perform the division to find the time: Time = #{distance / speed}.",
                                "Step 4: The time required to cover ${distance} km before the stop is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A cyclist pedals at ${speed} km/h to cover ${distance} km before taking a 30-minute break. How long does it take to reach the break point?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(10, 40)),
                                new Variable("distance", new Range(10, 200))
                        ))
                        .tip("To find the time it takes to reach the break point, divide the distance by the cyclist's speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate time: Time = Distance / Speed.",
                                "Step 2: Substitute the distance and speed values in the formula: Time = ${distance} / ${speed}.",
                                "Step 3: Perform the division to get the travel time: Time = #{distance / speed}.",
                                "Step 4: The time it takes for the cyclist to reach the break point is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed} km/h to cover ${distance} km before reducing its speed by 40% and then flying for 2 more hours. How long does it take to cover the distance before the speed reduction?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(300, 900)),
                                new Variable("distance", new Range(100, 5000))
                        ))
                        .tip("To find the required time before the speed reduction, divide the distance by the airplane's speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate time: Time = Distance / Speed.",
                                "Step 2: Substitute the distance and speed values in the formula: Time = ${distance} / ${speed}.",
                                "Step 3: Perform the division to get the travel time before the speed reduction: Time = #{distance / speed}.",
                                "Step 4: The time it takes for the airplane to cover the distance before the speed reduction is #{distance / speed} hours."
                        ))
                        .build());
        topic9Type2ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed} km/h to cover ${distance} km before reducing its speed by 40% and then flying for 2 more hours. How long does it take to cover the distance before the speed reduction?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(300, 900)),
                                new Variable("distance", new Range(100, 5000))
                        ))
                        .tip("To find the required time before the speed reduction, divide the distance by the airplane's speed.")
                        .preview(Arrays.asList(
                                "Time = Distance / Speed",
                                "Time = ${distance} / ${speed}"
                        ))
                        .answer("#{distance / speed}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate time: Time = Distance / Speed.",
                                "Step 2: Substitute the distance and speed values in the formula: Time = ${distance} / ${speed}.",
                                "Step 3: Perform the division to get the travel time before the speed reduction: Time = #{distance / speed}.",
                                "Step 4: The time it takes for the airplane to cover the distance before the speed reduction is #{distance / speed} hours."
                        ))
                        .build());
    }
}
