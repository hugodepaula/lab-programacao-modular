
package br.lpm.menu.acrescimos;

import br.lpm.menu.prato.Prato;

public class CremeAlho extends Acrescimo {
    public CremeAlho(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return prato.getDescricao() + ", Creme de Alho";
    }

    @Override
    public double getPreco() {
        return prato.getPreco() + 1.50;
    }
}