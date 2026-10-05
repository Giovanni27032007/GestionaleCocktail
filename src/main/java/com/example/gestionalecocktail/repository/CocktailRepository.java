package com.example.gestionalecocktail.repository;

import com.example.gestionalecocktail.model.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
    List<Cocktail> findByNome(String nome);
}
