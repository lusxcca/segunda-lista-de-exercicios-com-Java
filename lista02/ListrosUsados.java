package lista02;

import java.util.Scanner;

public class ListrosUsados {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe quantas horas foram gastas na viagem: ");
		int horas = sc.nextInt();
		System.out.println("Informe a velocidade m�dia do ve�culo: ");
		int velocidade = sc.nextInt();
		int distancia = horas*velocidade;
		float litrosUsados = distancia/12f;
		System.out.println("O tempo gasto na viagem � de: "+horas);
		System.out.println("A velocidade m�dia durante o trajeto percorrido � de: "+velocidade);
		System.out.println("A dist�ncia percorrida nesta viagem foi de: "+distancia);
		System.out.println("A quantidade de litros usados na viagem � de: "+litrosUsados);
		sc.close();
	}
	
}
