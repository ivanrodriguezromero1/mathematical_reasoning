package com.rasona.rasona.utils;

import com.rasona.rasona.models.input.MathematicalReasoning;

public class SharedData {
    private static SharedData instance;
    private MathematicalReasoning reasoning;

    private SharedData() {
    }

    public static SharedData getInstance() {
        if (instance == null) {
            instance = new SharedData();
        }
        return instance;
    }

    public MathematicalReasoning getReasoning() {
        return reasoning;
    }

    public void setReasoning(MathematicalReasoning reasoning) {
        this.reasoning = reasoning;
    }
}
