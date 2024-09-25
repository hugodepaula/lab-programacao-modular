package br.lpm.business;

import java.time.LocalDate;

public class Oficina {
    private static final int NOT_FOUND = -1;
    private static final int MAX_MANUTENCOES = 1000;
    private static final int MAX_MECANICOS = 1000;
    private String nome;
    private String endereco;
    private Manutencao[] manutencoes = new Manutencao[Oficina.MAX_MANUTENCOES];
    private Mecanico[] mecanicos = new Mecanico[Oficina.MAX_MECANICOS];
    private int numManutencoes = 0;
    private int numMecanicos = 0;

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

    public Mecanico[] getAllMecanicos() {
        return mecanicos;
    }

    public Manutencao getLastManutencaoFromVeiculo(Veiculo veiculo) {
        if (numManutencoes == 0) {
            return null;
        } else {
            for (int i = numManutencoes - 1; i >= 0; i++) {
                if (manutencoes[i].getVeiculo().equals(veiculo)) {
                    return manutencoes[i];
                }
            }
            return null;
        }
    }

    public void addVeiculoToManutencao(Veiculo veiculo) {
        if (numManutencoes < Oficina.MAX_MANUTENCOES) {
            // Veículo já está em manutenção
            if (veiculo.getEstado().equals(Estado.MANUTENCAO)) {
                return;
            } else {
                veiculo.setEstado(Estado.MANUTENCAO);
                Manutencao manutencao = new Manutencao(veiculo, this, LocalDate.now().plusDays(7));
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

    private int searchMecanicoByName(String nome) {
        for (int i = 0; i < numMecanicos; i++) {
            if (mecanicos[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return Oficina.NOT_FOUND;
    }
    public void addMecanico(Mecanico mecanico) {
        if (this.searchMecanicoByName(mecanico.getNome()) == NOT_FOUND) {
            mecanicos[numMecanicos++] = mecanico;
            mecanico.setOficina(this);
        }
    }

    public void removeMecanico(Mecanico mecanico) {
        int pos = searchMecanicoByName(mecanico.getNome());
        if (pos != NOT_FOUND) {
            mecanicos[pos].setOficina(null);
            for (int j = pos + 1; j < numManutencoes; j++) {
                mecanicos[j - 1] = mecanicos[j];
            }
            mecanicos[numManutencoes--] = null;
            return;
     }
    }


    public Oficina(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

}
