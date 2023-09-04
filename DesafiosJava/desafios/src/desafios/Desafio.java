package desafios;

import java.util.Scanner;

public class Desafio{
public static void main(String[] args) {
	// Lê o tipo de cofre (primeira linha da entrada)
	Scanner scanner = new Scanner(System.in);
	String tipoCofre = scanner.nextLine();

	// TODO: Implemente a condição necessário para a verificação dos cofres seguros:
	if (tipoCofre.equalsIgnoreCase("digital")) {
		int senha = scanner.nextInt();
		CofreDigital cofreDigital = new CofreDigital(senha);
		int confirmarSenha = scanner.nextInt();
		cofreDigital.imprimirInformacoes();
		if(cofreDigital.validarSenha(confirmarSenha)) {					
			System.out.println("Cofre aberto!");
		} else {
			System.out.println("Senha incorreta!");
		}
		
	} else {
		CofreFisico cofreFisico = new CofreFisico();
		cofreFisico.imprimirInformacoes();
	}
}
}
