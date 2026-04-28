package com.univesp.supremeribs.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeIten;
    private Float preco;
    private String descricao;


    public Cardapio() {
    }

    public Cardapio(Long id, String nomeIten, Float preco, String descricao) {
        this.id = id;
        this.nomeIten = nomeIten;
        this.preco = preco;
        this.descricao = descricao;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeIten() {
        return nomeIten;
    }

    public void setNomeIten(String nomeIten) {
        this.nomeIten = nomeIten;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
