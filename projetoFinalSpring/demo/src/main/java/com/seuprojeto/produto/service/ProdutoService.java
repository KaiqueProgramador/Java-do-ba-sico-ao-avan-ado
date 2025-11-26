package com.seuprojeto.produto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seuprojeto.produto.dto.ProdutoDTO;
import com.seuprojeto.produto.entity.Produto;
import com.seuprojeto.produto.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repo;

    public Produto salvar(ProdutoDTO dto) {
        Produto p = new Produto();
        p.setNome(dto.getNome());
        p.setPreco(dto.getPreco());
        return repo.save(p);
    }

    public List<Produto> listarBaratos(Double preco) {
        return repo.findByPrecoLessThan(preco);
    }

    public List<Produto> listarTodos() {
        return repo.findAll();
    }

}
