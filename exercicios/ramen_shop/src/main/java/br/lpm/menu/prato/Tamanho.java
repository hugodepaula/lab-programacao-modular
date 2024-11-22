package br.lpm.menu.prato;

public enum Tamanho {
    PEQUENO(9.90), 
    MEDIO(12.90), 
    GRANDE(15.90);

    private final double preco;

    Tamanho(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
