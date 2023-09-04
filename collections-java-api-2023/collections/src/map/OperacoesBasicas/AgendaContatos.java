package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}

	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}

	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}

	// teste
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();

		// Adicionar contatos
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("João", 5665);
		agendaContatos.adicionarContato("Carlos", 1111111);
		agendaContatos.adicionarContato("Ana", 654987);
		agendaContatos.adicionarContato("Maria", 1111111);
		agendaContatos.adicionarContato("Camila", 44444);
		// o put também serve para atualizar, por isso ele imprimiu o ultimo contato Camila 
		agendaContatos.exibirContatos();
		
		System.out.println("-------------------------");
		// remover contato
		agendaContatos.removerContato("Carlos");
		agendaContatos.exibirContatos();
		
		System.out.println("-------------------------");
		// pesquisar nome
		System.out.println(agendaContatos.pesquisarPorNome("Camila"));
	}
}
