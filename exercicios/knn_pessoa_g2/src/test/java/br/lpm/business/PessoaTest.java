package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PessoaTest {
    public static Pessoa pessoa;
    @BeforeEach
    public void setUp() throws Exception {
        pessoa = new Pessoa("Hugo");
    }
    
    @Test
    void testSetNome() {
        pessoa.setNome("Hugo de Paula");
        assertEquals("Hugo de Paula", pessoa.getNome(), "Atribuição de nome válido.");
        pessoa.setNome("Hugo de Paula 123");
        assertEquals("Hugo de Paula", pessoa.getNome(), "Atribuição de nome inválido.");
   }


    @Test
    void testSetAltura() {
        pessoa.setAltura(1.80f);
        assertEquals(1.80f, pessoa.getAltura(), 0.01f, "Atribuição de altura válida.");
        pessoa.setAltura(3.61f);
        assertEquals(1.80f, pessoa.getAltura(), 0.01f, "Atribuição de altura inválida.");
        pessoa.setAltura(-1.80f);
        assertEquals(1.80f, pessoa.getAltura(), 0.01f, "Atribuição de altura negativa.");
    }


    @Test
    void testSetDataNascimento() {
        pessoa.setDataNascimento(LocalDate.now().minusYears(10));
        assertEquals(LocalDate.now().minusYears(10), pessoa.getDataNascimento(), "Atribuição de data de nascimento válida.");
        pessoa.setDataNascimento(LocalDate.now().plusDays(1));
        assertEquals(LocalDate.now().minusYears(10), pessoa.getDataNascimento(), "Atribuição de data de nascimento inválida.");
    }


    @Test
    void testSetEstadoCivil() {
        pessoa.setEstadoCivil(EstadoCivil.CASADO);
        assertEquals(EstadoCivil.CASADO, pessoa.getEstadoCivil());
    }



    @Test
    void testSetPeso() {
        pessoa.setPeso(106);
        assertEquals(106, pessoa.getPeso(), "Atribuição de peso válido.");
        pessoa.setPeso(601);
        assertEquals(106, pessoa.getPeso(), 0.01f, "Atribuição de peso excecivo.");
        pessoa.setPeso(-180);
        assertEquals(106, pessoa.getPeso(), 0.01f, "Atribuição de peso negativo.");
       
    }

}
