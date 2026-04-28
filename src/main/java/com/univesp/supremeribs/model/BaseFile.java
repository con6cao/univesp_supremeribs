package com.univesp.supremeribs.model;


import jakarta.persistence.*;

@Entity
public class BaseFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFile;
    private String nameFile;
    @Lob // Define como BLOB
    @Column(name = "foto", columnDefinition="BLOB")
    private byte[] foto;


    public BaseFile() {
    }

    public BaseFile(Long id, String nameFile, byte[] foto) {
        this.idFile = idFile;
        this.nameFile = nameFile;
        this.foto = foto;
    }

    public Long getId() {
        return idFile;
    }

    public void setIdFile(Long idFile) {
        this.idFile = idFile;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFilee) {
        this.nameFile = nameFile;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
