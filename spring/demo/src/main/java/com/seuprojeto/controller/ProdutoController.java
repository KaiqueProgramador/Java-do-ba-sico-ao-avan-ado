package com.seuprojeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.seuprojeto.model.Produto;
import com.seuprojeto.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repo;

    @GetMapping
    public List<Produto> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Produto criar(@RequestBody Produto p) {
        return repo.save(p);
    }
}