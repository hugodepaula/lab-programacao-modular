package br.lpm.business;

import java.time.LocalDate;

public class Frota {

    private static final int MAX_VEICULOS = 1000;
    private static final int MAX_ROTAS = 10000;
    private Veiculo[] veiculos = new Veiculo[Frota.MAX_VEICULOS];
    private Rota[] rotas = new Rota[Frota.MAX_ROTAS];

    private int numVeiculos = 0;
    private int numRotas = 0;

    public int getNumVeiculos() {
        return numVeiculos;
    }

    public int getNumRotas() {
        return numRotas;
    }

    public Veiculo[] getAllVeiculos() {
        return veiculos;
    }

    public void addVeiculo(Veiculo veiculo) {
        if (numVeiculos < Frota.MAX_VEICULOS) {
            veiculos[numVeiculos++] = veiculo;
        }
    }

    public Veiculo getVeiculoByPlaca(String placa) {
        for (int i = 0; i < numVeiculos; i++) {
            if (veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                return veiculos[i];
            }
        }
        return null;
    }
    
    public void removeVeiculoByPlaca(String placa) {
        for (int i = 0; i < numVeiculos; i++) {
            if (veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                for (int j = i + 1; j < numVeiculos; j++) {
                    veiculos[j - 1] = veiculos[j];
                }
                this.veiculos[numVeiculos--] = null;
                return;
            }
        }
    }

    public void replaceVeiculo(Veiculo oldVeiculo, Veiculo newVeiculo) {
        for (int i = 0; i < numVeiculos; i++) {
            if (veiculos[i].getPlaca().equalsIgnoreCase(oldVeiculo.getPlaca())) {
                veiculos[i] = newVeiculo;
                return;
            }
        }
    }

    public void newRota(Motorista motorista, Veiculo veiculo, String origem, String destino) {
        var today = LocalDate.now();
        // Veículo não pode estar em manutenção
        if (veiculo.getEstado() == Estado.TRANSITO) {
            // Não pode existir rota para aquele veículo no mesmo dia
            for (int i = 0; i < numRotas; i++) {
                if (rotas[i].getVeiculo().equals(veiculo) && rotas[i].getData().equals(today)) {
                    return;
                }
            }
            Rota novaRota = new Rota(veiculo, motorista, origem, destino, today);
            rotas[numRotas++] = novaRota;
            motorista.addRota(novaRota);
        }
    }

}
