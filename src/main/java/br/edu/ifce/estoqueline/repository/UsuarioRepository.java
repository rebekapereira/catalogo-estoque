package br.edu.ifce.estoqueline.repository;

import br.edu.ifce.estoqueline.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{}