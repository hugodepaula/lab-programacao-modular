package br.lpm.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
    
    List<Double> distances = this.calculateDistances(testPoint);
    List<DataPoint> dp = dataset.getDataPoints();
    Map<Object, Integer> stateCount = new HashMap<Object, Integer>();
    
    // Colocar os k menores elementos no início do vetor
    for (int n = 0; n < k; n++) {
      int menor = n;
      
      for (int i = n + 1; i < dataset.size(); i++) {
        if (distances.get(i) < distances.get(menor)) {
          menor = i;
        }
      }
      Collections.swap(distances, menor, n);  
      Collections.swap(dp, menor, n);  

      Integer f = stateCount.get((Object) dp.get(n).getState()); 
      if (f == null) {
        stateCount.put((Object) dp.get(n).getState(), 1);
      } else {
        stateCount.put((Object) dp.get(n).getState(), f++);
      }
      distances.set(menor, Double.MAX_VALUE);
    }

    Set<Map.Entry<Object, Integer>> states = stateCount.entrySet();
    
    Map.Entry<Object, Integer> winner = states.stream().max((e1, e2) -> {
          return ((Map.Entry<Object, Integer>) e1).getValue().compareTo(((Map.Entry<Object, Integer>) e2).getValue());
    }).get();
    
    
    return winner.getKey();
  }
}







