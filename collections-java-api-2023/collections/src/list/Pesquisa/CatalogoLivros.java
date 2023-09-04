package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

	private List<Livro> catalogo;

	public CatalogoLivros() {
		this.catalogo = new ArrayList<>();
	}

	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalogo.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!catalogo.isEmpty()) {
			for(Livro l: catalogo) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!catalogo.isEmpty()) {
			for(Livro l: catalogo) {
				if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPortitulo = null;
		if(!catalogo.isEmpty()) {
			for(Livro l: catalogo) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPortitulo = l;
					break;
		// o laço será parado pois a regra de negócio deseja retornar apenas o primeiro encontrado
				}
			}
		}
		return livroPortitulo;
	}
	
	//Teste
	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		catalogo.adicionarLivro("Livro 1", "Autor 1", 2015);
		catalogo.adicionarLivro("Livro 1", "Autor 2", 2017);
		catalogo.adicionarLivro("Livro 2", "Autor 2", 2019);
		catalogo.adicionarLivro("Livro 3", "Autor 4", 2020);
		catalogo.adicionarLivro("Livro 4", "Autor 4", 1997);
		
		System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
		System.out.println(catalogo.pesquisarPorIntervaloAnos(1997, 2018));
		System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
	}
}
