package com.univesp.supremeribs.service;

import com.univesp.supremeribs.model.Usuario;
import com.univesp.supremeribs.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImp(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario inserir(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> buscar() {
        return usuarioRepository.findAll();

    }

    @Override
    public Usuario buscarId(Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    public void deletar(Long id)
        usuarioRepository.deleteById(id);
    }
}