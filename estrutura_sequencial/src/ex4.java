import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		// decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double H, S, P; 
		
		N = sc.nextInt();
		H = sc.nextDouble();
		S = sc.nextDouble();
		
		P = H * S;
		
		System.out.println("NUMBER = " + N);
		System.out.printf("SALARY = U$ %.2f%n", P);
		
		sc.close();

	}

}
