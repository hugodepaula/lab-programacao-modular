package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void testSetGenero() {
        pessoa.setGenero(Genero.MASCULINO);
        assertEquals(Genero.MASCULINO, pessoa.getGenero());
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
        pessoa.setAltura(2.61f);
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
    void testSetEscolaridade() {
        pessoa.setEscolaridade(Escolaridade.FUNDAMENTAL);
        assertEquals(Escolaridade.FUNDAMENTAL, pessoa.getEscolaridade());
    }


    @Test
    void testSetEstadoCivil() {
        pessoa.setEstadoCivil(EstadoCivil.CASADO);
        assertEquals(EstadoCivil.CASADO, pessoa.getEstadoCivil());
    }


    @Test
    void testSetFeliz() {
        pessoa.setFeliz(true);
        assertTrue(pessoa.isFeliz());
    }


    @Test
    void testSetHobby() {
        pessoa.setHobby(Hobby.ARTE);
        assertEquals(Hobby.ARTE, pessoa.getHobby());
    }


    @Test
    void testSetMoradia() {
        pessoa.setMoradia(Moradia.ALUGUEL);
        assertEquals(Moradia.ALUGUEL, pessoa.getMoradia());
    }


    @Test
    void testSetNaturalidade() {
        pessoa.setNaturalidade("Neuschweinstein");
        assertEquals("Neuschweinstein", pessoa.getNaturalidade());
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


    @Test
    void testSetRenda() {
        pessoa.setRenda(1237.34f);
        assertEquals(1237.34f, pessoa.getRenda(), 0.01f, "Atribuição de altura válida.");
        pessoa.setRenda(1237.34f);
        assertEquals(1237.34f, pessoa.getRenda(), 0.01f, "Atribuição de altura negativa.");
 
    }
}
