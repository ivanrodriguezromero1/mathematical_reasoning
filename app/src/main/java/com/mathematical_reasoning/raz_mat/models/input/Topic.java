package com.mathematical_reasoning.raz_mat.models.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class Topic {
    private String title;
    private String theory;
    @JsonProperty("types_of_problems")
    private List<ProblemType> problemTypes;
    private List<String> references;
}