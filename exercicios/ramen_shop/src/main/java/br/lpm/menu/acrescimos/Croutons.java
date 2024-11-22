package br.lpm.menu.acrescimos;

import br.lpm.menu.prato.Prato;

public class Croutons extends Acrescimo {
    public Croutons(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Croutons";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 2.00;
    }
}
