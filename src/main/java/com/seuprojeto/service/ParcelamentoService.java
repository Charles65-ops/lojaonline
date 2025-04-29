package com.seuprojeto.service;

import com.seuprojeto.model.Parcelamento;
import com.seuprojeto.repository.ParcelamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ParcelamentoService {

  ParcelamentoRepository parcelamentoRepository;

    public List<Parcelamento> listarTodos() {
        return parcelamentoRepository.findAll();
    }

    public Parcelamento salvar(Parcelamento parcelamento) {
        return parcelamentoRepository.save(parcelamento);
    }
}