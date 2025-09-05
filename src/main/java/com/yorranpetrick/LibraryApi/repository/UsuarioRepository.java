package com.yorranpetrick.LibraryApi.repository;

import com.yorranpetrick.LibraryApi.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    UserDetails findByUsername(String email);
}
