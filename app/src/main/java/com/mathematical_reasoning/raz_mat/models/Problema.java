package com.mathematical_reasoning.raz_mat.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Problema {
    private String enunciado;
    private List<String> alternativas;
    private int clave;
    private String solucion;
    private String tip;
}
