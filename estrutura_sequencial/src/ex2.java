import java.util.Locale;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo
		// depois mostrar o valor da área deste círculo com quatrocasas decimais
		// Fórmula da área: area = π . raio2
		// Considere o valor de π = 3.14159

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R, A, pi;
		
		pi = 3.14159;

		R = sc.nextDouble();

		A = pi * R * R;

		System.out.printf("A= %.4f%n", A);

		sc.close();

	}

}
