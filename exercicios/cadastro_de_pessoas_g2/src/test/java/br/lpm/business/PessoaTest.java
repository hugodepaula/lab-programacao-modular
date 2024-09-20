package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import business.Pessoa;

public class PessoaTest {

    @Test
    void testSetNome() {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Hugo");
        assertEquals("Hugo", pessoa.getNome(), "Altera o nome com valor válido.");
        pessoa.setNome("Hugo123");
        assertEquals("Hugo", pessoa.getNome(), "Altera o nome com valor inválido (com números).");

    }

    @Test
    void testSetDataNascimento() {
        Pessoa pessoa = new Pessoa();
        pessoa.setDataNascimento(LocalDate.of(2024, 1, 1));
        
    }
}
