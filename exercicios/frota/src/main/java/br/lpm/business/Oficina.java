package br.lpm.business;

import java.time.LocalDate;

public class Oficina {
    private static final int MAX_VEICULOS = 1000;
    private String nome;
    private String endereco;
    private Manutencao[] manutencoes = new Manutencao[Oficina.MAX_VEICULOS];
    private int numManutencoes = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumManutencoes() {
        return numManutencoes;
    }

    public Manutencao[] getAllManutencoes() {
        return manutencoes;
    }

    public Manutencao getLastManutencaoFromVeiculo(Veiculo veiculo) {
        for (int i = numManutencoes - 1; i >= 0; i++) {
            if (manutencoes[i].getVeiculo().equals(veiculo)) {
                return manutencoes[i];
            }
        }
        return null;
    }

    public void addVeiculoToManutencao(Veiculo veiculo) {
        if (numManutencoes < Oficina.MAX_VEICULOS) {
            // Veículo já está em manutenção
            if (veiculo.getEstado().equals(Estado.MANUTENCAO)) {
                return;
            } else {
                veiculo.setEstado(Estado.MANUTENCAO);
                Manutencao manutencao = new Manutencao(veiculo, LocalDate.now().plusDays(7));
                manutencoes[numManutencoes++] = manutencao;
            }
        }
    }

    public void removeVeiculoFromManutencao(Veiculo veiculo) {
        for (int i = 0; i < numManutencoes; i++) {
            if (manutencoes[i].getVeiculo().equals(veiculo)) {
                veiculo.setEstado(Estado.TRANSITO);
                for (int j = i + 1; j < numManutencoes; j++) {
                    manutencoes[j - 1] = manutencoes[j];
                }
                manutencoes[numManutencoes--] = null;
                return;
            }
        }
    }

    public Oficina(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

}
