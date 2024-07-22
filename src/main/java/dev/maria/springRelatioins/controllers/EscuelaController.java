package dev.maria.springRelatioins.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dev.maria.springRelatioins.models.Escuela;
import dev.maria.springRelatioins.repositories.EscuelaRepository;

import java.util.List;



@RestController
@RequestMapping("/escuelas")
public class EscuelaController {

    @Autowired
    private EscuelaRepository escuelaRepository;

    @GetMapping
    public List<Escuela> getAllEscuelas() {
        return escuelaRepository.findAll();
    }

    @PostMapping
    public Escuela createEscuela(@RequestBody Escuela escuela) {
        return escuelaRepository.save(escuela);
    }

    // Otros métodos para actualizar, eliminar, etc.
}

