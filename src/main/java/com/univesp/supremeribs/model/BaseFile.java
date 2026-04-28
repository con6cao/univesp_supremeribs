package com.univesp.supremeribs.model;


import jakarta.persistence.*;

@Entity
public class Cardapio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Lob
    @Column(name = "foto", columnDefinition="BLOB")
    public byte[] foto;


    public Cardapio() {
    }

    public Cardapio(Long id, String nome, String descricao, String preco, byte[] imagem) {
        this.id = id;
        this.nome = nome;
        this.foto = imagem;
    }

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



    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
