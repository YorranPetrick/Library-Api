package com.yorranpetrick.LibraryApi.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idLivro;
    @Column(length = 200, nullable = false)
    private String titulo;
    private LocalDate anoPublicacao;
    @Column(nullable = false, precision = 10)
    private Double preco;
    @Enumerated(EnumType.STRING)
    private GeneroLivro genero;

    @ManyToOne
    @JoinColumn(name = "idAutor")
    private AutorLivro autorLivro;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

}
