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

    public static Escolaridade parseEscolaridade(String escolaridade) {
        if (escolaridade.equalsIgnoreCase("Nenhuma")) {
            return Escolaridade.NENHUMA;
        } else if (escolaridade.equalsIgnoreCase("Ensino Fundamental")) {
            return Escolaridade.FUNDAMENTAL;
        } else if (escolaridade.equalsIgnoreCase("Ensino Médio")) {
            return Escolaridade.MEDIO;
        } else if (escolaridade.equalsIgnoreCase("Ensino Superior")) {
            return Escolaridade.SUPERIOR;
        } else if (escolaridade.equalsIgnoreCase("Pós-graduação, Mestrado ou Doutorado")) {
            return Escolaridade.POS_GRADUACAO;
        } else {
            return null;
        }
    }

}
