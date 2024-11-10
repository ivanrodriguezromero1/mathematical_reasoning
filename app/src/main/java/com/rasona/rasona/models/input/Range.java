package com.rasona.rasona.models.input;

import lombok.Data;

import java.io.Serializable;

@Data
public class Range implements Serializable {
    private int min;
    private int max;
}
