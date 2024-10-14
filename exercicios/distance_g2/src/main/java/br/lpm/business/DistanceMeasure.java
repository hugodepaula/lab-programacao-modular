package br.lpm.business;

public class DistanceMeasure {

    public double calcDistance(Pessoa first, Pessoa second) {
        double distance = 0;
        distance += Math.pow(first.getEstadoCivil().equals(second.getEstadoCivil()) ? 0 : 1, 2);
        distance += Math.pow(first.getFormacaoAcademica().equals(second.getFormacaoAcademica()) ? 0 : 1, 2);
        distance += Math.pow(first.getProfissao().equals(second.getProfissao()) ? 0 : 1, 2);

        distance += Math.pow(first.hasHobby() == second.hasHobby() ? 0 : 1, 2);
        distance += Math.pow(first.hasVidaSocial() == (second.hasVidaSocial()) ? 0 : 1, 2);

        distance += Math.pow(Math.abs(first.getAltura() - second.getAltura()), 2);
        distance += Math.pow(Math.abs(first.getPeso() - second.getPeso()), 2);
        distance += Math.pow(Math.abs(first.getAtividadeFisica() - second.getAtividadeFisica()), 2);
        distance += Math.pow(Math.abs(first.getSaude() - second.getSaude()), 2);

        return Math.sqrt(distance/9);
    }
}