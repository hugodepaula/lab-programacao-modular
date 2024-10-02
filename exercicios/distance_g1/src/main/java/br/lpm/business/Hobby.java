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

    public static Hobby parseHobby(String hobby) {
        if (hobby.equalsIgnoreCase("Arte")) {
            return Hobby.ARTE;
        } else if (hobby.equalsIgnoreCase("Esporte")) {
            return Hobby.ESPORTE;
        } else if (hobby.equalsIgnoreCase("Cinema")) {
            return Hobby.CINEMA;
        } else if (hobby.equalsIgnoreCase("Livro")) {
            return Hobby.LIVRO;
        } else if (hobby.equalsIgnoreCase("Música")) {
            return Hobby.MÚSICA;
        } else if (hobby.equalsIgnoreCase("Culinária")) {
            return Hobby.CULINÁRIA;
        } else if (hobby.equalsIgnoreCase("Game")) {
            return Hobby.GAME;
        } else if (hobby.equalsIgnoreCase("Nenhum")) {
            return Hobby.NENHUM;
        } else {
            return null;
        }
    }
   
}
