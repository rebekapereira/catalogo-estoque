package br.edu.ifce.estoqueline.model;

public class Produto {
    private Long id;
    private String nome;
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto () {}

    public Produto(Long id, String nome, int codigo, String descricao, double preco, int quantidade){

    this.id = id;
    this.nome = nome;
    this.codigo = codigo;
    this.descricao = descricao;
    this.preco = preco;
    this.quantidade = quantidade;
    }

public Long getid() {return id;}

public String getnome() {return nome;}

public int getcodigo(){ return codigo;}

public String getdescricao(){ return descricao;}

public double getpreco(){ return preco;}

public int getquantidade(){return quantidade;}

public void setid(Long id){this.id = id;}

public void setnome(String nome){ this.nome = nome;}

public void setcodigo(int codigo){ this.codigo = codigo;}

public void setdescricao(String descricao){ this.descricao = descricao;}

public void setpreco(double preco){ this.preco = preco;}

public void setquantidade(int quantidade){ this.quantidade = quantidade;}
  
}
