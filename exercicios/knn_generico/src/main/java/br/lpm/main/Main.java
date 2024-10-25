package br.lpm.main;

import br.lpm.business.Attribute;
import br.lpm.business.DataPoint;
import br.lpm.business.Dataset;
import br.lpm.business.FelizMetric;
import br.lpm.business.Knn;
import br.lpm.business.Metric;

public class Main {
  
  public static void main(String[] args) throws Exception {
    
    Dataset felizDataset = new Dataset();
    
    felizDataset.loadDataFromCSV("C:\\Users\\291599\\Downloads\\knn_generico\\Felicidade.CSV");
    
    System.out.println(felizDataset);
    
    Metric m = new FelizMetric();
    
    DataPoint dp1 = felizDataset.getDataPoints().get(0);
    DataPoint dp2 = felizDataset.getDataPoints().get(3);
    
    System.out.println(dp1 + "\nDistancia: " + m.distance(dp1, dp1));
    System.out.println(dp2 + "\nDistancia: " + m.distance(dp2, dp2));
    System.out.println("\nDistancia: " + m.distance(dp1, dp2));
    System.out.println("\nDistancia: " + m.distance(dp2, dp1));
    
    Knn knn = new Knn(felizDataset, 3, new FelizMetric());

    System.out.println("estado: " + knn.classify(dp1));
    System.out.println("estado: " + knn.classify(dp2));

    
    
    DataPoint testDp = new DataPoint();
    
    testDp.addAtribute(new Attribute("Solteiro"));
    testDp.addAtribute(new Attribute("Sim"));
    testDp.addAtribute(new Attribute(2200.00));
    testDp.addAtribute(new Attribute(25));
    testDp.addAtribute(new Attribute("Sim"));
    testDp.addAtribute(new Attribute("Sim"));

  
    System.out.println("estado: " + knn.classify(testDp));
  
  
    DataPoint testDp2 = new DataPoint();
    
    testDp2.addAtribute(new Attribute("Solteiro"));
    testDp2.addAtribute(new Attribute("Sim"));
    testDp2.addAtribute(new Attribute(1350.00));
    testDp2.addAtribute(new Attribute(20));
    testDp2.addAtribute(new Attribute("Nao"));
    testDp2.addAtribute(new Attribute("Nao"));

  
    System.out.println("estado: " + knn.classify(testDp2));
  
   
    
  
  }

}
