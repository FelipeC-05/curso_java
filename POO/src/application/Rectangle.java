package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangle;

public class Rectangle {

	public static void main(String[] args) {
		/*fazer um programa para ler os valores da largura e altura de um retangulo.
		 * Em seguida, mostrar na tela o valor de sua area, perímetro e diagonal.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangle rect = new retangle();
		
		System.out.println("Enter rectangle widht and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close();
	}

}
