package br.edu.ifce.estoqueline.model;

import java.util.List;

public class Relatorio {
    private String dataGeracao;
    private int totalProdutos;
    private double valorTotalEstoque;
    private List<String> movimentacoes;

    public Relatorio() {}

    public Relatorio(String dataGeracao, int totalProdutos, double valorTotalEstoque, List<String> movimentacoes) {
        this.dataGeracao = dataGeracao;
        this.totalProdutos = totalProdutos;
        this.valorTotalEstoque = valorTotalEstoque;
        this.movimentacoes = movimentacoes;
    }

    public String getDataGeracao() { return dataGeracao;}

    public int getTotalProdutos() { return totalProdutos;}

    public double getValorTotalEstoque() { return valorTotalEstoque; }

    public List<String> getMovimentacoes() {return movimentacoes;}

    public void setDataGeracao(String dataGeracao) {this.dataGeracao = dataGeracao;}

    public void setTotalProdutos(int totalProdutos) {this.totalProdutos = totalProdutos;}

    public void setValorTotalEstoque(double valorTotalEstoque) {this.valorTotalEstoque = valorTotalEstoque;}

    public void setMovimentacoes(List<String> movimentacoes) { this.movimentacoes = movimentacoes;}
}
