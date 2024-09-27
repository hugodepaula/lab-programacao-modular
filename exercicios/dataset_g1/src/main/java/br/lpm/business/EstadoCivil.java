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

    public static EstadoCivil parseEstadoCivil(String estadoCivil) {
        if (estadoCivil.equalsIgnoreCase("Solteiro")) {
            return EstadoCivil.SOLTEIRO;
        } else if (estadoCivil.equalsIgnoreCase("Casado")) {
            return EstadoCivil.CASADO;
        } else if (estadoCivil.equalsIgnoreCase("Viúvo")) {
            return EstadoCivil.VIUVO;
        } else if (estadoCivil.equalsIgnoreCase("Separado")) {
            return EstadoCivil.SEPARADO;
        } else if (estadoCivil.equalsIgnoreCase("Divorciado")) {
            return EstadoCivil.DIVORCIADO;
        } else {
            return null;
        }
    }

}
