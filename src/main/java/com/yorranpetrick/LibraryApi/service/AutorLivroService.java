package com.yorranpetrick.LibraryApi.service;

import com.yorranpetrick.LibraryApi.models.AutorLivro;
import com.yorranpetrick.LibraryApi.repository.AutorLivroRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AutorLivroService {

    private AutorLivroRepository autorLivroRepository;

    public AutorLivroService(AutorLivroRepository autorLivroRepository) {
        this.autorLivroRepository = autorLivroRepository;
    }

    public void salvarAutorLivro(AutorLivro autorLivro) {
        try {
            autorLivroRepository.save(autorLivro);
        }catch (RuntimeException e){
            throw new RuntimeException("Erro ao salvar autor do livro: " + e.getMessage());
        }
    }

    public AutorLivro pesquisarAutorId(String idAutorLivro) {
        try {
            return autorLivroRepository.findById(UUID.fromString(idAutorLivro)).orElse(null);
        }catch (RuntimeException e){
            throw new RuntimeException("Erro ao pesquisar autor do livro: " + e.getMessage());
        }
    }
}
