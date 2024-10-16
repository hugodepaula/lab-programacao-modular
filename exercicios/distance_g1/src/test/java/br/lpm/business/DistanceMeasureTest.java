package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistanceMeasureTest {
    private DistanceMeasure distanceMeasure;
    private Pessoa pessoa1;
    private Pessoa pessoa2;
    private Dataset dataset;

    @BeforeEach
    void setUp() {
        distanceMeasure = new DistanceMeasure();
        pessoa1 = new Pessoa("Pessoa Um", LocalDate.of(1990, 1, 1),
        Genero.MASCULINO, 2f, 100, 5000f, "Cidade Um",
        Hobby.NENHUM, EstadoCivil.CASADO, Escolaridade.SUPERIOR, false, Moradia.ALUGUEL);
        pessoa2 = new Pessoa("Pessoa Dois", LocalDate.of(2000, 1, 1),
        Genero.MASCULINO, 1.75f, 80, 4000f, "Cidade Dois",
        Hobby.GAME, EstadoCivil.SOLTEIRO, Escolaridade.SUPERIOR, false, Moradia.COM_FAMILIA);
        dataset = new Dataset();
        dataset.addPessoa(pessoa1);
        dataset.addPessoa(pessoa2);
    }

    @Test
    void testCalcDistance() {
        double expectedDistance = Math
                .sqrt((Math.pow(0.08, 2) + Math.pow(17, 2) + 1 + 1 + 1 + 1 + 0  + Math.pow(4, 2) + Math.pow(2, 2)) / 9);
        double actualDistance = distanceMeasure.calcDistance(pessoa1, pessoa2);
        assertEquals(expectedDistance, actualDistance, 0.0001);
    }

    @Test
    void testCalcDistanceSamePessoa() {
        double expectedDistance = 0.0;
        double actualDistance = distanceMeasure.calcDistance(pessoa1, pessoa1);
        assertEquals(expectedDistance, actualDistance, 0.0001);
    }

    @Test
    void testCalcDistanceDifferentAttributes() {
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
        dataset.addPessoa(pessoa3);
        double expectedDistance = Math
                .sqrt((1 + 1 + 1 + 1 + 1 + Math.pow(0.23, 2) + Math.pow(13, 2) + Math.pow(5, 2) + Math.pow(6, 2)) / 9);
        double actualDistance = distanceMeasure.calcDistance(pessoa1, pessoa3);
        assertEquals(expectedDistance, actualDistance, 0.0001);
    }
}
