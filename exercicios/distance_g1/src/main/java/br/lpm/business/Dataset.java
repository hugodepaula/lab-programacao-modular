package br.lpm.business;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;



public class Dataset {
    private static final int NOT_FOUND = -1;
    private static final int MAX_PESSOAS = 1000;
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int numPessoas = 0;

    private int searchPessoaByName(String nome) {
        for (int pos = 0; pos < numPessoas; pos++) {
            if (pessoas[pos].getNome().equalsIgnoreCase(nome)) {
                return pos;
            }
        }
        return NOT_FOUND;
    }

    public void addPessoa(Pessoa pessoa) {
        if (numPessoas < MAX_PESSOAS) {
            pessoas[numPessoas++] = pessoa;
        }
    }

    public void removePessoa(Pessoa pessoa) {
        for (int pos = 0; pos < numPessoas; pos++) {
            if (pessoas[pos].equals(pessoa)) {
                for (int i = pos + 1; i < numPessoas; i++) {
                    pessoas[i - 1] = pessoas[i];
                }
                pessoas[--numPessoas] = null;
            }
        }
    }

    public void removePessoaByName(String pessoa) {
        int pos = searchPessoaByName(pessoa);
        if (pos != NOT_FOUND) {
            for (int i = pos + 1; i < numPessoas; i++) {
                pessoas[i - 1] = pessoas[i];
            }
            pessoas[--numPessoas] = null;
        }
    }

    public void replacePessoa(Pessoa oldPessoa, Pessoa newPessoa) {
        int pos = searchPessoaByName(oldPessoa.getNome());
        if (pos != NOT_FOUND) {
            pessoas[pos] = newPessoa;
        }
    }

    public Pessoa getPessoaByName(String nome) {
        int pos = searchPessoaByName(nome);
        if (pos != NOT_FOUND) {
            return pessoas[pos];
        } else {
            return null;
        }
    }

    public Pessoa[] getAll() {
        return pessoas;
    }

    public void removeAll() {
        for (int i = 0; i < numPessoas; i++) {
            pessoas[i] = null;
        }
        numPessoas = 0;
    }

    public int size() {
        return numPessoas;
    }

