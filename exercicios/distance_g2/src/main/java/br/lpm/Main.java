package br.lpm;

// Medidas de Distância
   
// Requisitos
// Uma primeira abordagem para comparação entre dados ´através de medidas de distância e similaridade. Similaridade é uma medida numérica que identifica o quanto dois objetos são parecidos. O valor é mais alto quanto mais semelhantes os objetos são. É comum a medida de similaridade estar entre a faixa de valores [0,1] (normalizado). Distância (ou dissimilaridade) é uma medida numérica que identifica o quanto dois objetos são diferentes. Nese caso, valores menores indicam objetos mais semelhantes. A dissimilaridade mínima é normalmente 0 (objetos idênticos), mas o limite superior pode variar.

// Baseado no código do exercício "Dataset", será implementado um módulo para o cálculo de medida de similaridade entre duas pessoas.

// Uma classe chamada DistanceMeasure que possui os seguintes médodos:

// calcDistance(first: Pessoa, second: Pessoa): calcula a distância entre duas pessoas.
// O método deve calcular a distância da segunte forma:
// Se o tipo do atributo for Enum, distância é 0 se os valores forem iguais e 1, caso contrário.
// Se o tipo do atributo for boolean, distância é 0 se os valores forem iguais e 1, caso contrário.
// Se o tipo do atributo for numérico (inteiro ou real), distância é o valor absoluto da diferença entre os campos normalizados.
// A distância final entre duas pessoas é iqual à raiz quadrada da soma do quadrado das distâncias dos atributos, dividido pelo número de atributos.
// A classe Dataset deve ser alterada para incorporar os seguintes métodos de comportamento:

// normalizeField(String fieldName): normaliza um campo numérico chamado fieldName colocando os valores entre 0 e 1.
// A fórmula para normalização é: 
// calcDistanceVector(pessoa: Pessoa): retorna um vetor de distâncias, entre a pessoa passada como parâmetro e todas as demais pessoas do dataset.
// calcDistanceMatrix(): retorna uma matriz de tamanho N x N, onde N é o tamanho do dataset com as distâncias entre todos os pares de elementos do dataset.
// getSimilar(pessoa: Pessoa, n: int): retorna as n pessoas do dataset mais similares à uma pessoa passada como parâmetro.
// Implementação
// Deverá ser criado um projeto Java que utiliza o Maven como build tool, sem a utilização de Archetypes.

// O nome do Group ID deve ser: br.lpm
// O nome do Artifact ID deve ser: distance
// Configure o arquivo pom.xml conforme já explicado anteriormente para suportar testes unitários.
// Atualize o arquivo chamado "uml-class-diagram" com a nota classe.

// Deverá ser implementado:

// A classe Dataset, com seus atributos e métodos atualizados conforme especificado.
// A classe DatasetTest, atualizada para testar todos os novos requisitos. 
// A classe DistanceMeasure, no pacote chamado business, com seus atributos e métodos conforme especificado.
// A classe DistanceMeasureTest testando DistanceMeasure.
// A classe Main, com o método main atualizada para:
// Cadastrar um dataset.
// Cadastrar uma nova pessoa para consultar na base.
// Retornar as 3 pessoas mais similares a esta pessoa cadastrada.
// Entrega
// O trabalho deve ser entregue no Github Classroom, no Assignment: https://classroom.github.com/a/C63rvPbBLinks to an external site. 

// Deverá ser entregue todo o conteúdo do projeto Maven no Github Classrrom. A pasta raiz do repositório deve replicar a pasta raiz do projeto Maven.
// Não é para entregar nenhum arquivo zip, de forma alguma. Arquivos zip não serão avaliados.
// Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero). 

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}