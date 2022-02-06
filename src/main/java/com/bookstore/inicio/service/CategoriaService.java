package com.bookstore.inicio.service;

import java.util.List;
import java.util.Optional;

import com.bookstore.inicio.domain.Categoria;
import com.bookstore.inicio.exceptions.ObjectNotFoundException;
import com.bookstore.inicio.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! " + id + ", tipo: " + Categoria.class.getName())); // ()-> função anonima
    }
    
    public List<Categoria> findAll(){
        return repository.findAll();
    }

    public Categoria create(Categoria obj){
        obj.setId(null);
        return repository.save(obj);
    }
}
