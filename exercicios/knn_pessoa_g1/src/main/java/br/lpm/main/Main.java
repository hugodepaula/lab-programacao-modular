package br.lpm.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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

    public static void  histogramEscolaridade() {
        List<String> names = new ArrayList<String>();
        List<Float> values = new ArrayList<Float>();
        for (Escolaridade e: Escolaridade.values()) {
            names.add(e.toString());
            values.add(dataset.percentEscolaridade(e)*dataset.size());
        }
       new BarChart("Histograma de Escolaridade", names, values, "Escolaridade");
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
        dataset.loadDataFromCSV("C:\\Users\\291599\\Documents\\lab-programacao-modular\\exercicios\\knn_pessoa_g1\\LPM - Turma 1 - Cadastro de Pessoas.csv");
        System.out.println(dataset.size());

        JOptionPane.showMessageDialog(null, "\nAltura média: " + dataset.avgAltura() +
        "\nAltura máxima: " + dataset.maxAltura() + 
        "\nAltura mínima: " + dataset.minAltura() + 
        "\nPeso médio: " + dataset.avgPeso() + 
        "\nPeso máximo: " + dataset.maxPeso() + 
        "\nPeso mínimo: " + dataset.minPeso() + 
        "\nRenda média: " + dataset.avgRenda() + 
        "\nRenda máxima: " + dataset.maxRenda() + 
        "\nRenda mínima: " + dataset.minRenda() + 
        "\nPorcentagem de adultos: " + Math.round(dataset.percentAdulto()*100) + 
        "\nPorcentagem de pessoas felizes: " + Math.round(dataset.percentFeliz()*100), "Relatório de pessoas",JOptionPane.INFORMATION_MESSAGE);

        pieEscolaridade();
        histogramEscolaridade();
        pieGenero();
        histogramGenero();
    }
}
