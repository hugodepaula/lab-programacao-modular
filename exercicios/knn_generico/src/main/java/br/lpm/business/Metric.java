package br.lpm.business;

@FunctionalInterface
public interface Metric {
  public double distance(DataPoint p1, DataPoint p2);
}
