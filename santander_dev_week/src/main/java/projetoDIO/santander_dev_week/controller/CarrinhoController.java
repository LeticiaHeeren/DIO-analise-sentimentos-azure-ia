package projetoDIO.santander_dev_week.controller;

import org.springframework.web.bind.annotation.*;
import projetoDIO.santander_dev_week.model.Produto;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    private List<Produto> carrinho = new ArrayList<>();

    @PostMapping("/adicionar")
    public String adicionarAoCarrinho(@RequestBody Produto produto) {
        carrinho.add(produto);
        return "Produto adicionado ao carrinho!";
    }

    @GetMapping
    public List<Produto> verCarrinho() {
        return carrinho;
    }

    @PostMapping("/finalizar")
    public String finalizarCompra() {
        carrinho.clear();
        return "Compra finalizada com sucesso!";
    }
}