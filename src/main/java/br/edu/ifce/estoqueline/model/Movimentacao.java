package br.edu.ifce.estoqueline.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Movimentacao {

    @Id
    private Long id;
    private String tipo; 
    private int quantidade;
    private LocalDate data;


    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Produto produto;


}