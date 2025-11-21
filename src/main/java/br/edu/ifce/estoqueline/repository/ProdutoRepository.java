package br.edu.ifce.estoqueline.repository;

import br.edu.ifce.estoqueline.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>
{}
