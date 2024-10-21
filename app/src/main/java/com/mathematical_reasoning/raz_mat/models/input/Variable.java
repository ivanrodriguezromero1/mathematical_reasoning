package com.mathematical_reasoning.raz_mat.models.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Variable {
    private String name;
    @JsonProperty("variable_type")
    private String variableType;
    private Range range;
}
