package br.lpm.menu;

public class Chilli extends Acrescimo {
    public Chilli(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return prato.getDescricao() + ", Chilli";
    }

    @Override
    public double getPreco() {
        return prato.getPreco() + 2.50;
    }
}