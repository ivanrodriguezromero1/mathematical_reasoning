package com.rasona.app.models.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class Variable implements Serializable {
    private String name;
    private Range range;
}
