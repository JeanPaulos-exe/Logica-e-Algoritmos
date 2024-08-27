import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Configura o locale para usar o ponto como separador decimal
		Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler dados da entrada padrão (teclado)

		 String x; 
		 int x; 
		 double x; 
		 char x;
		 
		 x = sc.next(); // Lê apenas a primeira palavra
		 x = sc.nextInt(); 
		 x = sc.nextDouble(); 
		 x = sc.next().charAt(0);
		 
		 System.out.println("Você digitou: " + x); // Sem Locale imprime: 4.5
		 System.out.printf("Você digitou: %.2f%n", x); // Sem Locale imprime: 4,50
		 System.out.println("Você digitou: " + x);
		 
		 String x; 
		 int y; 
		 Double z;
		 
		 y = sc.nextInt(); 
		 z = sc.nextDouble();
		 
		 System.out.println("Dados digitados:"); 
		 System.out.println(x);
		 System.out.println(y); 
		 System.out.println(z);

		// Leitura de um inteiro e três linhas de texto
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt(); // Lê um número inteiro
		sc.nextLine(); // Consome a quebra de linha após ler o inteiro
		s1 = sc.nextLine(); // Lê a primeira linha de texto
		s2 = sc.nextLine();
		s3 = sc.nextLine(); 
		// next: apenas uma palavra nextline: texto inteiro até a quebra de linha 

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();  // Fecha o Scanner para liberar recursos
		
		import java.util.Locale;
		import java.util.Scanner;

		public class Main {

		    public static void main(String[] args) {
		        Locale.setDefault(Locale.US); // Configura o locale para usar ponto como separador decimal
		        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler dados do teclado

		        // **Bloco 1: Demonstração de diferentes tipos de leitura**
		        // (Este bloco tem problemas de reutilização de variáveis)
		        // ...

		        // **Bloco 2: Leitura de um inteiro e um double**
		        int y = sc.nextInt(); // Lê um número inteiro
		        double z = sc.nextDouble(); // Lê um número de ponto flutuante

		        System.out.println("Dados digitados:");
		        System.out.println(y);
		        System.out.println(z);

		        // **Bloco 3: Leitura de um inteiro e três linhas de texto**
		        int x = sc.nextInt(); // Lê um número inteiro
		        sc.nextLine(); // Consome a quebra de linha após ler o inteiro
		        String s1 = sc.nextLine(); // Lê a primeira linha de texto
		        String s2 = sc.nextLine(); // Lê a segunda linha de texto
		        String s3 = sc.nextLine(); // Lê a terceira linha de texto

		        System.out.println("DADOS DIGITADOS:");
		        System.out.println(x);
		        System.out.println(s1);
		        System.out.println(s2);
		        System.out.println(s3);

		        sc.close(); // Fecha o Scanner para liberar recursos
		    }
		}
		

	}
}

