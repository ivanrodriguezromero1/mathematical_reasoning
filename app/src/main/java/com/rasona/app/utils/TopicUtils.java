package com.rasona.app.utils;

import android.util.Log;
import com.rasona.app.R;
import com.rasona.app.models.input.MathematicalReasoning;
import com.rasona.app.models.input.Topic;

import java.util.LinkedHashMap;
import java.util.Map;

public class TopicUtils {

    private static final String TAG = "TopicUtils";
    private static final Map<String, Integer> ICON_MAP = new LinkedHashMap<>();

    static {
        ICON_MAP.put("icon_basic_arithmetic", R.drawable.symbols_calculate);
        ICON_MAP.put("icon_exponents_percentages", R.drawable.symbols_percent);
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
    }

    public static Map<String, Integer> createTopicMap(MathematicalReasoning reasoning) {
        Map<String, Integer> topicMap = new LinkedHashMap<>();
        try {
            for (Topic topic : reasoning.getTopics()) {
                String title = topic.getTitle();
                String iconName = topic.getIconName();
                Integer imageResource = ICON_MAP.get(iconName);
                if (imageResource != null) {
                    topicMap.put(title, imageResource);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error creating topic map: " + e.getMessage(), e);
        }
        return topicMap;
    }
}
