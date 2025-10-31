package br.edu.ifce.estoqueline.controller;

import br.edu.ifce.estoqueline.model.Produto;
import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public List<Produto> listar() {
        return produtos;
    }

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        produtos.removeIf(p -> p.getid().equals(id));
        return "Produto removido!";
    }
}