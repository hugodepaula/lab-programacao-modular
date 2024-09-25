package br.lpm.business;

import java.time.LocalDate;

public class Rota {

    private Veiculo veiculo;
    private Motorista motorista;

    private String origem;
    private String destino;
    private LocalDate data;

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getData() {
        return data;
    }

    public Rota(Veiculo veiculo, Motorista motorista, String origem, String destino, LocalDate data) {
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

}