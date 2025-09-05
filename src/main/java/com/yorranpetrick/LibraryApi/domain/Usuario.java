package com.yorranpetrick.LibraryApi.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data //Gera os Getters e Setters e contem dentro outras anotações
@Table(name = "Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idUsuario;
    @Column(length = 100, nullable = false)
    private String nome;
    private String email;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String senha;

    @OneToMany(mappedBy = "usuario")
    private List<Compras> compras;
}
