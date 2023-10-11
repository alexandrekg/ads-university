package meuprojetoteste1;

import meuprojetoteste1.Carro;
import meuprojetoteste1.Teclado;

public class App {

	public static void main(String[] args) {
		int idade = Teclado.leInt("Informe a sua idade: ");
		
		Pessoa p = new Pessoa(idade);

		System.out.println("A sua idade eh: " + p.getIdade());
	}

}
