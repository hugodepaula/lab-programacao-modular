package br.lpm.business;

public class Motorista {
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

    public Motorista(String nome) {
        this.nome = nome;
        this.id = ++cont;
    }

    
}
