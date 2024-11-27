package com.rasona.app.models.input;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class Problem implements Serializable {
    private String statement;
    private int difficulty;
    private List<Variable> variables;
    private String tip;
    private List<String> preview;
    private String answer;
    private List<String> stepByStepSolution;
}
