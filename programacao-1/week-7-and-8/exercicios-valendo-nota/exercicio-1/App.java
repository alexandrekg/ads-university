package Week7e8ExerciciosValendoNota;

import java.util.ArrayList;
import java.util.List;

import Week7e8ExerciciosValendoNota.Carro;
import Week7e8ExerciciosValendoNota.Cliente;

public class App {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Petrônio", new Carro("Fiat", 37000));
		cli.getCarro().setValor(90000);

        System.out.println(cli.getCarro().getValor());
	}
}
