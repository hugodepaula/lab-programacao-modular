package br.lpm.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;



class DatasetTest {

    private Dataset dataset;
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    @BeforeEach
    void setUp() {
        dataset = new Dataset();
        pessoa1 = new Pessoa("Zé Shulambs", 1.83f, 83, LocalDate.of(1977, 1, 1), EstadoCivil.CASADO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, true, 6, 7);
        pessoa2 = new Pessoa("Maria Shulambs", 1.75f, 66, LocalDate.of(1985, 5, 15), EstadoCivil.SEPARADO, FormacaoAcademica.MEDIA, Profissao.AUTONOMO, false, true, 2, 5);
        dataset.addPessoa(pessoa1);
        dataset.addPessoa(pessoa2);
    }

    @Test
    void testAddPessoa() {
        Pessoa pessoa3 = new Pessoa("Tereza Shulambs", 1.70f, 65, LocalDate.of(1992, 3, 10), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, false, 4, 3);
        dataset.addPessoa(pessoa3);
        assertEquals(3, dataset.size());
    }

    @Test
    void testRemovePessoa() {
        dataset.removePessoa(pessoa1);
        assertEquals(1, dataset.size());
        assertNull(dataset.getPessoaByName("Zé Shulambs"));
    }

    @Test
    void testRemovePessoaByName() {
        dataset.removePessoaByName("Maria Shulambs");
        assertEquals(1, dataset.size());
        assertNull(dataset.getPessoaByName("Maria Shulambs"));
    }

    @Test
    void testReplacePessoa() {
        Pessoa pessoa3 = new Pessoa("Tereza Shulambs", 1.70f, 65, LocalDate.of(1992, 3, 10), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, false, 4, 3);
        dataset.replacePessoa(pessoa1, pessoa3);
        assertEquals(pessoa3, dataset.getPessoaByName("Tereza Shulambs"));
    }

    @Test
    void testGetPessoaByName() {
        assertEquals(pessoa1, dataset.getPessoaByName("Zé Shulambs"));
        assertNull(dataset.getPessoaByName("Shulambs sem cabeça"));
    }

    @Test
    void testGetAll() {
        Pessoa[] pessoas = dataset.getAll();
        assertEquals(pessoa1, pessoas[0]);
        assertEquals(pessoa2, pessoas[1]);
    }

    @Test
    void testRemoveAll() {
        dataset.removeAll();
        assertEquals(0, dataset.size());
    }

    @Test
    void testMaxAltura() {
        assertEquals(1.83f, dataset.maxAltura());
    }

    @Test
    void testMinAltura() {
        assertEquals(1.75f, dataset.minAltura());
    }

    @Test
    void testAvgAltura() {
        assertEquals(1.79f, dataset.avgAltura(), 0.01);
    }

    @Test
    void testMaxPeso() {
        assertEquals(83, dataset.maxPeso());
    }

    @Test
    void testMinPeso() {
        assertEquals(66, dataset.minPeso());
    }

    @Test
    void testAvgPeso() {
        assertEquals(74.5f, dataset.avgPeso(), 0.01);
    }

    @Test
    void testPercentAdulto() {
        assertEquals(1.0f, dataset.percentAdulto());
    }

    @Test
    void testPercentEstadoCivil() {
        assertEquals(0.5f, dataset.percentEstadoCivil(EstadoCivil.CASADO));
    }

    @Test
    void testModeEstadoCivil() {
        Pessoa pessoa3 = new Pessoa("Tereza Shulambs", 1.70f, 65, LocalDate.of(1992, 3, 10), EstadoCivil.SEPARADO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, false, 4, 3);
        dataset.addPessoa(pessoa3);
       assertEquals(EstadoCivil.SEPARADO, dataset.modeEstadoCivil());
    }

    @Test
    void testPercentFormacaoAcademica() {
        assertEquals(0.5f, dataset.percentFormacaoAcademica(FormacaoAcademica.SUPERIOR));
    }

    @Test
    void testModeFormacaoAcademica() {
        Pessoa pessoa3 = new Pessoa("Tereza Shulambs", 1.70f, 65, LocalDate.of(1992, 3, 10), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, false, 4, 3);
        dataset.addPessoa(pessoa3);
       assertEquals(FormacaoAcademica.SUPERIOR, dataset.modeFormacaoAcademica());
    }

    @Test
    void testPercentProfissao() {
        assertEquals(0.5f, dataset.percentProfissao(Profissao.CLT));
    }

    @Test
    void testModeProfissao() {
        Pessoa pessoa3 = new Pessoa("Tereza Shulambs", 1.70f, 65, LocalDate.of(1992, 3, 10), EstadoCivil.SOLTEIRO, FormacaoAcademica.SUPERIOR, Profissao.CLT, true, false, 4, 3);
        dataset.addPessoa(pessoa3);
       assertEquals(Profissao.CLT, dataset.modeProfissao());
    }

    @Test
    void testPercentHobby() {
        assertEquals(1.0f, dataset.percentHobby());
    }

    @Test
    void testPercentVidaSocial() {
        assertEquals(0.5f, dataset.percentVidaSocial());
    }

    @Test
    void testAvgSaude() {
        assertEquals(6f, dataset.avgSaude(), 0.01);
    }

    @Test
    void testSvdSaude() {
        assertEquals(1.0f, dataset.svdSaude(), 0.01);
    }

    @Test
    void testAvgAtividadeFisica() {
        assertEquals(4f, dataset.avgAtividadeFisica(), 0.01);
    }

    @Test
    void testSvdAtividadeFisica() {
        assertEquals(2.0f, dataset.svdAtividadeFisica(), 0.01);
    }
}