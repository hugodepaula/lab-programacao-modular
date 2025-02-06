package br.lpm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * Classe de teste para a calculadora
 * 
 * @author Hugo de Paula
 * @version 1.0
 */
public class CalculadoraTest {

    /**
     * Testa o método de soma da calculadora
     * Verifica se a soma de 2 + 3 resulta em 5
     */
    @Test
    public void testSomar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.somar(2, 3));
    }

    /**
     * Testa o método de subtração da calculadora
     * Verifica se a subtração de 3 - 2 resulta em 1
     */
    @Test
    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.subtrair(3, 2));
    }

    /**
     * Testa o método de multiplicação da calculadora
     * Verifica se a multiplicação de 2 * 3 resulta em 6
     */
    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
    }

    /**
     * Testa o método de divisão da calculadora
     * Verifica se a divisão de 5 / 2 resulta em 2.5
     */
    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.5, calc.dividir(5, 2));
    }

    /**
     * Testa o método de divisão da calculadora com divisão por zero
     * Verifica se uma exceção IllegalArgumentException é lançada ao tentar dividir por zero
     */
    @Test
    public void testDividirPorZero() {
        Calculadora calc = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(5, 0);
        });
    }
}
