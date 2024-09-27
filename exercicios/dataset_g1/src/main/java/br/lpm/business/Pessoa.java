package br.lpm.business;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;
    private float altura;
    private int peso;
    private float renda;
    private String naturalidade;
    private Hobby hobby;
    private EstadoCivil estadoCivil;
    private Escolaridade escolaridade;
    private boolean feliz;
    private Moradia moradia;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0 && altura <= 2.6f) {
            this.altura = altura;
        } 
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso > 0 && peso < 600) {
            this.peso = peso;
        } 
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        if (renda >= 0) {
            this.renda = renda;
        }
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public boolean isFeliz() {
        return feliz;
    }

    public void setFeliz(boolean feliz) {
        this.feliz = feliz;
    }

    public Moradia getMoradia() {
        return moradia;
    }

    public void setMoradia(Moradia moradia) {
        this.moradia = moradia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            this.nome = "No Name " + this.hashCode();
        } else if (nome.matches("[a-zA-Z]+")) {
            this.nome = nome;
        } 
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero, float altura, int peso, float renda,
            String naturalidade, Hobby hobby, EstadoCivil estadoCivil, Escolaridade escolaridade, boolean feliz,
            Moradia moradia) {
                this.setNome(nome);
                this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.renda = renda;
        this.naturalidade = naturalidade;
        this.hobby = hobby;
        this.estadoCivil = estadoCivil;
        this.escolaridade = escolaridade;
        this.feliz = feliz;
        this.moradia = moradia;
    }

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    @Override
    public String toString() {
        return String.join(", ", 
            nome, 
            genero.toString(), 
            "Altura: " + Float.toString(altura), 
            "Peso: " + Integer.toString(peso), 
            "Renda: " + Float.toString(renda), 
            "Naturalidade: " + naturalidade,
            "Hobby: " + hobby.toString(),
            "Estado Civil: " + estadoCivil.toString(),
            "Escolaridade: " + escolaridade.toString(),
            ((feliz) ? "Feliz" : "Infeliz"),
            "Moradia: " + moradia.toString());
    }

}