package br.lpm.business;

import java.time.LocalDate;

public class Dataset {
    private static final int NOT_FOUND = -1;
    private static final int MAX_PESSOAS = 1000;
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int numPessoas = 0;

    private int searchPessoaByName(Pessoa pessoa) {
        for (int pos = 0; pos < numPessoas; pos++) {
            if (pessoas[pos].getNome().equalsIgnoreCase(pessoa.getNome())) {
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
                for (int i = pos+1; i < numPessoas; i++) {
                    pessoas[i-1] = pessoas[i];
                }
                pessoas[--numPessoas] = null;
            }
        }
    }

    public void removePessoaByName(String pessoa) {
        int pos = searchPessoaByName(pessoa);
        if (pos != NOT_FOUND) {
            for (int i = pos+1; i < numPessoas; i++) {
                pessoas[i-1] = pessoas[i];
            }
            pessoas[--numPessoas] = null;
        }
    }

    public void replacePessoa(Pessoa oldPessoa, Pessoa newPessoa) {
        int pos = searchPessoaByName(oldPessoa);
        if (pos != NOT_FOUND) {
            pessoas[pos] = newPessoa;
        } 
    }

    public Pessoa getPessoaByName(String nome) {
        int pos = searchPessoaByName(pessoa);
        if (pos != NOT_FOUND) {
            return pessoas[pos];
        } else {
            return null;
        }
    }

    public Pessoa[] getAll(){
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
        return sum/numPessoas;
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
        return sum/numPessoas;
    }
   
    public float percentAdult() {
        int count = 0;
        LocalDate today = LocalDate.now();
        for (int i = 0; i < numPessoas; i++) {
            if (pessoas[i].getDataNascimento().until(today).getYears() >= 18) {
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

    public float percentHobby() {
        int count = 0;
        for (int i = 0; i < numPessoas; i++) {
            if (!pessoas[i].getHobby().equals(Hobby.NENHUM)) {
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

}
