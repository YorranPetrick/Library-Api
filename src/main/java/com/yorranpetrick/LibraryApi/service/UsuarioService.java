package com.yorranpetrick.LibraryApi.service;


import com.yorranpetrick.LibraryApi.domain.Usuario;
import com.yorranpetrick.LibraryApi.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void salvarUsuario(Usuario usuario) {
        try {
            usuarioRepository.save(usuario);
        }catch (RuntimeException e){
            throw new RuntimeException("Erro ao salvar usuario: " + e.getMessage());
        }
    }

    public Usuario pesquisarUsuarioId(String idUsuario) {
        try {
            return usuarioRepository.findById(UUID.fromString(idUsuario)).orElse(null);
        }catch (RuntimeException e){
            throw new RuntimeException("Erro ao pesquisar usuario: " + e.getMessage());
        }
    }
}
