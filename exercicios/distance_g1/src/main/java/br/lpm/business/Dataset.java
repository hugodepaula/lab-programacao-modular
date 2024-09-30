package br.lpm.business;

/* Requisitos
Baseado no código do exercício "Cadastro de Pessoas", crie um dataset de pessoas. Um dataset é uma classe que possui uma coleção de elementos do tipo pessoa e permite realizar operações sobre este conjunto de elementos.

A classe Dataset deve ter os seguintes atributos:

pessoas: Pessoa[], uma lista de pessoas.
MAX_PESSOAS: atributo static final que representa o tamanho máximo do dataset.
A classe Dataset deve ter os seguintes métodos de acesso:

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
maxPeso(): retorna a maior peso.
minPeso(): retorna a menor peso.
avgPeso(): retorna a altura pseo.
percentAdult(): float: retorna a porcentagem de pessoas maiores de idade na coleção. Para manter a alta coesão e baixo acoplamento, pode ser necessário alterar a classe Pessoa.
percentEstadoCivil(enum EstadoCivil): retorna a porcentagem de pessoas com o estado civil determinado pelo parâmetro.
modeEstadoCivil(): retorna o estado civil mais frequente.
percentEscolaridade(enum  Escolaridade): retorna a porcentagem de pessoas com a formação acadêmica determinada pelo parâmetro.
modeEscolaridade(): retorna a formação acadêmica mais frequente.
percentMoradia(enum  Moradia): retorna a porcentagem de pessoas com a moradia determinada pelo parâmetro.
modeMoradia(): retorna a Moradia mais frequente.
percentHobby(): retorna a porcentagem de pessoas com hobbies.
percentFeliz(): retorna a porcentagem de pessoas felizes.
Implementação
Deverá ser criado um projeto Java que utiliza o Maven como build tool, sem a utilização de Archetypes.

O nome do Group ID deve ser: br.lpm
O nome do Artifact ID deve ser: dataset
Substitua o arquivo pom.xml pelo arquivo a seguir: pom.xmlDownload pom.xml
Deverá ser criada uma pasta chamada "uml" na raiz do projeto. Nesta pasta, deverá ser criado um arquivo chamado "uml-class-diagram" contendo o diagrama de classes baseada na UML, utilizando o plugin/extensão "UMLet" (https://www.umlet.com/Links to an external site.).

Deverá ser implementado:

A classe Dataset, com seus atributos e médodos conforme especificado.
A classe DatasetTest, que testa todos os requisitos. 
A classe Dataset e a classe Pessoa devem estar em um pacote chamado business.
A classe DatasetTest deve estar na pasta de testes do projeto Maven.
A classe PessoaTest deve ser adaptada à nova classe Pessoa e deve estar na pasta de testes do projeto Maven.
A classe Main, com o método main que realiza o cadastro de pessoas em um atributo público e estático do tipo Dataset.
Utilizando a biblioteca JFreeChart (https://www.jfree.org/jfreechart/Links to an external site.), implemente na classe Main um método público e estático histogramEscolaridade() que plota o histograma com a distribuição das Escolaridades.
Utilizando a biblioteca JFreeChart (https://www.jfree.org/jfreechart/Links to an external site.), implemente na classe Main um método público e estático pieHobby() que plota um gráfico de torta (Pie chart) com a distribuição dos Hobbies.
A classe Main deve estar em um pacote chamado main.
Entrega
O trabalho deve ser entregue no Github Classroom, no Assignment: https://classroom.github.com/a/qIs7DOQ8Links to an external site. Links to an external site.

Deverá ser entregue todo o conteúdo do projeto Maven no Github Classrrom. A pasta raiz do repositório deve replicar a pasta raiz do projeto Maven.
Não é para entregar nenhum arquivo zip, de forma alguma. Arquivos zip não serão avaliados.
Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero). 
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
