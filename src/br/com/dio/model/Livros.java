package br.com.dio.model;

import java.util.Objects;

public class Livros {
	private String nome;
	private Integer paginas;

	public Livros(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}
	
	
	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", paginas=" + paginas + "]";
	}
}
