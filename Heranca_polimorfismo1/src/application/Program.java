package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++ ) {
			System.out.println("Employee #" + (i+1) + " data:");
			
		}
		
		
		
		
		
		sc.close();
	}

}
