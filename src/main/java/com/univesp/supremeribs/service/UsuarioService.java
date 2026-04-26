package com.univesp.supremeribs.service;

import com.univesp.supremeribs.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsuarioService {


    Usuario inserir(Usuario usuario);

    List<Usuario> buscar();

    Usuario buscarId(Long id);

    void deletar(Long id);
}
