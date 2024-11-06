package br.lpm.metrics;

import br.lpm.data_structures.DataPoint;

@FunctionalInterface
public interface Metric {
  public double distance(DataPoint p1, DataPoint p2);
}
