package com.rasona.app.utils.topic;

import com.rasona.app.models.input.Topic;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopicTheories {

    @Getter
    private static final List<Topic> topicsTheories = new ArrayList<>();

    static {

        topicsTheories.add(Topic.builder()
                .title("Basic Arithmetic Operations")
                .theory("Basic arithmetic operations involve addition, subtraction, multiplication, and division, which are the foundational mathematical operations used to manipulate numbers and perform calculations. They serve as the basis for more complex mathematical concepts and are essential in everyday life.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/arithmetic",
                        "https://mathworld.wolfram.com/Arithmetic.html",
                        "https://www.britannica.com/science/arithmetic"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Exponents and Percentages")
                .theory("Exponents are used to represent repeated multiplication of a base number, while percentages are a way to express a number as a fraction of 100. These mathematical concepts are crucial for understanding growth, interest rates, proportions, and comparisons in various contexts such as finance, science, and everyday calculations.")
                .references(Arrays.asList(
                        "https://www.mathsisfun.com/exponents.html",
                        "https://www.britannica.com/science/percentage",
                        "https://www.khanacademy.org/math/pre-algebra/pre-algebra-exponents-radicals"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Basic Fraction Operations")
                .theory("Basic fraction operations include addition, subtraction, multiplication, and division of fractions. These operations require understanding how to find a common denominator for addition and subtraction, as well as applying rules for multiplying and dividing numerators and denominators. Mastery of fractions is crucial in mathematical problem-solving, measurements, and real-world applications.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/arithmetic/fractions",
                        "https://www.mathsisfun.com/fractions.html",
                        "https://www.britannica.com/science/fraction-mathematics"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Fraction Division and Conversion")
                .theory("Fraction division involves inverting the divisor and then multiplying. Converting fractions may include changing improper fractions to mixed numbers, converting between decimals and fractions, or simplifying fractions. These concepts are essential for accurately handling fractional values in mathematical operations, problem-solving, and real-world contexts.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/arithmetic/fraction-arithmetic",
                        "https://www.mathsisfun.com/fractions-division.html",
                        "https://www.britannica.com/science/fraction-mathematics#ref813470"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Arithmetic Sequences")
                .theory("An arithmetic sequence is a sequence of numbers in which the difference between consecutive terms is constant. This difference is called the common difference. Arithmetic sequences are commonly used to model linear patterns in mathematics, and they have applications in areas such as finance, engineering, and everyday problem-solving.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/algebra/sequences",
                        "https://www.mathsisfun.com/algebra/sequences.html",
                        "https://www.britannica.com/science/arithmetic-progression"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Geometric Sequences")
                .theory("A geometric sequence is a sequence of numbers where each term after the first is found by multiplying the previous term by a constant called the common ratio. Geometric sequences are used to represent exponential growth or decay and have applications in fields such as finance, physics, and computer science.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/algebra/sequences/geometric-sequences",
                        "https://www.mathsisfun.com/algebra/sequences-geometric.html",
                        "https://www.britannica.com/science/geometric-progression"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Current Age Calculations")
                .theory("Current age calculations involve determining a person's present age based on known information, such as their age difference with another person or a specific event in the past or future. These problems are common in mathematics and help to build logical thinking and problem-solving skills.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/pre-algebra/pre-algebra-arithmetic-reasoning",
                        "https://www.math-only-math.com/age-word-problems.html",
                        "https://www.bbc.co.uk/bitesize/guides/z6j6fg8/revision/1"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Age Relations Over Time")
                .theory("Age relations over time focus on determining changes in age relationships between individuals over different periods. These problems often require comparing ages in the past, present, and future, and are used to enhance logical thinking and algebraic reasoning.")
                .references(Arrays.asList(
                        "https://www.math-only-math.com/age-word-problems.html",
                        "https://www.khanacademy.org/math/algebra/x2f8bb11595b61c86:systems-of-equations/age-word-problems/v/age-word-problems",
                        "https://www.bbc.co.uk/bitesize/guides/z7mqtfr/revision/3"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Distance and Speed Calculations")
                .theory("Distance and speed calculations involve determining the relationship between distance, speed, and time using formulas such as distance = speed × time. These calculations are fundamental in understanding motion, travel scenarios, and physics, and are widely applied in real-world contexts, including transportation and logistics.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/science/physics/one-dimensional-motion",
                        "https://www.mathsisfun.com/speed-time-distance.html",
                        "https://www.bbc.co.uk/bitesize/guides/zc2hsrd/revision/1"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Relative Motion Problems")
                .theory("Relative motion problems involve determining the motion of objects with respect to each other, often requiring the calculation of relative speeds and distances. These problems are used to understand scenarios where multiple objects move towards or away from each other, commonly applied in physics and transportation scenarios.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/science/physics/one-dimensional-motion/relative-velocity",
                        "https://www.mathsisfun.com/geometry/motion-relative.html",
                        "https://www.britannica.com/science/relative-motion"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Elapsed Time Calculations")
                .theory("Elapsed time calculations involve finding the difference in time between two events or determining the duration of an event. These calculations are commonly used in scheduling, time management, and various real-world scenarios where time intervals are important.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/cc-3rd-grade-math/cc-3rd-measurement-data/cc-3rd-elapsed-time",
                        "https://www.mathsisfun.com/time-calculations.html",
                        "https://www.bbc.co.uk/bitesize/topics/zm4k7ty/articles/ztwkvwx"
                ))
                .build());

        topicsTheories.add(Topic.builder()
                .title("Time Interval Analysis")
                .theory("Time interval analysis involves measuring and comparing the duration between different events or segments of time. This analysis helps in understanding schedules, sequences, and breaks within a given period, and is used widely in project management, scheduling, and various mathematical applications.")
                .references(Arrays.asList(
                        "https://www.khanacademy.org/math/cc-4th-grade-math/cc-4th-measurement-topic/cc-4th-intervals-time",
                        "https://www.mathsisfun.com/measure/time-intervals.html",
                        "https://www.britannica.com/science/time-physics/Time-intervals"
                ))
                .build());

    }
}
