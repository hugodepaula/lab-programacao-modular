package br.lpm;

import br.lpm.menu.Boi;
import br.lpm.menu.Chilli;
import br.lpm.menu.Prato;
import br.lpm.menu.Shitake;
import br.lpm.menu.Tamanho;
import br.lpm.pedidos.Balanco;
import br.lpm.pedidos.ListaDePedidos;
import br.lpm.pedidos.Pedido;

public class Main {
    public static void main(String[] args) {
        Prato prato = new Boi("Boi", Tamanho.GRANDE);
        prato = new Chilli(prato);
        prato = new Shitake(prato);

        Pedido pedido = new Pedido(prato);
        ListaDePedidos.getInstance().addPedido(pedido);

        Balanco balanco = new Balanco();
        balanco.exibirBalanco();
   }
}