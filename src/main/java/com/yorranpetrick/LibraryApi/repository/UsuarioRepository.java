package com.yorranpetrick.LibraryApi.repository;

import com.yorranpetrick.LibraryApi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
