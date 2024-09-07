import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// Fazer um programa que lê um valor inteiro N e depois N numeros inteiros.
		// Ao final, mostrar a soma dos N numeros lidos.
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		sc.close();
	}

}
