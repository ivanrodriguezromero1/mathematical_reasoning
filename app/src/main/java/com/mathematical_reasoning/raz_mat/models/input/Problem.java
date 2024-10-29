package com.mathematical_reasoning.raz_mat.models.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class Problem {
    private String statement;
    private int difficulty;
    private List<Variable> variables;
    private String tip;
    private List<String> preview;
    private String answer;
    @JsonProperty("step_by_step_solution")
    private List<String> stepByStepSolution;
}
