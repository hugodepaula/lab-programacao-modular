package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrotaTest {

    private static Frota frota;
    private static Veiculo veiculo;
    private static String placa;

    @BeforeEach
    public void setUp() {
        placa = "A32J4B";
        frota = new Frota();
        veiculo = new Veiculo("Shulambs", 2024, placa, 19999);
    }

    @Test
    void testAddVeiculo() {
       int numVeiculos = frota.getNumVeiculos();
       frota.addVeiculo(veiculo);
       assertEquals(numVeiculos + 1, frota.getNumVeiculos(), "Adicionando novo veículo na Frota.");
    }

    @Test
    void testGetVeiculoByPlaca() {
        frota.addVeiculo(veiculo);
        assertEquals(veiculo, frota.getVeiculoByPlaca("A32J4B"), "Recupera veículo adicionado.");
        assertNull(frota.getVeiculoByPlaca("XXXXXX"), "Recupera veículo inexistente.");
     }

    @Test
    void testNewRota() {
        Motorista motorista = new Motorista("José Shulambs da Silva");
        int numRotas = frota.getNumRotas();
        frota.newRota(motorista, veiculo, "Belo Horizonte", "Nova Lima");
        assertEquals(numRotas+1, frota.getNumRotas(),"Adicionando nova rota para veículo.");
    }

    @Test
    void testRemoveVeiculoByPlaca() {
        int numVeiculos = frota.getNumVeiculos();
        frota.addVeiculo(veiculo);
        frota.removeVeiculoByPlaca("XXXXXX");
        assertEquals(numVeiculos + 1, frota.getNumVeiculos(), "Removendo veículo inexistente da Frota.");
        frota.removeVeiculoByPlaca(placa);
        assertEquals(numVeiculos, frota.getNumVeiculos(), "Removendo veículo da Frota.");
    }

}
