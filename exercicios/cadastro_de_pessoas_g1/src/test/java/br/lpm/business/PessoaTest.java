package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PessoaTest {
    public static Pessoa pessoa;
    @BeforeEach
    public void setUp() throws Exception {
        pessoa = new Pessoa();
    }


    @Test
    void testSetGenero() {
        pessoa.setGenero(Genero.MASCULINO);
        assertEquals(Genero.MASCULINO, pessoa.getGenero());

    }

    @Test
    void testSetNome() {
        pessoa.setNome("Hugo");
        assertEquals("Hugo", pessoa.getNome(), "Atribuição de nome válido.");
        pessoa.setNome("Hugo123");
        assertEquals("Hugo", pessoa.getNome(), "Atribuição de nome inválido.");

    }


    @Test
    void testSetAltura() {
        
    }


    @Test
    void testSetDataNascimento() {
        
    }


    @Test
    void testSetEscolaridade() {
        
    }


    @Test
    void testSetEstadoCivil() {
        
    }


    @Test
    void testSetFeliz() {
        
    }


    @Test
    void testSetHobby() {
        
    }


    @Test
    void testSetMoradia() {
        
    }


    @Test
    void testSetNaturalidade() {
        
    }


    @Test
    void testSetPeso() {
        
    }


    @Test
    void testSetRenda() {
        
    }
}
