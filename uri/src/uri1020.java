import java.util.Scanner;

public class uri1020 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dias = sc.nextInt();
		
		int ano = dias / 365;
		
		int mes = dias % 365 / 30;
		
		int dia = dias % 365 % 30 / 1;
		
		System.out.printf("%d ano(s)%n"
				+ "%d mes(es)%n"
				+ "%d dia(s)%n", ano, mes, dia);
		
		sc.close();
	}

}
