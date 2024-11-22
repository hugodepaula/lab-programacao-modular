package br.lpm.menu.acrescimos;

import br.lpm.menu.prato.Prato;

public abstract class Acrescimo implements Prato {
    protected Prato prato;

    public Acrescimo(Prato prato) {
        this.prato = prato;
    }

    @Override
    public String getDescricao() {
        return prato.getDescricao();
    }

    @Override
    public double getPreco() {
        return prato.getPreco();
    }
}
