package com.yorranpetrick.LibraryApi.service;

import com.yorranpetrick.LibraryApi.models.Livro;
import com.yorranpetrick.LibraryApi.repository.AutorLivroRepository;
import com.yorranpetrick.LibraryApi.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private LivroRepository livroRepository;
    private AutorLivroService autorLivroService;
    private UsuarioService usuarioService;

    public LivroService(LivroRepository livroRepository, AutorLivroService autorLivroService, UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
        this.autorLivroService = autorLivroService;
        this.livroRepository = livroRepository;
    }

    public void salvarLivro(Livro livro, String idAutorLivro, String idUsuario) {
        try {
            var autorPesquisado = autorLivroService.pesquisarAutorId(idAutorLivro);
            var usuarioPesquisado = usuarioService.pesquisarUsuarioId(idUsuario);

            if (autorPesquisado != null && usuarioPesquisado != null) {
                livro.setUsuario(usuarioPesquisado);
                livro.setAutorLivro(autorPesquisado);
                livroRepository.save(livro);
            }
        }catch (RuntimeException e){
            throw new RuntimeException("Erro ao salvar livro: " + e.getMessage());
        }
    }
}
