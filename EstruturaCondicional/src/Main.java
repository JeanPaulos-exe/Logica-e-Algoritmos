import java.util.Scanner;

/* Estrutura de controle */

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 5;
		
		System.out.println("Bom dia");
		// Condicional Simples (somente if)
		if (x < 0) { // 5 menor que 0: F
			System.out.println("Boa Tarde");
		}
		
		System.out.println("Boa Noite");
		
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		// Condicional Composta (if e else)
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			System.out.println("Boa Tarde");
		}
		
		// Encadeamento de estruturas condicionais
		
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			// Encadeamento
			if (hora < 18) {
			System.out.println("Boa Tarde");
			}
			else {
				System.out.println("Boa Noite");
			}
		}
		
		/* Forma Simplificada de Encadeamento
		 * if (condição1) {
		 * 	comando1
		 * }
		 * else if (condição2){
		 * 	comando2
		 * }
		 * else {
		 * comando3
		 * }
		 * 
		 */
		
		
		
		sc.close();
	}

}


/* 
 * Comparativas:
 * > Maior 
 * < Menor
 * >= Maior ou Igual
 * <= Menor ou igual
 * == Igual
 * != Diferente
 * 
 * Logicas:
 * && E
 * || OU
 * ! Não
 */