package com.mathematical_reasoning.raz_mat.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problem {
    private String statement;
    private List<String> alternatives;
    private int correctKeyIndex;
    private String precalculate;
    private String solution;
    private String tip;
}
