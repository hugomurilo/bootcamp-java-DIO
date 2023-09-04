package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{

	private String name;
	private Integer age;
	private Double height;
	
	
	public Pessoa(String name, Integer age, Double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}


	public String getName() {
		return name;
	}


	public Integer getAge() {
		return age;
	}


	public Double getHeight() {
		return height;
	}


	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", age=" + age + ", height=" + height + "]";
	}


	@Override
	public int compareTo(Pessoa p) {
		return Integer.compare(age, p.getAge());
	}
	
}

class ComparatorPorAltura implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa p1, Pessoa p2) {
		
		return Double.compare(p1.getHeight(), p2.getHeight());
	}
	
}
