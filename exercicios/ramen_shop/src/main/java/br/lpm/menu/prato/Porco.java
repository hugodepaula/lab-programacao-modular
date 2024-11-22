package br.lpm.menu.prato;

public class Porco extends PratoBase {
    public Porco(String descricao, Tamanho tamanho) {
        super(descricao, tamanho);
    }

    @Override
    protected double getProteinaPreco() {
        return 5.90;
    }
}
