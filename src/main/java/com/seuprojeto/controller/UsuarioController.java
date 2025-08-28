package com.seuprojeto.controller;

import com.seuprojeto.model.Produto;
import com.seuprojeto.model.Usuario;
import com.seuprojeto.service.ProdutoService;
import com.seuprojeto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Listar todos os produtos
    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuario() {
        System.out.println("Listando todos os usuários");
        return ResponseEntity.ok(usuarioService.listarTodos());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        System.out.println("Listando usuários por Id");
        return ResponseEntity.ok(usuarioService.findById(id));
    }



    // Criar novo produto
    @PostMapping
    public ResponseEntity<Usuario> criarProduto(@RequestBody Usuario usuario) {
        Usuario novoUsuario = usuarioService.salvar(usuario);
        return ResponseEntity.status(201).body(novoUsuario); // 201 Created
    }

    // Atualizar produto existente
    @PutMapping("/{id}")
    public Usuario atualizarProduto(@PathVariable Long id, @RequestBody Usuario usuario) {
        Usuario.setId(id);
        return usuarioService.atualizar(id, usuario);

    }

    // Deletar produto por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long id) {
        System.out.println("Deletanto usuario pelo Id:" + id);
        usuarioService.deletar(id);
        return ResponseEntity.noContent().build(); // 204 No Content se deletou

    }
}
