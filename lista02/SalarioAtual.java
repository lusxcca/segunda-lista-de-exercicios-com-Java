package lista02;

import java.util.Scanner;

public class SalarioAtual {

	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Informe seu sal�rio: ");
		float salario = sc.nextFloat();
		System.out.println("Informe o percentual de reajuste: ");
		int reajuste = sc.nextInt();
		float novoSalario = salario+(salario/reajuste);
		System.out.println("Seu novo sal�rio ser�: "+novoSalario);
		sc.close();
		
	}
}
