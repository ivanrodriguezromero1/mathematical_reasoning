package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic11Type1ProblemsBuilder {
    @Getter
    public static final List<Problem> topic11Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A class starts at ${start_hour} hours and ${start_minute} minutes and ends at ${end_hour} hours and ${end_minute} minutes. What is the total duration of the class in minutes?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes from midnight and then subtract the start time from the end time to get the total duration.")
                        .preview(Arrays.asList(
                                "Convert the start and end times into total minutes from midnight",
                                "Calculate the difference in minutes between the start and end times"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the end time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the end = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the end time and the start time.",
                                "Step 6: Total duration = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes."
                        ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A flight departs at ${start_hour} hours and ${start_minute} minutes and lands at ${end_hour} hours and ${end_minute} minutes. How long did the flight last in minutes?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the departure and arrival times into total minutes from midnight and subtract the values to get the total duration.")
                        .preview(Arrays.asList(
                                "Convert the departure and arrival times into total minutes from midnight",
                                "Calculate the difference in minutes to find the flight duration"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the departure time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the departure = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the arrival time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the arrival = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the arrival time and the departure time.",
                                "Step 6: Total flight duration in minutes = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)}."
                        ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer match starts at ${start_hour} hours and ${start_minute} minutes and ends at ${end_hour} hours and ${end_minute} minutes. How much time elapsed during the match in minutes?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes from midnight and subtract the start time from the end time to get the total elapsed time.")
                        .preview(Arrays.asList(
                                "Convert the start and end times into total minutes from midnight",
                                "Calculate the difference in minutes to get the match duration"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the end time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the end = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the end time and the start time.",
                                "Step 6: Total elapsed time during the match = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes."
                        ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A conference starts at ${start_hour} hours and ${start_minute} minutes and ends at ${end_hour} hours and ${end_minute} minutes. What is the total duration of the conference in minutes?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes from midnight and subtract the start time from the end time to get the total elapsed time.")
                        .preview(Arrays.asList(
                                "Convert the start and end times into total minutes from midnight",
                                "Calculate the difference in minutes to get the match duration"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the end time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the end = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the end time and the start time.",
                                "Step 6: Total elapsed time during the match = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes."
                        ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A class starts at ${start_hour} hours and ${start_minute} minutes and ends at ${end_hour} hours and ${end_minute} minutes, but is interrupted for 30 minutes. What is the total elapsed time in minutes, including the interruption?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes from midnight, subtract to get the duration, and then add the 30-minute interruption.")
                        .preview(Arrays.asList(
                                "Convert the start and end times into total minutes from midnight",
                                "Calculate the difference in minutes and add the interruption"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 30}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the end time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the end = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the end time and the start time.",
                                "Step 6: Duration in minutes without the interruption = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes.",
                                "Step 7: Add the 30-minute interruption to the total duration.",
                                "Step 8: Total duration in minutes, including the interruption = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 30} minutes."                                              ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A train departs at ${start_hour} hours and ${start_minute} minutes and arrives at ${end_hour} hours and ${end_minute} minutes, but stops for 25 minutes at an intermediate station. What is the total elapsed time in minutes?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes, subtract to get the duration, and then add the 25-minute stop.")
                        .preview(Arrays.asList(
                                "Convert the departure and arrival times into total minutes from midnight",
                                "Calculate the difference in minutes and add the stop"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 25}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the departure time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the departure = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the arrival time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the arrival = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the arrival time and the departure time.",
                                "Step 6: Duration in minutes without the stop = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes.",
                                "Step 7: Add the 25-minute stop to the total duration.",
                                "Step 8: Total duration in minutes, including the stop = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 25} minutes."                                              ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer match starts at ${start_hour} hours and ${start_minute} minutes and ends at ${end_hour} hours and ${end_minute} minutes, but has a 15-minute break. What is the total elapsed time in minutes, including the break?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes, subtract to get the duration, and then add the 15-minute break.")
                        .preview(Arrays.asList(
                                "Convert the start and end times into total minutes from midnight",
                                "Calculate the difference in minutes and add the break"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 15}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the end time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the end = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the end time and the start time.",
                                "Step 6: Duration in minutes without the break = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes.",
                                "Step 7: Add the 15-minute break to the total duration.",
                                "Step 8: Total duration in minutes, including the break = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 15} minutes."
                        ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A flight departs at ${start_hour} hours and ${start_minute} minutes and lands at ${end_hour} hours and ${end_minute} minutes, with a 45-minute layover. What is the total elapsed time in minutes, including the layover?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes, subtract to get the duration, and then add the 45-minute layover.")
                        .preview(Arrays.asList(
                                "Convert the departure and arrival times into total minutes from midnight",
                                "Calculate the difference in minutes and add the 45-minute layover"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 45}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the departure time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the departure = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the arrival time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the arrival = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the arrival time and the departure time.",
                                "Step 6: Duration in minutes without the layover = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes.",
                                "Step 7: Add the 45-minute layover to the total duration.",
                                "Step 8: Total duration in minutes, including the layover = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 45} minutes."
                        ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A class starts at ${start_hour} hours and ${start_minute} minutes and ends at ${end_hour} hours and ${end_minute} minutes, with a 20-minute interruption. What is the total elapsed time in minutes, including the interruption?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes, subtract to get the duration, and then add the 20-minute interruption.")
                        .preview(Arrays.asList(
                                "Convert the start and end times into total minutes from midnight",
                                "Calculate the difference in minutes and add the 20-minute interruption"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 20}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the end time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the end = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the end time and the start time.",
                                "Step 6: Duration in minutes without the interruption = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes.",
                                "Step 7: Add the 20-minute interruption to the total duration.",
                                "Step 8: Total duration in minutes, including the interruption = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 20} minutes."
                        ))
                        .build());
        topic11Type1ProblemsBuilder.add(Problem.builder()
                        .statement("A train departs at ${start_hour} hours and ${start_minute} minutes and arrives at ${end_hour} hours and ${end_minute} minutes, with a 30-minute stop at an intermediate station. What is the total elapsed time in minutes, including the stop?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59))
                        ))
                        .tip("Convert the start and end times into total minutes, subtract to get the duration, and then add the 30-minute stop.")
                        .preview(Arrays.asList(
                                "Convert the start and arrival times into total minutes from midnight",
                                "Calculate the difference in minutes and add the 30-minute stop"
                        ))
                        .answer("#{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 30}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes from midnight for the start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the arrival time into minutes from midnight.",
                                "Step 4: Minutes from midnight for the arrival = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 5: Calculate the difference in minutes between the arrival time and the start time.",
                                "Step 6: Duration in minutes without the stop = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute)} minutes.",
                                "Step 7: Add the 30-minute stop to the total duration.",
                                "Step 8: Total duration in minutes, including the stop = #{(end_hour * 60 + end_minute) - (start_hour * 60 + start_minute) + 30} minutes."
                        ))
                        .build());
    }
}
