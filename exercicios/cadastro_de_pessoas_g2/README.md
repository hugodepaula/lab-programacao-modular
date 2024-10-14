# Cadastro de Pessoas

## Requisitos

Realize um cadastro de pessoas com os seguintes requisitos.

A classe **Pessoa** deve ter os seguintes atributos:

*   **nome**: String, alfabético com apenas letras e espaço.
*   **altura**: float, 0 < altura < 3.
*   **peso**: int, 0 < peso, < 500.
*   **dataNascimento**: LocalDate, dataNascimento < hoje.
*   **estadoCivil**: enum EstadoCivil = {SOLTEIRO, CASADO, UNIAO_ESTAVEL, VIUVO, SEPARADO, DIVORCIADO}.
*   **formacaoAcademica**: enum FormacaoAcademica = {NENHUMA, BASICA, MEDIA, SUPERIOR}.
*   **profissao**: enum Profissao = {DESEMPREGADO, ESTUDANTE, AUTONOMO, CLT, EMPRESARIO}.
*   **vidaSocial:** boolean.
*   **hobby:** boolean.
*   **atividadeFisica**: int, onde valor armazena quantos dias na semana pratica atividade física, 0 <= atividadeFisica <= 7.
*   **saude**: int, onde valor representa o estado de saúde em uma escala entre 1 e 10.

## Implementação

Deverá ser implementado:

1.  A classe **Pessoa**, com seus atributos, _getters_ e _setters_. Os _setters_ devem validar os campos conforme requisitos apresentados acima.
2.  Construtor com parâmetros para a classe **Pessoa**.
3.  Os tipos enumerados (_enum_) com visibilidade pública em seus respectivos arquivos.
4.  A classe **Main**, com o método _main_ que realiza o cadastro de pessoas em um atributo público e estático da classe **Main**, que é um vetor de **Pessoa**.
5.  A classe **PessoaTest**, que testa todos os requisitos implementados nos _setters_. 
6.  A classe **Pessoa** e os tipos enumerados devem estar em um pacote chamado **business**.
7.  A classe **Main** deve estar em um pacote chamado **main**.
8.  A classe **PessoaTest** deve estar em um pacote chamado **test**.

## Entrega

O trabalho deve ser entregue no Github Classroom.

Utilize a ferramenta Maven para construir o projeto: group ID **br.lpm** e Artifact ID: **cadastro_de_pessoas**

A maneira correta de fazer isso é a seguinte:

1. Acesse o Assignment do Github Classroom para criar seu repositório para o exercício.
2. Realize a clonagem do repositório para a sua máquina local.
3. Crie o projeto Maven dentro do repositório.
4. Desenvolva o trabalho realizando _commits_ a cada requisito implementado. Use _commits_ pequenos para armazenar a evolução do seu trabalho.
5. Realize o _push_ dos _commits_ para o repositório remoto.

Observações

* Não é para entregar nenhum arquivo no formato zip, de forma alguma. Arquivos zip não serão avaliados.
* Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero).