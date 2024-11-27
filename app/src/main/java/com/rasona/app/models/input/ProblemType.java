package com.rasona.app.models.input;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ProblemType implements Serializable {
    private String type;
    private List<Problem> problems;
}
