/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.List;
import models.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DavidRamosNavas
 */
@RestController
@RequestMapping("/api")
public class LibroController {
    
    @Autowired
    private LibroRepository repo;
    
    @GetMapping("/")
    public List<Object[]> listaBasica() {
        return repo.listaBasica();
    }
    
    @GetMapping("/{id}")
    public Libro detalle(@PathVariable Long id) {
        Libro l = repo.getById(id);
        return l;
    }
    
    @GetMapping("/cat/{categoria}")
    public List<Libro> categoria(@PathVariable String categoria) {
        List<Libro> salida = repo.findByCategoria(categoria);
        return salida;
    }
    
}
