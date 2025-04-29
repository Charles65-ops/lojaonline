package com.seuprojeto.controller;

import com.seuprojeto.model.Parcelamento;
import com.seuprojeto.service.ParcelamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/parcelamentos")
public class ParcelamentoController {

    @Autowired
    private ParcelamentoService parcelamentoService;

    @GetMapping
    public List<Parcelamento> listarParcelamentos() {
        return parcelamentoService.listarTodos();
    }

    @PostMapping
    public Parcelamento criarParcelamento(@RequestBody Parcelamento parcelamento) {
        return parcelamentoService.salvar(parcelamento);
    }
}