# Gerenciamento de Frotas - Trabalho de Laboratório de Programação Modular

Prof. Hugo de Paula

### Descrição do Problema:

Você foi contratado para desenvolver um sistema de gerenciamento de frotas para uma empresa de logística. O sistema deve ser capaz de gerenciar informações sobre **veículos e motoristas**. Uma frota é formada por diversos veículos. Os veículos são dirigidos por motoristas da empresa. 

### Requisitos:

1.  **Veículos**: veículos possuem um modelo, ano, placa, quilometragem (km).
    
2.  **Motorista**: Um motorista tem nome e número de identificação. O número de identificação deve ser auto-incremento. O motorista pode estar associado a vários veículos, mas não ao mesmo tempo.

3.  **Oficina**: Um veículo pode estar em trânsito ou em manutenção. Uma oficina possui um nome e um endereço, e deve armazenar a lista dos veículos em manutenção. Os veículos em manutenção devem ter associados a ele uma data prevista de término do serviço.
    
4.  **Trânsito:** Um veículo em trânsito deve estar associado à sua rota de entrega. A rota de entrega é definida apenas pela sua origem, destino e data do transporte. Um veículo não pode ser colocado em trânsito se ele estiver em manutenção.

5. **Frota**: Deve ser desenvolvido um cadastro de veículos e rotas para gerenciar a frota. A partir da frota um usuário deve ser capaz de consultar todos os veículos cadastrados e Todas as rotas já realizadas.

### Tarefas:

1.  **Modelagem UML**:
    
    *   Desenvolva um diagrama de classes UML que represente os elementos e as relações descritas acima. Use corretamente os conceitos de associação, agregação e composição.
    *   Indique os atributos e métodos de cada classe.
    *   Não se preocupe em indicar _getters_ e _setters_. 

2.  **Desenvolvimento do Sistema**:
    
    *   Implemente as classes necessárias em Java.
    *   Utilize a ferramenta Maven para construir o projeto: group ID **br.lpm** e Artifact ID: **frota**
    *   Desenvolva a classe Main capaz de cadastrar as entidades do sistema.

3.  **Testes Unitários**:
    
    *   Implemente testes unitários para garantir que os principais métodos e funcionalidades das classes estejam funcionando corretamente. Só é necessário testar métodos que implementam regras de negócio. Métodos de acesso simples não devem ser testados.
    *   Escreva testes que verifiquem a correta criação dos objetos da classe e da associação entre eles.

### Critérios de Avaliação:

*   Correta utilização dos conceitos de **associação**, **agregação** e **composição** na modelagem e implementação.
*   Qualidade do diagrama UML, representando corretamente as relações entre as classes.
*   Implementação correta e funcional do sistema.
*   Testes unitários que garantam a confiabilidade do sistema desenvolvido.

### Entrega

Entregue o trabalho no Github Classroom.

Você deverá mover toda a pasta "frota" correspondente ao seu projeto Maven para dentro do repositório.

A maneira correta de fazer isso é a seguinte:

1. Acessar o Assignment do Github Classroom para criar seu repositório para o exercício.
2. Realizar a clonagem do repositório para a sua máquina local.
3. Extrair o arquivo frota.zip para dentro da pasta local. O seu repositório local deverá ficar com uma única pasta chamada "frota".
4. Desenvolver o trabalho realizando _commits_ a cada requisito implementado. Use _commits_ pequenos (_atomic commit_) para armazenar a evolução do seu trabalho.
5. Realizar o _push_ dos _commits_ para o repositório remoto.

**Observações**

* Não é para entregar nenhum arquivo no formato zip, de forma alguma. _**Arquivos zip não serão avaliados**_.
* Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero). 