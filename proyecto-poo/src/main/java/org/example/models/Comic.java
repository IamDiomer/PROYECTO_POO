package org.example.models;


import javax.persistence.*;

@Entity
@Table(name = "Comics")

public class Comic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titulo",nullable = true, length = 100)
    private String titulo;
    @Column(name = "autor",nullable = true, length = 100)
    private String autor;
    @Column(name = "editorial",nullable = true, length = 100)
    private String editorial;
    @Column(name = "genero",nullable = true, length = 100)
    private String genero;
    @Column(name = "anio_publicacion",nullable = true, length = 4)
    private int anio_publicacion;
    @Column(name = "numero_paginas",nullable = true, length = 4)
    private int numero_paginas;

    public Comic(){

    }

    public Comic(Long id, String titulo, String autor, String editorial, String genero, int anio_publicacion, int numero_paginas) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.anio_publicacion = anio_publicacion;
        this.numero_paginas = numero_paginas;
    }

    public Comic(String titulo, String autor, String editorial, String genero, int anio_publicacion, int numero_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.anio_publicacion = anio_publicacion;
        this.numero_paginas = numero_paginas;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }
}
