package lista02;

import java.util.Scanner;

public class votacaoEleitores {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome o total de eleitores de um munic�pio: ");
		int eleitores = sc.nextInt();
		
		System.out.println("Informe a quantidade de votos brancos: ");
		float brancos = sc.nextFloat() / eleitores*100;
		
		System.out.println("Informe a quantidade de votos nulos: ");
		float nulos = sc.nextFloat() / eleitores*100;
		
		System.out.println("Informe a quantidade de votos v�lidos: ");
		float validos = sc.nextFloat() / eleitores*100;
		
		System.out.println("A procentagem de votods brancos: "+ brancos);
		System.out.println("A porcentagem de votos nulos � de: "+ nulos);
		System.out.println("A porcentagem de votos valdios � de: "+validos);
		sc.close();
	}

}
