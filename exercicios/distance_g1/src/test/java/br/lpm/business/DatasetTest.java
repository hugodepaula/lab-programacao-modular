package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatasetTest {

    Pessoa pessoa1 = new Pessoa("Pessoa Um", 
                                LocalDate.of(1990, 1, 1),
                                Genero.MASCULINO, 
                                2f, 
                                100, 
                                5000f,
                                "Cidade Um",
                                Hobby.NENHUM, 
                                EstadoCivil.CASADO, 
                                Escolaridade.SUPERIOR, 
                                false, 
                                Moradia.ALUGUEL);
    Pessoa pessoa2 = new Pessoa("Pessoa Dois", 
                                LocalDate.of(2000, 1, 1),
                                Genero.MASCULINO, 
                                1.75f, 
                                80, 
                                4000f,
                                "Cidade Dois",
                                Hobby.GAME, 
                                EstadoCivil.SOLTEIRO, 
                                Escolaridade.SUPERIOR, 
                                false, 
                                Moradia.COM_FAMILIA);
    Pessoa pessoa3 = new Pessoa("Pessoa Três", 
                                LocalDate.of(2010, 1, 1),
                                Genero.FEMININO, 
                                1.5f, 
                                60, 
                                3000f,
                                "Cidade Três",
                                Hobby.GAME, 
                                EstadoCivil.SOLTEIRO, 
                                Escolaridade.MEDIO, 
                                true, 
                                Moradia.COM_FAMILIA);
    Dataset dataset = new Dataset();

    @BeforeEach
    public void setUp() {
        dataset.addPessoa(pessoa1);
        dataset.addPessoa(pessoa2);
        dataset.addPessoa(pessoa3);
    }



    @Test
    void testAddPessoa() {
        int numPessoas = dataset.size();
        dataset.addPessoa(new Pessoa("Pessoa Quatro", LocalDate.of(2020, 1, 1), Genero.FEMININO, 1.5f, 
                50, 3000f, "Cidade Quatro", Hobby.GAME, EstadoCivil.SOLTEIRO, Escolaridade.MEDIO, true, Moradia.COM_FAMILIA));
        assertEquals(numPessoas+1, dataset.size());

    }

    @Test
    void testAvgAltura() {
        assertEquals(1.75f, dataset.avgAltura(), 0.01f);
    }

    @Test
    void testAvgPeso() {
        assertEquals(80f, dataset.avgPeso(), 0.01f);
    }

    @Test
    void testAvgRenda() {
        assertEquals(4000f, dataset.avgRenda(), 0.01f);
    }

    @Test
    void testGetPessoaByName() {
        Pessoa pessoax = dataset.getPessoaByName("Pessoa Um");
        assertNotNull(pessoax, "Recuperando uma pessoa cadastrada.");
        Pessoa pessoay = dataset.getPessoaByName("Pessoa Shulambs");
        assertNull(pessoay, "Recuperando uma pessoa não cadastrada.");
     }

    @Test
    void testMaxAltura() {
        assertEquals(2f,dataset.maxAltura(),0.01f);
    }

    @Test
    void testMaxPeso() {
        assertEquals(100f,dataset.maxPeso(),0.01f);
    }

    @Test
    void testMaxRenda() {
        assertEquals(5000f,dataset.maxRenda(),0.01f);
    }

    @Test
    void testMinAltura() {
        assertEquals(1.5f,dataset.minAltura(),0.01f);
    }

    @Test
    void testMinPeso() {
        assertEquals(60f,dataset.minPeso(),0.01f);
    }

    @Test
    void testMinRenda() {
        assertEquals(3000f,dataset.minRenda(),0.01f);
    }

    @Test
    void testModeEscolaridade() {
        assertEquals(Escolaridade.SUPERIOR,dataset.modeEscolaridade());
    }

    @Test
    void testModeEstadoCivil() {
        assertEquals(EstadoCivil.SOLTEIRO,dataset.modeEstadoCivil());
    }

    @Test
    void testModeGenero() {
        assertEquals(Genero.MASCULINO,dataset.modeGenero());
    }

    @Test
    void testModeHobby() {
        assertEquals(Hobby.GAME,dataset.modeHobby());
    }

    @Test
    void testModeMoradia() {
        assertEquals(Moradia.COM_FAMILIA,dataset.modeMoradia());
    }

    @Test
    void testPercentAdulto() {
        assertEquals(2.0f/3.0f, dataset.percentAdulto(), 0.01f);
    }

    @Test
    void testPercentEscolaridade() {
        assertEquals(2.0f/3.0f, dataset.percentEscolaridade(Escolaridade.SUPERIOR), 0.01f);
    }

    @Test
    void testPercentEstadoCivil() {
        assertEquals(2.0f/3.0f, dataset.percentEstadoCivil(EstadoCivil.SOLTEIRO), 0.01f);
    }

    @Test
    void testPercentFeliz() {
        assertEquals(1.0f/3.0f, dataset.percentFeliz(), 0.01f);
    }

    @Test
    void testPercentGenero() {
        assertEquals(2.0f/3.0f, dataset.percentGenero(Genero.MASCULINO), 0.01f);
    }

    @Test
    void testPercentHobby() {
        assertEquals(2.0f/3.0f, dataset.percentHobby(Hobby.GAME), 0.01f);
    }

    @Test
    void testPercentMoradia() {
        assertEquals(2.0f/3.0f, dataset.percentMoradia(Moradia.COM_FAMILIA), 0.01f);
    }

    @Test
    void testRemoveAll() {
        dataset.removeAll();
        assertEquals(0, dataset.size());
    }

    @Test
    void testRemovePessoa() {
        dataset.removePessoa(pessoa1);
        assertEquals(2, dataset.size(), "Remove pessoa cadastrada.");
        dataset.removePessoa(new Pessoa("Shulambs"));
        assertEquals(2, dataset.size(), "Remove pessoa não cadastrada.");
    }

    @Test
    void testRemovePessoaByName() {
        dataset.removePessoaByName("Pessoa Um");
        assertEquals(2, dataset.size(), "Remove pessoa cadastrada.");
        dataset.removePessoaByName("Shulambs");
        assertEquals(2, dataset.size(), "Remove pessoa não cadastrada.");

    }

}
