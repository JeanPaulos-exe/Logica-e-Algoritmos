import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nFuncionario = sc.nextInt();
		int horas = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", nFuncionario, salario);
		
		sc.close();

	}

}
