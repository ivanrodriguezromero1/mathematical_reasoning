package com.rasona.app.utils.topic;

import android.util.Log;
import com.rasona.app.models.input.*;
import lombok.Getter;

import java.util.*;

import static com.rasona.app.utils.IconMap.ICON_MAP;
import static com.rasona.app.utils.topic.TopicIcons.topicsIcons;

public class TopicUtils {

    private static final String TAG = "TopicUtils";

    public static Map<String, Integer> getTopicsIconsResources() {
        Map<String, Integer> topicIconsResources = new LinkedHashMap<>();
        try {
            for (Topic topic : topicsIcons) {
                String title = topic.getTitle();
                String iconName = topic.getIconName();
                Integer imageResource = ICON_MAP.get(iconName);
                if (imageResource != null) {
                    topicIconsResources.put(title, imageResource);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Error creating topic map: " + e.getMessage(), e);
        }
        return topicIconsResources;
    }

}
