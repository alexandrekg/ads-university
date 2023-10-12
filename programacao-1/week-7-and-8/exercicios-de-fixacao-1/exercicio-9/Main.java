package meuprojetoteste1;

import meuprojetoteste1.Teclado;

import java.util.ArrayList;
import java.util.List;

import meuprojetoteste1.Caneta;
import meuprojetoteste1.Estojo;
import meuprojetoteste1.Cor;

public class App {

	public static void main(String[] args) {
		Cor canetaCor1 = new Cor(255, 255, 0);
		Cor canetaCor2 = new Cor(0, 255, 0);
		
		Caneta caneta1 = new Caneta("Bic", canetaCor1);
		Caneta caneta2 = new Caneta("FaberCastell", canetaCor2);
		
		List<Caneta> canetas = new ArrayList<>();
		canetas.add(caneta1);
		
		Estojo estojo1 = new Estojo(canetas);
		
		System.out.println("Estojo agora...");
		System.out.println(estojo1.getCanetas());
		System.out.println("----------------");
		
		estojo1.setCaneta(caneta2);
		System.out.println("Estojo agora...");
		System.out.println(estojo1.getCanetas());
	}
}
