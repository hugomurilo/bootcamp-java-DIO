package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	private String nome;
	private Integer code;
	
	public Convidado(String nome, Integer code) {
		this.nome = nome;
		this.code = code;
	}

	public String getNome() {
		return nome;
	}

	public Integer getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", code=" + code + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(code, other.code);
	}
	
	
}
