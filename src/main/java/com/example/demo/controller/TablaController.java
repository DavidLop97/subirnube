package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;  // <- Asegúrate de que sea este import
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Persona;

import java.util.Arrays;
import java.util.List;

@Controller
public class TablaController {

    @GetMapping("/tabla")  
    public String mostrarTabla(Model model) {
        List<Persona> personas = Arrays.asList(
            new Persona("David López", 25, "david@example.com"),
            new Persona("Ana Pérez", 30, "ana@example.com"),
            new Persona("Juan Gómez", 28, "juan@example.com")
        );

        model.addAttribute("personas", personas);
        return "tabla";  
    }
}