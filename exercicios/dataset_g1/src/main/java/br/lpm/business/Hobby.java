package br.lpm.business;

public enum Hobby {
    ARTE(0), ESPORTE(1), CINEMA(2), LIVRO(3), MÚSICA(4), CULINÁRIA(5), GAME(6), NENHUM(7);

    private int value;

    public int getValue() {
        return value;
    }

    private Hobby(int value) {
        this.value = value;
    }
}
