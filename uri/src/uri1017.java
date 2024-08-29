import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velMedia = sc.nextInt();
		
		double distancia = (tempoGasto * velMedia);
		double qntL = distancia / 12;
		
		System.out.printf("%.3f%n", qntL);
		
		
		sc.close();

	}

}
