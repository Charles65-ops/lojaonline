package com.seuprojeto.service;

import com.seuprojeto.model.Produto;
import com.seuprojeto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {
        Optional<Produto> produtoExistente = produtoRepository.findById(id);

        if (produtoExistente.isPresent()) {

            Produto produto = produtoExistente.get();
            produto.setId(id);
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
            produto.setId(produtoAtualizado.setId());
            // adicione outros atributos se tiver
            return produtoRepository.save(produto);
        } else {
            throw new RuntimeException("Produto não encontrado com ID: " + id);
        }
    }

    public void deletar(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produto não encontrado com ID: " + id);
        }

    }

    public Produto findById(long Id) {
        Produto produto = produtoRepository.findById(Id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado com ID: " + Id));
        return produto;
    }
}
