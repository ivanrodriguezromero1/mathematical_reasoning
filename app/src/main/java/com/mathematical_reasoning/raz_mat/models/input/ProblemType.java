package com.mathematical_reasoning.raz_mat.models.input;

import lombok.Data;
import java.util.List;

@Data
public class ProblemType {
    private String type;
    private List<Problem> problems;
}
