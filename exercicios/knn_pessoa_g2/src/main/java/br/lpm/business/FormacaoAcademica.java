package br.lpm.business;

public enum FormacaoAcademica {
    NENHUMA(0), BASICA(1), MEDIA(2), SUPERIOR(3);

    private int value;

    public int getValue() {
        return value;
    }

    private FormacaoAcademica(int value) {
        this.value = value;
    }

    public static FormacaoAcademica parseFormacaoAcademica(String formacaoAcademica) {
        if (formacaoAcademica.equalsIgnoreCase("Nenhuma")) {
            return FormacaoAcademica.NENHUMA;
        } else if (formacaoAcademica.equalsIgnoreCase("Educação básica")) {
            return FormacaoAcademica.BASICA;
        } else if (formacaoAcademica.equalsIgnoreCase("Ensino Médio")) {
            return FormacaoAcademica.MEDIA;
        } else if (formacaoAcademica.equalsIgnoreCase("Educação superior")) {
            return FormacaoAcademica.SUPERIOR;
        } else {
            return null;
        }
    }

}
