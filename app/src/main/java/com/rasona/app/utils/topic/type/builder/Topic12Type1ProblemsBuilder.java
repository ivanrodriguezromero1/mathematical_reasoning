package com.rasona.app.utils.topic.type.builder;

import com.rasona.app.models.input.Problem;
import com.rasona.app.models.input.Range;
import com.rasona.app.models.input.Variable;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topic12Type1ProblemsBuilder {
    @Getter
    public static final List<Problem> topic12Type1ProblemsBuilder = new ArrayList<>();

    static {
        topic12Type1ProblemsBuilder.add(Problem.builder()
                .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A class starts at ${event_hour} hours and ${event_minute} minutes, which may be today or on the next day. Calculate the total minutes left until the class starts.")
                .difficulty(0)
                .variables(Arrays.asList(
                        new Variable("current_hour", new Range(0, 23)),
                        new Variable("current_minute", new Range(0, 59)),
                        new Variable("event_hour", new Range(0, 23)),
                        new Variable("event_minute", new Range(0, 59))
                ))
                .tip("Convert both times to total minutes from midnight. If the event occurs the next day, add 1440 minutes (24 hours) to the event time.")
                .preview(Arrays.asList(
                        "Convert the current time and event time to total minutes.",
                        "Add 1440 minutes to the event time if it is on the next day."
                ))
                .answer("#{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}")
                .stepByStepSolution(Arrays.asList(
                        "Step 1: Convert the current time to total minutes from midnight.",
                        "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                        "Step 3: Convert the event time to total minutes from midnight.",
                        "Step 4: Event minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                        "Step 5: Add 1440 minutes to the event time to handle next-day scenarios.",
                        "Step 6: Calculate the remaining minutes: #{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}."
                ))
                .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A soccer match starts at ${event_hour} hours and ${event_minute} minutes. Calculate the total minutes left until the match starts, considering the match may occur today or on the next day.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Convert both times to total minutes from midnight. If the event is scheduled for the next day, add 1440 minutes (24 hours) to the event time.")
                        .preview(Arrays.asList(
                                "Convert the current time and event time to total minutes.",
                                "If needed, add 1440 minutes to handle events occurring the next day."
                        ))
                        .answer("#{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the event time to total minutes from midnight.",
                                "Step 4: Event minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Add 1440 minutes to the event time to account for next-day events.",
                                "Step 6: Calculate the remaining minutes until the event: #{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A conference is scheduled at ${event_hour} hours and ${event_minute} minutes. Calculate the total minutes left until the conference starts, assuming it may be today or on the next day.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Convert both times to total minutes from midnight. If the event occurs on the next day, add 1440 minutes (24 hours) to the event time.")
                        .preview(Arrays.asList(
                                "Convert the current time and event time to total minutes.",
                                "Add 1440 minutes to the event time to handle events that may occur the next day."
                        ))
                        .answer("#{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the event time to total minutes from midnight.",
                                "Step 4: Event minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Add 1440 minutes to the event time to handle next-day scenarios.",
                                "Step 6: Calculate the remaining minutes: #{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A train departs at ${event_hour} hours and ${event_minute} minutes. Calculate the total minutes left until the train departs, assuming it may be today or on the next day.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Convert both times to total minutes from midnight. If the event is scheduled for the next day, add 1440 minutes (24 hours) to the event time.")
                        .preview(Arrays.asList(
                                "Convert the current time and departure time to total minutes.",
                                "Add 1440 minutes to the departure time to handle next-day departures."
                        ))
                        .answer("#{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the departure time to total minutes from midnight.",
                                "Step 4: Departure minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Add 1440 minutes to the departure time to account for next-day scenarios.",
                                "Step 6: Calculate the remaining minutes until the departure: #{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A train departs at ${event_hour} hours and ${event_minute} minutes. Calculate the total minutes left until the train's departure, considering it may be today or on the next day.")
                        .difficulty(0)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Convert both times to total minutes from midnight. If the departure time is scheduled for the next day, add 1440 minutes (24 hours) to handle this scenario.")
                        .preview(Arrays.asList(
                                "Convert the current time and departure time to total minutes from midnight.",
                                "Add 1440 minutes to the departure time for next-day departures."
                        ))
                        .answer("#{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the departure time to total minutes from midnight.",
                                "Step 4: Departure minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Add 1440 minutes to the departure time to handle next-day departures if needed.",
                                "Step 6: Calculate the remaining minutes: #{(event_hour * 60 + event_minute + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A soccer game scheduled to start at ${event_hour} hours and ${event_minute} minutes is delayed by 15 minutes. How many total minutes are left until the game starts with the delay?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Convert the current and event start (adjusted for the delay) times to total minutes from midnight, then subtract to find the remaining time. Consider adding 1440 minutes (24 hours) if needed to avoid negative results.")
                        .preview(Arrays.asList(
                                "Convert the current time and adjusted event start time to total minutes.",
                                "Calculate the remaining minutes."
                        ))
                        .answer("#{(event_hour * 60 + event_minute + 15 + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the event start time to total minutes from midnight.",
                                "Step 4: Event start minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Adjust the event start time for the 15-minute delay.",
                                "Step 6: Adjusted event start minutes = #{event_hour * 60 + event_minute + 15} minutes.",
                                "Step 7: Add 1440 minutes to handle next-day events if needed.",
                                "Step 8: Calculate the remaining minutes = #{(event_hour * 60 + event_minute + 15 + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A conference originally scheduled for ${event_hour} hours and ${event_minute} minutes is moved up by 10 minutes. How many total minutes are left until the conference starts with the new timing?")
                        .difficulty(1)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Convert the current and event hours and minutes (adjusted for the earlier start) to minutes from midnight, then subtract to find the remaining time. Consider adding 1440 minutes (24 hours) if needed to avoid negative results.")
                        .preview(Arrays.asList(
                                "Convert the current time and the adjusted event start time to total minutes.",
                                "Calculate the remaining minutes."
                        ))
                        .answer("#{(event_hour * 60 + event_minute - 10 + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the event start time to total minutes from midnight.",
                                "Step 4: Event start minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Adjust the event start time for the 10-minute advancement.",
                                "Step 6: Adjusted event start minutes = #{event_hour * 60 + event_minute - 10} minutes.",
                                "Step 7: Add 1440 minutes to handle next-day events if needed.",
                                "Step 8: Calculate the remaining minutes = #{(event_hour * 60 + event_minute - 10 + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A meeting scheduled for ${event_hour} hours and ${event_minute} minutes is moved up by 20 minutes. How many total minutes are left until the meeting starts with the new timing?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Adjust the meeting start time by subtracting 20 minutes and calculate the remaining time from the current time, converting to total minutes for easier calculations.")
                        .preview(Arrays.asList(
                                "Convert the current time and adjusted start time to minutes from midnight.",
                                "Calculate the difference in total minutes."
                        ))
                        .answer("#{(event_hour * 60 + event_minute - 20 + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the event start time to total minutes from midnight.",
                                "Step 4: Event start minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Adjust the event start time by moving it up by 20 minutes.",
                                "Step 6: Adjusted event start minutes = #{event_hour * 60 + event_minute - 20}.",
                                "Step 7: Add 1440 minutes to handle next-day events if necessary.",
                                "Step 8: Calculate the remaining time in total minutes = #{(event_hour * 60 + event_minute - 20 + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A flight scheduled to depart at ${event_hour} hours and ${event_minute} minutes is delayed by 45 minutes. How many total minutes are left until the flight's departure with the delay?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Calculate the total delay by adding 45 minutes to the scheduled departure time, convert all times to minutes, and find the difference.")
                        .preview(Arrays.asList(
                                "Convert the current time and adjusted departure time to total minutes.",
                                "Calculate the difference in total minutes."
                        ))
                        .answer("#{(event_hour * 60 + event_minute + 45 + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the scheduled departure time to total minutes from midnight.",
                                "Step 4: Scheduled departure minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Add the 45-minute delay to the departure time.",
                                "Step 6: Adjusted departure minutes = #{event_hour * 60 + event_minute + 45}.",
                                "Step 7: Add 1440 minutes to handle next-day calculations if necessary.",
                                "Step 8: Calculate the remaining time in total minutes = #{(event_hour * 60 + event_minute + 45 + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
        topic12Type1ProblemsBuilder.add(Problem.builder()
                        .statement("The current time is ${current_hour} hours and ${current_minute} minutes. A class scheduled for ${event_hour} hours and ${event_minute} minutes is moved up by 25 minutes. How many minutes are left until the class starts with the new timing?")
                        .difficulty(2)
                        .variables(Arrays.asList(
                                new Variable("current_hour", new Range(0, 23)),
                                new Variable("current_minute", new Range(0, 59)),
                                new Variable("event_hour", new Range(0, 23)),
                                new Variable("event_minute", new Range(0, 59))
                        ))
                        .tip("Calculate the adjusted start time by subtracting 25 minutes from the scheduled class time and determine the remaining time in minutes from the current time.")
                        .preview(Arrays.asList(
                                "Convert the current time and the adjusted start time to total minutes from midnight.",
                                "Calculate the difference in total minutes."
                        ))
                        .answer("#{(event_hour * 60 + event_minute - 25 + 1440) - (current_hour * 60 + current_minute)}")
                        .stepByStepSolution(Arrays.asList(
                                "Step 1: Convert the current time to total minutes from midnight.",
                                "Step 2: Current minutes = (${current_hour} * 60) + ${current_minute} = #{current_hour * 60 + current_minute} minutes.",
                                "Step 3: Convert the scheduled class start time to total minutes from midnight.",
                                "Step 4: Scheduled start minutes = (${event_hour} * 60) + ${event_minute} = #{event_hour * 60 + event_minute} minutes.",
                                "Step 5: Adjust the start time by moving it up by 25 minutes.",
                                "Step 6: Adjusted start minutes = #{event_hour * 60 + event_minute - 25}.",
                                "Step 7: Add 1440 minutes to handle next-day calculations if necessary.",
                                "Step 8: Calculate the remaining time in total minutes = #{(event_hour * 60 + event_minute - 25 + 1440) - (current_hour * 60 + current_minute)}."
                        ))
                        .build());
    }
}
