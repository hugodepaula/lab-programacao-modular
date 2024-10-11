package br.lpm.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.lpm.business.EstadoCivil;
import br.lpm.business.FormacaoAcademica;
import br.lpm.business.Pessoa;
import br.lpm.business.Profissao;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Zé Maria", 
                                1.83f, 
                                82, 
                                LocalDate.of(1977, 1, 28),
                                EstadoCivil.VIUVO, 
                                FormacaoAcademica.SUPERIOR,
                                Profissao.DESEMPREGADO,
                                false,
                                true,
                                5,
                                7);

        System.out.printf("Cadastro de pessoas:\n\t%s\t%s\tAltura: %f\tPeso: %d\tHobby: %s\tEstado civil: %s",
                    pessoa.getNome(),
                    pessoa.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")),
                    pessoa.getAltura(),
                    pessoa.getPeso(),
                    pessoa.hasHobby(),
                    pessoa.getEstadoCivil());
    }
}
