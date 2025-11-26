package com.seuprojeto.produto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seuprojeto.produto.entity.Produto;

// Query Method profissional
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByPrecoLessThan(Double preco);
}
