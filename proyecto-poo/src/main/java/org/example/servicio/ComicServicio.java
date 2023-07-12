package org.example.servicio;

import org.example.models.Comic;
import org.example.repositorio.ComicRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ComicServicio implements InterfaceComicServicio{
    @Autowired
    private ComicRepositorio repositorio;
    @Override
    public List<Comic> listarComics() {
        return (List<Comic>) repositorio.findAll();
    }
    @Override
    public Comic agregarComic(Comic comic) {
        return repositorio.save(comic);
    }
    @Override
    public Comic actualizarComic(Comic comic) {
        return repositorio.save(comic);
    }
    @Override
    public void eliminarComic(Long id) {
        repositorio.deleteById(id);
    }
}