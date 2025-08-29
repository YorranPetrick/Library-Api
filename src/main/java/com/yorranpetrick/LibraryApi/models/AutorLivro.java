package com.yorranpetrick.LibraryApi.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Autor")
//Lombok - Gera os Getters e Setters Automaticamente
@Getter
@Setter
public class AutorLivro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idAutor;
    @Column(length = 100, nullable = false) //Quantidade de Caracteres
    private String nome;

    // Informa que a não é uma propriedade do banco de dados apenas um mapeamento
    @OneToMany(mappedBy = "autorLivro")
    private List<Livro> listaLivros;

}
