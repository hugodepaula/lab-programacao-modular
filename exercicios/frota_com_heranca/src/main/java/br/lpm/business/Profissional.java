package br.lpm.business;

public class Profissional {
    private String nome;
    private int id;
    private static int cont = 0;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public Profissional(String nome) {
        this.nome = nome;
        this.id = ++cont;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + " Nome: " + this.nome;
    }

    
}
