package com.yorranpetrick.LibraryApi.controller;

import com.yorranpetrick.LibraryApi.service.ComprasService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class ComprasController {

    private ComprasService comprasService;

    public ComprasController(ComprasService comprasService) {
        this.comprasService = comprasService;
    }

    @PostMapping
    public void salvarCompra(@RequestParam String idLivro, @RequestParam String idUsuario) {
        comprasService.salvarCompra(idLivro, idUsuario);
    }
}
