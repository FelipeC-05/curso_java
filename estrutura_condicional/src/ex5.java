import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e
		// a quantidade deste item. A
		// seguir, calcule e mostre o valor da conta a pagar.

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cod, qtd;
		double total;

		cod = sc.nextInt();
		qtd = sc.nextInt();

		switch (cod) {
		case 1:
			total = qtd * 4.0;
			System.out.printf("Total: %.2f%n", total);
			break;
		case 2:
			total = qtd * 4.5;
			System.out.printf("Total: %.2f%n", total);
			break;
		case 3:
			total = qtd * 5.0;
			System.out.printf("Total: %.2f%n", total);
			break;
		case 4:
			total = qtd * 2.0;
			System.out.printf("Total: %.2f%n", total);
			break;
		case 5:
			total = qtd * 1.5;
			System.out.printf("Total: %.2f%n", total);
			break;
		default:
			System.out.println("Valor de codigo informado não encontrado no sistema.");
			break;
		}
		
		

		sc.close();
	}

}
