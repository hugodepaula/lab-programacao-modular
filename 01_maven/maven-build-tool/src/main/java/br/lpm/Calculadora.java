package br.lpm;

/**
 * Classe que implementa operações matemáticas básicas.
 * 
 * @author Hugo de Paula
 * @version 1.0
 */
public class Calculadora {
    /**
     * Soma dois números inteiros.
     * 
     * @param a primeiro número a ser somado
     * @param b segundo número a ser somado
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * 
     * @param a número do qual será subtraído b
     * @param b número a ser subtraído de a
     * @return a diferença entre a e b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     * 
     * @param a primeiro número a ser multiplicado
     * @param b segundo número a ser multiplicado
     * @return o produto de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois números inteiros.
     * 
     * @param a dividendo
     * @param b divisor
     * @return o quociente de a por b como um número decimal
     * @throws IllegalArgumentException se o divisor for zero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return (double) a / b;
    }
}
