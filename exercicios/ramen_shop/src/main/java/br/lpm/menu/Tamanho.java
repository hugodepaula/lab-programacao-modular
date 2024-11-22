package br.lpm.menu;

public enum Tamanho {
    PEQUENO(0), MEDIO(1), GRANDE(2);

    private int value;

    Tamanho(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
