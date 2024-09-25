package br.lpm.business;

public class Veiculo {

    private String modelo;
    private int ano;
    private String placa;
    private int km;
    private Estado estado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getKm() {
        return this.km;
    }

    public void setKm(int km) {
        if (km > 0) {
            this.km = km;
        }
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Veiculo(String modelo, int ano, String placa, int km) {
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.km = km;
        this.estado = Estado.TRANSITO;
    }


    
}
