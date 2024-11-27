package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic11Type3ProblemsBuilder {
    @Getter
    public static final List<Problem> topic11Type3ProblemsBuilder = new ArrayList<>();

    static {
        topic11Type3ProblemsBuilder.add(Problem.builder()
                .statement("A flight lands at ${end_hour} hours and ${end_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the plane took off, counting from midnight?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("end_hour", new Range(15, 23)),
                        new Variable("end_minute", new Range(1, 59)),
                        new Variable("duration_hour", new Range(1, 10)),
                        new Variable("duration_minute", new Range(1, 59))
                ))
                .tip("To find the takeoff time, subtract the total flight duration from the landing time and convert the result to minutes from midnight.")
                .preview(Arrays.asList(
                        "Convert the landing time and the total flight duration to minutes.",
                        "Subtract the total duration minutes from the landing minutes to get the takeoff time in minutes from midnight."
                ))
                .answer("#{(end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute))}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Convert the landing time to minutes from midnight.",
                        "Step 2: Landing minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                        "Step 3: Convert the flight duration to minutes.",
                        "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                        "Step 5: Subtract the duration minutes from the landing minutes.",
                        "Step 6: Total remaining minutes = #{end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute)} minutes."
                ))
                .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer match ends at ${end_hour} hours and ${end_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the match started, counting from midnight?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the takeoff time, subtract the total flight duration from the landing time and convert the result to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the ending time and the match duration to minutes.",
                                "Subtract the duration minutes from the ending minutes to get the start time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the ending time to minutes from midnight.",
                                "Step 2: Ending minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the match duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Subtract the duration minutes from the ending minutes.",
                                "Step 6: Total remaining minutes = #{end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A conference ends at ${end_hour} hours and ${end_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the conference started, counting from midnight?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 4)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the start time, subtract the duration of the conference from the ending time and convert the result to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the ending time and the conference duration to minutes.",
                                "Subtract the duration minutes from the ending minutes to get the start time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the ending time to minutes from midnight.",
                                "Step 2: Ending minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the conference duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Subtract the duration minutes from the ending minutes.",
                                "Step 6: Total remaining minutes = #{end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A train arrives at its destination at ${end_hour} hours and ${end_minute} minutes and the journey lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the train departed, counting from midnight?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the departure time, subtract the journey duration from the arrival time and convert the result to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the arrival time and the journey duration to minutes.",
                                "Subtract the duration minutes from the arrival minutes to get the departure time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the arrival time to minutes from midnight.",
                                "Step 2: Arrival minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the journey duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Subtract the duration minutes from the arrival minutes.",
                                "Step 6: Total remaining minutes = #{end_hour * 60 + end_minute - (duration_hour * 60 + duration_minute)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A class ends at ${end_hour} hours and ${end_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, but was interrupted for 30 minutes. What is the total time in minutes when the class started, counting from midnight?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the start time, add the interruption to the duration and subtract the total from the ending time to find the minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the ending time and the total duration (including the interruption) to minutes.",
                                "Subtract the total duration minutes from the ending minutes to get the start time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 30))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the ending time to minutes from midnight.",
                                "Step 2: Ending minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the class duration to minutes and include the interruption.",
                                "Step 4: Total duration minutes = (${duration_hour} * 60) + ${duration_minute} + 30 = #{(duration_hour * 60 + duration_minute) + 30} minutes.",
                                "Step 5: Subtract the total duration minutes from the ending minutes.",
                                "Step 6: Remaining minutes = #{end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 30)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A train arrives at ${end_hour} hours and ${end_minute} minutes and the journey lasts for ${duration_hour} hours and ${duration_minute} minutes, but there was a 25-minute stop at a station. What is the total time in minutes when the train departed, counting from midnight?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the departure time, add the stop duration to the total journey time and subtract that total from the arrival time to find the minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the arrival time and the total duration (including the stop) to minutes.",
                                "Subtract the total duration minutes from the arrival minutes to get the departure time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 25))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the arrival time to minutes from midnight.",
                                "Step 2: Arrival minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the total journey duration to minutes, including the stop.",
                                "Step 4: Total journey minutes = (${duration_hour} * 60) + ${duration_minute} + 25 = #{(duration_hour * 60 + duration_minute) + 25} minutes.",
                                "Step 5: Subtract the total journey minutes from the arrival minutes.",
                                "Step 6: Remaining minutes = #{end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 25)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer match ends at ${end_hour} hours and ${end_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, with a 15-minute break. What is the total time in minutes when the match started, counting from midnight?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 3)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the start time, add the break time to the total match duration and subtract that total from the ending time to find the minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the ending time and the total duration (including the break) to minutes.",
                                "Subtract the total duration minutes from the ending minutes to get the start time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 15))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the ending time to minutes from midnight.",
                                "Step 2: Ending minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the total match duration to minutes, including the break.",
                                "Step 4: Total match minutes = (${duration_hour} * 60) + ${duration_minute} + 15 = #{(duration_hour * 60 + duration_minute) + 15} minutes.",
                                "Step 5: Subtract the total match minutes from the ending minutes.",
                                "Step 6: Remaining minutes = #{end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 15)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A flight lands at ${end_hour} hours and ${end_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, with a 45-minute layover. What is the total time in minutes when the flight took off, counting from midnight?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the takeoff time, add the layover time to the total flight duration and subtract that total from the landing time to get the minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the landing time and the total duration (including the layover) to minutes.",
                                "Subtract the total duration minutes from the landing minutes to get the takeoff time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 45))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the landing time to minutes from midnight.",
                                "Step 2: Landing minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the total flight duration to minutes, including the layover.",
                                "Step 4: Total flight minutes = (${duration_hour} * 60) + ${duration_minute} + 45 = #{(duration_hour * 60 + duration_minute) + 45} minutes.",
                                "Step 5: Subtract the total flight minutes from the landing minutes.",
                                "Step 6: Remaining minutes = #{end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 45)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A class ends at ${end_hour} hours and ${end_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, with a 20-minute interruption. What is the total time in minutes when the class started, counting from midnight?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the start time, add the interruption to the duration and subtract that total from the ending time to find the minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the ending time and the total duration (including the interruption) to minutes.",
                                "Subtract the total duration minutes from the ending minutes to get the start time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 20))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the ending time to minutes from midnight.",
                                "Step 2: Ending minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the total class duration to minutes, including the interruption.",
                                "Step 4: Total class minutes = (${duration_hour} * 60) + ${duration_minute} + 20 = #{(duration_hour * 60 + duration_minute) + 20} minutes.",
                                "Step 5: Subtract the total class minutes from the ending minutes.",
                                "Step 6: Remaining minutes = #{end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 20)} minutes."
                        ))
                        .build());
        topic11Type3ProblemsBuilder.add(Problem.builder()
                        .statement("A train arrives at ${end_hour} hours and ${end_minute} minutes and the journey lasts for ${duration_hour} hours and ${duration_minute} minutes, with a 30-minute stop at a station. What is the total time in minutes when the train departed, counting from midnight?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("end_hour", new Range(15, 23)),
                                new Variable("end_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the departure time, add the 30-minute stop to the total journey duration and subtract that total from the arrival time to get the minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the arrival time and the total duration (including the stop) to minutes.",
                                "Subtract the total duration minutes from the arrival minutes to get the departure time in minutes from midnight."
                        ))
                        .answer("#{(end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 30))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the arrival time to minutes from midnight.",
                                "Step 2: Arrival minutes = (${end_hour} * 60) + ${end_minute} = #{end_hour * 60 + end_minute} minutes.",
                                "Step 3: Convert the total journey duration to minutes, including the stop.",
                                "Step 4: Total journey minutes = (${duration_hour} * 60) + ${duration_minute} + 30 = #{(duration_hour * 60 + duration_minute) + 30} minutes.",
                                "Step 5: Subtract the total journey minutes from the arrival minutes.",
                                "Step 6: Remaining minutes = #{end_hour * 60 + end_minute - ((duration_hour * 60 + duration_minute) + 30)} minutes."
                        ))
                        .build());
    }
}
