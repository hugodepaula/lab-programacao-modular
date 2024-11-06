package br.lpm.loaders;

import java.io.BufferedReader;
import java.io.FileReader;

import br.lpm.data_structures.Attribute;
import br.lpm.data_structures.DataPoint;
import br.lpm.data_structures.DataSet;
import br.lpm.data_structures.Parser;

public class CsvLoader implements DataLoader {
    private String filename;
    private String delimiter;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    public CsvLoader(String filename, String delimiter) {
        this.setFilename(filename);
        this.setDelimiter(delimiter);
    }

    @Override
    public void load(DataSet dataSet) {
        String line;
        try (BufferedReader inputFile = new BufferedReader(new FileReader(filename))) {

            // Lê os nomes dos atributos (cabeçalho)
            line = inputFile.readLine();
            String[] dataFields = line.split(delimiter);
            for (int i = 0; i < dataFields.length - 1; i++) {
                dataSet.getAttributeNames().add(dataFields[i].trim());
            }
            dataSet.setStateName(dataFields[dataFields.length - 1]);

            // Começa a ler as linhas de dados
            line = inputFile.readLine();

            while (line != null) {
                dataFields = line.split(";");
                DataPoint dp = new DataPoint();

                // Para cada campo da linha de dados, utiliza o Parse para identificar
                // o tipo e cria um atributo daquele tipo.
                for (int i = 0; i < dataFields.length - 1; i++) {
                    dp.addAtribute(new Attribute(Parser.parse(dataFields[i].trim())));
                }

                dp.setState(new Attribute(Parser.parse(dataFields[dataFields.length - 1].trim())));

                // Adiciona o ponto processado na tabela de dados
                dataSet.getDataPoints().add(dp);

                line = inputFile.readLine();
            }
        } catch (Exception e) {

        }

    }

}
