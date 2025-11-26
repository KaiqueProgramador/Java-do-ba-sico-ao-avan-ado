package com.seuprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}