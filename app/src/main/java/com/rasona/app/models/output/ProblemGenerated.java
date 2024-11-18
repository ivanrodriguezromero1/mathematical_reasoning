package com.rasona.app.models.output;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemGenerated {
    private String statement;
    private List<String> alternatives;
    private int correctKeyIndex;
    private String answer;
    private String preview;
    private String solution;
    private String tip;
}
