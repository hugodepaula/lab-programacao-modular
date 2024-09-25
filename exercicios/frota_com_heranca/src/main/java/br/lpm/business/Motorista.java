package br.lpm.business;

public class Motorista extends Profissional {

    private static final int MAX_ROTAS = 1000;
    private Rota[] rotas = new Rota[Motorista.MAX_ROTAS];
    private int numRotas = 0;

    public Rota[] geRotas() {
        return rotas;
    }
    
    public void addRota(Rota rota) {
        if (numRotas < Motorista.MAX_ROTAS) {
            rotas[numRotas++] = rota;
        }
    }

    public Motorista(String nome) {
        super(nome);
    }

    
}
