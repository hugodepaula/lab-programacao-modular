package br.lpm.business;

public enum Profissao {
    DESEMPREGADO(0), ESTUDANTE(1), AUTONOMO(2), CLT(3), EMPRESARIO(4);

    private int value;

    public int getValue() {
        return value;
    }

    private Profissao(int value) {
        this.value = value;
    }

    public static Profissao parseProfissao(String profissao) {
        if (profissao.equalsIgnoreCase("Desempregado")) {
            return Profissao.DESEMPREGADO;
        } else if (profissao.equalsIgnoreCase("Estudante")) {
            return Profissao.ESTUDANTE;
        } else if (profissao.equalsIgnoreCase("Autônomo")) {
            return Profissao.AUTONOMO;
        } else if (profissao.equalsIgnoreCase("CLT")) {
            return Profissao.CLT;
        }  else if (profissao.equalsIgnoreCase("Empresário")) {
            return Profissao.EMPRESARIO;
        } else {
            return null;
        }
    }

}    
