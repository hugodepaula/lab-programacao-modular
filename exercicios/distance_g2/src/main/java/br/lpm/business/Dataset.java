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

    public float percentFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getFormacaoAcademica().equals(formacaoAcademica)) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public FormacaoAcademica modeFormacaoAcademica() {
        FormacaoAcademica[] values = FormacaoAcademica.values();
        int[] count = new int[values.length];
        int currentMax = -1;
        FormacaoAcademica currentValue = null;

        for (int i = 0; i < numPessoas; i++) {
            int val = pessoas[i].getFormacaoAcademica().getValue();
            count[val]++;
            if (count[val] > currentMax) {
                currentMax = count[val];
                currentValue = pessoas[i].getFormacaoAcademica();
            }
        }
        return currentValue;
    }

    public float percentProfissao(Profissao profissao) {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getProfissao().equals(profissao)) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public Profissao modeProfissao() {
        Profissao[] values = Profissao.values();
        int[] count = new int[values.length];
        int currentMax = -1;
        Profissao currentValue = null;

        for (int i = 0; i < numPessoas; i++) {
            int val = pessoas[i].getProfissao().getValue();
            count[val]++;
            if (count[val] > currentMax) {
                currentMax = count[val];
                currentValue = pessoas[i].getProfissao();
            }
        }
        return currentValue;
    }

    public float percentHobby() {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].hasHobby()) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public float percentVidaSocial() {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].hasVidaSocial()) {
                count++;
            }
        }
        return ((float) count) / numPessoas;
    }

    public float avgSaude() {
        float sum = 0;
        for (int i = 0; i < numPessoas; i++) {
            sum += pessoas[i].getSaude();
        }
        return sum / numPessoas;
    }
 
    public float svdSaude() {
        float media = avgSaude();
        float sum = 0;
        for (int i = 0; i < numPessoas; i++) {
            sum += Math.pow(pessoas[i].getSaude() - media, 2);
        }
        return (float) Math.sqrt(sum / numPessoas) ;
    }
 
    public float avgAtividadeFisica() {
        float sum = 0;
        for (int i = 0; i < numPessoas; i++) {
            sum += pessoas[i].getAtividadeFisica();
        }
        return sum / numPessoas;
    }
 
    public float svdAtividadeFisica() {
        float media = avgAtividadeFisica();
        float sum = 0;
        for (int i = 0; i < numPessoas; i++) {
            sum += Math.pow(pessoas[i].getAtividadeFisica() - media, 2);
        }
        return (float) Math.sqrt(sum / numPessoas) ;
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
                float altura =   format.parse(fields[2]).floatValue();
                int peso = format.parse(fields[3]).intValue();
                EstadoCivil estadoCivil = EstadoCivil.parseEstadoCivil(fields[4]);
                FormacaoAcademica formacaoAcademica = FormacaoAcademica.parseFormacaoAcademica(fields[5]);
                Profissao profissao = Profissao.parseProfissao(fields[6]);
                boolean vidaSocial = fields[7].equalsIgnoreCase("Sim");
                boolean hobby = fields[8].equalsIgnoreCase("Sim");
                int atividadeFisica = format.parse(fields[9]).intValue();
                int saude = format.parse(fields[10]).intValue();

                pessoas[numPessoas++] = new Pessoa(nome, altura, peso, dataNascimento, estadoCivil,
                formacaoAcademica, profissao, vidaSocial, hobby, atividadeFisica, saude) ;
                line = file.readLine();
            }
        } catch (IOException e) {

        }

    }

}
