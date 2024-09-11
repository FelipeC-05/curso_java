package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler os dados de um produto em estoque (nome, preço e
		 * quantidade no estoque). Em seguida: • Mostrar os dados do produto (nome,
		 * preço, quantidade no estoque, valor total no estoque) • Realizar uma entrada
		 * no estoque e mostrar novamente os dados do produto • Realizar uma saída no
		 * estoque e mostrar novamente os dados do produto
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		
		
		
		sc.close();
	}

}
