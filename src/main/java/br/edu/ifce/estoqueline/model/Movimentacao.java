package br.edu.ifce.estoqueline.model;

import java.time.LocalDate;

public class Movimentacao {
    private Long id;
    private String tipo; 
    private String produto;
    private int quantidade;
    private LocalDate data;

    public Movimentacao() {}

    public Movimentacao(Long id, String tipo, String produto, int quantidade, LocalDate data) {
        this.id = id;
        this.tipo = tipo;
        this.produto = produto;
        this.quantidade = quantidade;
        this.data = data;
    }


    public Long getId() { return id; }
    public String getTipo() { return tipo; }
    public String getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }
    public LocalDate getData() { return data; }

    public void setId(Long id) { this.id = id; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setProduto(String produto) { this.produto = produto; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public void setData(LocalDate data) { this.data = data; }

    public Object getIdMovimentacao() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getIdMovimentacao'");
    }

    public Object getCodigo() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getCodigo'");
    }

    public void setCodigo(Object codigo) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setCodigo'");
    }
}