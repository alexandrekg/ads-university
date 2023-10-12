package meuprojetoteste1;

import java.util.ArrayList;
import java.util.List;
import meuprojetoteste1.Caneta;

public class Estojo {
    private List<Caneta> canetas = new ArrayList<>();
	
	public Estojo(List<Caneta> canetas) {
        this.canetas = canetas;
    }

    public List<Caneta> getCanetas(){
        return canetas;
    }

    public void setCanetas(List<Caneta> canetas){
        this.canetas = canetas;
    }
}

