package com.yorranpetrick.LibraryApi.controller;

import com.yorranpetrick.LibraryApi.domain.AutorLivro;
import com.yorranpetrick.LibraryApi.service.AutorLivroService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autorlivro")
public class AutorLivroController {

    private AutorLivroService autorLivroService;

    public AutorLivroController(AutorLivroService autorLivroService) {
        this.autorLivroService = autorLivroService;
    }

    @PostMapping
    public void salvarAutor(@RequestBody AutorLivro autorLivro) {
        autorLivroService.salvarAutorLivro(autorLivro);
    }
}
