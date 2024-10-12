package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CNPJ;
import entities.CPF;
import entities.Contribuinte;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Tax payer #" +i+ "data:");
			System.out.print("Individual or company (f/j)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			if(ch == 'f') {
				System.out.println("Health expenditures: ");
				Double saude = sc.nextDouble();
				list.add(new CPF(name, rendaAnual, saude));
			}
			else {
				System.out.println("Number of Employees: ");
				int quantFuncionarios = sc.nextInt();
				list.add(new CNPJ(name, rendaAnual, quantFuncionarios));
			}
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Contribuinte cb : list) {
			double tax = cb.tax();
			System.out.println(cb.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
