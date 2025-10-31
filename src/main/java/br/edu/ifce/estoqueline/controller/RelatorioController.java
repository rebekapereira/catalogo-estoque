package br.edu.ifce.estoqueline.controller;

import org.springframework.web.bind.annotation.*;

import br.edu.ifce.estoqueline.model.Relatorio;

import java.util.*;

@RestController
@RequestMapping("/api/relatorios")
public class RelatorioController {

    private List<Relatorio> relatorios = new ArrayList<>();

    // ✅ Criar relatório (POST)
    @PostMapping
    public Relatorio criarRelatorio(@RequestBody Relatorio relatorio) {
        relatorios.add(relatorio);
        return relatorio;
    }

    // ✅ Listar relatórios (GET)
    @GetMapping
    public List<Relatorio> listarRelatorios() {
        return relatorios;
    }

    // ✅ Deletar relatório por índice (DELETE)
    @DeleteMapping("/{id}")
    public String removerRelatorio(@PathVariable int id) {
        if (id >= 0 && id < relatorios.size()) {
            relatorios.remove(id);
            return "Relatório removido com sucesso!";
        }
        return "Relatório não encontrado.";
    }
}
