package com.rasona.app.models.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Topic implements Serializable {
    private String title;
    private String iconName;
    private String theory;
    @Builder.Default
    private List<ProblemType> problemTypes = new ArrayList<>();
    @Builder.Default
    private List<String> references = new ArrayList<>();

}