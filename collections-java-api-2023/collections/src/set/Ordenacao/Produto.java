package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

	private Long code;
	private String name;
	private Double price;
	private Integer quantity;

	public Produto(Long code, String name, Double price, Integer quantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
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
		Produto other = (Produto) obj;
		return Objects.equals(code, other.code);
	}

	@Override
	public String toString() {
		return "{" + code + ", " + name + ", " + price + ", " + quantity + "}";
	}

	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return name.compareToIgnoreCase(p.getName());
	}

}

class ComparatorPrice implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPrice(), p2.getPrice());
	}

	
	
}
