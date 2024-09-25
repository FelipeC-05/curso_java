package application;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
		   aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
		   digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] med = new int[n];
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um numero: ");
			med[i] = sc.nextInt();
		}
		for (int i = 0; i<n; i++) {
			if(med[i] % 2 == 0) {
				double media = med[i] / n;
				System.out.printf("Media dos pares = %.1f", media);
			}
			else if (med[i] % 2 != 0){
				System.out.println("NENHUM NUMERO PAR");
			}
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
