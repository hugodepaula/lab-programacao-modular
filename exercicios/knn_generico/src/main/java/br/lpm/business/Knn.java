package br.lpm.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Knn {
  private Dataset dataset;
  private int k;
  private Metric metric;

  public Knn(Dataset dataset, int k, Metric metric) {
      this.dataset = dataset;
      this.k = k;
      this.metric = metric;
  }

  
  private List<Double> calculateDistances(DataPoint testPoint) {
    
    List<Double> distances = new ArrayList<Double>(dataset.size());
  
    List<DataPoint> dpList = dataset.getDataPoints();
    for (DataPoint dp: dpList) {
      distances.add(metric.distance(dp, testPoint));
    }
    return distances;
  }
  
  public Object classify(DataPoint testPoint) {
    
    // Passo 1: Calcula as distâncias do ponto de teste para todos os pontos do Dataset
    List<DataPoint> dp = dataset.getDataPoints();
    int size = dataset.size();
    List<Double> distances = this.calculateDistances(testPoint);
    
    
    // Passo 2: Selecionar os k menores elementos em relação 
    // ao testPoint
    Integer[] indices = new Integer[size];
    for (int i = 0; i < size; i++) {
        indices[i] = i;
    }

    // Ordena os DataPoints em função da lista de distâncias.
    Arrays.sort(indices, Comparator.comparingDouble(i -> distances.get(i)));

    // Passo 3: Cria uma estrutura de dados para contar quantas vezes
    // cada valor apareceu.
    Map<Object, Integer> stateCount = new HashMap<Object, Integer>();

    for (int n = 0; n < k; n++) {
      Integer f = stateCount.get(dp.get(n).getState()); 
      if (f == null) {
        stateCount.put(dp.get(n).getState(), 1);
      } else {
        stateCount.put(dp.get(n).getState(), f++);
      }
    }

    // Transforma o tipo Map em um tipo Set. 
    // Retorna o estado que apareceu mais vezes.
    Set<Map.Entry<Object, Integer>> states = stateCount.entrySet();
    
    Map.Entry<Object, Integer> winner = states.stream()
      .max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
      .get();
    
    return winner.getKey();
  }
}







