package com.diploma.diploma.controllers;

import com.diploma.diploma.dto.AlumnoDTO;
import com.diploma.diploma.services.DiplomaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facultad")
public class DiplomaController {
    @PostMapping("/diploma")
    public ResponseEntity calcularMetrosCuadrados(@RequestBody AlumnoDTO alumno) {
        return DiplomaService.getDiploma(alumno);
    }
}
