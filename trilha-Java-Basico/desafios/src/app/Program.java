package app;


import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        if (valor > 0) {
           System.out.println("Deposito realizado com sucesso! Saldo atual: R$ " + String.format("%.2f%n", valor));
        } else if (valor == 0) {
            //TODO: Imprimir a mensagem de valor inválido.
        } else {
             //TODO: Imprimir a mensagem de encerrar o programa.
        }
	  }
}
