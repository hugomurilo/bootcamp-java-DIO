package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> setProdutos;
	
	public CadastroProdutos() {
		this.setProdutos = new HashSet<>();
	}
	
	public void adicionarProduto(long code, String name, double price, int quantity) {
		setProdutos.add(new Produto(code, name, price, quantity));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(setProdutos);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPrice());
		produtosPorPreco.addAll(setProdutos);
		return produtosPorPreco;
	}
	
	//teste
	public static void main(String[] args) {
		 // Criando uma instância do CadastroProdutos
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		 // Adicionando produtos ao cadastro
	    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
	    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
	    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
	    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
	    
	    // Exibindo todos os produtos
	    System.out.println(cadastroProdutos.setProdutos);
	    
	    // Exibindo todos os produtos ordenado por Nome
	    System.out.println(cadastroProdutos.exibirProdutosPorNome());
	    
	    // Exibindo todos os produtos ordenado por Preço
	    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
	}
}
