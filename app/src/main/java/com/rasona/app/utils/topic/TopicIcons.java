package com.rasona.app.utils.topic;

import com.rasona.app.models.input.Topic;

import java.util.ArrayList;
import java.util.List;

public class TopicIcons {
    public static final List<Topic> topicsIcons = new ArrayList<>();
    static {

        topicsIcons.add(Topic.builder()
                .title("Basic Arithmetic Operations")
                .iconName("icon_basic_arithmetic")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Exponents and Percentages")
                .iconName("icon_exponents_percentages")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Basic Fraction Operations")
                .iconName("icon_basic_fractions")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Fraction Division and Conversion")
                .iconName("icon_fraction_division_conversion")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Arithmetic Sequences")
                .iconName("icon_arithmetic_sequences")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Geometric Sequences")
                .iconName("icon_geometric_sequences")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Current Age Calculations")
                .iconName("icon_age_calculations")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Age Relations Over Time")
                .iconName("icon_age_relations")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Distance and Speed Calculations")
                .iconName("icon_distance_speed")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Relative Motion Problems")
                .iconName("icon_relative_motion")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Elapsed Time Calculations")
                .iconName("icon_elapsed_time")
                .build());

        topicsIcons.add(Topic.builder()
                .title("Time Interval Analysis")
                .iconName("icon_time_interval")
                .build());

    }
}
