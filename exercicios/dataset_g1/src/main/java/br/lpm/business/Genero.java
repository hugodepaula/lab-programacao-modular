package br.lpm.business;

public enum Genero {
    FEMININO(0), MASCULINO(1), NAO_BINARIO(2), NAO_RESPONDER(3);

    private int value;

    public int getValue() {
        return value;
    }

    private Genero(int value) {
        this.value = value;
    }
}
