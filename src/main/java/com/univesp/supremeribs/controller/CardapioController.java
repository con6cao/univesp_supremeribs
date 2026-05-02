package com.univesp.supremeribs.controller;

import com.univesp.supremeribs.model.Cardapio;
import com.univesp.supremeribs.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class CardapioController {
    @Autowired
    private CardapioService cardapioService;


    @PostMapping("/item")
    public ResponseEntity<Cardapio> postUsuario(@RequestParam("file") MultipartFile file,
                                                @RequestParam("nomeItem") String nomeItem,
                                                @RequestParam("descricao") String descricao,
                                                @RequestParam("preco") Float preco) throws IOException {
        Cardapio cardapio = new Cardapio();
        cardapio.setNameFile(file.getOriginalFilename());
        cardapio.setFoto(file.getBytes());

        cardapio.setNomeIten(nomeItem);
        cardapio.setDescricao(descricao);
        cardapio.setPreco(preco);

        cardapioService.inserir(cardapio);
        return ResponseEntity.status(HttpStatus.CREATED).body(cardapio);
    }

    @GetMapping("/item/{id}")
    public ResponseEntity buscarId(@PathVariable Long id) {
        Optional<Cardapio> cardapio = cardapioService.buscarId(id);
        return ResponseEntity.status(HttpStatus.OK).body(cardapio);
    }

    @GetMapping("/items")
    public ResponseEntity<List<Cardapio>> buscar() {
        List<Cardapio> cardapio = cardapioService.buscarVarios();
        return ResponseEntity.status(HttpStatus.OK).body(cardapio);
    }

    @DeleteMapping(path = "/deletarItem/{id}")
    public ResponseEntity<Cardapio> deletar(@PathVariable Long id) {
        cardapioService.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
