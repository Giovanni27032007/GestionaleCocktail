package com.example.gestionalecocktail.repository;


import com.example.gestionalecocktail.model.Utente;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UtenteRepository extends JpaRepository<Utente, Long> {
    List<Utente> findByNome(String nome);
}