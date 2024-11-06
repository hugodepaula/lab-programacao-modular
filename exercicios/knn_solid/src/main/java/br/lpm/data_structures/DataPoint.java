package br.lpm.data_structures;

import java.util.ArrayList;
import java.util.List;

public class DataPoint {
  private List<Attribute> attributes;
  private Attribute state;

  public DataPoint() {
    attributes = new ArrayList<Attribute>();
  }

  public void addAtribute(Attribute attribute) {
    attributes.add(attribute);
  }

  public void addAttributes(List<Attribute> attributes) {
    attributes.addAll(attributes);
  }

  public DataPoint setState(Attribute state) {
    this.state = state;
    return this;
  }

  public Attribute getAttribute(int index) {
    return attributes.get(index);
  }

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public Attribute getState() {
    return this.state;
  }

  @Override
  public String toString() {
    StringBuffer output = new StringBuffer();
    output.append("[");

    for (Attribute a : this.attributes) {
      output.append(a + ", ");
    }
    output.append(this.state);

    output.replace(output.length()-1,output.length(), "]");
    return output.toString();
  }

}
