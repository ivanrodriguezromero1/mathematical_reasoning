package com.rasona.app.utils.topic;

import com.rasona.app.models.input.*;
import com.rasona.app.utils.topic.type.builder.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TopicProblems {
    @Getter
    private static final List<Topic> topicsProblems = new ArrayList<>();

    static {

        topicsProblems.add(Topic.builder()
                .title("Basic Arithmetic Operations")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Calculate the result of adding or subtracting integers")
                                .problems(Topic1Type1ProblemBuilder.getTopic1Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Calculate the result of multiplying or dividing integers")
                                .problems(Topic1Type2ProblemBuilder.getTopic1Type2ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Solve combined basic operations")
                                .problems(Topic1Type3ProblemBuilder.getTopic1Type3ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Exponents and Percentages")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Solve problems involving powers and square roots")
                                .problems(Topic2Type1ProblemBuilder.getTopic2Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Solve percentage problems")
                                .problems(Topic2Type2ProblemBuilder.getTopic2Type2ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Basic Fraction Operations")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Calculate the sum of three fractions with different denominators and simplify the result")
                                .problems(Topic3Type1ProblemBuilder.getTopic3Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Subtract one mixed fraction from another, both with different denominators")
                                .problems(Topic3Type2ProblemBuilder.getTopic3Type2ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Multiply two complex fractions and convert the result into a mixed number")
                                .problems(Topic3Type3ProblemBuilder.getTopic3Type3ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Fraction Division and Conversion")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Divide an improper fraction by a proper fraction and simplify the result")
                                .problems(Topic4Type1ProblemBuilder.getTopic4Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Calculate the fraction that represents a part of a given mixed number")
                                .problems(Topic4Type2ProblemBuilder.getTopic4Type2ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Arithmetic Sequences")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Find the n-th term of an arithmetic sequence")
                                .problems(Topic5Type1ProblemBuilder.getTopic5Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Find the common difference in a first-order arithmetic sequence")
                                .problems(Topic5Type2ProblemBuilder.getTopic5Type2ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Geometric Sequences")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Find the common ratio in a geometric sequence")
                                .problems(Topic6Type1ProblemBuilder.getTopic6Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Find the first term of an arithmetic sequence")
                                .problems(Topic6Type2ProblemBuilder.getTopic6Type2ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Current Age Calculations")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Calculate a person's current age based on the age difference")
                                .problems(Topic7Type1ProblemBuilder.getTopic7Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Find a person's age in the future given a number of years")
                                .problems(Topic7Type2ProblemsBuilder.getTopic7Type2ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Calculate a person's age in the past given a number of years")
                                .problems(Topic7Type3ProblemsBuilder.getTopic7Type3ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Age Relations Over Time")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Find a person's age when the age relationship between two people changes over time")
                                .problems(Topic8Type1ProblemsBuilder.getTopic8Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Determine a person's current age if their age in the past and in the future is known")
                                .problems(Topic8Type2ProblemsBuilder.getTopic8Type2ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Distance and Speed Calculations")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Calculate the distance traveled by an object given the time and speed")
                                .problems(Topic9Type1ProblemsBuilder.getTopic9Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Find the time required for an object to travel a given distance at a constant speed")
                                .problems(Topic9Type2ProblemsBuilder.getTopic9Type2ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Calculate the speed of an object given the time and distance traveled")
                                .problems(Topic9Type3ProblemsBuilder.getTopic9Type3ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Relative Motion Problems")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Determine the total distance traveled by two objects moving in the same direction")
                                .problems(Topic10Type1ProblemsBuilder.getTopic10Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Calculate the meeting time of two mobiles moving in opposite directions")
                                .problems(Topic10Type2ProblemsBuilder.getTopic10Type2ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Elapsed Time Calculations")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Calculate the elapsed time between two events given in hours and minutes")
                                .problems(Topic11Type1ProblemsBuilder.getTopic11Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Find the end time if the start time and duration are known")
                                .problems(Topic11Type2ProblemsBuilder.getTopic11Type2ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Calculate the start time if the end time and duration are known")
                                .problems(Topic11Type3ProblemsBuilder.getTopic11Type3ProblemsBuilder())
                                .build()
                ))
                .build());

        topicsProblems.add(Topic.builder()
                .title("Time Interval Analysis")
                .problemTypes(Arrays.asList(
                        ProblemType.builder()
                                .type("Determine the remaining time until a known future event")
                                .problems(Topic12Type1ProblemsBuilder.getTopic12Type1ProblemsBuilder())
                                .build(),
                        ProblemType.builder()
                                .type("Calculate the total time in an interval with multiple consecutive segments")
                                .problems(Topic12Type2ProblemsBuilder.getTopic12Type2ProblemsBuilder())
                                .build()
                ))
                .build());

    }
}
