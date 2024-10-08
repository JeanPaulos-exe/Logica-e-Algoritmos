	
		 /*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do
		 * terreno com duas casa decimais. Em seguida, o programa deve mostrar o valor
		 * da área do terreno, bem como o valor do preço do terreno, ambos com duas
		 * casas decimais, conforme o exemplo.
		 * Entrada: | Saida:
		 * 10.0     | AREA = 300.00
		 * 30.0    | PRECO = 6000.00
		 * 200.00   |
		 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
