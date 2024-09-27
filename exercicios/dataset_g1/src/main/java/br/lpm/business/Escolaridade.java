package br.lpm.business;

public enum Escolaridade {
    NENHUMA(0), FUNDAMENTAL(1), MEDIO(2), SUPERIOR(3), POS_GRADUACAO(4);

    private int value;

    public int getValue() {
        return value;
    }

    private Escolaridade(int value) {
        this.value = value;
    }
}
