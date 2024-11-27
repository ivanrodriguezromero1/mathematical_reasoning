package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic9Type3ProblemsBuilder {
    @Getter
    public static final List<Problem> topic9Type3ProblemsBuilder = new ArrayList<>();

    static {
        topic9Type3ProblemsBuilder.add(Problem.builder()
                .statement("A bus covers a distance of ${distance} km in ${time} hours. What is the bus's average speed?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("speed", new Range(50, 1000)),
                        new Variable("time", new Range(1, 24))
                ))
                .tip("To calculate the average speed, divide the total distance by the total travel time.")
                .preview(Arrays.asList(
                        "Speed = Distance / Time",
                        "Speed = ${distance} / ${time}"
                ))
                .answer("#{distance / time}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Use the formula to calculate speed: Speed = Distance / Time.",
                        "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                        "Step 3: Perform the division to get the average speed: Speed = #{distance / time}.",
                        "Step 4: The bus's average speed is #{distance / time} km/h."
                ))
                .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies ${distance} km in ${time} hours. What is the average speed of the airplane?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed", new Range(100, 10000)),
                                new Variable("time", new Range(1, 15))
                        ))
                        .tip("To calculate the average speed, divide the total distance by the total flight time.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate speed: Speed = Distance / Time.",
                                "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the division to get the average speed: Speed = #{distance / time}.",
                                "Step 4: The average speed of the airplane is #{distance / time} km/h."
                        ))
                        .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A motorcyclist travels ${distance} km in ${time} hours. What is their average speed?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("distance", new Range(10, 500)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the average speed, divide the total distance by the total travel time.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate speed: Speed = Distance / Time.",
                                "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the division to get the average speed: Speed = #{distance / time}.",
                                "Step 4: The motorcyclist's average speed is #{distance / time} km/h."
                        ))
                        .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A runner covers a distance of ${distance} km in ${time} hours. What is their average speed?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("distance", new Range(1, 100)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the average speed, divide the total distance by the total time taken.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate speed: Speed = Distance / Time.",
                                "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the division to get the average speed: Speed = #{distance / time}.",
                                "Step 4: The runner's average speed is #{distance / time} km/h."
                        ))
                        .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A cyclist covers ${distance} km in ${time} hours and then reduces their speed by 30%. What was their average speed before the reduction?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("distance", new Range(1, 100)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the average speed before the reduction, divide the total distance by the travel time.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate speed: Speed = Distance / Time.",
                                "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the division to get the average speed: Speed = #{distance / time}.",
                                "Step 4: The cyclist's average speed before the reduction was #{distance / time} km/h."
                        ))
                        .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies ${distance} km in ${time} hours and then reduces its speed by 40%. What was its average speed before the reduction?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("distance", new Range(100, 5000)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To find the average speed before the reduction, divide the total distance by the flight time before the reduction.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate average speed: Speed = Distance / Time.",
                                "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the division to get the average speed before the reduction: Speed = #{distance / time}.",
                                "Step 4: The airplane's average speed before the reduction was #{distance / time} km/h."
                        ))
                        .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A train covers ${distance} km in ${time} hours, stops for an hour, and then resumes its journey at the same speed. What was its average speed before the stop?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("distance", new Range(50, 1000)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the average speed before the stop, divide the distance covered by the travel time before the stop.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula to calculate average speed: Speed = Distance / Time.",
                                "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the division to get the average speed before the stop: Speed = #{distance / time}.",
                                "Step 4: The train's average speed before the stop was #{distance / time} km/h."
                        ))
                        .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A cyclist covers ${distance} km in ${time} hours, takes a 30-minute break, and then continues at the same speed. What was their average speed before the break?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("distance", new Range(50, 200)),
                                new Variable("time", new Range(1, 5))
                        ))
                        .tip("To find the average speed before the break, divide the distance covered by the travel time before the pause.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for average speed: Speed = Distance / Time.",
                                "Step 2: Substitute the distance and time values into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the division to obtain the average speed before the break: Speed = #{distance / time}.",
                                "Step 4: The cyclist's average speed before the break was #{distance / time} km/h."
                        ))
                        .build());
        topic9Type3ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies ${distance} km in ${time} hours and then reduces its speed by 30%, traveling for 2 more hours. What was its average speed before the reduction?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("distance", new Range(500, 5000)),
                                new Variable("time", new Range(1, 10))
                        ))
                        .tip("To calculate the average speed before the reduction, divide the distance covered by the initial flight time.")
                        .preview(Arrays.asList(
                                "Speed = Distance / Time",
                                "Speed = ${distance} / ${time}"
                        ))
                        .answer("#{distance / time}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Use the formula for average speed: Speed = Distance / Time.",
                                "Step 2: Substitute the values for distance and time into the formula: Speed = ${distance} / ${time}.",
                                "Step 3: Perform the calculation to get the average speed before the reduction: Speed = #{distance / time}.",
                                "Step 4: The airplane's average speed before reducing its speed was #{distance / time} km/h."
                        ))
                        .build());
    }
}
