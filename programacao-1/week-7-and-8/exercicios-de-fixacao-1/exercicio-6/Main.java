package meuprojetoteste1;

import meuprojetoteste1.Carro;
import meuprojetoteste1.Teclado;

public class App {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(Teclado.leInt("Informe a sua idade: "));

		int idade = p.getIdade();

		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
	}
}
