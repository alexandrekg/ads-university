package Week7e8ExerciciosValendoNota;

public class Carro {
	private String marca;
    private double valor;
	
	public Carro(String marca, double valor) {
        this.marca = marca;
        this.valor = valor;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}
