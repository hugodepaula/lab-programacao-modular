package br.lpm.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.lpm.business.Dataset;
import br.lpm.business.FormacaoAcademica;
import br.lpm.business.Profissao;

public class Main {

    private static Dataset dataset;
    
    public static void pieFormacaoAcademica() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (FormacaoAcademica e: FormacaoAcademica.values()) {
            names.add(e.toString());
            values.add(dataset.percentFormacaoAcademica(e));
        }
        new PieChart("Formacao Acadêmica", names, values);

    }

    public static void  histogramFormacaoAcademica() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (FormacaoAcademica e: FormacaoAcademica.values()) {
            names.add(e.toString());
            values.add(dataset.percentFormacaoAcademica(e)*dataset.size());
        }
       new BarChart("Histograma de Formacao Acadêmica", names, values, "Formacao Acadêmica");
    }

    public static void pieProfissao() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (Profissao e: Profissao.values()) {
            names.add(e.toString());
            values.add(dataset.percentProfissao(e));
        }
        new PieChart("Profissão", names, values);

    }

    public static void  histogramProfissao() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (Profissao e: Profissao.values()) {
            names.add(e.toString());
            values.add(dataset.percentProfissao(e)*dataset.size());
        }
       new BarChart("Distribuição de Profissão", names, values, "Profissão");
    }

    public static void main(String[] args) throws Exception {
        dataset = new Dataset();
        dataset.loadDataFromCSV("D:\\OneDrive - sga.pucminas.br\\git-code\\disciplinas\\lab-programacao-modular\\exercicios\\dataset_g2\\LPM - Turma 2 - Cadastro de Pessoas.csv");
        System.out.println(dataset.size());

        JOptionPane.showMessageDialog(null, "\nAltura média: " + dataset.avgAltura() +
            "\nAltura máxima: " + dataset.maxAltura() + 
            "\nAltura mínima: " + dataset.minAltura() + 
            "\nPeso médio: " + dataset.avgPeso() + 
            "\nPeso máximo: " + dataset.maxPeso() + 
            "\nPeso mínimo: " + dataset.minPeso() + 
            "\nPorcentagem de adultos: " + Math.round(dataset.percentAdulto() * 100) + "%",
             "Relatório de pessoas",JOptionPane.INFORMATION_MESSAGE);

        pieFormacaoAcademica();
        histogramFormacaoAcademica();
        pieProfissao();
        histogramProfissao();
    }
}
