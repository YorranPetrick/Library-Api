package com.yorranpetrick.LibraryApi.service;

import com.yorranpetrick.LibraryApi.domain.Compras;
import com.yorranpetrick.LibraryApi.repository.ComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ComprasService {

    @Autowired
    private ComprasRepository comprasRepository;
    @Autowired
    private LivroService livroService;
    @Autowired
    private UsuarioService usuarioService;


    public void salvarCompra(String idLivro, String idUsuario) {
        try {
            var livro = livroService.pesquisarLivroId(idLivro);
            var usuario = usuarioService.pesquisarUsuarioId(idUsuario);

            if (livro != null && usuario != null) {
                Compras compras = new Compras(LocalDate.now(), livro, usuario);
                comprasRepository.save(compras);
            }
        }catch (RuntimeException e){
            throw new RuntimeException("Erro ao salvar compra: " + e.getMessage());
        }
    }
}
