package com.seuprojeto.controller;

import com.seuprojeto.model.Pagamento;
import com.seuprojeto.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoService pagamentoService;

    @GetMapping
    public List<Pagamento> listarPagamentos() {
        return pagamentoService.listarTodos();
    }

    @PostMapping
    public Pagamento criarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.salvar(pagamento);
    }
}