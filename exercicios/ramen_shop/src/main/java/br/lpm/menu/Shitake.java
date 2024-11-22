package br.lpm.menu;

public class Shitake extends Acrescimo {
    public Shitake(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return prato.getDescricao() + ", Shitake";
    }

    @Override
    public double getPreco() {
        return prato.getPreco() + 6.90;
    }
}
