package entities;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando música via app iPhone ");
		
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página no navegador do iPhone");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada no navegador do iPhone");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando para o número discado via iPhone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atender ligação via iPhone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Ligação não atendida. Iniciando correio de voz iPhone.");
		
	}

}
