package org.example.controlador;

import org.example.models.Comic;
import org.example.servicio.ComicServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ComicsControlador {
    @Autowired
    private ComicServicio servicio;

    @GetMapping("/comics/index")
    public String index(Model model) {

        model.addAttribute("comics", servicio.listarComics());

        return "comic/index";
    }

    @GetMapping("/comics/create")
    public String create(Model model) {

        Comic comic = new Comic();
        model.addAttribute("comic", comic);

        return "comic/create";
    }

    @PostMapping("/comics/store")
    public String store(@ModelAttribute("comics") Comic curso) {

        servicio.agregarComic(curso);

        return "redirect:/comics/index";
    }
}