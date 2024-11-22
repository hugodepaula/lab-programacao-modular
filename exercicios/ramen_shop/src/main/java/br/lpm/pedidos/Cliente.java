package br.lpm.pedidos;

public class Cliente implements Observer {
    private final String nome;
    private final String telefone; 
    private final Pedido pedido;

    public Cliente(String nome, String telefone, Pedido pedido) {
        this.nome = nome;
        this.telefone = telefone;
        this.pedido = pedido;
    }

    @Override
    public void update() {
        System.out.print(telefone + " foi notificado:  ");
        System.out.println("Olá, " + nome + "! O pedido " + pedido.getId() + " está pronto!");
    }
}
