package com.yorranpetrick.LibraryApi.service;

import com.yorranpetrick.LibraryApi.domain.Livro;
import com.yorranpetrick.LibraryApi.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class LivroService {

    private LivroRepository livroRepository;
    private AutorLivroService autorLivroService;

    public LivroService(LivroRepository livroRepository, AutorLivroService autorLivroService) {
        this.autorLivroService = autorLivroService;
        this.livroRepository = livroRepository;
    }

    public void salvarLivro(Livro livro, String idAutorLivro) {
        try {
            var autorPesquisado = autorLivroService.pesquisarAutorId(idAutorLivro);

            if (autorPesquisado != null) {
                livro.setAutorLivro(autorPesquisado);
                livroRepository.save(livro);
            }
        }catch (RuntimeException e){
            throw new RuntimeException("Erro ao salvar livro: " + e.getMessage());
        }
    }

    public Livro pesquisarLivroId(String idLivro){
        return livroRepository.findById(UUID.fromString(idLivro)).orElse(null);
    }
}
