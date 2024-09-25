package br.lpm.business;

import java.time.LocalDate;

public class Manutencao {
    private Veiculo veiculo;
    private Oficina oficina;
    private LocalDate previsao;

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

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Manutencao(Veiculo veiculo, Oficina oficina, LocalDate previsao) {
        this.setVeiculo(veiculo);
        this.setOficina(oficina);
        this.setPrevisao(previsao);
    }

}
