package meuprojetoteste1;

import meuprojetoteste1.caneta;
import meuprojetoteste1.Caneta;

public class Estojo {
	private Cor cor;
    private Caneta caneta1;
    private Caneta caneta2;
	
	public Estojo(int cor, caneta1, caneta2) {
        this.cor = cor;
        this.caneta1 = caneta1;
        this.caneta2 = caneta2;
    }

    public Cor getCor(){
        return cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }

    public Caneta getCaneta1(){
        return caneta1;
    }

    public void setCaneta1(Caneta caneta1){
        this.caneta = caneta;
    }

    public Caneta getCaneta2(){
        return caneta2;
    }

    public void setCaneta2(Caneta caneta2){
        this.caneta = caneta;
    }
}
