package br.lpm.business;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataPoint {
  private List<Attribute> attributes;
  private Object state;

  public DataPoint() {
    attributes = new ArrayList<Attribute>();
  }

  public void addAtribute(Attribute attribute) {
    attributes.add(attribute);
  }

  public void addAttributes(List<Attribute> attributes) {
    attributes.addAll(attributes);
  }

  public DataPoint setState(String state) {
    this.state = state;
    return this;
  }

  public Attribute getAttribute(int index) {
    return attributes.get(index);
  }

  public List<Attribute> getAttributes() {
    return attributes;
  }

  @SuppressWarnings("unchecked")
  public <T> T getState() {
    return (T) this.state;
  }

  public Object parse(String input) {
    try {
      return Integer.parseInt(input);
    } catch (Exception e) {

    }
    try {
      return Double.parseDouble(input);
    } catch (Exception e) {

    }
    if (input.equalsIgnoreCase("sim") || input.equalsIgnoreCase("true")) {
      return true;
    }
    if (input.equalsIgnoreCase("não") || input.equalsIgnoreCase("false")) {
      return false;
    }
    try {
      return LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    } catch (DateTimeParseException e) {
    }
    try {
      return LocalDate.parse(input, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    } catch (DateTimeParseException e) {
    }
    return input;
  }

  @Override
  public String toString() {
    StringBuffer output = new StringBuffer();
    output.append("[");

    for (Attribute a : this.attributes) {
      output.append(a + ", ");
    }
    output.append(this.state);

    output.append("]");
    return output.toString();
  }

}
