package org.example.servicio;

import org.example.models.Comic;

import java.util.List;

public interface InterfaceComicServicio {
    public List<Comic> listarComics();
    public Comic agregarComic(Comic comic);
    public Comic actualizarComic(Comic comic);
    public void eliminarComic(Long id);
}