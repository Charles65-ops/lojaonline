package com.seuprojeto.controller;

import com.seuprojeto.model.Carrinho;
import com.seuprojeto.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/carrinhos")
public class CarrinhoController {

    @Autowired
    private CarrinhoService carrinhoService;

    @GetMapping
    public List<Carrinho> listarCarrinhos() {
        return carrinhoService.listarTodos();
    }

    @PostMapping
    public Carrinho criarCarrinho(@RequestBody Carrinho carrinho) {
        return carrinhoService.salvar(carrinho);
    }
}