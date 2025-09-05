package com.yorranpetrick.LibraryApi.controller;

import com.yorranpetrick.LibraryApi.domain.Livro;
import com.yorranpetrick.LibraryApi.service.LivroService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @PostMapping
    public void salvarLivro(@RequestBody Livro livro, @RequestParam String idAutorLivro) {
        livroService.salvarLivro(livro, idAutorLivro);
    }
}
