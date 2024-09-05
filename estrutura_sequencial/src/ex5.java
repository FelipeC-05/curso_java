import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qte1, cod2, qte2;
		double vlr1, vlr2, total;
		
		cod1 = sc.nextInt();
		qte1 = sc.nextInt();
		vlr1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qte2 = sc.nextInt();
		vlr2 = sc.nextDouble();
				
		total = qte1*vlr1 + qte2*vlr2 ;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		sc.close();
		
	}

}
