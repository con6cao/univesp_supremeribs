package com.univesp.supremeribs.controller;

import com.univesp.supremeribs.model.Cardapio;
import com.univesp.supremeribs.service.CardapioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class CardapioController {
    @Autowired
    private CardapioService cardapioService;


    @PostMapping("/item")
    public ResponseEntity<Cardapio> postUsuario(@RequestBody @Valid Cardapio cardapio) {
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
