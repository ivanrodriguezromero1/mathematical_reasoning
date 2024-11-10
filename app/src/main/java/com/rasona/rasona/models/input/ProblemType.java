package com.rasona.rasona.models.input;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProblemType implements Serializable {
    private String type;
    private List<Problem> problems;
}
