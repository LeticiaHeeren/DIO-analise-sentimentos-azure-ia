package projetoDIO.santander_dev_week.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoDIO.santander_dev_week.model.Usuario;
import projetoDIO.santander_dev_week.repository.UsuarioRepository;

@RestController
@RequestMapping("/produtos")
public class AuthController {

    private final UsuarioRepository produtoRepository;

    @Autowired
    public AuthController(UsuarioRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping
    public List<Usuario> getAllProdutos() {
        return produtoRepository.findAll();
    }
}