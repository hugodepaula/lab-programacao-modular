package br.lpm.main;

import br.lpm.business.Knn;
import br.lpm.business.KnnClassifier;
import br.lpm.data_structures.Attribute;
import br.lpm.data_structures.DataPoint;
import br.lpm.data_structures.DataSet;
import br.lpm.loaders.CsvLoader;
import br.lpm.loaders.DataLoader;
import br.lpm.metrics.FelizMetric;
import br.lpm.metrics.Metric;

public class Main {
  
  public static void main(String[] args) throws Exception {
    
    DataSet felizDataset = new DataSet();
    DataLoader loader = new CsvLoader("D:\\OneDrive - sga.pucminas.br\\git-code\\disciplinas\\lab-programacao-modular\\exercicios\\knn_solid", ";");
    loader.load(felizDataset);
    
    System.out.println(felizDataset);
    
    Metric m = new FelizMetric();
    
    DataPoint dp1 = felizDataset.getDataPoints().get(0);
    DataPoint dp2 = felizDataset.getDataPoints().get(3);
    
    System.out.println(dp1 + "\nDistancia: " + m.distance(dp1, dp1));
    System.out.println(dp2 + "\nDistancia: " + m.distance(dp2, dp2));
    System.out.println("\nDistancia: " + m.distance(dp1, dp2));
    System.out.println("\nDistancia: " + m.distance(dp2, dp1));
    
    Knn knn = new KnnClassifier(felizDataset, 3, new FelizMetric());

    System.out.println("estado: " + knn.predict(dp1));
    System.out.println("estado: " + knn.predict(dp2));

    
    
    DataPoint testDp = new DataPoint();
    
    testDp.addAtribute(new Attribute("Solteiro"));
    testDp.addAtribute(new Attribute("Sim"));
    testDp.addAtribute(new Attribute(2200.00));
    testDp.addAtribute(new Attribute(25));
    testDp.addAtribute(new Attribute("Sim"));
    testDp.addAtribute(new Attribute("Sim"));

  
    System.out.println("estado: " + knn.predict(testDp));
  
  
    DataPoint testDp2 = new DataPoint();
    
    testDp2.addAtribute(new Attribute("Solteiro"));
    testDp2.addAtribute(new Attribute("Sim"));
    testDp2.addAtribute(new Attribute(1350.00));
    testDp2.addAtribute(new Attribute(20));
    testDp2.addAtribute(new Attribute("Nao"));
    testDp2.addAtribute(new Attribute("Nao"));

  
    System.out.println("estado: " + knn.predict(testDp2));
  
   
    
  
  }

}
