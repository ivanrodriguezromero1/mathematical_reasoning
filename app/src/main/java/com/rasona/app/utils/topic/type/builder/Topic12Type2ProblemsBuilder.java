package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic12Type2ProblemsBuilder {
    @Getter
    public static final List<Problem> topic12Type2ProblemsBuilder = new ArrayList<>();

    static {
        topic12Type2ProblemsBuilder.add(Problem.builder()
                .statement("A workshop has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, followed by a second segment of ${duration2_hour} hours and ${duration2_minute} minutes. What is the total duration of the workshop in minutes?")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("duration1_hour", new Range(1, 10)),
                        new Variable("duration1_minute", new Range(1, 59)),
                        new Variable("duration2_hour", new Range(1, 10)),
                        new Variable("duration2_minute", new Range(1, 59))
                ))
                .tip("Convert the hours to minutes and add all the minutes together to find the total duration.")
                .preview(Arrays.asList(
                        "Convert the hours to minutes for both segments.",
                        "Add the minutes of both segments together."
                ))
                .answer("#{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Convert the hours of the first segment to minutes.",
                        "Minutes from first segment hours = ${duration1_hour} * 60 = #{duration1_hour * 60} minutes.",
                        "Step 2: Add the minutes of the first segment.",
                        "Total minutes for first segment = #{duration1_hour * 60} + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                        "Step 3: Convert the hours of the second segment to minutes.",
                        "Minutes from second segment hours = ${duration2_hour} * 60 = #{duration2_hour * 60} minutes.",
                        "Step 4: Add the minutes of the second segment.",
                        "Total minutes for second segment = #{duration2_hour * 60} + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                        "Step 5: Add the total minutes of both segments.",
                        "Total duration of the workshop = #{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute)} minutes."                                              ))
                .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer game has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, followed by a second segment of ${duration2_hour} hours and ${duration2_minute} minutes. What is the total duration of the game in minutes?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 3)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 3)),
                                new Variable("duration2_minute", new Range(1, 59))
                        ))
                        .tip("Convert the hours to minutes and add all the minutes together to find the total duration.")
                        .preview(Arrays.asList(
                                "Convert the hours to minutes for both segments.",
                                "Add the minutes of both segments together."
                        ))
                        .answer("#{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment hours = ${duration1_hour} * 60 = #{duration1_hour * 60} minutes.",
                                "Step 2: Add the minutes of the first segment.",
                                "Total minutes for first segment = #{duration1_hour * 60} + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 3: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment hours = ${duration2_hour} * 60 = #{duration2_hour * 60} minutes.",
                                "Step 4: Add the minutes of the second segment.",
                                "Total minutes for second segment = #{duration2_hour * 60} + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                                "Step 5: Add the total minutes of both segments.",
                                "Total duration of the game = #{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute)} minutes."                                              ))
                        .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A conference has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, followed by a second segment of ${duration2_hour} hours and ${duration2_minute} minutes. What is the total duration of the conference in minutes?")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 5)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 5)),
                                new Variable("duration2_minute", new Range(1, 59))
                        ))
                        .tip("Convert the hours to minutes and add all the minutes together to find the total duration.")
                        .preview(Arrays.asList(
                                "Convert the hours of both segments to minutes.",
                                "Add all the minutes together."
                        ))
                        .answer("#{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment hours = ${duration1_hour} * 60 = #{duration1_hour * 60} minutes.",
                                "Step 2: Add the minutes of the first segment.",
                                "Total minutes for first segment = #{duration1_hour * 60} + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 3: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment hours = ${duration2_hour} * 60 = #{duration2_hour * 60} minutes.",
                                "Step 4: Add the minutes of the second segment.",
                                "Total minutes for second segment = #{duration2_hour * 60} + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                                "Step 5: Add the total minutes of both segments.",
                                "Total duration of the conference = #{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute)} minutes."                                              ))
                        .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A class has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, a second segment of ${duration2_hour} hours and ${duration2_minute} minutes, and a third segment of ${duration3_hour} hours and ${duration3_minute} minutes. What is the total duration of the class in minutes?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 5)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 5)),
                                new Variable("duration2_minute", new Range(1, 59)),
                                new Variable("duration3_hour", new Range(1, 5)),
                                new Variable("duration3_minute", new Range(1, 59))
                        ))
                        .tip("Convert the hours to minutes for each segment, sum up all the minutes, and find the total duration.")
                        .preview(Arrays.asList(
                                "Convert each segment's hours to minutes.",
                                "Sum up all the minutes."
                        ))
                        .answer("#{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment hours = ${duration1_hour} * 60 = #{duration1_hour * 60} minutes.",
                                "Step 2: Add the minutes of the first segment.",
                                "Total minutes for first segment = #{duration1_hour * 60} + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 3: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment hours = ${duration2_hour} * 60 = #{duration2_hour * 60} minutes.",
                                "Step 4: Add the minutes of the second segment.",
                                "Total minutes for second segment = #{duration2_hour * 60} + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                                "Step 5: Convert the hours of the third segment to minutes.",
                                "Minutes from third segment hours = ${duration3_hour} * 60 = #{duration3_hour * 60} minutes.",
                                "Step 6: Add the minutes of the third segment.",
                                "Total minutes for third segment = #{duration3_hour * 60} + ${duration3_minute} = #{duration3_hour * 60 + duration3_minute} minutes.",
                                "Step 7: Add the total minutes of all three segments.",
                                "Total duration of the class = #{(duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute)} minutes."                                              ))
                        .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A workshop has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, a second segment of ${duration2_hour} hours and ${duration2_minute} minutes, and a third segment of ${duration3_hour} hours and ${duration3_minute} minutes. What is the total duration of the workshop in minutes?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 5)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 5)),
                                new Variable("duration2_minute", new Range(1, 59)),
                                new Variable("duration3_hour", new Range(1, 5)),
                                new Variable("duration3_minute", new Range(1, 59))
                        ))
                        .tip("Convert all hours to minutes and add the total minutes from all segments to get the total duration in minutes.")
                        .preview(Arrays.asList(
                                "Convert each segment's hours to minutes.",
                                "Sum up all the minutes."
                        ))
                        .answer("#{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment hours = ${duration1_hour} * 60 = #{duration1_hour * 60} minutes.",
                                "Step 2: Add the minutes of the first segment.",
                                "Total minutes for first segment = #{duration1_hour * 60} + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 3: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment hours = ${duration2_hour} * 60 = #{duration2_hour * 60} minutes.",
                                "Step 4: Add the minutes of the second segment.",
                                "Total minutes for second segment = #{duration2_hour * 60} + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                                "Step 5: Convert the hours of the third segment to minutes.",
                                "Minutes from third segment hours = ${duration3_hour} * 60 = #{duration3_hour * 60} minutes.",
                                "Step 6: Add the minutes of the third segment.",
                                "Total minutes for third segment = #{duration3_hour * 60} + ${duration3_minute} = #{duration3_hour * 60 + duration3_minute} minutes.",
                                "Step 7: Add the total minutes of all three segments.",
                                "Total duration of the workshop = #{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute))}."                                              ))
                        .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A soccer match has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, a second segment of ${duration2_hour} hours and ${duration2_minute} minutes, and a third segment of ${duration3_hour} hours and ${duration3_minute} minutes. What is the total duration of the match in minutes?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 2)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 2)),
                                new Variable("duration2_minute", new Range(1, 59)),
                                new Variable("duration3_hour", new Range(1, 2)),
                                new Variable("duration3_minute", new Range(1, 59))
                        ))
                        .tip("Convert the hours of each segment to minutes and add all the minutes to find the total duration in minutes.")
                        .preview(Arrays.asList(
                                "Convert each segment's hours to minutes.",
                                "Sum up all the minutes to get the total duration."
                        ))
                        .answer("#{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment hours = ${duration1_hour} * 60 = #{duration1_hour * 60} minutes.",
                                "Step 2: Add the minutes of the first segment.",
                                "Total minutes for first segment = #{duration1_hour * 60} + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 3: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment hours = ${duration2_hour} * 60 = #{duration2_hour * 60} minutes.",
                                "Step 4: Add the minutes of the second segment.",
                                "Total minutes for second segment = #{duration2_hour * 60} + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                                "Step 5: Convert the hours of the third segment to minutes.",
                                "Minutes from third segment hours = ${duration3_hour} * 60 = #{duration3_hour * 60} minutes.",
                                "Step 6: Add the minutes of the third segment.",
                                "Total minutes for third segment = #{duration3_hour * 60} + ${duration3_minute} = #{duration3_hour * 60 + duration3_minute} minutes.",
                                "Step 7: Add the total minutes of all three segments.",
                                "Total duration of the match = #{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute))}."                                              ))
                        .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A meeting has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, a second segment of ${duration2_hour} hours and ${duration2_minute} minutes, and a third segment of ${duration3_hour} hours and ${duration3_minute} minutes, but is interrupted for 10 minutes during the second segment. What is the total time in minutes?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 3)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 3)),
                                new Variable("duration2_minute", new Range(1, 59)),
                                new Variable("duration3_hour", new Range(1, 3)),
                                new Variable("duration3_minute", new Range(1, 59))
                        ))
                        .tip("Convert all hours to minutes, add the total minutes, and subtract the interruption to get the total duration in minutes.")
                        .preview(Arrays.asList(
                                "Convert the hours to minutes and add all minutes.",
                                "Subtract the interruption from the total."
                        ))
                        .answer("#{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute - 10) + (duration3_hour * 60 + duration3_minute))}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment hours = ${duration1_hour} * 60 = #{duration1_hour * 60} minutes.",
                                "Step 2: Add the minutes of the first segment.",
                                "Total minutes for first segment = #{duration1_hour * 60} + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 3: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment hours = ${duration2_hour} * 60 = #{duration2_hour * 60} minutes.",
                                "Step 4: Add the minutes of the second segment and subtract the interruption.",
                                "Total minutes for second segment (adjusted) = #{duration2_hour * 60} + ${duration2_minute} - 10 = #{duration2_hour * 60 + duration2_minute - 10} minutes.",
                                "Step 5: Convert the hours of the third segment to minutes.",
                                "Minutes from third segment hours = ${duration3_hour} * 60 = #{duration3_hour * 60} minutes.",
                                "Step 6: Add the minutes of the third segment.",
                                "Total minutes for third segment = #{duration3_hour * 60} + ${duration3_minute} = #{duration3_hour * 60 + duration3_minute} minutes.",
                                "Step 7: Calculate the total time by summing up all adjusted minutes.",
                                "Total time = #{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute - 10) + (duration3_hour * 60 + duration3_minute))} minutes."                                              ))
                        .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A flight has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, a second segment of ${duration2_hour} hours and ${duration2_minute} minutes, and a third segment of ${duration3_hour} hours and ${duration3_minute} minutes, with a 20-minute layover. What is the total duration in minutes?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 10)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 10)),
                                new Variable("duration2_minute", new Range(1, 59)),
                                new Variable("duration3_hour", new Range(1, 10)),
                                new Variable("duration3_minute", new Range(1, 59))
                        ))
                        .tip("Convert all hours to minutes, add the minutes, and include the 20-minute layover to find the total duration.")
                        .preview(Arrays.asList(
                                "Add the hours converted to minutes and the minutes of all segments, plus the layover.",
                                "Provide the total in minutes."
                        ))
                        .answer("#{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute) + 20)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment = ${duration1_hour} * 60 + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 2: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment = ${duration2_hour} * 60 + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                                "Step 3: Convert the hours of the third segment to minutes.",
                                "Minutes from third segment = ${duration3_hour} * 60 + ${duration3_minute} = #{duration3_hour * 60 + duration3_minute} minutes.",
                                "Step 4: Add all minutes from the segments and the 20-minute layover.",
                                "Total minutes = #{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute) + 20)} minutes."                                              ))
                        .build());
        topic12Type2ProblemsBuilder.add(Problem.builder()
                        .statement("A class has a first segment of ${duration1_hour} hours and ${duration1_minute} minutes, a second segment of ${duration2_hour} hours and ${duration2_minute} minutes, and a third segment of ${duration3_hour} hours and ${duration3_minute} minutes, with a 25-minute break. What is the total duration in minutes?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("duration1_hour", new Range(1, 10)),
                                new Variable("duration1_minute", new Range(1, 59)),
                                new Variable("duration2_hour", new Range(1, 10)),
                                new Variable("duration2_minute", new Range(1, 59)),
                                new Variable("duration3_hour", new Range(1, 10)),
                                new Variable("duration3_minute", new Range(1, 59))
                        ))
                        .tip("Convert the hours to minutes, sum all minutes including the 25-minute break.")
                        .preview(Arrays.asList(
                                "Add the minutes of the three segments and include the break time.",
                                "Calculate the total in minutes."
                        ))
                        .answer("#{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute) + 25)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the hours of the first segment to minutes.",
                                "Minutes from first segment = ${duration1_hour} * 60 + ${duration1_minute} = #{duration1_hour * 60 + duration1_minute} minutes.",
                                "Step 2: Convert the hours of the second segment to minutes.",
                                "Minutes from second segment = ${duration2_hour} * 60 + ${duration2_minute} = #{duration2_hour * 60 + duration2_minute} minutes.",
                                "Step 3: Convert the hours of the third segment to minutes.",
                                "Minutes from third segment = ${duration3_hour} * 60 + ${duration3_minute} = #{duration3_hour * 60 + duration3_minute} minutes.",
                                "Step 4: Sum all the minutes from the three segments and add the 25-minute break.",
                                "Total minutes = #{((duration1_hour * 60 + duration1_minute) + (duration2_hour * 60 + duration2_minute) + (duration3_hour * 60 + duration3_minute) + 25)} minutes."                                              ))
                        .build());
    }
}
