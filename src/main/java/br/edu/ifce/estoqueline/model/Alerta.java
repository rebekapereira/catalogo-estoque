package br.edu.ifce.estoqueline.model;

public class Alerta {
    private Long id;
    private String produto;
    private int quantidadeAtual;
    private int limiteMinimo;
    private String mensagem;

    public Alerta() {}

    public Alerta(Long id, String produto, int quantidadeAtual, int limiteMinimo, String mensagem) {
        this.id = id;
        this.produto = produto;
        this.quantidadeAtual = quantidadeAtual;
        this.limiteMinimo = limiteMinimo;
        this.mensagem = mensagem;
    }

    
    public Long getId() { return id;}

    public String getProduto() {return produto;}

    public int getQuantidadeAtual() {return quantidadeAtual;}

    public int getLimiteMinimo() {return limiteMinimo;}

    public String getMensagem() { return mensagem;}

    
    public void setId(Long id) {this.id = id;}

    public void setProduto(String produto) {this.produto = produto;}

    public void setQuantidadeAtual(int quantidadeAtual) {this.quantidadeAtual = quantidadeAtual;}

    public void setLimiteMinimo(int limiteMinimo) {this.limiteMinimo = limiteMinimo;}

    public void setMensagem(String mensagem) {this.mensagem = mensagem;}
}