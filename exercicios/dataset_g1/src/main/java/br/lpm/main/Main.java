package br.lpm.main;

import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ui.UIUtils;

import br.lpm.business.Dataset;
import br.lpm.business.Escolaridade;
import br.lpm.business.Genero;

public class Main {

    private static Dataset dataset;
    
    public static void pieEscolaridade() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (Escolaridade e: Escolaridade.values()) {
            names.add(e.toString());
            values.add(dataset.percentEscolaridade(e));
        }
        new PieChart("Escolaridade", names, values);

    }

    public static void  histogramFormacaoAcadêmica() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (Escolaridade e: Escolaridade.values()) {
            names.add(e.toString());
            values.add(dataset.percentEscolaridade(e)*dataset.size());
        }
       new BarChart("Histograma de formação acadêmica", names, values, "Escolaridade");
    }

    public static void pieGenero() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (Genero e: Genero.values()) {
            names.add(e.toString());
            values.add(dataset.percentGenero(e));
        }
        new PieChart("Genero", names, values);

    }

    public static void  histogramGenero() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (Genero e: Genero.values()) {
            names.add(e.toString());
            values.add(dataset.percentGenero(e)*dataset.size());
        }
       new BarChart("Distribuição de Gênero", names, values, "Gênero");
    }

    public static void main(String[] args) throws Exception {
        dataset = new Dataset();
        dataset.loadDataFromCSV("D:\\OneDrive - sga.pucminas.br\\git-code\\disciplinas\\lab-programacao-modular\\exercicios\\dataset_g1\\LPM - Turma 1 - Cadastro de Pessoas.csv");
        System.out.println(dataset.size());

        pieEscolaridade();
        histogramFormacaoAcadêmica();
        pieGenero();
        histogramGenero();
    }
}
