package br.lpm.business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dataset {
  private List<DataPoint> dataPoints;
  private List<String> attributeNames;
  private String stateName;

  public List<DataPoint> getDataPoints() {
    return this.dataPoints;

  }

  public int size() {
    return this.dataPoints.size();
  }

  public List<String> getAttributeNames() {
    return attributeNames;
  }

  public String getStateName() {
    return stateName;
  }

  public Dataset() {
    this.dataPoints = new ArrayList<DataPoint>();
    this.attributeNames = new ArrayList<String>();
  }

  public void loadDataFromCSV(String filename) {
    String line;
    try (BufferedReader inputFile = new BufferedReader(new FileReader(filename))) {

    // Lê os nomes dos atributos (cabeçalho)
    line = inputFile.readLine();
    String[] dataFields = line.split(";");
    for (int i = 0; i < dataFields.length - 1; i++) {
      this.attributeNames.add(dataFields[i].trim());
    }
    this.stateName = dataFields[dataFields.length - 1];

    // Começa a ler as linhas de dados
    line = inputFile.readLine();

    while (line != null) {
      dataFields = line.split(";");
      DataPoint dp = new DataPoint();

      // Para cada campo da linha de dados, utiliza o Parse para identificar 
      // o tipo e cria um atributo daquele tipo.
      for (int i = 0; i < dataFields.length - 1; i++) {
        dp.addAtribute(new Attribute(dp.parse(dataFields[i].trim())));
      }
      
      dp.setState(dataFields[dataFields.length - 1].trim());
      
      // Adiciona o ponto processado na tabela de dados
      this.dataPoints.add(dp);
      
      line = inputFile.readLine();
    }
    } catch (Exception e) {
      
    }
  }

  @Override
  public String toString() {
    StringBuffer output = new StringBuffer();
    output.append("[\n");

    // Linha de título
    output.append("[");
    for (String names: this.attributeNames) {
      output.append(names + ", ");
    }
    output.append(this.stateName);
    output.append("]\n");
    
    // Linhas de DataPoints (dados)
    for (DataPoint dp: this.dataPoints) {
      output.append(dp + "\n");
    }
    
    
    output.append("]\n");
    return output.toString();
  }
  
  
}

















