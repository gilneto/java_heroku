package com.bookstore.inicio.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.validator.constraints.Length;


@Entity
public class Livro  implements Serializable{
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @NotEmpty(message = "O campo titulo é requirido!")
   @Length(min = 3, max = 50, message = "O campo deve ter entre 3 e 50 caracteres!")
   private String titulo;

   @NotEmpty(message = "O campo nome do autor é requirido!")
   @Length(min = 3, max = 50, message = "O campo deve ter entre 3 e 50 caracteres!")
   private String nome_autor;

   @NotEmpty(message = "O campo texto é requirido!")
   @Length(min = 10, max = 2000000, message = "O campo deve ter entre 10 e 2.000.000 caracteres!")
   private String texto;
   @JsonIgnore
   @ManyToOne
   @JoinColumn(name = "categoria_id")
   private Categoria categoria;

   public Livro(){
       super();
   }

    public Livro(Integer id, String titulo, String nome_autor, String texto, Categoria categoria) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.categoria = categoria;
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
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

    
}
