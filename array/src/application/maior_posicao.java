package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {

	public static void main(String[] args) {
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
		  o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
		  considerando a primeira posição como 0 (zero).  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros você vai digitar: ");
		int n = sc.nextInt();
		double [] number = new double[n];
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			number[i] = sc.nextDouble();
		}
		
		double maior = number[0];
		int posmaior = 0;
		
		for(int i=0; i<n; i++) {
			if(number[i]>maior) {
				maior = number[i];
				posmaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
		sc.close();

	}

}
