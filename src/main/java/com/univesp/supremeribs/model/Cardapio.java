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
    private String nameFile;
    @Lob // Define como BLOB
    @Column(name = "foto", columnDefinition="BLOB")
    private byte[] foto;


    public Cardapio() {
    }

    public Cardapio(Long id, String nomeIten, Float preco, String descricao, Long idFile, String nameFile, byte[] foto) {
        this.id = id;
        this.nomeIten = nomeIten;
        this.preco = preco;
        this.descricao = descricao;
        this.nameFile = nameFile;
        this.foto = foto;
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



    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
