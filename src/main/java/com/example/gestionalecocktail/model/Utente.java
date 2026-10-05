package com.example.gestionalecocktail.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private String email;
    private String password;
    private Ruolo ruolo;
    @OneToMany(mappedBy = "utente")
    private List<Ordine> ordini;
}