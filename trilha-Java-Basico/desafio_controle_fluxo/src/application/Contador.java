package application;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int number1 = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int number2 = sc.nextInt();
		sc.close();
		try {
			contar(number1, number2);
		}
		catch(ParametrosInvalidosException e) {
			System.out.println("Error: " + e.getMessage());
		}		
	}
	
	public static void contar(int number1, int number2) throws ParametrosInvalidosException{
		
		if(number1>number2) {
			throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo.");
		} else {
			int diff = number2 - number1;
			for(int i=1; i<=diff; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
	}
}
