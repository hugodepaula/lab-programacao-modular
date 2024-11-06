package br.lpm.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.lpm.data_structures.Attribute;
import br.lpm.data_structures.DataPoint;
import br.lpm.data_structures.DataSet;
import br.lpm.metrics.Metric;

public class KnnClassifier extends Knn {

    public KnnClassifier(DataSet dataset, int k, Metric metric) {
        super(dataset, k, metric);
    }

    public Attribute predict(DataPoint testPoint) {

        // Passo 1: Calcula as distâncias do ponto de teste para todos os pontos do
        // Dataset
        List<DataPoint> dp = getDataset().getDataPoints();
        List<Double> distances = this.calculateDistances(testPoint);

        // Passo 2: Selecionar os k menores elementos em relação ao testPoint
        List<Integer> indexes = this.getNearest(distances);

        // Passo 3: Cria uma estrutura de dados para contar quantas vezes
        // cada valor apareceu.
        Map<Object, Integer> stateCount = new HashMap<Object, Integer>();

        for (int n = 0; n < getK(); n++) {
            Integer f = stateCount.get(dp.get(indexes.get(n)).getState());
            if (f == null) {
                stateCount.put(dp.get(indexes.get(n)).getState(), 1);
            } else {
                stateCount.put(dp.get(indexes.get(n)).getState(), f++);
            }
        }

        // Transforma o tipo Map em um tipo Set.
        // Retorna o estado que apareceu mais vezes.
        Set<Map.Entry<Object, Integer>> states = stateCount.entrySet();

        Map.Entry<Object, Integer> winner = states.stream()
                .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .get();

        return new Attribute(winner.getKey());
    }

}
