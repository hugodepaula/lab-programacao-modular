package br.lpm.menu.acrescimos;

import br.lpm.menu.prato.Prato;

public class Tofu extends Acrescimo {
    public Tofu(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Tofu";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.70;
    }
}
