package br.lpm.menu.prato;

import java.util.Optional;

import br.lpm.menu.acompanhamentos.Bebida;

public abstract class PratoBase implements Prato {
    private String descricao;
    private Tamanho tamanho;
    private Bebida bebida;
    
    public PratoBase(String descricao, Tamanho tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.bebida = null;
    }

    public Prato addBebida(Bebida bebida) {
       this.bebida = bebida;
        return this;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return tamanho.getPreco() 
                + getProteinaPreco() 
                + (bebida != null ? bebida.getPreco() : 0.0);             
    }

    /**
     * Retorna o preço de cada proteína base.
     * 
     * Evita violar o LSP (Liskov Substitution Principle), uma vez que não irá sobrepor
     * o método getPreço, que já possui implementação.
     * 
     * @return preço da proteína base
     */ 
    protected abstract double getProteinaPreco();
}
