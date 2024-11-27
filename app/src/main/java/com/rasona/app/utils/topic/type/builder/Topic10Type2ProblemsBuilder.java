package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic10Type2ProblemsBuilder {
    @Getter
    public static final List<Problem> topic10Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic10Type2ProblemsBuilder.add(Problem.builder()
                .statement("Two buses leave from opposite points and travel towards each other. The first bus travels at ${speed1} km/h and the second at ${speed2} km/h. If the initial distance between them is ${distance} km, how long will it take for them to meet?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("speed1", new Range(40, 100)),
                        new Variable("speed2", new Range(40, 100)),
                        new Variable("distance", new Range(100, 500))
                ))
                .tip("To calculate the time it takes for them to meet, add the speeds of both buses and divide the distance by this sum.")
                .preview(Arrays.asList(
                        "Total speed = ${speed1} + ${speed2}",
                        "Time = ${distance} / (#{speed1 + speed2})"
                ))
                .answer("#{distance / (speed1 + speed2)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Calculate the total speed by adding the speeds of both buses.",
                        "Step 2: Substitute the speeds into the formula: Total speed = ${speed1} + ${speed2}.",
                        "Step 3: Perform the addition to find the total speed: #{speed1 + speed2} km/h.",
                        "Step 4: Calculate the time by dividing the initial distance by the total speed.",
                        "Step 5: Substitute the distance and total speed into the formula: Time = ${distance} / #{speed1 + speed2}.",
                        "Step 6: Perform the division to find the time: #{distance / (speed1 + speed2)} hours.",
                        "Step 7: The time it will take for the buses to meet is #{distance / (speed1 + speed2)} hours."
                ))
                .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two airplanes leave from opposite airports and fly towards each other. The first airplane flies at ${speed1} km/h and the second at ${speed2} km/h. If the initial distance between the airports is ${distance} km, how long will it take for them to meet?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(500, 900)),
                                new Variable("speed2", new Range(500, 900)),
                                new Variable("distance", new Range(1000, 5000))
                        ))
                        .tip("To calculate the time it takes for them to meet, add the speeds of both airplanes and divide the distance by this sum.")
                        .preview(Arrays.asList(
                                "Total speed = ${speed1} + ${speed2}",
                                "Time = ${distance} / (#{speed1 + speed2})"
                        ))
                        .answer("#{distance / (speed1 + speed2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the total speed by adding the speeds of both airplanes.",
                                "Step 2: Substitute the speeds into the formula: Total speed = ${speed1} + ${speed2}.",
                                "Step 3: Perform the addition to find the total speed: #{speed1 + speed2} km/h.",
                                "Step 4: Calculate the time by dividing the initial distance by the total speed.",
                                "Step 5: Substitute the distance and total speed into the formula: Time = ${distance} / #{speed1 + speed2}.",
                                "Step 6: Perform the division to find the time: #{distance / (speed1 + speed2)} hours.",
                                "Step 7: The time it will take for the airplanes to meet is #{distance / (speed1 + speed2)} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two motorcyclists leave from opposite points and head towards each other. The first motorcyclist travels at ${speed1} km/h and the second at ${speed2} km/h. If the initial distance between them is ${distance} km, how long will it take for them to meet?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(40, 120)),
                                new Variable("speed2", new Range(40, 120)),
                                new Variable("distance", new Range(50, 300))
                        ))
                        .tip("To find the time it takes for them to meet, add the speeds of both motorcyclists and divide the distance by this sum.")
                        .preview(Arrays.asList(
                                "Total speed = ${speed1} + ${speed2}",
                                "Time = ${distance} / (#{speed1 + speed2})"
                        ))
                        .answer("#{distance / (speed1 + speed2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the total speed by adding the speeds of both motorcyclists.",
                                "Step 2: Substitute the speeds into the formula: Total speed = ${speed1} + ${speed2}.",
                                "Step 3: Perform the addition to find the total speed: #{speed1 + speed2} km/h.",
                                "Step 4: Calculate the time by dividing the initial distance by the total speed.",
                                "Step 5: Substitute the distance and total speed into the formula: Time = ${distance} / #{speed1 + speed2}.",
                                "Step 6: Perform the division to find the time: #{distance / (speed1 + speed2)} hours.",
                                "Step 7: The time it will take for the motorcyclists to meet is #{distance / (speed1 + speed2)} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two ships sail from opposite ports and head towards each other. The first ship moves at ${speed1} km/h and the second at ${speed2} km/h. If the initial distance between the ports is ${distance} km, how long will it take for them to meet?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(10, 50)),
                                new Variable("speed2", new Range(10, 50)),
                                new Variable("distance", new Range(50, 500))
                        ))
                        .tip("To find the time it takes for them to meet, add the speeds of both ships and divide the distance by this sum.")
                        .preview(Arrays.asList(
                                "Total speed = ${speed1} + ${speed2}",
                                "Time = ${distance} / (#{speed1 + speed2})"
                        ))
                        .answer("#{distance / (speed1 + speed2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the total speed by adding the speeds of both ships.",
                                "Step 2: Substitute the speeds into the formula: Total speed = ${speed1} + ${speed2}.",
                                "Step 3: Perform the addition to find the total speed: #{speed1 + speed2} km/h.",
                                "Step 4: Calculate the time by dividing the initial distance by the total speed.",
                                "Step 5: Substitute the distance and total speed into the formula: Time = ${distance} / #{speed1 + speed2}.",
                                "Step 6: Perform the division to find the time: #{distance / (speed1 + speed2)} hours.",
                                "Step 7: The time it will take for the ships to meet is #{distance / (speed1 + speed2)} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two buses leave from opposite points at ${speed1} km/h and ${speed2} km/h, but one of them increases its speed by 25% after 2 hours. If the initial distance is ${distance} km, how long will it take for them to meet?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(10, 50)),
                                new Variable("speed2", new Range(10, 50)),
                                new Variable("distance", new Range(100, 1000))
                        ))
                        .tip("Calculate the distance traveled in the first 2 hours at the original speeds. Then adjust the speed of one of the buses and continue the calculation.")
                        .preview(Arrays.asList(
                                "Adjusted speed of the second bus = ${speed2} * 1.25",
                                "Total time = (remaining distance) / (#{speed1} + adjusted speed)"
                        ))
                        .answer("#{(distance - (2 * (speed1 + speed2))) / (speed1 + (speed2 * 1.25)) + 2}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled in the first 2 hours using the initial speeds.",
                                "Step 2: Distance traveled in 2 hours = 2 * (${speed1} + ${speed2}) = #{2 * (speed1 + speed2)} km.",
                                "Step 3: Subtract the distance traveled in the first 2 hours from the total distance.",
                                "Step 4: Remaining distance = ${distance} - #{2 * (speed1 + speed2)} = #{distance - (2 * (speed1 + speed2))} km.",
                                "Step 5: Increase the speed of the second bus by 25%: Adjusted speed = ${speed2} * 1.25 = #{speed2 * 1.25} km/h.",
                                "Step 6: Calculate the time needed to travel the remaining distance with the new speeds.",
                                "Step 7: Time for the remaining distance = #{distance - (2 * (speed1 + speed2))} / (#{speed1} + #{speed2 * 1.25}) hours.",
                                "Step 8: Add the initial 2 hours to the time calculated in Step 7.",
                                "Step 9: The total time for them to meet is #{(distance - (2 * (speed1 + speed2))) / (speed1 + (speed2 * 1.25)) + 2} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two airplanes take off from opposite airports at ${speed1} km/h and ${speed2} km/h, but one of them stops for 1 hour along the way. If the initial distance is ${distance} km, how long will it take for them to meet?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(200, 800)),
                                new Variable("speed2", new Range(200, 800)),
                                new Variable("distance", new Range(1000, 5000))
                        ))
                        .tip("Calculate the distance traveled by the airplane that does not stop during the first hour. Then, calculate the time needed for both airplanes to cover the remaining distance together.")
                        .preview(Arrays.asList(
                                "Distance traveled by the first airplane in 1 hour = ${speed1} * 1",
                                "Total time = (remaining distance) / (#{speed1} + #{speed2}) + 1"
                        ))
                        .answer("#{(distance - speed1) / (speed1 + speed2) + 1}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first airplane in the first hour before the second airplane stops.",
                                "Step 2: Distance traveled in 1 hour by the first airplane = ${speed1} * 1 = #{speed1} km.",
                                "Step 3: Subtract this distance from the initial total distance.",
                                "Step 4: Remaining distance = ${distance} - #{speed1} = #{distance - speed1} km.",
                                "Step 5: Calculate the time needed to travel the remaining distance considering that both airplanes are moving.",
                                "Step 6: Time for the remaining distance = #{distance - speed1} / (#{speed1 + speed2}) hours.",
                                "Step 7: Add the initial 1 hour to the time calculated in Step 6.",
                                "Step 8: The total time for them to meet is #{(distance - speed1) / (speed1 + speed2) + 1} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two motorcyclists leave from opposite points at ${speed1} km/h and ${speed2} km/h, but one of them reduces its speed by 30% after 2 hours. If the initial distance is ${distance} km, how long will it take for them to meet?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(40, 120)),
                                new Variable("speed2", new Range(40, 120)),
                                new Variable("distance", new Range(500, 2000))
                        ))
                        .tip("Calculate the distance each motorcyclist travels in the first 2 hours. Then, adjust the speed of the second motorcyclist and calculate the additional time to cover the remaining distance.")
                        .preview(Arrays.asList(
                                "Distance traveled in 2 hours by the first motorcyclist = ${speed1} * 2",
                                "Remaining distance / new combined speed"
                        ))
                        .answer("#{2 + (distance - (2 * (speed1 + speed2))) / (speed1 + speed2 * 0.7)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by both motorcyclists in the first 2 hours before the speed reduction.",
                                "Step 2: Distance of the first motorcyclist in 2 hours = ${speed1} * 2 = #{speed1 * 2} km.",
                                "Step 3: Distance of the second motorcyclist in 2 hours = ${speed2} * 2 = #{speed2 * 2} km.",
                                "Step 4: Calculate the total distance traveled in those 2 hours: #{speed1 * 2} + #{speed2 * 2} = #{2 * (speed1 + speed2)} km.",
                                "Step 5: Subtract this distance from the initial total distance.",
                                "Step 6: Remaining distance = ${distance} - #{2 * (speed1 + speed2)} = #{distance - 2 * (speed1 + speed2)} km.",
                                "Step 7: Reduce the speed of the second motorcyclist by 30%: new speed = #{speed2 * 0.7} km/h.",
                                "Step 8: Calculate the time needed to travel the remaining distance with the new combined speeds.",
                                "Step 9: Additional time = #{(distance - 2 * (speed1 + speed2)) / (speed1 + speed2 * 0.7)} hours.",
                                "Step 10: The total time for them to meet is #{2 + (distance - 2 * (speed1 + speed2)) / (speed1 + speed2 * 0.7)} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two cyclists leave from opposite ends at ${speed1} km/h and ${speed2} km/h, but one of them increases its speed by 15% after 1 hour. If the initial distance is ${distance} km, how long will it take for them to meet?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(10, 30)),
                                new Variable("speed2", new Range(10, 30)),
                                new Variable("distance", new Range(100, 500))
                        ))
                        .tip("Calculate the distance traveled by each cyclist in the first hour. Then, adjust the speed of the cyclist who increases its speed and calculate the additional time needed to cover the remaining distance.")
                        .preview(Arrays.asList(
                                "Distance in the first hour: (${speed1} + ${speed2}) * 1",
                                "Total time considering the speed increase"
                        ))
                        .answer("#{1 + (distance - (speed1 + speed2) * 1) / (speed1 * 1.15 + speed2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by both cyclists in the first hour before the speed increase.",
                                "Step 2: Distance of the first cyclist in 1 hour = ${speed1} * 1 = #{speed1} km.",
                                "Step 3: Distance of the second cyclist in 1 hour = ${speed2} * 1 = #{speed2} km.",
                                "Step 4: Total distance traveled in that first hour = #{speed1 + speed2} km.",
                                "Step 5: Subtract this distance from the initial distance to get the remaining distance.",
                                "Step 6: Remaining distance = ${distance} - #{speed1 + speed2} = #{distance - (speed1 + speed2)} km.",
                                "Step 7: Increase the speed of the first cyclist by 15%: new speed = #{speed1 * 1.15} km/h.",
                                "Step 8: Calculate the time needed to travel the remaining distance with the new combined speeds.",
                                "Step 9: Additional time = #{(distance - (speed1 + speed2)) / (speed1 * 1.15 + speed2)} hours.",
                                "Step 10: The total time for them to meet is #{1 + (distance - (speed1 + speed2)) / (speed1 * 1.15 + speed2)} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two buses leave from opposite points at ${speed1} km/h and ${speed2} km/h, but one of them takes a 30-minute break at the start. If the initial distance is ${distance} km, how long will it take for them to meet?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(40, 80)),
                                new Variable("speed2", new Range(40, 80)),
                                new Variable("distance", new Range(200, 600))
                        ))
                        .tip("Calculate the distance traveled by the second bus in the first 30 minutes while the first bus is resting. Then, calculate the time needed for both buses to meet.")
                        .preview(Arrays.asList(
                                "Distance traveled by the second bus in 0.5 hours: ${speed2} * 0.5",
                                "Total time for meeting considering the first bus's rest"
                        ))
                        .answer("#{(distance - (speed2 * 0.5)) / (speed1 + speed2) + 0.5}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the second bus during the first 30 minutes (0.5 hours) while the first bus rests.",
                                "Step 2: Distance of the second bus in 0.5 hours = ${speed2} * 0.5 = #{speed2 * 0.5} km.",
                                "Step 3: Subtract this distance from the initial total distance to get the remaining distance between the two buses.",
                                "Step 4: Remaining distance = ${distance} - #{speed2 * 0.5} = #{distance - (speed2 * 0.5)} km.",
                                "Step 5: Calculate the time needed to cover this remaining distance with the combined speed of both buses.",
                                "Step 6: Additional time = #{(distance - (speed2 * 0.5)) / (speed1 + speed2)} hours.",
                                "Step 7: The total time for meeting is the rest time plus the additional time, which is 0.5 + #{(distance - (speed2 * 0.5)) / (speed1 + speed2)} hours."
                        ))
                        .build());
        topic10Type2ProblemsBuilder.add(Problem.builder()
                        .statement("Two airplanes take off from opposite airports at ${speed1} km/h and ${speed2} km/h, but one of them reduces its speed by 20% after 2 hours of flight. If the initial distance is ${distance} km, how long will it take for them to meet?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(400, 800)),
                                new Variable("speed2", new Range(400, 800)),
                                new Variable("distance", new Range(100, 300))
                        ))
                        .tip("Calculate the distance traveled by both airplanes in the first 2 hours. Then, adjust the speed of one of the airplanes and calculate the additional time needed to cover the remaining distance.")
                        .preview(Arrays.asList(
                                "Distance traveled in 2 hours by both airplanes at their initial speeds",
                                "Additional time needed with the reduced speed of the first airplane"
                        ))
                        .answer("#{2 + (distance - (speed1 + speed2) * 2) / ((speed1 * 0.8) + speed2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by each airplane in the first 2 hours.",
                                "Step 2: Distance of the first airplane in 2 hours = ${speed1} * 2 = #{speed1 * 2} km.",
                                "Step 3: Distance of the second airplane in 2 hours = ${speed2} * 2 = #{speed2 * 2} km.",
                                "Step 4: Add the distances traveled by both airplanes in the first 2 hours.",
                                "Step 5: Total distance traveled in the first 2 hours = #{(speed1 * 2) + (speed2 * 2)} km.",
                                "Step 6: Subtract this distance from the initial distance to get the remaining distance between the two airplanes.",
                                "Step 7: Remaining distance = ${distance} - #{(speed1 * 2) + (speed2 * 2)} = #{distance - ((speed1 * 2) + (speed2 * 2))} km.",
                                "Step 8: Reduce the speed of the first airplane by 20% after 2 hours.",
                                "Step 9: New speed of the first airplane = #{speed1 * 0.8} km/h.",
                                "Step 10: Calculate the additional time needed to cover the remaining distance with the reduced speed of the first airplane and the speed of the second airplane.",
                                "Step 11: Additional time = #{(distance - ((speed1 * 2) + (speed2 * 2))) / ((speed1 * 0.8) + speed2)} hours.",
                                "Step 12: The total time for meeting is the initial 2 hours plus the additional time calculated in Step 11, which is 2 + #{(distance - ((speed1 * 2) + (speed2 * 2))) / ((speed1 * 0.8) + speed2)} hours."
                        ))
                        .build());
    }
}
