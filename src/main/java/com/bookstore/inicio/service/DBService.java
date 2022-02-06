package com.bookstore.inicio.service;

import com.bookstore.inicio.domain.Categoria;
import com.bookstore.inicio.domain.Livro;
import com.bookstore.inicio.repositories.CategoriaRepository;
import com.bookstore.inicio.repositories.LivroRepository;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
    public void instanciaBaseDeDados(){
        	// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null,"Informática","Livros de TI");
		Categoria cat2 = new Categoria(null,"Informática 2","Livros de TI");
		Categoria cat3 = new Categoria(null,"Informática 3","Livros de TI");

		Livro l1 = new Livro(null, "Clean code1", "Robert Martin1", "Lorem ipsum1", cat1);
		Livro l2 = new Livro(null, "Clean code2", "Robert Martin2", "Lorem ipsum2", cat1);
		Livro l3 = new Livro(null, "Clean code3", "Robert Martin3", "Lorem ipsum3", cat2);
		Livro l4 = new Livro(null, "Clean code4", "Robert Martin4", "Lorem ipsum4", cat2);
		Livro l5 = new Livro(null, "Clean code5", "Robert Martin5", "Lorem ipsum5", cat2);

		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4,l5));

		this.categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3)); // cat1,cat2,cat3 etc....
	    this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
    }
    
}
