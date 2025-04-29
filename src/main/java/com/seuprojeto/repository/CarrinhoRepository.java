package com.seuprojeto.repository;

import com.seuprojeto.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Anotação que permite o Spring reconhecer o repositório
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
}