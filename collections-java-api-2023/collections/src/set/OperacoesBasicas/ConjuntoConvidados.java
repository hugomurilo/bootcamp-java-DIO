package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> conjuntoConvidados;

	public ConjuntoConvidados() {
		this.conjuntoConvidados = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int code) {
		conjuntoConvidados.add(new Convidado(nome, code));
	}

	public void removerConvidadoPorCodigo(int code) {
		Convidado convidadoParaRemover = null;

		for (Convidado c : conjuntoConvidados) {
			if (c.getCode() == code) {
				convidadoParaRemover = c;
				break;
			}
		}
		conjuntoConvidados.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return conjuntoConvidados.size();
	}
	
	public void exibirConvidados() {
		System.out.println(conjuntoConvidados);
	}
	
	//Teste
	public static void main(String[] args) {
		 // Criando uma instância da classe ConjuntoConvidados
	    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

	    // Exibindo o número de convidados no conjunto (deve ser zero)
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

	    // Adicionando convidados ao conjunto
	    conjuntoConvidados.adicionarConvidado("Alice", 1234);
	    conjuntoConvidados.adicionarConvidado("Bob", 1235);
	    conjuntoConvidados.adicionarConvidado("Charlie", 1235);
	    conjuntoConvidados.adicionarConvidado("David", 1236);
	    
	    conjuntoConvidados.exibirConvidados();
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
	    
	   
	    // Removendo um convidado do conjunto por código de convite
	    conjuntoConvidados.removerConvidadoPorCodigo(1236);
	    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

	    // Exibindo os convidados atualizados no conjunto
	    System.out.println("Convidados no conjunto após a remoção:");
	    conjuntoConvidados.exibirConvidados();
	}
}
