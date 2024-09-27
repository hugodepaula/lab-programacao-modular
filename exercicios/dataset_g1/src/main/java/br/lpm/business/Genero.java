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

    public static Genero parseGenero(String genero) {
        if (genero.equalsIgnoreCase("Feminino")) {
            return Genero.FEMININO;
        } else if (genero.equalsIgnoreCase("Masculilno")) {
            return Genero.MASCULINO;
        } else if (genero.equalsIgnoreCase("Não binário")) {
            return Genero.NAO_BINARIO;
        } else if (genero.equalsIgnoreCase("Não responder")) {
            return Genero.NAO_RESPONDER;
        } else {
            return null;
        }
    }
}
