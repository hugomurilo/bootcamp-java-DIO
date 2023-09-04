package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> setContatos;
	
	public AgendaContatos() {
		this.setContatos = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numeroTelefone) {
		setContatos.add(new Contato(nome, numeroTelefone));
	}
	
	public void exibirContatos() {
		System.out.println(setContatos);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c: setContatos) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c: setContatos) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumeroTelefone(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	//teste
	public static void main(String[] args) {
		// Criando uma instância da classe AgendaContatos
	    AgendaContatos agendaContatos = new AgendaContatos();

	    // Exibindo os contatos no conjunto (deve estar vazio)
	    agendaContatos.exibirContatos();

	    // Adicionando contatos à agenda
	    agendaContatos.adicionarContato("João", 123456789);
	    agendaContatos.adicionarContato("Maria", 987654321);
	    agendaContatos.adicionarContato("Maria", 937654321);
	    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
	    agendaContatos.adicionarContato("Ana", 88889999);
	    agendaContatos.adicionarContato("Fernando", 77778888);
	    agendaContatos.adicionarContato("Carolina", 55555555);
	    
	    agendaContatos.exibirContatos();
	    	    
	 // Pesquisando contatos pelo nome
	    System.out.println("-------------------------");
	    System.out.println(agendaContatos.pesquisarPorNome("Maria"));
	    	    
	 // Atualizando um contato
	    System.out.println("-------------------------");
	    System.out.println("Contato atualizado" + agendaContatos.atualizarNumeroContato("Maria Fernandes", 85324322));
	   
	    System.out.println("-------------------------");
	    agendaContatos.exibirContatos();
	}
}
