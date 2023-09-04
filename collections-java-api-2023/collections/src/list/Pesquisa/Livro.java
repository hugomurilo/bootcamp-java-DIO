package list.Pesquisa;

public class Livro {
	private String titulo;
	private String autor;
	private Integer anoPublicacao;
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, Integer anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	@Override
	public String toString() {
		return "Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao;
	}
	
	
}
