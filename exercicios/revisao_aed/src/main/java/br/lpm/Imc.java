package br.lpm;
/**
 * Imc
 * 
 * Neste primeiro exercício o objetivo é apresentar a criação de uma classe.
 * 
 * Ainda não foi ensinado encapsulamento nem construtores. Por enquanto um tipo abstrato de dados
 * é apenas uma coleção de atributos e métodos associados.
 * 
 */
public class Imc {
    float peso;
    float altura;

    float getImc() {
        return this.peso / (this.altura * this.altura);
    }
}
