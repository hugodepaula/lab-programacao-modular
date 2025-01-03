# Dataset de Pessoas

## Requisitos

Baseado no código do exercício "Cadastro de Pessoas", crie um dataset de pessoas. Um dataset é uma classe que possui uma coleção de elementos do tipo pessoa e permite realizar operações sobre este conjunto de elementos.

A classe **Dataset** deve ter os seguintes atributos:

*   **pessoas**: Pessoa[], uma lista de pessoas.
*   **MAX_PESSOAS**: atributo static final que representa o tamanho máximo do dataset.

A classe **Dataset** deve ter os seguintes métodos de acesso:

*   **addPessoa(Pessoa)**: adiciona uma pessoa na coleção.
*   **removePessoa(Pessoa)**: remove uma pessoa da coleção.
*   **removePessoaByName(String)**: remove uma pessoa da coleção baseada em seu nome.
*   **replacePessoa(old: Pessoa, new: Pessoa)**: substitui uma pessoa por outra.
*   **getPessoaByName(String)**: retorna uma pessoa baseada em seu nome.
*   **getAll()**: retorna todo o vetor de pessoas.
*   **removeAll()**: apaga todo o vetor de pessoas.

A classe **Dataset** deve ter os seguintes métodos de comportamento:

*   **size()**: retorna o número de elementos do dataset.
*   **maxAltura()**: retorna a maior altura.
*   **minAltura()**: retorna a menor altura.
*   **avgAltura()**: retorna a altura média.
*   **maxPeso()**: retorna a maior altura.
*   **minPeso()**: retorna a menor altura.
*   **avgPeso()**: retorna a altura média.
*   **percentAdult()**: float: retorna a porcentagem de pessoas maiores de idade na coleção. Para manter a alta coesão e baixo acoplamento, pode ser necessário alterar a classe Pessoa.
*   **percentEstadoCivil(enum EstadoCivil)**: retorna a porcentagem de pessoas com o estado civil determinado pelo parâmetro.
*   **modeEstadoCivil()**: retorna o estado civil mais frequente.
*   **percentFormacaoAcademica(enum  FormacaoAcademica)**: retorna a porcentagem de pessoas com a formação acadêmica determinada pelo parâmetro.
*   **modeFormacaoAcademica()**: retorna a formação acadêmica mais frequente.
*   **percentProfissao(enum  Profissao)**: retorna a porcentagem de pessoas com a profissão determinada pelo parâmetro.
*   **modeProfissao()**: retorna a profissão mais frequente.
*   **percentVidaSocial()**: retorna a porcentagem de pessoas com vida social ativa.
*   **percentHobby()**: retorna a porcentagem de pessoas com hobbies.
*   **avgAtividadeFisica()**: retorna a média de dias na semana de prática atividade física.
*   **svdAtividadeFisica()**: retorna o desvio padrão dos dias na semana de prática atividade física.
*   **avgSaude()**: retorna a média do estado de saúde das pessoas.
*   **svdSaude()**: retorna o desvio padrão do estado de saúde das pessoas.

## Implementação

Deverá ser implementado:

1. A classe **Dataset**, com seus atributos e médodos conforme especificado.
2. A classe **DatasetTest**, que testa todos os requisitos. 
3. A classe **Dataset** e a classe Pessoa devem estar em um pacote chamado **business**.
4. A classe **DatasetTest** deve estar na pasta de testes do projeto **Maven**.
5. A classe **PessoaTest** deve ser adaptada à nova classe Pessoa e deve estar na pasta de testes do projeto **Maven**.
6. A classe **Main**, com o método main que realiza o cadastro de pessoas em um atributo público e estático do tipo **Dataset**.
7. Utilizando a biblioteca **JFreeChart** (https://www.jfree.org/jfreechart/), implemente na classe **Main** um método público e estático **histogramFormacaoAcadêmica()**  que plota o histograma com a distribuição das Formações Acadêmicas.
8. Utilizando a biblioteca **JFreeChart** (https://www.jfree.org/jfreechart/), implemente na classe **Main** um método público e estático **pieProfissao()** que plota um gráfico de torta (Pie chart) com a distribuição das Profissões.
9. A classe **Main** deve estar em um pacote chamado **main**.
10. Deverá ser criada uma pasta chamada "**uml**" na raiz do projeto. Nesta pasta, deverá ser criado um arquivo chamado "**uml-class-diagram**" contendo o diagrama de classes baseada na UML, utilizando o plugin/extensão "**UMLet**" (https://www.umlet.com/).



## Entrega

O trabalho deve ser entregue no Github Classroom.

Utilize a ferramenta Maven para construir o projeto: group ID **br.lpm** e Artifact ID: **dataset**

A maneira correta de fazer isso é a seguinte:

1. Acesse o Assignment do Github Classroom para criar seu repositório para o exercício.
2. Realize a clonagem do repositório para a sua máquina local.
3. Crie o projeto Maven dentro do repositório.
4. Desenvolva o trabalho realizando _commits_ a cada requisito implementado. Use _commits_ pequenos para armazenar a evolução do seu trabalho.
5. Realize o _push_ dos _commits_ para o repositório remoto.

Observações

* Não é para entregar nenhum arquivo no formato zip, de forma alguma. Arquivos zip não serão avaliados.
* Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero).