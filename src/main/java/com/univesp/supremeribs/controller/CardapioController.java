package com.univesp.supremeribs.controller;

import com.univesp.supremeribs.model.Usuario;
import com.univesp.supremeribs.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;


    @PostMapping("/usuarios")
    public ResponseEntity postUsuario(@RequestBody @Valid Usuario usuario) {
        usuarioService.inserir(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarId(@PathVariable Long id) {
        Usuario usuario = usuarioService.buscarId(id);
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> buscar() {
        List<Usuario> usuario = usuarioService.buscar();
        return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }

    @DeleteMapping(path = "/deletar/{id}")
    public ResponseEntity<Usuario> deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
