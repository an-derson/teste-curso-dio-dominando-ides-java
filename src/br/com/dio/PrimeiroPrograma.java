package br.com.dio;

/*Ctrl + Shift + o - Importar automaticamente*/
import br.com.dio.model.Gato;
import br.com.dio.model.Livros;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Miau", "Preto", 3);
		Livros livros = new Livros("Cidade", 100);
		
		System.out.println(livros);
		System.out.println(gato);
		
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/
	}

}
