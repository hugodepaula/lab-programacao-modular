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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            this.nome = "No Name " + this.hashCode();
        } else if (nome.matches("[a-zA-Z áéíóúàâêãõçü]+")) {
            this.nome = nome;
        } 
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento.isBefore(LocalDate.now())) {
            this.dataNascimento = dataNascimento;
        }
    }

    public boolean isAdulto() {
        return (dataNascimento.until(LocalDate.now()).getYears() >= 18);
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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
        if (naturalidade.matches("[a-zA-Z áéíóúàâêãõçü]+")) {
            this.naturalidade = naturalidade;
        } 
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

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero, float altura, int peso, float renda,
            String naturalidade, Hobby hobby, EstadoCivil estadoCivil, Escolaridade escolaridade, boolean feliz,
            Moradia moradia) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setGenero(genero);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setRenda(renda);
        this.setNaturalidade(naturalidade);
        this.setHobby(hobby);
        this.setEstadoCivil(estadoCivil);
        this.setEscolaridade(escolaridade);
        this.setFeliz(feliz);
        this.setMoradia(moradia);
    }

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    

}