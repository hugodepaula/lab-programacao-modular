package br.lpm.business;

import java.util.Arrays;
import java.util.Comparator;

public class Knn {
    private Dataset dataset;
    private int k;
    private DistanceMeasure distanceMeasure;

    public Knn(Dataset dataset, int k) {
        this.dataset = dataset;
        this.k = k;
        this.distanceMeasure = new DistanceMeasure();
    }

    public float predictSaude(Pessoa pessoa) {
        
        // Passo 1: Calcule a distância entre o ponto de dados de entrada e todos os outros pontos de dados no Dataset. 
        // Utilize a distância euclidiana normalizada já implementada anteriormente.
        Pessoa[] allPessoas = dataset.getAll();
        int numPessoas = dataset.size();
        double[] distances = new double[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            distances[i] = distanceMeasure.calcDistance(pessoa, allPessoas[i]);
        }

        // Passo 2: Selecione as K pessoas com a menor distância em relação pessoa entrada como parâmetro.
        Integer[] indices = new Integer[numPessoas];
        for (int i = 0; i < numPessoas; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingDouble(i -> distances[i]));

        // Passo 3: Calcule a saúde média das K pessoas mais próximas e retorne como resultado.
        float sumSaude = 0;
        for (int i = 0; i < k; i++) {
            sumSaude += allPessoas[indices[i]].getSaude();
        }

        return sumSaude / k;
    }
}