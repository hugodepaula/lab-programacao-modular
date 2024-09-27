package br.lpm.business;

public enum Moradia {
    COM_FAMILIA(0), ALUGUEL(1), CASA_PROPRIA(2);

    private int value;

    public int getValue() {
        return value;
    }

    private Moradia(int value) {
        this.value = value;
    }
}
