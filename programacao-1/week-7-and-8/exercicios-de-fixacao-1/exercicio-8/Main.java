package meuprojetoteste1;

import meuprojetoteste1.Teclado;

public class App {

	public static void main(String[] args) {
		int x = 0;
		do {
			x = Teclado.leInt("Digite um numero positivo: ");
		} while (x == 0 || x < 0);

	}
}
