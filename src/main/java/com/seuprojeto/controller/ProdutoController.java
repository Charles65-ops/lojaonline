package com.seuprojeto.controller;

import com.seuprojeto.model.Produto;
import com.seuprojeto.service.ProdutoService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

  @Autowired
    ProdutoService produtoService;

    // Listar todos os produtos
    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        return ResponseEntity.ok(produtoService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(produtoService.findById(id));
    }



    // Criar novo produto
    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
        Produto novoProduto = produtoService.salvar(produto);
        return ResponseEntity.status(201).body(novoProduto); // 201 Created
    }

    // Atualizar produto existente
    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        produto.setId(id);
        return produtoService.atualizar(id, produto);

    }

    // Deletar produto por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {
        produtoService.deletar(id);
            return ResponseEntity.noContent().build(); // 204 No Content se deletou

    }
}
