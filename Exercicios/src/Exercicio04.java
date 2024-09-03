import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double nota = n1 + n2;
		
		System.out.println("NOTA FINAL = " + nota);
		if (nota < 60.00) {
			System.out.println("REPROVADO");
		}
		
		
		sc.close();
	}
}
