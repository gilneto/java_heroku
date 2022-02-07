package com.bookstore.inicio.dtos;

import java.io.Serializable;

import com.bookstore.inicio.domain.Livro;

public class LivroDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private static final String NomeAutor = null;
    
    private Integer id;
    private String titulo;
   // private String nome_autor;

    private String nome_autor;

    public LivroDTO(){
        super();
    }

    public LivroDTO(Livro obj) {
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
        this.nome_autor = obj.getNome_autor();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getNome_autor() {
        return this.nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.titulo = nome_autor;
    }



}
