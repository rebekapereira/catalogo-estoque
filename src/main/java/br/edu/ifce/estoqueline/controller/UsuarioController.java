package br.edu.ifce.estoqueline.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifce.estoqueline.model.Usuario;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public  List<Usuario> listar(){
        return usuarios;
    }

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

    @PostMapping("/{id}")
    public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado){
        for (Usuario a : usuarios){
            if(a.getId_usuario().equals(id)){
                a.setNome(usuarioAtualizado.getNome());
                a.setEmail(usuarioAtualizado.getEmail());
                a.setTelefone(usuarioAtualizado.getTelefone());
                a.setCargo(usuarioAtualizado.getCargo());
                return a;
            }
        }
        return null;
    }
    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id){
        usuarios.removeIf(u -> u.getId_usuario().equals(id));
        return "Usuario removido";
    }

}


