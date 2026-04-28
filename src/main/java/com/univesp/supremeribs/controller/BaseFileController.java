package com.univesp.supremeribs.controller;

import com.univesp.supremeribs.model.BaseFile;
import com.univesp.supremeribs.repository.BaseFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@CrossOrigin(origins ="*")
public class BaseFileController {

    @Autowired
    private BaseFileRepository baseFileRepository;

    @PostMapping("/fotoCardapio")
    public String uploadImagem(@RequestParam("file") MultipartFile file) throws IOException {
        BaseFile baseFile = new BaseFile();
        baseFile.setNameFile(file.getOriginalFilename());
        baseFile.setFoto(file.getBytes()); // Converte para byte[]
        baseFileRepository.save(baseFile);
        return "Imagem salva com sucesso! ID: " + baseFile.getId();
    }

    @GetMapping("/fotoCardapio/{id}")
    public ResponseEntity<byte[]> getImagem(@PathVariable Long id) {
        BaseFile baseFile = baseFileRepository.findById(id).orElseThrow();

        // Retorna a imagem com o content type apropriado
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG) // Ou IMAGE_PNG
                .body(baseFile.getFoto());
    }
}




