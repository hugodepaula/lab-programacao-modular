package br.lpm.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.lpm.business.Escolaridade;
import br.lpm.business.EstadoCivil;
import br.lpm.business.Genero;
import br.lpm.business.Hobby;
import br.lpm.business.Moradia;
import br.lpm.business.Pessoa;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Zé Maria", 
                                LocalDate.of(1977, 1, 28),
                                Genero.MASCULINO, 
                                1.83f, 
                                82, 
                                5630f,
                                "Carapicuíba",
                                Hobby.NENHUM, 
                                EstadoCivil.VIUVO, 
                                Escolaridade.MEDIO, 
                                false, 
                                Moradia.ALUGUEL);

        System.out.printf("Cadastro de pessoas:\n\t%s\t%s\t%s\tAltura: %f\tPeso: %d\tRenda: %f\t%s\tHobby: %s\tEstado civil: %s\tEscolaridade: %s\t%s\t%s",
                    pessoa.getNome(),
                    pessoa.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")),
                    pessoa.getGenero(),
                    pessoa.getAltura(),
                    pessoa.getPeso(),
                    pessoa.getRenda(),
                    pessoa.getNaturalidade(),
                    pessoa.getHobby(),
                    pessoa.getEstadoCivil(),
                    pessoa.getEscolaridade(),
                    (pessoa.isFeliz()) ? "Feliz" : "Infeliz",
                    pessoa.getMoradia());
    }
}
