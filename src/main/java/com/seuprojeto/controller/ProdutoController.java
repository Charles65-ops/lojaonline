package com.seuprojeto.controller;

import com.seuprojeto.model.Produto;
import com.seuprojeto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }
}