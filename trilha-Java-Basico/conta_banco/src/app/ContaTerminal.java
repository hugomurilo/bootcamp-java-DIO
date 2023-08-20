package app;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, digite o número da Agência: ");
		String agency = sc.nextLine();
		System.out.print("Digite o número da conta: ");
		int holderNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome do cliente: ");
		String nameHolder = sc.nextLine();
		System.out.print("Digite o saldo da conta: ");
		double balance = sc.nextDouble();
		
		System.out.println("\"Olá " +nameHolder +", obrigado por criar uma conta em nosso banco, sua agência é "+ agency + ", conta "+holderNumber +" e seu saldo R$"+ balance +" já está disponível para saque\"");
				sc.close();
	}

}
