package br.lpm.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KnnTest {
    private Dataset dataset;
    private Knn knn;

    @BeforeEach
    public void setUp() {
        dataset = new Dataset();
        
        dataset.addPessoa(new Pessoa("José Shulambs", 1.65f, 60, LocalDate.of(1990, 1, 1), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 3, 8));
        dataset.addPessoa(new Pessoa("Maria Shulambs", 1.75f, 80, LocalDate.of(1985, 5, 20), EstadoCivil.CASADO, FormacaoAcademica.SUPERIOR, Profissao.CLT, false, false, 2, 7));
        dataset.addPessoa(new Pessoa("Tereza Shulambs", 1.80f, 70, LocalDate.of(2000, 3, 15), EstadoCivil.SOLTEIRO, FormacaoAcademica.MEDIA, Profissao.DESEMPREGADO, true, true, 4, 9));
        dataset.addPessoa(new Pessoa("João Shulambs", 1.70f, 75, LocalDate.of(1995, 7, 10), EstadoCivil.CASADO, FormacaoAcademica.MEDIA, Profissao.DESEMPREGADO, true, false, 5, 6));
        
        knn = new Knn(dataset, 3); // Using k=3 for this example
    }

    @Test
    public void testPredictSaude() {
        Pessoa testPessoa = new Pessoa("Test Shulambs", 1.68f, 65, LocalDate.of(1992, 2, 25), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 3, 0);
        float predictedSaude = knn.predictSaude(testPessoa);
        
        // Verifica apenas se o valor previsto para a saúde está dentro do intervalo do atributo
        assertTrue(predictedSaude >= 0 && predictedSaude <= 10);
    }

    @Test
    public void testPredictSaudeComMesmosElementos() {
        Pessoa testPessoa1 = new Pessoa("Test Shulambs 1", 1.68f, 65, LocalDate.of(1992, 2, 25), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 3, 0);
        Pessoa testPessoa2 = new Pessoa("Test Shulambs 2", 1.68f, 65, LocalDate.of(1992, 2, 25), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 3, 0);
        Pessoa testPessoa3 = new Pessoa("Test Shulambs 3", 1.68f, 65, LocalDate.of(1992, 2, 25), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 3, 0);
        dataset.addPessoa(testPessoa1);
        dataset.addPessoa(testPessoa2);
        dataset.addPessoa(testPessoa3);
        
        Pessoa testPessoa = new Pessoa("Test Shulambs", 1.68f, 65, LocalDate.of(1992, 2, 25), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 3, 0);
        float predictedSaude = knn.predictSaude(testPessoa);
        
        // Verifica apenas se o valor previsto para a saúde está dentro do intervalo do atributo
        assertEquals(testPessoa.getSaude(), predictedSaude);
    }

}