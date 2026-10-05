package com.example.gestionalecocktail.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class IngredientiNelCocktail  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @Column(name = "cocktail_id")
    private Cocktail cocktail;
    private int quantitaCl;
    @ManyToOne
    @Column(name = "prodotto_id")
    private Prodotto prodotto;
}
