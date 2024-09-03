import java.util.Scanner;

public class uri1019 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seg = sc.nextInt();
		
		int horas = seg / 3600;
		int resto = seg % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;
		
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		
		sc.close();
	}

}
