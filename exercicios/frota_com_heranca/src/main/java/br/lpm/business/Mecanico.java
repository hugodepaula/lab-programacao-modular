package br.lpm.business;

public class Mecanico extends Profissional {

    private Oficina oficina;
    
    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
    
    public Mecanico(String nome, Oficina oficina) {
        super(nome);
        this.setOficina(oficina); 
        oficina.addMecanico(this);
    }

    @Override
    public String toString() {
        return super.toString() + " Oficina: " + this.oficina.getNome();
    }

    
}
