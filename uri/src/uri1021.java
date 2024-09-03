import java.util.Locale;
import java.util.Scanner;

public class uri1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		int centavos =(int) Math.round(valor * 100);
		
		int n100 = centavos / 10000;
		centavos %= 10000;
		
		int n50 = centavos / 5000;
		centavos %= 5000;
		
		int n20 = centavos / 2000;
		centavos %= 2000;
		
		int n10 = centavos / 1000;
		centavos %= 1000;
		
		int n5 = centavos / 500;
		centavos %= 500;
		
		int n2 = centavos / 200;
		centavos %= 200;
		
		int m1 = centavos / 100;
		centavos %= 100;
		
		int m050 = centavos / 50;
		centavos %= 50;
		
		int m025 = centavos / 25;
		centavos %= 25;
		
		int m010 = centavos / 10;
		centavos %= 10;
		
		int m005 = centavos / 5;
		centavos %= 5;
		
		int m001 = centavos;
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00%n"
				+ "%d nota(s) de R$ 50.00%n"
				+ "%d nota(s) de R$ 20.00%n"
				+ "%d nota(s) de R$ 10.00%n"
				+ "%d nota(s) de R$ 5.00%n"
				+ "%d nota(s) de R$ 2.00%n", n100, n50, n20, n10, n5, n2);
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00%n"
				+ "%d moeda(s) de R$ 0.50%n"
				+ "%d moeda(s) de R$ 0.25%n"
				+ "%d moeda(s) de R$ 0.10%n"
				+ "%d moeda(s) de R$ 0.05%n"
				+ "%d moeda(s) de R$ 0.01%n", m1, m050, m025, m010, m005, m001);
	}

}
