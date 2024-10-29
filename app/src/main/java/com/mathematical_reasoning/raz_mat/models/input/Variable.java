package com.mathematical_reasoning.raz_mat.models.input;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Variable implements Serializable {
    private String name;
    @JsonProperty("variable_type")
    private String variableType;
    private Range range;
}
