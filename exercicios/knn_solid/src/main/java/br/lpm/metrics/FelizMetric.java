package br.lpm.metrics;

import java.util.List;

import br.lpm.data_structures.Attribute;
import br.lpm.data_structures.DataPoint;

public class FelizMetric implements Metric {

  @Override
  public double distance(DataPoint p1, DataPoint p2) {
    List<Attribute> ap1 = p1.getAttributes();
    List<Attribute> ap2 = p2.getAttributes();

    double distance = 0;
    
    for (int i = 0; i < ap1.size(); i++) {
      Object vp1 = ap1.get(i).getValue(); 
      Object vp2 = ap2.get(i).getValue();
      
      if (i == 2) {
        distance += Math.abs((Double) vp1 - (Double) vp2) / 10000.00;
      } else if (i == 3) {
        distance += Math.abs((Integer) vp1 - (Integer) vp2) / 70.00;
      } else {
        distance += (vp1.equals(vp2)) ? 0 : 1;
      }
    }

    return distance;
  }

}





