package com.univesp.supremeribs.controller;

import com.univesp.supremeribs.model.Usuario;
import com.univesp.supremeribs.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping("/usuarios")
    public void postUsuario(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
/*
    @PutMapping("/usuarios")
    public void put(@RequestBody Usuario usuario) {
        repository.update(usuario);
    }*/

    @GetMapping("/usuarios")
    public List<Usuario> getAllUsuarios() {
        return repository.findAll();
    }

    @GetMapping("/usuario/{id}")
    public Optional<Usuario> getOneUsuarios(@PathVariable("id") Long id) {
        return repository.findById(id);
    }

/*@DeleteMapping("/usuarios/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.remove(id);
    }*/
}
