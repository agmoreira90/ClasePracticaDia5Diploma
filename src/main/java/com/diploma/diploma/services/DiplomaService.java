package com.diploma.diploma.services;

import com.diploma.diploma.dto.AlumnoDTO;
import com.diploma.diploma.dto.DiplomaDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DiplomaService {
    public static ResponseEntity getDiploma(AlumnoDTO alumno){
        Double promedio = promedio(alumno);
        String mensaje = "";
        if(promedio > 9){
            mensaje = "Felicitaciones, se ha recibido con promedio: ";
        }else {
            mensaje = "Se ha recibido con promedio: ";
        }
        DiplomaDTO diploma = new DiplomaDTO(mensaje + promedio,promedio,alumno);
        return new ResponseEntity(diploma, HttpStatus.OK);
    }

    private static Double promedio(AlumnoDTO alumno){
        Double promedio = 0.0;
        if(alumno.getAsignaturas().size() > 0) {
            for (int i = 0; i < alumno.getAsignaturas().size(); i++) {
                promedio += alumno.getAsignaturas().get(i).getNota();
            }
            promedio = promedio / alumno.getAsignaturas().size();
        }
        return promedio;
    }
}
