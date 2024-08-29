import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int qnt1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int qnt2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = valor1 * qnt1 + valor2 * qnt2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();

	}

}
