package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> listPessoas;

	public OrdenacaoPessoas() {
		this.listPessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String name, Integer age, Double height) {
		listPessoas.add(new Pessoa(name, age, height));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}
	
	//teste
	public static void main(String[] args) {
		OrdenacaoPessoas list = new OrdenacaoPessoas();
		list.adicionarPessoa("Joao", 18, 1.80);
		list.adicionarPessoa("Carlos", 25, 1.76);
		list.adicionarPessoa("Maria", 12, 1.30);
		list.adicionarPessoa("Ana", 32, 1.65);
		list.adicionarPessoa("Alex", 19, 1.60);
		
		System.out.println(list.ordenarPorIdade());
		System.out.println(list.ordenarPorAltura());
	}
}
