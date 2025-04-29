package com.seuprojeto.service;

import com.seuprojeto.model.Pagamento;
import com.seuprojeto.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PagamentoService {

    
    PagamentoRepository pagamentoRepository;

    public List<Pagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }

    public Pagamento salvar(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
}