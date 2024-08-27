import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double x = 10.35784; // Declara uma variável do tipo double para armazenar um número real
		String nome = "Maria"; // Declara uma variável do tipo String para armazenar um texto
		int idade = 31; // Declara uma variável do tipo int para armazenar um número inteiro
		double renda = 4000.0;

		System.out.println(x); // Imprime o valor de x com todas as casas decimais
		System.out.printf("%.2f%n", x); // Imprime x com 2 casas decimais e uma nova linha
		System.out.printf("%.4f%n", x); // Imprime x com 4 casas decimais e uma nova linha
		Locale.setDefault(Locale.US); // Define o locale como US para formatação numérica
		System.out.printf("%.4f%n", x); // Imprime x com 4 casas decimais no formato US
		System.out.println("RESULTADO = " + x + " METROS"); // Concatena strings e o valor de x
		System.out.printf("RESULTADO = %.2f metros%n", x); // Formata a saída com string e valor numérico
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // Formata uma frase completa com várias variáveis

	}

}