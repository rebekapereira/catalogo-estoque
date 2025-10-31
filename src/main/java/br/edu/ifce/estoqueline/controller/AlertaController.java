package br.edu.ifce.estoqueline.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.estoqueline.model.Alerta;

@RestController
@RequestMapping("/api/alertas")
public class AlertaController {

    private List<Alerta> alertas = new ArrayList<>();
    private Long contadorId = 1L;

    @GetMapping
    public List<Alerta> listarAlertas() {
        return alertas;
    }
    @PostMapping
    public Alerta criarAlerta(@RequestBody Alerta alerta) {
        alerta.setId(contadorId++);
        alertas.add(alerta);
        return alerta;
    }

    @PutMapping("/{id}")
    public Alerta atualizarAlerta(@PathVariable Long id, @RequestBody Alerta alertaAtualizado) {
        for (Alerta a : alertas) {
            if (a.getId().equals(id)) {
                a.setProduto(alertaAtualizado.getProduto());
                a.setQuantidadeAtual(alertaAtualizado.getQuantidadeAtual());
                a.setLimiteMinimo(alertaAtualizado.getLimiteMinimo());
                a.setMensagem(alertaAtualizado.getMensagem());
                return a;
            }
        }
        return null; 
    }

    @DeleteMapping("/{id}")
    public String removerAlerta(@PathVariable Long id) {
        boolean removido = alertas.removeIf(a -> a.getId().equals(id));
        return removido ? "Alerta removido com sucesso!" : "Alerta não encontrado!";
    }
}