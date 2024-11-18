package com.rasona.app.models.input;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MathematicalReasoning implements Serializable {
    private List<Topic> topics;
}
