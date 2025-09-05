package com.yorranpetrick.LibraryApi.repository;

import com.yorranpetrick.LibraryApi.domain.Compras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ComprasRepository extends JpaRepository<Compras, UUID> {
}
