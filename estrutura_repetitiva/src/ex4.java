import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		// Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
		// Perguntar se o usuario deseja repetir (s/n). Caso digite "s", repetir o programa.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		char resp;
		do {
		System.out.println("Digite a temperatura em Celcius: ");
		double C = sc.nextDouble();
		double F = 9*C/5+32;
		System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		System.out.println("Deseja repetir (s/n)?");
		resp = sc.next().charAt(0);
		}while (resp != 'n');
		
		
		sc.close();  
	}

}
