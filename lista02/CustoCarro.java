package lista02;

import java.util.Scanner;

public class CustoCarro {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o custo de f�brica do carro: ");
		float custoFabrica = sc.nextInt();
		float distribuidor = custoFabrica*28/100;
		float imposto = custoFabrica*45/100;
		float total = custoFabrica+distribuidor+imposto;
		System.out.println("O valor a ser pago no carro � de: "+total);
		sc.close();
	}

}
