package com.univesp.supremeribs.service;

import com.univesp.supremeribs.model.Cardapio;

import java.util.List;
import java.util.Optional;

public interface CardapioService {

    Cardapio inserir(Cardapio cardapio);

    Optional<Cardapio> buscarId(Long id);

    List<Cardapio> buscarVarios();

    void deletar(Long id);
}
