package com.rasona.rasona.utils;

import com.rasona.rasona.R;
import com.rasona.rasona.models.input.MathematicalReasoning;
import com.rasona.rasona.models.input.Topic;

import java.util.LinkedHashMap;
import java.util.Map;

public class TopicUtils {

    private static final Map<String, Integer> ICON_MAP = new LinkedHashMap<>();

    static {
        ICON_MAP.put("icon_successions", R.drawable.symbols_123);
        ICON_MAP.put("icon_age_problems", R.drawable.symbols_face_4);
        ICON_MAP.put("icon_mobile_problems", R.drawable.symbols_directions_car);
        ICON_MAP.put("icon_timing", R.drawable.symbols_timer);
        ICON_MAP.put("icon_probabilities", R.drawable.symbols_casino);
        ICON_MAP.put("icon_logical_reasoning", R.drawable.symbols_cognition);
        ICON_MAP.put("icon_truth_and_lies", R.drawable.symbols_balance);
        ICON_MAP.put("icon_information_sorting", R.drawable.symbols_sort);
        ICON_MAP.put("icon_propositional_logic", R.drawable.symbols_arrow_forward);
        ICON_MAP.put("icon_inferential_logic", R.drawable.symbols_quick_reference_all);
        ICON_MAP.put("icon_inductive_reasoning", R.drawable.symbols_trending_up);
        ICON_MAP.put("icon_deductive_reasoning", R.drawable.symbols_fact_check);
        ICON_MAP.put("icon_equation_setup", R.drawable.symbols_cancel_presentation);
        ICON_MAP.put("icon_diophantine_equations", R.drawable.symbols_numbers);
        ICON_MAP.put("icon_math_operations", R.drawable.symbols_calculate);
        ICON_MAP.put("icon_magnitude_comparison", R.drawable.symbols_scale);
        ICON_MAP.put("icon_fractions", R.drawable.symbols_incomplete_circle);
        ICON_MAP.put("icon_percentage_calculations", R.drawable.symbols_percent);
        ICON_MAP.put("icon_figure_counting", R.drawable.symbols_grid_on);
        ICON_MAP.put("icon_minimal_events", R.drawable.symbols_linear_scale);
        ICON_MAP.put("icon_intro_combinatorial_analysis", R.drawable.symbols_bar_chart);
        ICON_MAP.put("icon_areas_and_perimeters", R.drawable.symbols_square_foot);
    }

    public static Map<String, Integer> createTopicMap(MathematicalReasoning reasoning) {
        Map<String, Integer> topicMap = new LinkedHashMap<>();
        for (Topic topic : reasoning.getTopics()) {
            String title = topic.getTitle();
            String iconName = topic.getIconName();
            Integer imageResource = ICON_MAP.get(iconName);
            if (imageResource != null) {
                topicMap.put(title, imageResource);
            }
        }
        return topicMap;
    }
}
