package com.seuprojeto.produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.seuprojeto.produto.dto.ProdutoDTO;
import com.seuprojeto.produto.entity.Produto;
import com.seuprojeto.produto.service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @PostMapping
    public Produto criar(@RequestBody ProdutoDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping("/baratos")
    public List<Produto> baratos(@RequestParam Double preco) {
        return service.listarBaratos(preco);
    }

    @GetMapping
    public List<Produto> listarTodos() {
        return service.listarTodos();
    }

}
