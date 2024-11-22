package br.lpm.pedidos;

import java.util.ArrayList;
import java.util.List;

public class ListaDePedidos extends Observable {
    private static ListaDePedidos instance;
    private final List<Pedido> pedidos;

    private ListaDePedidos() {
        pedidos = new ArrayList<>();
    }

    public static ListaDePedidos getInstance() {
        if (instance == null) {
            instance = new ListaDePedidos();
        }
        return instance;
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
        notifyAllObservers();
    }

    public void removePedido(Pedido pedido) {
        pedidos.remove(pedido);
        notifyAllObservers();
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
