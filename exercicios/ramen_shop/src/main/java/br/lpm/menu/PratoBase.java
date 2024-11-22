package br.lpm.menu;

public abstract class PratoBase implements Prato {
    private float[] precoBase = new float[] {9.9f, 12.9f, 15.9f};
    private String descricao;
    private double preco;
    private Tamanho tamanho;


    public PratoBase(String descricao, Tamanho tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = precoBase[tamanho.getValue()];
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
}
