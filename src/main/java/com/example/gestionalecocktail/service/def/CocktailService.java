package com.example.gestionalecocktail.service.def;

import com.example.gestionalecocktail.model.Cocktail;
import org.springframework.stereotype.Service;

@Service

public interface CocktailService {
long creaCocktail(Cocktail cocktail);
Cocktail getCocktailById(Long id);



}
