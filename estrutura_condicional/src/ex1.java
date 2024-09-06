import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é
		// negativo ou não.

		Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();

		if (x >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		sc.close();

	}

}
