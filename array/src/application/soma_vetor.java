package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		   - Imprimir todos os elementos do vetor
		   - Mostrar na tela a soma e a média dos elementos do vetor
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i]= sc.nextDouble();
		}
		
		soma = 0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		media = soma / n;
		
		System.out.print("Valores = ");
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		
		System.out.printf("%nSOMA = %.1f%n", soma);
		System.out.printf("SOMA = %.1f%n", media);
		
		sc.close();
	}

}
