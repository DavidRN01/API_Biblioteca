/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author david
 */

@Controller
@RequestMapping("/web")
public class LibroWebController {
    
    @Autowired
    private LibroRepository repo;
    
    @GetMapping("/")
    public String listado(Model model) {
        model.addAttribute("libro", repo.findAll());
        return "listado";
    }
    
}
