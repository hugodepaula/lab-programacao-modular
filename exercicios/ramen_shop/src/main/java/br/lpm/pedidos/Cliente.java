package br.lpm.pedidos;

public class Cliente implements Observer {
    private final String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void update() {
        System.out.println(nome + " foi notificado!");
    }
}
