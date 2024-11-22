package br.lpm.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Balanco {
    private static Balanco instance;
    private final List<Pedido> pedidos = new ArrayList<>();

    private Balanco() {}

    public static Balanco getInstance() {
        if (instance == null) {
            instance = new Balanco();
        }
        return instance;
    }

    public List<Pedido> getAllPedidos() {
        return new ArrayList<>(pedidos);
    }

    public Balanco addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return this;
    }

    public int getCountPedidos() {
        return pedidos.size();
    }

    public float getReceitaTotal() {
        return (float) pedidos.stream()
                .mapToDouble(pedido -> pedido.getPrato().getPreco())
                .sum();
    }

    public float getTicketMedio() {
        return getCountPedidos() > 0 ? getReceitaTotal() / getCountPedidos() : 0;
    }

    public void exibirBalanco() {
        System.out.println("Total de pedidos: " + getCountPedidos());
        System.out.println("Receita total: R$ " + getReceitaTotal());
        System.out.println("Ticket médio: R$ " + getTicketMedio());
    }
}
