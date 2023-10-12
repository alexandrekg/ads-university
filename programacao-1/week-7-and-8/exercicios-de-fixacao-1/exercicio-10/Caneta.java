package meuprojetoteste1;

import meuprojetoteste1.Cor;

public class Caneta {
	private String marca;
    private Cor cor;
	
	public Caneta(String marca, Cor cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Cor getCor(){
        return cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }
}
