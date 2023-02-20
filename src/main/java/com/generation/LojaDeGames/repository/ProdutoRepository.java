package com.generation.LojaDeGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.LojaDeGames.model.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
