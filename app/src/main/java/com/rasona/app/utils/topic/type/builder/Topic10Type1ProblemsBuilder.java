package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic10Type1ProblemsBuilder {
    @Getter
    public static final List<Problem> topic10Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic10Type1ProblemsBuilder.add(Problem.builder()
                .statement("A bus travels at ${speed1} km/h for ${time1} hours, while another bus follows at ${speed2} km/h for the same time. What is the total distance traveled by both buses?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("speed1", new Range(50, 100)),
                        new Variable("time1", new Range(1, 10)),
                        new Variable("speed2", new Range(50, 100))
                ))
                .tip("To find the total distance traveled, calculate the distance for each bus using the formula Distance = Speed * Time and then sum the distances.")
                .preview(Arrays.asList(
                        "Distance of the first bus = ${speed1} * ${time1}",
                        "Distance of the second bus = ${speed2} * ${time1}"
                ))
                .answer("#{(speed1 * time1) + (speed2 * time1)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Calculate the distance traveled by the first bus using the formula Distance = Speed * Time.",
                        "Step 2: Substitute the speed and time for the first bus: Distance of the first bus = ${speed1} * ${time1}.",
                        "Step 3: Perform the calculation to find the distance of the first bus: #{speed1 * time1} km.",
                        "Step 4: Calculate the distance traveled by the second bus using the same formula.",
                        "Step 5: Substitute the speed and time for the second bus: Distance of the second bus = ${speed2} * ${time1}.",
                        "Step 6: Perform the calculation to find the distance of the second bus: #{speed2 * time1} km.",
                        "Step 7: Sum the distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time1)} km.",
                        "Step 8: The total distance traveled by both buses is #{(speed1 * time1) + (speed2 * time1)} km."
                ))
                .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed1} km/h for ${time1} hours, while another airplane follows at ${speed2} km/h for the same time. What is the total distance traveled by both airplanes?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(300, 900)),
                                new Variable("time1", new Range(1, 10)),
                                new Variable("speed2", new Range(300, 900))
                        ))
                        .tip("To find the total distance traveled by both airplanes, calculate the distance for each airplane using the formula Distance = Speed * Time and then sum the distances.")
                        .preview(Arrays.asList(
                                "Distance of the first airplane = ${speed1} * ${time1}",
                                "Distance of the second airplane = ${speed2} * ${time1}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first airplane using the formula Distance = Speed * Time.",
                                "Step 2: Substitute the speed and time for the first airplane: Distance of the first airplane = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first airplane: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second airplane using the same formula.",
                                "Step 5: Substitute the speed and time for the second airplane: Distance of the second airplane = ${speed2} * ${time1}.",
                                "Step 6: Perform the calculation to find the distance of the second airplane: #{speed2 * time1} km.",
                                "Step 7: Sum the distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time1)} km.",
                                "Step 8: The total distance traveled by both airplanes is #{(speed1 * time1) + (speed2 * time1)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A motorcyclist travels at ${speed1} km/h for ${time1} hours, while another motorcyclist follows at ${speed2} km/h for the same time. What is the total distance traveled by both motorcyclists?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(50, 150)),
                                new Variable("time1", new Range(1, 10)),
                                new Variable("speed2", new Range(50, 150))
                        ))
                        .tip("To find the total distance traveled by both motorcyclists, calculate the distance for each using the formula Distance = Speed * Time and then sum the distances.")
                        .preview(Arrays.asList(
                                "Distance of the first motorcyclist = ${speed1} * ${time1}",
                                "Distance of the second motorcyclist = ${speed2} * ${time1}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first motorcyclist using the formula Distance = Speed * Time.",
                                "Step 2: Substitute the speed and time for the first motorcyclist: Distance of the first motorcyclist = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first motorcyclist: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second motorcyclist using the same formula.",
                                "Step 5: Substitute the speed and time for the second motorcyclist: Distance of the second motorcyclist = ${speed2} * ${time1}.",
                                "Step 6: Perform the calculation to find the distance of the second motorcyclist: #{speed2 * time1} km.",
                                "Step 7: Sum the distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time1)} km.",
                                "Step 8: The total distance traveled by both motorcyclists is #{(speed1 * time1) + (speed2 * time1)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A boat travels at ${speed1} km/h for ${time1} hours, while another boat follows at ${speed2} km/h for the same time. What is the total distance traveled by both boats?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(20, 50)),
                                new Variable("time1", new Range(1, 15)),
                                new Variable("speed2", new Range(20, 50))
                        ))
                        .tip("To find the total distance traveled by both boats, calculate the distance for each using the formula Distance = Speed * Time and then sum the distances.")
                        .preview(Arrays.asList(
                                "Distance of the first boat = ${speed1} * ${time1}",
                                "Distance of the second boat = ${speed2} * ${time1}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time1)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first boat using the formula Distance = Speed * Time.",
                                "Step 2: Substitute the speed and time for the first boat: Distance of the first boat = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first boat: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second boat using the same formula.",
                                "Step 5: Substitute the speed and time for the second boat: Distance of the second boat = ${speed2} * ${time1}.",
                                "Step 6: Perform the calculation to find the distance of the second boat: #{speed2 * time1} km.",
                                "Step 7: Sum the distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time1)} km.",
                                "Step 8: The total distance traveled by both boats is #{(speed1 * time1) + (speed2 * time1)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A bus travels at ${speed1} km/h for ${time1} hours, while another bus follows at ${speed2} km/h for a longer time of ${time2} hours. What is the total distance traveled by both buses?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(40, 80)),
                                new Variable("time1", new Range(1, 10)),
                                new Variable("speed2", new Range(40, 80)),
                                new Variable("time2", new Range(1, 15))
                        ))
                        .tip("To find the total distance traveled, calculate the distance for each bus using the formula Distance = Speed * Time and then sum the distances.")
                        .preview(Arrays.asList(
                                "Distance of the first bus = ${speed1} * ${time1}",
                                "Distance of the second bus = ${speed2} * ${time2}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first bus using the formula Distance = Speed * Time.",
                                "Step 2: Substitute the speed and time for the first bus: Distance of the first bus = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first bus: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second bus using the same formula.",
                                "Step 5: Substitute the speed and time for the second bus: Distance of the second bus = ${speed2} * ${time2}.",
                                "Step 6: Perform the calculation to find the distance of the second bus: #{speed2 * time2} km.",
                                "Step 7: Sum the distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time2)} km.",
                                "Step 8: The total distance traveled by both buses is #{(speed1 * time1) + (speed2 * time2)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed1} km/h for ${time1} hours, while another airplane follows at ${speed2} km/h for a shorter time of ${time2} hours. What is the total distance traveled by both airplanes?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(400, 900)),
                                new Variable("time1", new Range(1, 10)),
                                new Variable("speed2", new Range(400, 900)),
                                new Variable("time2", new Range(1, 10))
                        ))
                        .tip("To find the total distance traveled, calculate the distance for each airplane using the formula Distance = Speed * Time and then sum the distances.")
                        .preview(Arrays.asList(
                                "Distance of the first airplane = ${speed1} * ${time1}",
                                "Distance of the second airplane = ${speed2} * ${time2}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first airplane using the formula Distance = Speed * Time.",
                                "Step 2: Substitute the speed and time for the first airplane: Distance of the first airplane = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first airplane: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second airplane using the same formula.",
                                "Step 5: Substitute the speed and time for the second airplane: Distance of the second airplane = ${speed2} * ${time2}.",
                                "Step 6: Perform the calculation to find the distance of the second airplane: #{speed2 * time2} km.",
                                "Step 7: Sum the distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time2)} km.",
                                "Step 8: The total distance traveled by both airplanes is #{(speed1 * time1) + (speed2 * time2)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A motorcyclist travels at ${speed1} km/h for ${time1} hours, while another motorcyclist follows at ${speed2} km/h for a longer time of ${time2} hours. What is the total distance traveled by both motorcyclists?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(50, 120)),
                                new Variable("time1", new Range(1, 8)),
                                new Variable("speed2", new Range(50, 120)),
                                new Variable("time2", new Range(1, 10))
                        ))
                        .tip("To find the total distance traveled, calculate the distance for each motorcyclist using the formula Distance = Speed * Time and then sum the distances.")
                        .preview(Arrays.asList(
                                "Distance of the first motorcyclist = ${speed1} * ${time1}",
                                "Distance of the second motorcyclist = ${speed2} * ${time2}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first motorcyclist using the formula Distance = Speed * Time.",
                                "Step 2: Substitute the speed and time for the first motorcyclist: Distance of the first motorcyclist = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first motorcyclist: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second motorcyclist using the same formula.",
                                "Step 5: Substitute the speed and time for the second motorcyclist: Distance of the second motorcyclist = ${speed2} * ${time2}.",
                                "Step 6: Perform the calculation to find the distance of the second motorcyclist: #{speed2 * time2} km.",
                                "Step 7: Sum the distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time2)} km.",
                                "Step 8: The total distance traveled by both motorcyclists is #{(speed1 * time1) + (speed2 * time2)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A cyclist pedals at ${speed1} km/h for ${time1} hours and takes a 30-minute break. Another cyclist follows at ${speed2} km/h for ${time2} hours without stopping. What is the total distance traveled by both cyclists?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(10, 30)),
                                new Variable("time1", new Range(1, 5)),
                                new Variable("speed2", new Range(10, 30)),
                                new Variable("time2", new Range(1, 5))
                        ))
                        .tip("To find the total distance traveled, first calculate the distance for each cyclist using Distance = Speed * Time, then sum both distances.")
                        .preview(Arrays.asList(
                                "Distance of the first cyclist = ${speed1} * ${time1}",
                                "Distance of the second cyclist = ${speed2} * ${time2}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first cyclist using the formula Distance = Speed * Time.",
                                "Step 2: Substitute the speed and time for the first cyclist: Distance of the first cyclist = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first cyclist: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second cyclist using the same formula.",
                                "Step 5: Substitute the speed and time for the second cyclist: Distance of the second cyclist = ${speed2} * ${time2}.",
                                "Step 6: Perform the calculation to find the distance of the second cyclist: #{speed2 * time2} km.",
                                "Step 7: Sum both distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time2)} km.",
                                "Step 8: The total distance traveled by both cyclists is #{(speed1 * time1) + (speed2 * time2)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A bus travels at ${speed1} km/h for ${time1} hours and then stops for an hour. Another bus follows at ${speed2} km/h for ${time2} hours without stopping. What is the total distance traveled by both buses?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(50, 100)),
                                new Variable("time1", new Range(1, 5)),
                                new Variable("speed2", new Range(50, 100)),
                                new Variable("time2", new Range(1, 5))
                        ))
                        .tip("To find the total distance traveled, first calculate the distance for each bus using Distance = Speed * Time, and then sum both distances.")
                        .preview(Arrays.asList(
                                "Distance of the first bus = ${speed1} * ${time1}",
                                "Distance of the second bus = ${speed2} * ${time2}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first bus before stopping.",
                                "Step 2: Substitute the speed and time for the first bus: Distance of the first bus = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first bus: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second bus without stopping.",
                                "Step 5: Substitute the speed and time for the second bus: Distance of the second bus = ${speed2} * ${time2}.",
                                "Step 6: Perform the calculation to find the distance of the second bus: #{speed2 * time2} km.",
                                "Step 7: Sum both distances to find the total distance traveled: #{(speed1 * time1) + (speed2 * time2)} km.",
                                "Step 8: The total distance traveled by both buses is #{(speed1 * time1) + (speed2 * time2)} km."
                        ))
                        .build());
        topic10Type1ProblemsBuilder.add(Problem.builder()
                        .statement("An airplane flies at ${speed1} km/h for ${time1} hours and then reduces its speed by 30%. Another airplane follows at ${speed2} km/h for ${time2} hours without changing its speed. What is the total distance traveled by both airplanes?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("speed1", new Range(500, 900)),
                                new Variable("time1", new Range(1, 5)),
                                new Variable("speed2", new Range(500, 900)),
                                new Variable("time2", new Range(1, 5))
                        ))
                        .tip("To find the total distance traveled, first find the distance covered by the first airplane before reducing its speed. Then calculate the distance covered by the second airplane during its flight.")
                        .preview(Arrays.asList(
                                "Distance of the first airplane (before reducing speed) = ${speed1} * ${time1}",
                                "Distance of the second airplane = ${speed2} * ${time2}"
                        ))
                        .answer("#{(speed1 * time1) + (speed2 * time2)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Calculate the distance traveled by the first airplane before reducing its speed.",
                                "Step 2: Substitute the speed and time for the first airplane: Distance of the first airplane = ${speed1} * ${time1}.",
                                "Step 3: Perform the calculation to find the distance of the first airplane before reducing speed: #{speed1 * time1} km.",
                                "Step 4: Calculate the distance traveled by the second airplane without changing its speed.",
                                "Step 5: Substitute the speed and time for the second airplane: Distance of the second airplane = ${speed2} * ${time2}.",
                                "Step 6: Perform the calculation to find the distance of the second airplane: #{speed2 * time2} km.",
                                "Step 7: Sum both distances to find the total distance traveled by both airplanes: #{(speed1 * time1) + (speed2 * time2)} km.",
                                "Step 8: The total distance traveled by both airplanes is #{(speed1 * time1) + (speed2 * time2)} km."
                        ))
                        .build());
    }
}
