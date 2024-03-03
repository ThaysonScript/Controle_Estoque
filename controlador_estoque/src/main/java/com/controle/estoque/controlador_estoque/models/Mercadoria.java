package com.controle.estoque.controlador_estoque.models;

import com.controle.estoque.controlador_estoque.enums.Categoria;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mercadoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    private String nome;
    private Integer quantidade;
    private Double preco;
    private String codigo;
    @ManyToMany(mappedBy = "mercadorias")
    private List<Categoria> categorias;

    // -------------------------------------------- GETTERS AND SETTERS ------------------------------------------ //
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
