package br.lpm.menu.acrescimos;

import br.lpm.menu.prato.Prato;

public class ProteinaExtra extends Acrescimo {
    public ProteinaExtra(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + ", Proteína Extra";
    }

    @Override
    public double getPreco() {
        return super.getPreco() + 4.00;
    }
}
