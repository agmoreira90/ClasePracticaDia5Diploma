package com.diploma.diploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiplomaDTO {
    private String mensaje;
    private Double promedio;
    private AlumnoDTO alumno;
}
