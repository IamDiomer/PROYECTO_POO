package org.example.controlador;

import org.example.models.Comic;
import org.example.servicio.ComicServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/comics")
public class ComicControlador {
    @Autowired
    private ComicServicio servicio;
    @GetMapping
    public List<Comic> index() {
        return servicio.listarComics();
    }
    @PostMapping
    public Comic store(@RequestBody Comic comic) {
        return servicio.agregarComic(comic);
    }
    @PutMapping("/{id}")
    public Comic update(@PathVariable("id") Long id, @RequestBody Comic comic) {

        Comic c = new Comic();
        c.setId(id);
        c.setTitulo(comic.getTitulo());
        c.setAutor(comic.getAutor());
        c.setEditorial(comic.getEditorial());
        c.setGenero(comic.getGenero());
        c.setAnio_publicacion(comic.getAnio_publicacion());
        c.setNumero_paginas(comic.getNumero_paginas());

        return  servicio.actualizarComic(c);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        servicio.eliminarComic(id);
    }
}