import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		double gasto = sc.nextDouble();
		
		double consumoMedio = distancia / gasto;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		sc.close();

	}

}
