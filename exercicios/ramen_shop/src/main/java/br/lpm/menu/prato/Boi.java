package br.lpm.menu.prato;

public class Boi extends PratoBase {
    public Boi(String descricao, Tamanho tamanho) {
        super(descricao, tamanho);
    }

    @Override
    protected double getProteinaPreco() {
        return 7.90;
    }
}
