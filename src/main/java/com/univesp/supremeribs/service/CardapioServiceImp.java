package com.univesp.supremeribs.service;

import com.univesp.supremeribs.model.Cardapio;
import com.univesp.supremeribs.repository.CardapioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardapioServiceImp implements CardapioService {


    private CardapioRepository cardapioRepository;

    public CardapioServiceImp(CardapioRepository cardapioRepository) {
        this.cardapioRepository = cardapioRepository;
    }

    @Override
    public Cardapio inserir(Cardapio cardapio) {
       return cardapioRepository.save(cardapio);
    }

    @Override
    public Optional<Cardapio> buscarId(Long id) {
        return cardapioRepository.findById(id);
    }

    @Override
    public List<Cardapio> buscarVarios() {
        return cardapioRepository.findAll();
    }

    @Override
    public void deletar(Long id) {
        cardapioRepository.deleteById(id);
    }
}
