package com.mathematical_reasoning.raz_mat.models.input;

import lombok.Data;

import java.io.Serializable;

@Data
public class Range implements Serializable {
    private int min;
    private int max;
}
