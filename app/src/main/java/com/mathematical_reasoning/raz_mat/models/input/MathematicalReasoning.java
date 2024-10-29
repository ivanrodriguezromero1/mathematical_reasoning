package com.mathematical_reasoning.raz_mat.models.input;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MathematicalReasoning implements Serializable {
    private List<Topic> topics;
}
