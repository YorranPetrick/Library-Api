package com.yorranpetrick.LibraryApi.domain;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCompra;

    @Column(nullable = false)
    private LocalDate dataCompra;

    @ManyToOne
    @JoinColumn(name = "idLivro")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Compras(LocalDate dataCompra, Livro livro, Usuario usuario) {
        this.dataCompra = dataCompra;
        this.livro = livro;
        this.usuario = usuario;
    }

    public Compras() {

    }
}
