package com.yorranpetrick.LibraryApi.repository;

import com.yorranpetrick.LibraryApi.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID> {

}

