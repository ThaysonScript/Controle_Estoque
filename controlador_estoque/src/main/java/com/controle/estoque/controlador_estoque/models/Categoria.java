package com.controle.estoque.controlador_estoque.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "mercadorias")
    private List<Mercadoria> mercadorias;
}
