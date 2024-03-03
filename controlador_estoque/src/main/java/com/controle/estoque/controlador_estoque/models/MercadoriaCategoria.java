package com.controle.estoque.controlador_estoque.models;

import jakarta.persistence.*;

@Entity
public class MercadoriaCategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Mercadoria mercadoria;

    @ManyToOne
    private Categoria categoria;
}
