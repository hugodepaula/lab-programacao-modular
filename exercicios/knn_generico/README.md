O algoritmo K-Nearest Neighbors (K-NN) é um método de aprendizado que é compatível com todos os tipos de dados, desde que seja possível criar uma medida de distância para comparar estes elementos.

Esta tarefa consiste em implementar o algoritmo de K-NN genérico para classificação baseada em atributos de um dado.

### Requisitos

Considere o **Dataset** (base de dados) de pessoas implementado anteriormente.

Implemente os seguintes requisitos:

1. Desenvolva uma classe **Atribute** que representa um atributo de dados.
2. Implemente uma classe **DataPoint** que representa um ponto de dados.
3. Implemente uma interface funcional **Metric** que representa o contrato (ou padrão de comportamento) para o cálculo de uma distância entre dois **DataPoints**.
4. Adapte o código do projeto do K-NN para que ele seja capaz de realizar a classificação genérica de qualquer **DataSet**.

A assinatura da classe **Atribute** deve ser a seguinte:

```
public class Attribute {
  public Attribute(Object value)
  public <T> T getValue()
  public Attribute setValue(Object value)
  public String toString() 
}
```

A assinatura da classe **DataPoint** deve ser a seguinte:

```
public class DataPoint {
  public DataPoint()
  public void addAtribute(Attribute attribute) 
  public void addAttributes(List<Attribute> attributes)
  public DataPoint setState(String state) 
  public Attribute getAttribute(int index) 
  public List<Attribute> getAttributes() 
  public <T> T getState()   
  public Object parse(String input) 
  public String toString() 
}
```

A assinatura da interface **Metric** deve ser:

```
public double distance(DataPoint p1, DataPoint p2);
```

Requisitos não funcionais:

- Construa o diagrama UML da nova solução.
- Implemente os construtores com parâmetros para todas as classes.
- Implemente os *getters/setters* para os atributos pertinentes.
- Adicione os atributos adicionais sejam porventura necessários.
- Parametrize o código para evitar repetição e aumentar a legibilidade.
- Utilizando a JUnit, construa os testes unitários necessários para testar os valores dos atributos de todas as classes.
- Certifique-se de que seu código seja eficiente e modular.
- Utilize boas práticas de programação e comente seu código conforme necessário para facilitar a compreensão.

### Entrega

Entregue o trabalho no Github Classroom.

Utilize a ferramenta Maven para construir o projeto: group ID **br.lpm** e Artifact ID: **knn\_generico**

A maneira correta de fazer isso é a seguinte:

1. Acesse o **Assignment** do **Github Classroom** para criar seu repositório para o exercício.
2. Realize a clonagem do repositório para a sua máquina local.
3. Crie o projeto Maven dentro do seu repositório.
4. Desenvolva o trabalho realizando commits a cada requisito implementado. Use commits pequenos para armazenar a evolução do seu trabalho.
5. Realize o push dos commits para o repositório remoto.

#### **Observações**

* Não é para entregar nenhum arquivo no formato zip, de forma alguma. ***Arquivos zip não serão avaliados***.

* Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero).