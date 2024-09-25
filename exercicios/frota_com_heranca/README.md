# Gerenciamento de Frotas - Trabalho de Laboratório de Programação Modular

Prof. Hugo de Paula

### Descrição do Problema:

O sistema de gerenciamento de frotas para uma empresa de logística foi definido conforme o exercício frota anterior.

Você foi solicitado a estender o sistema para atender a novos requisitos.

Requisitos:

1. **Mecânicos**: O sistema deve agora gerenciar Mecânicos. Os mecânicos possuem os mesmos atributos dos motoristas, mas eles estão associados a uma Oficina. 

2. O sistema deve permitir que uma mesma pessoa seja cadastrada como Motorista e Mecânico, sem que haja duplicação de dados. 

3. A partir dos dados do Mecânico deve ser possível encontrar a Oficina ao qual ele está associado. A partir da Oficina também devemos ser capazes de consultar todos os mecânicos contratados.

4. **Frota**: A classe Frota deve ser estendida para gerenciar o cadastro de Oficinas, Mecânicos e Motoristas. Cadastros adicionais podem ser necessários para garantir o funcionamento correto do sistema

5. Todas as classes devem sobrescrever o método toString() da classe Object para exibir os atributos do objeto formatados em uma String.

6. A classe Main deve possuir métodos para cadastrar Veículos, Motoristas, Mecânicos, Rotas, Manutenções, etc... E deve criar métodos para exibir os elementos cadastrados na tela.

### Tarefas

Este trabalho deverá utilizar como referência o projeto Maven: frota

#### Modelagem UML

* Atualize o diagrama de classes UML que represente os elementos e as relações descritas acima. Use corretamente os conceitos de associação, agregação e composição.
* Indique os atributos e métodos de cada classe.

#### Desenvolvimento do Sistema

* Implemente os novos requisitos em Java.
* Utilize a ferramenta Maven para construir o projeto: group ID br.lpm e Artifact ID: frota

#### Testes Unitários

* Implemente testes unitários para garantir que os principais métodos e funcionalidades das classes estejam funcionando corretamente.
* Escreva testes que verifiquem a correta criação dos objetos da classe e da associação entre eles.

### Critérios de Avaliação

* Correta utilização dos conceitos de associação, agregação e composição na modelagem e implementação.
* Qualidade do diagrama UML, representando corretamente as relações entre as classes.
* Implementação correta e funcional do sistema.
* Testes unitários que garantam a confiabilidade do sistema desenvolvido.

### Entrega

Entregue o trabalho no Github Classroom.

Você deverá mover toda a pasta "frota" correspondente ao seu projeto Maven para dentro do repositório.

A maneira correta de fazer isso é a seguinte:

1. Acesse o Assignment do Github Classroom para criar seu repositório para o exercício.
2. Realize a clonagem do repositório para a sua máquina local.
3. Extrair o arquivo frota.zip para dentro da pasta local. O seu repositório local deverá ficar com uma única pasta chamada "frota".
4. Desenvolva o trabalho realizando commits a cada requisito implementado. Use commits pequenos para armazenar a evolução do seu trabalho.
5. Realize o push dos commits para o repositório remoto.

Observações

* Não é para entregar nenhum arquivo no formato zip, de forma alguma. Arquivos zip não serão avaliados.
* Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero).