package com.rasona.app.models.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Range implements Serializable {
    private int min;
    private int max;
}
