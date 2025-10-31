package br.edu.ifce.estoqueline.model;

public class Usuario {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String cargo;

    public Usuario() {}
    
    public Usuario (Long id, String nome, String cpf, String email, String telefone, String cargo) {
        this.id= id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
    }

public Long getid(){ return id;}

public String getnome(){ return nome;}

public String getcpf(){ return cpf;}

public String getemail(){ return email;}

public String gettelefone(){return telefone;}

public String getcargo(){ return cargo;}

public void setid(Long id){ this.id = id;}

public void setnome(String nome){ this.nome = nome;}

public void setcpf(String cpf){this.cpf = cpf;}

public void setemail (String email){this.email = email;}

public void settelefone(String telefone){this.telefone = telefone;}

public void setcargo(String cargo){ this.cargo = cargo;}
}


