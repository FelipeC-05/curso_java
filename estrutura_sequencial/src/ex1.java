import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros
		// depois mostrar na tela a soma desses números com uma mensagem explicativa.

		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();

	}

}
