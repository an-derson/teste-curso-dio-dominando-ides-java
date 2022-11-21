package br.com.dio.model;

import java.util.Objects;

/*Ctrl + d - Apaga linha*/
/*Ctrl + m - Expande a tela*/
/*Ctrl + n - Criar class*/
/*Ctrl + 3 - Pesquisar*/
/*Selecionar código -> Alt + seta para cima ou para baixo - Move entre linhas*/
/*Ctrl + Shift + f - Identação*/

public class Gato {

	private String nome;
	private String cor;
	private Integer idade;

	/* Ctrl + 3 - Digitar contru */

	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/* Ctrl + 3 - Digitar ggas */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/* Ctrl + 3 - Digitar equal */

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	/* Ctrl + 3 - Digitar toString */

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
}