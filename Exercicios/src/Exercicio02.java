import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * base + 2 * altura;
		double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.printf("AREA = %.4f%nPERIMETRO = %.4f%nDIAGONAL = %.4f%n",area, perimetro, diagonal);
		
		sc.close();

	}

}
