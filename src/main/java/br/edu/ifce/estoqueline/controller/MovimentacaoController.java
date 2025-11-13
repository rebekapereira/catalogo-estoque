package br.edu.ifce.estoqueline.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.estoqueline.model.Movimentacao;

@RestController
@RequestMapping("/api/estoque")
public class MovimentacaoController {

    private List<Movimentacao> movimentacoes = new ArrayList<>();

    @PostMapping("/entrada")
    public Movimentacao registrarEntrada(@RequestBody Movimentacao entrada) {
        entrada.setTipo("Entrada");
        entrada.setData(LocalDate.now());
        movimentacoes.add(entrada);
        return entrada;
    }

    @PostMapping("/saida")
    public Movimentacao registrarSaida(@RequestBody Movimentacao saida) {
        saida.setTipo("Saída");
        saida.setData(LocalDate.now());
        movimentacoes.add(saida);
        return saida;
    }

    @GetMapping("/movimentacoes")
    public List<Movimentacao> listarMovimentacoes() {
        return movimentacoes;
    }


}