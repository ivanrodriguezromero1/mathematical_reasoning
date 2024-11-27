package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic11Type2ProblemsBuilder {
    @Getter
    public static final List<Problem> topic11Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic11Type2ProblemsBuilder.add(Problem.builder()
                .statement("A flight departs at ${start_hour} hours and ${start_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the plane lands, counting from midnight?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("start_hour", new Range(1, 10)),
                        new Variable("start_minute", new Range(1, 59)),
                        new Variable("duration_hour", new Range(1, 5)),
                        new Variable("duration_minute", new Range(1, 59))
                ))
                .tip("Add the hours and minutes of the duration to the departure time and convert the total to minutes from midnight.")
                .preview(Arrays.asList(
                        "Convert the departure time and duration to minutes and sum them",
                        "Calculate the total minutes from midnight for the landing time"
                ))
                .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Convert the departure time into minutes from midnight.",
                        "Step 2: Minutes of departure = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                        "Step 3: Convert the flight duration into minutes.",
                        "Step 4: Duration in minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                        "Step 5: Add the departure minutes and the duration minutes.",
                        "Step 6: Total in minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute} minutes."
                ))
                .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer match starts at ${start_hour} hours and ${start_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the match ends, counting from midnight?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 10)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 5)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the ending time, add the match duration to the start time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Add the start time and the match duration in minutes",
                                "Calculate the total minutes from midnight for the ending time"
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes of start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the match duration into minutes.",
                                "Step 4: Duration in minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the start minutes and the duration minutes.",
                                "Step 6: Total in minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A conference starts at ${start_hour} hours and ${start_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the conference ends, counting from midnight?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 8)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the ending time, add the hours and minutes of the duration to the start time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the start time and duration to minutes.",
                                "Add the total minutes to get the ending time in minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time into minutes from midnight.",
                                "Step 2: Minutes of start = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the duration of the conference into minutes.",
                                "Step 4: Duration in minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the start minutes and the duration minutes.",
                                "Step 6: Total in minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A train departs at ${start_hour} hours and ${start_minute} minutes and its journey lasts for ${duration_hour} hours and ${duration_minute} minutes. What is the total time in minutes when the train arrives, counting from midnight?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the arrival time, add the journey duration to the departure time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the departure time and duration to minutes.",
                                "Add the total minutes to get the arrival time in minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the departure time into minutes from midnight.",
                                "Step 2: Minutes of departure = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the journey duration into minutes.",
                                "Step 4: Duration in minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the departure minutes and the duration minutes.",
                                "Step 6: Total in minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A class starts at ${start_hour} hours and ${start_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, but is interrupted for 30 minutes. What is the total time in minutes when the class ends, counting from midnight?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the ending time, add the duration and the interruption to the start time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the start time, duration, and interruption to minutes.",
                                "Add all the minutes to get the ending time in minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 30)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time to minutes from midnight.",
                                "Step 2: Start minutes = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the class duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the 30-minute interruption to the duration.",
                                "Step 6: Total additional minutes = #{duration_hour * 60 + duration_minute + 30} minutes.",
                                "Step 7: Add the start minutes and the additional minutes.",
                                "Step 8: Total minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 30} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A train departs at ${start_hour} hours and ${start_minute} minutes and its journey lasts for ${duration_hour} hours and ${duration_minute} minutes, but it has a 25-minute stop at a station. What is the total time in minutes when the train arrives, counting from midnight?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 10)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the arrival time, add the duration and the stop to the start time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the start time and duration to minutes.",
                                "Add the duration and stop minutes to the start minutes to get the total minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 25)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time to minutes from midnight.",
                                "Step 2: Start minutes = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the journey duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the 25-minute stop to the duration.",
                                "Step 6: Total additional minutes = #{duration_hour * 60 + duration_minute + 25} minutes.",
                                "Step 7: Add the start minutes and the additional minutes.",
                                "Step 8: Total minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 25} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer match starts at ${start_hour} hours and ${start_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, but has a 15-minute break. What is the total time in minutes when the match ends, counting from midnight?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 5)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the ending time, add the match duration and the break to the start time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the start time and duration to minutes.",
                                "Add the duration and break minutes to the start minutes to get the total minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 15)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time to minutes from midnight.",
                                "Step 2: Start minutes = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the match duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the 15-minute break to the total duration.",
                                "Step 6: Total additional minutes = #{duration_hour * 60 + duration_minute + 15} minutes.",
                                "Step 7: Add the start minutes and the additional minutes.",
                                "Step 8: Total minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 15} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A flight departs at ${start_hour} hours and ${start_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, with a 45-minute layover. What is the total time in minutes when the flight lands, counting from midnight?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 5)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To calculate the landing time, add the flight duration and layover time to the departure time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the departure time and total duration (including layover) to minutes.",
                                "Add the duration and layover minutes to the departure minutes to get the total minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 45)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the departure time to minutes from midnight.",
                                "Step 2: Departure minutes = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the flight duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the 45-minute layover to the total duration.",
                                "Step 6: Total additional minutes = #{duration_hour * 60 + duration_minute + 45} minutes.",
                                "Step 7: Add the departure minutes and the additional minutes.",
                                "Step 8: Total minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 45} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A class starts at ${start_hour} hours and ${start_minute} minutes and lasts for ${duration_hour} hours and ${duration_minute} minutes, with a 20-minute interruption. What is the total time in minutes when the class ends, counting from midnight?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 12)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the ending time, add the total duration of the class and the interruption time to the start time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the start time and total duration (including the interruption) to minutes.",
                                "Add the duration and interruption minutes to the start minutes to get the total minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 20)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the start time to minutes from midnight.",
                                "Step 2: Start minutes = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the class duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the 20-minute interruption to the total duration.",
                                "Step 6: Total additional minutes = #{duration_hour * 60 + duration_minute + 20} minutes.",
                                "Step 7: Add the start minutes and the additional minutes.",
                                "Step 8: Total minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 20} minutes."
                        ))
                        .build());
        topic11Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A train departs at ${start_hour} hours and ${start_minute} minutes and its journey lasts for ${duration_hour} hours and ${duration_minute} minutes, with a 30-minute stop at a station. What is the total time in minutes when the train arrives, counting from midnight?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("start_hour", new Range(1, 23)),
                                new Variable("start_minute", new Range(1, 59)),
                                new Variable("duration_hour", new Range(1, 12)),
                                new Variable("duration_minute", new Range(1, 59))
                        ))
                        .tip("To find the arrival time, add the total journey duration and the stop to the departure time and convert the total to minutes from midnight.")
                        .preview(Arrays.asList(
                                "Convert the departure time and total duration (including the stop) to minutes.",
                                "Add the duration and stop minutes to the departure minutes to get the total minutes from midnight."
                        ))
                        .answer("#{(start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 30)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the departure time to minutes from midnight.",
                                "Step 2: Departure minutes = (${start_hour} * 60) + ${start_minute} = #{start_hour * 60 + start_minute} minutes.",
                                "Step 3: Convert the journey duration to minutes.",
                                "Step 4: Duration minutes = (${duration_hour} * 60) + ${duration_minute} = #{duration_hour * 60 + duration_minute} minutes.",
                                "Step 5: Add the 30-minute stop to the total duration.",
                                "Step 6: Total additional minutes = #{duration_hour * 60 + duration_minute + 30} minutes.",
                                "Step 7: Add the departure minutes and the additional minutes.",
                                "Step 8: Total minutes = #{start_hour * 60 + start_minute + duration_hour * 60 + duration_minute + 30} minutes."
                        ))
                        .build());
    }
}
