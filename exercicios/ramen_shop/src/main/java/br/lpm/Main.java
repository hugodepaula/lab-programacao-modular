package br.lpm;

import br.lpm.menu.acrescimos.Chilli;
import br.lpm.menu.acrescimos.CremeAlho;
import br.lpm.menu.acrescimos.Shitake;
import br.lpm.menu.acrescimos.Tofu;
import br.lpm.menu.prato.Boi;
import br.lpm.menu.prato.Prato;
import br.lpm.menu.prato.Tamanho;
import br.lpm.menu.prato.Vegano;
import br.lpm.pedidos.Balanco;
import br.lpm.pedidos.ListaDePedidos;
import br.lpm.pedidos.Pedido;

public class Main {
    public static void main(String[] args) {
        Prato prato;
        Pedido pedido;

        prato = new Vegano("Boi", Tamanho.GRANDE);
        prato = new Tofu(prato);
        prato = new Shitake(prato);
        pedido = new Pedido(prato);

        ListaDePedidos.getInstance().addPedido(pedido);
        Balanco.getInstance().addPedido(pedido);
 
        prato = new Boi("Boi", Tamanho.GRANDE);
        prato = new Chilli(prato);
        prato = new CremeAlho(prato);
        pedido = new Pedido(prato);

        ListaDePedidos.getInstance().addPedido(pedido);
        Balanco.getInstance().addPedido(pedido);

        Balanco.getInstance().exibirBalanco();
   }
}