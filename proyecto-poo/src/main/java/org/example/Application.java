package org.example;

import org.example.models.Comic;
import org.example.repositorio.ComicRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{
    @Autowired
    private ComicRepositorio repositorio;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {

        //Comic comic = new Comic("spiderman", "Dereck", "DC", "Ficcion", 2003, 100);

        //repositorio.save(comic);
    }
}
