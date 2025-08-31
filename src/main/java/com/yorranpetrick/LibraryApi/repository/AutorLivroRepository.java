package com.yorranpetrick.LibraryApi.repository;

import com.yorranpetrick.LibraryApi.models.AutorLivro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorLivroRepository extends JpaRepository<AutorLivro, UUID> {
}
