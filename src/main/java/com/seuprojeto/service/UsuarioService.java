package com.seuprojeto.service;

import com.seuprojeto.model.Usuario;
import com.seuprojeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired
     private UsuarioRepository usuarioRepository;

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletar(Long id)
    {
        usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(Long id, Usuario usuario) {
        usuario = usuarioRepository.save(usuario);
        return usuario;
    }

    public Usuario findById(Long id) {

        return usuarioRepository.findById(id).orElseThrow();
    }
}