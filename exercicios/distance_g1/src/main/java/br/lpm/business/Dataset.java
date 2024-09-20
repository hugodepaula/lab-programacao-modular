package br.lpm.business;

/*

addPessoa(Pessoa): adiciona uma pessoa na coleção.
removePessoa(Pessoa): remove uma pessoa da coleção.
removePessoaByName(String): remove uma pessoa da coleção baseada em seu nome.
replacePessoa(old: Pessoa, new: Pessoa): substitui uma pessoa por outra.
getPessoaByName(String): retorna uma pessoa baseada em seu nome.
getAll(): retorna todo o vetor de pessoas.
removeAll(): apaga todo o vetor de pessoas.
A classe Dataset deve ter os seguintes métodos de comportamento:

size(): retorna o número de elementos do dataset.
maxAltura(): retorna a maior altura.
minAltura(): retorna a menor altura.
avgAltura(): retorna a altura média.
maxPeso(): retorna a maior altura.
minPeso(): retorna a menor altura.
avgPeso(): retorna a altura média.
percentAdult(): float: retorna a porcentagem de pessoas maiores de idade na coleção. Para manter a alta coesão e baixo acoplamento, pode ser necessário alterar a classe Pessoa.
percentEstadoCivil(enum EstadoCivil): retorna a porcentagem de pessoas com o estado civil determinado pelo parâmetro.
modeEstadoCivil(): retorna o estado civil mais frequente.
percentFormacaoAcademica(enum  FormacaoAcademica): retorna a porcentagem de pessoas com a formação acadêmica determinada pelo parâmetro.
modeFormacaoAcademica(): retorna a formação acadêmica mais frequente.
percentProfissao(enum  Profissao): retorna a porcentagem de pessoas com a profissão determinada pelo parâmetro.
modeProfissao(): retorna a profissão mais frequente.
percentVidaSocial(): retorna a porcentagem de pessoas com vida social ativa.
percentHobby(): retorna a porcentagem de pessoas com hobbies.
avgAtividadeFisica(): retorna a média de dias na semana de prática atividade física.
svdAtividadeFisica(): retorna o desvio padrão dos dias na semana de prática atividade física.
avgSaude(): retorna a média do estado de saúde das pessoas.
svdSaude(): retorna o desvio padrão do estado de saúde das pessoas.
 */
public class Dataset {
    private static final int MAX_PESSOAS = 1000;
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int numPessoas = 0;

    public void addPessoa(Pessoa pessoa) {
        if (numPessoas < MAX_PESSOAS) {
            pessoas[numPessoas++] = pessoa;
        }
    }

    public void removePessoa(Pessoa pessoa) {
        
    }

    public void removePessoaByName(String pessoa) {
        
    }

    public void replacePessoa(Pessoa oldPessoa, Pessoa newPessoa) {

    }

    public Pessoa getPessoaByName(String nome) {
        return null;
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

    
    public void normalizeField(String fieldName) {
        if (fieldName.equalsIgnoreCase("Altura")) {
            float maxAltura = this.maxAltura();
            float minAltura = this.minAltura();
            float difAltura = maxAltura - minAltura;

            for (int i = 0; i < numPessoas; i++) {
                pessoas[i].setAltura((pessoas[i].getAltura() - minAltura) / difAltura);
            }
        }

    }

}
