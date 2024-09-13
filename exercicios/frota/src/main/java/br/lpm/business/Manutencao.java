package br.lpm.business;

import java.time.LocalDate;

public class Manutencao {
    Veiculo veiculo;
    LocalDate previsao;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getPrevisao() {
        return previsao;
    }

    public void setPrevisao(LocalDate previsao) {
        if (previsao.isAfter(LocalDate.now())) {
            this.previsao = previsao;
        } else {
            this.previsao = LocalDate.now().plusDays(7);
        }
    }

    public Manutencao(Veiculo veiculo, LocalDate previsao) {
        this.setVeiculo(veiculo);
        this.setPrevisao(previsao);
    }

}
