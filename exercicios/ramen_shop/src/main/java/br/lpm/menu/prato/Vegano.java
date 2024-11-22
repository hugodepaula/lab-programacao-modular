package br.lpm.menu.prato;

public class Vegano extends PratoBase {
    public Vegano(String descricao, Tamanho tamanho) {
        super(descricao, tamanho);
    }

    @Override
    protected double getProteinaPreco() {
        return 3.90;
    }
}

