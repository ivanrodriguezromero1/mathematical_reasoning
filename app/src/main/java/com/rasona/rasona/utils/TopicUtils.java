package com.rasona.rasona.utils;

import com.rasona.rasona.R;
import com.rasona.rasona.models.input.MathematicalReasoning;
import com.rasona.rasona.models.input.Topic;

import java.util.LinkedHashMap;
import java.util.Map;

public class TopicUtils {

    private static final Map<String, Integer> ICON_MAP = new LinkedHashMap<>();

    static {
        ICON_MAP.put("icon_basic_arithmetic", R.drawable.symbols_calculate);
        ICON_MAP.put("icon_exponents_percentages",R.drawable.symbols_percent);
        ICON_MAP.put("icon_basic_fractions", R.drawable.symbols_incomplete_circle);
        ICON_MAP.put("icon_fraction_division_conversion", R.drawable.symbols_shape_line);
        ICON_MAP.put("icon_arithmetic_sequences", R.drawable.symbols_123);
        ICON_MAP.put("icon_geometric_sequences", R.drawable.symbols_pin);
        ICON_MAP.put("icon_age_calculations", R.drawable.symbols_face_4);
        ICON_MAP.put("icon_age_relations", R.drawable.symbols_elderly);
        ICON_MAP.put("icon_distance_speed", R.drawable.symbols_local_shipping);
        ICON_MAP.put("icon_relative_motion", R.drawable.symbols_directions_car);
        ICON_MAP.put("icon_elapsed_time", R.drawable.symbols_scale);
        ICON_MAP.put("icon_time_interval", R.drawable.symbols_timer);
        ICON_MAP.put("icon_permutations_combinations", R.drawable.symbols_grid_on);
        ICON_MAP.put("icon_advanced_combinatorial", R.drawable.symbols_widgets);
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
