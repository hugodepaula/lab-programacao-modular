package br.lpm.business;

public enum EstadoCivil {
    SOLTEIRO(0), CASADO(1), VIUVO(2), SEPARADO(3), DIVORCIADO(4);

    private int value;

    public int getValue() {
        return value;
    }

    private EstadoCivil(int value) {
        this.value = value;
    }
}
