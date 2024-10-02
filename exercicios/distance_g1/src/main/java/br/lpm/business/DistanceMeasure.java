package br.lpm.business;

public class DistanceMeasure {

    public double calcDistance(Pessoa first, Pessoa second) {
        double distance = 0;
        distance += Math.pow(first.getGenero().equals(second.getGenero()) ? 0 : 1, 2);
        distance += Math.pow(first.getHobby().equals(second.getHobby()) ? 0 : 1, 2);
        distance += Math.pow(first.getEscolaridade().equals(second.getEscolaridade()) ? 0 : 1, 2);
        distance += Math.pow(first.getEstadoCivil().equals(second.getEstadoCivil()) ? 0 : 1, 2);
        distance += Math.pow(first.getMoradia().equals(second.getMoradia()) ? 0 : 1, 2);
        distance += Math.pow(first.isFeliz() == (second.isFeliz()) ? 0 : 1, 2);
        distance += Math.pow(first.getNaturalidade().equalsIgnoreCase(second.getNaturalidade()) ? 0 : 1, 2);
        distance += Math.pow(Math.abs(first.getAltura() - second.getAltura()), 2);
        distance += Math.pow(Math.abs(first.getPeso() - second.getPeso()), 2);
        distance += Math.pow(Math.abs(first.getRenda() - second.getRenda()), 2);

        return Math.sqrt(distance/10);
    }

    public double normalizedEuclideanDistance(Pessoa first, Pessoa second) {
        double distance = 0;
        distance += Math.pow(first.getGenero().equals(second.getGenero()) ? 0 : 1, 2);
        distance += Math.pow(first.getHobby().equals(second.getHobby()) ? 0 : 1, 2);
        distance += Math.pow(first.getEscolaridade().equals(second.getEscolaridade()) ? 0 : 1, 2);
        distance += Math.pow(first.getEstadoCivil().equals(second.getEstadoCivil()) ? 0 : 1, 2);
        distance += Math.pow(first.getMoradia().equals(second.getMoradia()) ? 0 : 1, 2);
        distance += Math.pow(first.isFeliz() == (second.isFeliz()) ? 0 : 1, 2);
        distance += Math.pow(first.getNaturalidade().equalsIgnoreCase(second.getNaturalidade()) ? 0 : 1, 2);
        distance += Math.pow(Math.abs(first.getAltura() - second.getAltura()), 2);
        distance += Math.pow(Math.abs(first.getPeso() - second.getPeso()), 2);
        distance += Math.pow(Math.abs(first.getRenda() - second.getRenda()), 2);

        return Math.sqrt(distance/10);
    }
}