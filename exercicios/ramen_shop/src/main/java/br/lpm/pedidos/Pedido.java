package br.lpm.pedidos;

import br.lpm.menu.prato.Prato;

public class Pedido {
    private static int counter = 0;
    private final int id;
    private int estado; // 0 = Pendente, 1 = Pronto, 2 = Retirado
    private final Prato prato;

    public Pedido(Prato prato) {
        this.id = ++counter;
        this.estado = 0;
        this.prato = prato;
    }

    public int getId() {
        return id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Prato getPrato() {
        return prato;
    }
}
