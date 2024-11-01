O algoritmo K-Nearest Neighbors (K-NN) é um método de aprendizado que é pode ser utilizado tanto para tarefas de classificação quanto para tarefas de regressão. A classificação é usada quando se deseja prever a classe de um exemplo, enquanto a regressão é usada quando o objetivo é prever um valor contínuo.

Nas tarefas de classificação, os passos do algoritmo são:

1.  Calcule a distância entre o ponto de dados de entrada e todos os outros pontos de dados no Dataset, dado uma métrica de distância.
2.  Selecione os K elementos com a menor distância em relação ao elemento de entrada.
3.  Definir o estado do elemento de entrada baseado na classe mais frequente entre os k vizinhos mais próximos.

Nas tarefas de regressão, os passos do algoritmo são:

1.  Calcule a distância entre o ponto de dados de entrada e todos os outros pontos de dados no Dataset, dado uma métrica de distância.
2.  Selecione os K elementos com a menor distância em relação ao elemento de entrada.
3.  Definir o estado do elemento de entrada baseado no valor médio dos estados dos k vizinhos mais próximos.

Esta tarefa consiste em estender o algoritmo de K-NN genérico para o sistema seja capaz de classificar ou estimar o estado de um DataPoint a partir de um DataSet genérico.

### Requisitos

*   O novo projeto deverá utilizar os princípios SOLID e ser genérico e expansível para tarefas de classificação e regressão.
*   O novo projeto deverá utilizar os princípios SOLID para que ele possa ler um Dataset a partir de quaisquer formatos de dados arbitrário.
*   O novo projeto deverá utilizar os princípios SOLID para suportar Datasets simples e Datasets normalizados.
*   O diagrama UML do novo sistema deve deixar claro que o sistema obedece a todos os princípios SOLID. Para isso ocorrer, será necessário colocar algumas classes de exemplo demonstrando como seria a implementação de classes para leituras de múltiplos formatos de dados, entre outras coisas.
*   A classe KNN deve ter um método polimórfico **Attribute predict(DataPoint)** que será capaz de classificar ou estimar o estado final de um DataPoint.

### Entrega

Entregue o trabalho no Github Classroom.

Utilize a ferramenta Maven para construir o projeto: group ID **br.lpm** e Artifact ID: **knn\_solid**

A maneira correta de fazer isso é a seguinte:

1.  Acesse o **Assignment** do **Github Classroom** para criar seu repositório para o exercício.
2.  Realize a clonagem do repositório para a sua máquina local.
3.  Crie o projeto Maven dentro do seu repositório.
4.  Desenvolva o trabalho realizando commits a cada requisito implementado. Use commits pequenos para armazenar a evolução do seu trabalho.
5.  Realize o push dos commits para o repositório remoto.

#### **Observações**

\* Não é para entregar nenhum arquivo no formato zip, de forma alguma. _**Arquivos zip não serão avaliados**_.

\* Os alunos devem ser capazes de explicar os códigos submetidos. Caso o aluno utilize algum código gerado externamente e não souber explicar o código receberá 0 (zero).