    public float maxAltura() {
        float max = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < numPessoas; i++) {
            if (max < pessoas[i].getAltura()) {
                max = pessoas[i].getAltura();
            }
        }
        return max;
    }

    public float minAltura() {
        float min = Float.POSITIVE_INFINITY;
        for (int i = 0; i < numPessoas; i++) {
            if (min > pessoas[i].getAltura()) {
                min = pessoas[i].getAltura();
            }
        }
        return min;
    }

    public float avgAltura() {
        float sum = 0;
        for (int i = 0; i < numPessoas; i++) {
            sum += pessoas[i].getAltura();
        }
        return sum / numPessoas;
    }
 
    public float maxPeso() {
        float max = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < numPessoas; i++) {
            if (max < pessoas[i].getPeso()) {
                max = pessoas[i].getPeso();
            }
        }
        return max;
    }

    public float minPeso() {
        float min = Float.POSITIVE_INFINITY;
        for (int i = 0; i < numPessoas; i++) {
            if (min > pessoas[i].getPeso()) {
                min = pessoas[i].getPeso();
            }
        }
        return min;
    }

    public float avgPeso() {
        float sum = 0;
        for (int i = 0; i < numPessoas; i++) {
            sum += pessoas[i].getPeso();
        }
        return sum / numPessoas;
    }

    public float percentAdulto() {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].isAdulto()) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public float maxRenda() {
        float max = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < numPessoas; i++) {
            if (max < pessoas[i].getRenda()) {
                max = pessoas[i].getRenda();
            }
        }
        return max;
    }

    public float minRenda() {
        float min = Float.POSITIVE_INFINITY;
        for (int i = 0; i < numPessoas; i++) {
            if (min > pessoas[i].getRenda()) {
                min = pessoas[i].getRenda();
            }
        }
        return min;
    }

    public float avgRenda() {
        float sum = 0;
        for (int i = 0; i < numPessoas; i++) {
            sum += pessoas[i].getRenda();
        }
        return sum / numPessoas;
    }

    public float percentGenero(Genero genero) {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getGenero().equals(genero)) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public Genero modeGenero() {
        Genero[] values = Genero.values();
        int[] count = new int[values.length];
        int currentMax = -1;
        Genero currentValue = null;

        for (int i = 0; i < numPessoas; i++) {
            int val = pessoas[i].getGenero().getValue();
            count[val]++;
            if (count[val] > currentMax) {
                currentMax = count[val];
                currentValue = pessoas[i].getGenero();
            }
        }
        return currentValue;
    }

   public float percentEstadoCivil(EstadoCivil estadoCivil) {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getEstadoCivil().equals(estadoCivil)) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public EstadoCivil modeEstadoCivil() {
        EstadoCivil[] values = EstadoCivil.values();
        int[] count = new int[values.length];
        int currentMax = -1;
        EstadoCivil currentValue = null;

        for (int i = 0; i < numPessoas; i++) {
            int val = pessoas[i].getEstadoCivil().getValue();
            count[val]++;
            if (count[val] > currentMax) {
                currentMax = count[val];
                currentValue = pessoas[i].getEstadoCivil();
            }
        }
        return currentValue;
    }

    public float percentEscolaridade(Escolaridade escolaridade) {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getEscolaridade().equals(escolaridade)) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public Escolaridade modeEscolaridade() {
        Escolaridade[] values = Escolaridade.values();
        int[] count = new int[values.length];
        int currentMax = -1;
        Escolaridade currentValue = null;

        for (int i = 0; i < numPessoas; i++) {
            int val = pessoas[i].getEscolaridade().getValue();
            count[val]++;
            if (count[val] > currentMax) {
                currentMax = count[val];
                currentValue = pessoas[i].getEscolaridade();
            }
        }
        return currentValue;
    }

    public float percentMoradia(Moradia moradia) {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getMoradia().equals(moradia)) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public Moradia modeMoradia() {
        Moradia[] values = Moradia.values();
        int[] count = new int[values.length];
        int currentMax = -1;
        Moradia currentValue = null;

        for (int i = 0; i < numPessoas; i++) {
            int val = pessoas[i].getMoradia().getValue();
            count[val]++;
            if (count[val] > currentMax) {
                currentMax = count[val];
                currentValue = pessoas[i].getMoradia();
            }
        }
        return currentValue;
    }

    public float percentHobby(Hobby hobby) {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getHobby().equals(hobby)) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public Hobby modeHobby() {
        Hobby[] values = Hobby.values();
        int[] count = new int[values.length];
        int currentMax = -1;
        Hobby currentValue = null;

        for (int i = 0; i < numPessoas; i++) {
            int val = pessoas[i].getHobby().getValue();
            count[val]++;
            if (count[val] > currentMax) {
                currentMax = count[val];
                currentValue = pessoas[i].getHobby();
            }
        }
        return currentValue;
    }

    public float percentFeliz() {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].isFeliz()) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    @Override
    public String toString() {
        return Arrays.stream(pessoas).map(Pessoa::getNome).reduce("", (a, b) -> a + b + "\n");
    }

    public void loadDataFromCSV(String filename) throws Exception {

        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {

            // Remove linha de título
            String line = file.readLine();

            line = file.readLine();
            
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator(',');
            DecimalFormat format = new DecimalFormat("0.#");
            format.setDecimalFormatSymbols(symbols);

            while (line != null && this.numPessoas < Dataset.MAX_PESSOAS) {
                String[] fields = line.split(";");
                String nome = fields[0];
                LocalDate dataNascimento = LocalDate.parse(fields[1], DateTimeFormatter.ofPattern("M/d/yyyy"));
                Genero genero = Genero.parseGenero(fields[2]);
                float altura =   format.parse(fields[3]).floatValue();
                int peso = format.parse(fields[4]).intValue();
                float renda = format.parse(fields[5]).floatValue();
                String naturalidade = fields[6];
                Moradia moradia = Moradia.parseMoradia(fields[7]);
                EstadoCivil estadoCivil = EstadoCivil.parseEstadoCivil(fields[8]);
                Escolaridade escolaridade = Escolaridade.parseEscolaridade(fields[9]);
                Hobby hobby = Hobby.parseHobby(fields[10]);
                boolean feliz = fields[11].equalsIgnoreCase("Sim");

                pessoas[numPessoas++] = new Pessoa(nome, dataNascimento, genero, altura, peso, renda,
                naturalidade, hobby, estadoCivil, escolaridade, feliz, moradia) ;
                line = file.readLine();
            }
        } catch (IOException e) {

        }

    }

    public float[] normalizeField(String fieldName) {

        float[] field = new float[numPessoas];

        if (fieldName.equalsIgnoreCase("Altura")) {
            float maxAltura = this.maxAltura();
            float minAltura = this.minAltura();
            float difAltura = maxAltura - minAltura;

            for (int i = 0; i < numPessoas; i++) {
                field[i] = (pessoas[i].getAltura() - minAltura) / difAltura;
            }
        } else if (fieldName.equalsIgnoreCase("Peso")) {
            float maxPeso = this.maxPeso();
            float minPeso = this.minPeso();
            float difPeso = maxPeso - minPeso;

            for (int i = 0; i < numPessoas; i++) {
                field[i] = ((float) (pessoas[i].getPeso() - minPeso)) / difPeso;
            }
        } else if (fieldName.equalsIgnoreCase("Renda")) {
            float maxRenda = this.maxRenda();
            float minRenda = this.minRenda();
            float difRenda = maxRenda - minRenda;

            for (int i = 0; i < numPessoas; i++) {
                field[i] = ((pessoas[i].getRenda() - minRenda) / difRenda);
            }
        } else if (fieldName.equalsIgnoreCase("Altura")) {
            float maxAltura = this.maxAltura();
            float minAltura = this.minAltura();
            float difAltura = maxAltura - minAltura;

            for (int i = 0; i < numPessoas; i++) {
                pessoas[i].setAltura((pessoas[i].getAltura() - minAltura) / difAltura);
            }
        } else if (fieldName.equalsIgnoreCase("Altura")) {
            float maxAltura = this.maxAltura();
            float minAltura = this.minAltura();
            float difAltura = maxAltura - minAltura;

            for (int i = 0; i < numPessoas; i++) {
                pessoas[i].setAltura((pessoas[i].getAltura() - minAltura) / difAltura);
            }
        }
        return field;
    }

}
