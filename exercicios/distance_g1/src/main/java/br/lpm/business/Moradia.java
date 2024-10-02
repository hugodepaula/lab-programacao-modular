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

    public static Moradia parseMoradia(String moradia) {
        if (moradia.equalsIgnoreCase("Com a família")) {
            return Moradia.COM_FAMILIA;
        } else if (moradia.equalsIgnoreCase("Aluguel")) {
            return Moradia.ALUGUEL;
        } else if (moradia.equalsIgnoreCase("Casa Própria")) {
            return Moradia.CASA_PROPRIA;
        } else {
            return null;
        }
    }
}
