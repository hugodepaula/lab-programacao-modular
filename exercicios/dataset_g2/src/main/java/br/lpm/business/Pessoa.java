package br.lpm.business;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private float altura;
    private int peso;
    private LocalDate dataNascimento;
    private EstadoCivil estadoCivil;
    private FormacaoAcademica formacaoAcademica;
    private Profissao profissao;
    private boolean vidaSocial;
    private boolean hobby;
    private int atividadeFisica;
    private int saude;

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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura > 0 && altura <= 3) {
            this.altura = altura;
        } 
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso > 0 && peso < 500) {
            this.peso = peso;
        } 
    }

    public boolean hasHobby() {
        return hobby;
    }

    public void setHobby(boolean hobby) {
        this.hobby = hobby;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public FormacaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public boolean hasVidaSocial() {
        return vidaSocial;
    }

    public void setVidaSocial(boolean vidaSocial) {
        this.vidaSocial = vidaSocial;
    }

    public int getAtividadeFisica() {
        return atividadeFisica;
    }

    public void setAtividadeFisica(int atividadeFisica) {
        if (atividadeFisica >= 1 && atividadeFisica <=7) {
            this.atividadeFisica = atividadeFisica;
        }
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        if (saude >= 1 && saude <=10) {
            this.saude = saude;
        }
    }

    public Pessoa(String nome, float altura, int peso, LocalDate dataNascimento, 
            EstadoCivil estadoCivil, FormacaoAcademica formacaoAcademica, Profissao profissao,
            boolean vidaSocial, boolean hobby, int atividadeFisica, int saude) {
        this.setNome(nome);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setDataNascimento(dataNascimento);
        this.setEstadoCivil(estadoCivil);
        this.setFormacaoAcademica(formacaoAcademica);
        this.setProfissao(profissao);
        this.setVidaSocial(vidaSocial);
        this.setHobby(hobby);
        this.setAtividadeFisica(atividadeFisica);
        this.setSaude(saude);
    }

    public Pessoa(String nome) {
        this.setNome(nome);
    }

    

}