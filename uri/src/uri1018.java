import java.util.Scanner;

public class uri1018 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notas = sc.nextInt();
		
		int n100 = notas / 100;
		int n050 = notas % 100 / 50;
		int n020 = notas % 100 % 50 / 20;
		int n010 = notas % 100 % 50 % 20 / 10;
		int n005 = notas % 100 % 50 % 20 % 10 / 5;
		int n002 = notas % 100 % 50 % 20 % 10 % 5 / 2;
		int n001 = notas % 100 % 50 % 20 % 10 % 5 % 2 / 1;
		
		System.out.printf("%d%n"
				+ "%d nota (s) de R$ 100,00%n"
				+ "%d nota(s) de R$ 50,00%n"
				+ "%d nota(s) de R$ 20,00%n"
				+ "%d nota(s) de R$ 10,00%n"
				+ "%d nota(s) de R$ 5,00%n"
				+ "%d nota(s) de R$ 2,00%n"
				+ "%d nota(s) de R$ 1,00%n", notas, n100, n050, n020, n010, n005, n002, n001);
		
	}

}
