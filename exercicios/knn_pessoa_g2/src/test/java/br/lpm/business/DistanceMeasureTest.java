package br.lpm.business;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceMeasureTest {

    private DistanceMeasure distanceMeasure;
    private Pessoa pessoa1;
    private Pessoa pessoa2;
    private Dataset dataset;

    @BeforeEach
    void setUp() {
        distanceMeasure = new DistanceMeasure();
        pessoa1 = new Pessoa("Zé Shulambs", 1.83f, 83, LocalDate.of(1977, 1, 1), EstadoCivil.CASADO,
                FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 6, 7);
        pessoa2 = new Pessoa("Maria Shulambs", 1.75f, 66, LocalDate.of(1985, 5, 15), EstadoCivil.SEPARADO,
                FormacaoAcademica.MEDIA, Profissao.AUTONOMO, false, true, 2, 5);
        dataset = new Dataset();
        dataset.addPessoa(pessoa1);
        dataset.addPessoa(pessoa2);
    }

    @Test
    void testCalcDistance() {
        double expectedDistance = Math
                .sqrt((1 + 1 + 1 + 1 + 0 + Math.pow(0.08, 2) + Math.pow(17, 2) + Math.pow(4, 2) + Math.pow(2, 2)) / 9);
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
        Pessoa pessoa3 = new Pessoa("João Silva", 1.60f, 70, LocalDate.of(1990, 10, 10), EstadoCivil.SOLTEIRO,
                FormacaoAcademica.BASICA, Profissao.DESEMPREGADO, false, false, 1, 1);
        dataset.addPessoa(pessoa3);
        double expectedDistance = Math
                .sqrt((1 + 1 + 1 + 1 + 1 + Math.pow(0.23, 2) + Math.pow(13, 2) + Math.pow(5, 2) + Math.pow(6, 2)) / 9);
        double actualDistance = distanceMeasure.calcDistance(pessoa1, pessoa3);
        assertEquals(expectedDistance, actualDistance, 0.0001);
    }
}
