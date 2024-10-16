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

    public boolean classifyFeliz(Pessoa pessoa) {
        
        // Passo 1: Calcule a distância entre o ponto de dados de entrada e todos 
        // os outros pontos de dados no Dataset. 
        // Utilize a distância euclidiana normalizada já implementada anteriormente.
        Pessoa[] allPessoas = dataset.getAll();
        int numPessoas = dataset.size();
        double[] distances = new double[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            distances[i] = distanceMeasure.calcDistance(pessoa, allPessoas[i]);
        }

        // Passo 2: Selecione as K pessoas com a menor distância em 
        // relação pessoa entrada como parâmetro.
        Integer[] indices = new Integer[numPessoas];
        for (int i = 0; i < numPessoas; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, Comparator.comparingDouble(i -> distances[i]));

        // Passo 3: Calcule a quantidade de pessoas felizes.
        int contFeliz = 0;
        for (int i = 0; i < k; i++) {
            contFeliz += allPessoas[indices[i]].isFeliz() ? 1 : 0;;
        }

        return contFeliz > (k / 2);
    }
}