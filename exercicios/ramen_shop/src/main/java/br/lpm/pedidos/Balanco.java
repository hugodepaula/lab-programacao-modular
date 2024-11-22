package br.lpm.pedidos;

public class Balanco {
    private final ListaDePedidos listaDePedidos = ListaDePedidos.getInstance();

    public void exibirBalanco() {
        double receitaTotal = 0;
        int totalPedidos = listaDePedidos.getPedidos().size();

        for (Pedido pedido : listaDePedidos.getPedidos()) {
            receitaTotal += pedido.getPrato().getPreco();
        }

        double ticketMedio = totalPedidos > 0 ? receitaTotal / totalPedidos : 0;

        System.out.println("Total de pedidos: " + totalPedidos);
        System.out.println("Receita total: R$ " + receitaTotal);
        System.out.println("Ticket médio: R$ " + ticketMedio);
    }
}
