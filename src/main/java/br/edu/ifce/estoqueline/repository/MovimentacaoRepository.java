package br.edu.ifce.estoqueline.repository;

import br.edu.ifce.estoqueline.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends
JpaRepository<Movimentacao, Long> {}

