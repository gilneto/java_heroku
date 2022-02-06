package com.bookstore.inicio.service;

import java.util.Optional;

import com.bookstore.inicio.domain.Categoria;
import com.bookstore.inicio.repositories.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
