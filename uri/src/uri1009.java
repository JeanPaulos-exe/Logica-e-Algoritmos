import java.util.Locale;
import java.util.Scanner;

public class uri1009 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String vendedor = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double comissao = totalVendas * 15 / 100;
		double total = comissao + salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();
	}

}
