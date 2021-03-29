package com.diploma.diploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO {
    private String nombre;
    private ArrayList<AsignaturaDTO> asignaturas;

}
