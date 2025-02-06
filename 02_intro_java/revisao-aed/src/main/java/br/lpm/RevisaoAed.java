package br.lpm;

// O comando import serve para referenciar um pacote ou uma classe, semelhante ao #INCLUDE
import java.lang.Math;
import java.util.Scanner;

/**
 * <p>
 * Ilustra o conceito de semântica de referência com o uso de uma classe
 * (semelhante à <code>struct</code>) e de um vetor.
 * </p>
 * <p>
 * O programa irá criar um vetor de raios de circunferências e irá calcular as
 * áreas dessas respectivas circunferências. Finalmente o programa irá exibir na
 * tela o raio de uma circunferência com suas respectivas áreas.
 * </p>
 *
 * @author Hugo de Paula
 * @version 1.0
 * 
 */
public class RevisaoAed {

	/**
	 *
	 * O programa irá criar um vetor de raios de circunferências e irá calcular as
	 * áreas dessas respectivas circunferências. Finalmente o programa irá exibir na
	 * tela o raio de uma circunferência com suas respectivas áreas.
	 * 
	 * @param args número inteiro positivo que representa a quantidade de raios que
	 *             se deseja calcular
	 *
	 */
	public static void main(String args[]) {

		// Declara uma variável inteira.
		int numCirc;

		// Cria uma instância da classe Scanner para ler a entrada do usuário a partir
		// do console (System.in).
		// A classe Scanner é uma classe do pacote java.util que facilita a leitura de
		// dados de várias fontes, como entrada padrão (console), arquivos, strings, etc. 
		Scanner input = new Scanner(System.in);

		System.out.print("Digite quantas circunferências deseja criar: ");
		numCirc = input.nextInt();

		// Lê a tecla <enter> pressionada após o inteiro.
		input.nextLine();

		// Declara as variáveis raios e areas, que são referências (ponteiros)
		// para vetores de números reais. O comando <code>double[] raios</code> 
		// cria a referência para um vetor do tipo int, mas não constroi o 
		// vetor propriamente dito. O comando <code>new double[numCirc]</code> 
		// aloca a memória e constroi o vetor, retornando o endereço (referência) 
		// do objeto criado.
		double[] raios = new double[numCirc];
		double[] areas = new double[numCirc];


		Constante pi = new Constante();
		pi.nome = "pi";
		pi.valor = 3.1415926;

		for (int i = 0; i < numCirc; i++) {
			raios[i] = Math.random();
			areas[i] = pi.valor * raios[i] * raios[i];
			System.out.println("Area de circ com raio " + raios[i] + " é igual a " + areas[i] + ".");
		}
		input.close();
	}
}

/**
 *
 * Semelhante à uma struct na linguagem C, em que se declara uma estrutura com
 * campos. Os campos de uma classe são chamados de atributos.
 *
 */
class Constante {
	String nome;
	double valor;
}
