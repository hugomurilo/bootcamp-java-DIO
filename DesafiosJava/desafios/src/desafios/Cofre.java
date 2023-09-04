package desafios;

import java.util.Scanner;

abstract class Cofre {
	protected String tipo;
	protected String metodoAbertura;

	public Cofre(String tipo, String metodoAbertura) {
		this.tipo = tipo;
		this.metodoAbertura = metodoAbertura;
	}

	public void imprimirInformacoes() {
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Metodo de abertura: " + this.metodoAbertura);
	}
}

class CofreDigital extends Cofre {

	private int senha;

	public CofreDigital(int senha) {
		super("Cofre Digital", "Senha");
		this.senha = senha;
	}

	public boolean validarSenha(int confirmacaoSenha) {
		return confirmacaoSenha == this.senha;
	}
}

class CofreFisico extends Cofre {

	public CofreFisico() {
		super("Cofre Fisico", "Chave");
	}	
}

