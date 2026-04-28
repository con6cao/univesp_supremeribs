package com.univesp.supremeribs.repository;

import com.univesp.supremeribs.model.BaseFile;
import com.univesp.supremeribs.model.Cardapio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {

}


