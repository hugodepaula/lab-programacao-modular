package br.lpm.main;

import br.lpm.business.Mecanico;
import br.lpm.business.Oficina;

public class Main {
    public static void main(String[] args) {
        Oficina automec = new Oficina("Automec", "Rua Sem nome, 000");
        Mecanico ze = new Mecanico("Ze", automec);
        System.out.println(ze);
    }
}