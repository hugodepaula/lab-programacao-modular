
package br.lpm.menu.acompanhamentos;

public enum Bebida {
    REFRIGERANTE(5.90),
    CHA_VERDE(3.90),
    CHA_PRETO(0.00);

    private final double preco;

    Bebida(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}