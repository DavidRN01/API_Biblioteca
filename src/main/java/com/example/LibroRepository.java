/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.List;
import models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author david
 */
public interface LibroRepository extends JpaRepository<Libro, Long> {
    
    public List<Libro> findByCategoria(String categoria);
    
    public List<Libro> findByAutor(String autor);
    
    public List<Libro> findByIsbn(String isbn);
    
    public List<Libro> findByEdicion(String edicion);
    
    @Query(value="SELECT libro.id, libro.titulo FROM Libro libro")
    public List<Object[]> listaBasica ();
    
}
