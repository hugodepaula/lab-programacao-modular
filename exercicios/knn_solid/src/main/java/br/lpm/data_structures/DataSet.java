package br.lpm.data_structures;



import java.util.ArrayList;
import java.util.List;

/**
 * A classe {@code Dataset} representa um conjunto de dados que pode ser carregado 
 * a partir de um {@code DataLoader}.
 * 
 * <p>Ela armazena os pontos de dados, os nomes dos atributos e o nome do estado.</p>
 * <p>
 * Métodos principais incluem:
 * <ul>
 *   <li>{@link #getDataPoints()} - Retorna a lista de pontos de dados.</li>
 *   <li>{@link #size()} - Retorna o tamanho do conjunto de dados.</li>
 *   <li>{@link #getAttributeNames()} - Retorna a lista de nomes dos atributos.</li>
 *   <li>{@link #getStateName()} - Retorna o nome do estado.</li>
 *   <li>{@link #loadDataFromCSV(String)} - Carrega os dados a partir de um arquivo CSV.</li>
 * </ul>
 * </p>
 */
public class DataSet {
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
  
  public void setAttributeNames(List<String> attributeNames) {
    this.attributeNames = attributeNames;
  }

  public void setDataPoints(List<DataPoint> dataPoints) {
    this.dataPoints = dataPoints;
  }

 
  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public DataSet() {
    this.dataPoints = new ArrayList<DataPoint>();
    this.attributeNames = new ArrayList<String>();
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

















