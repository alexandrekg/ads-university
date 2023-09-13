public class Computador {
    private String marca;
    private double velocidade;
    private int anoFabricacao;
    private Boolean isComputadorNovo;

    public Computador(String marca, double velocidade, int anoFabricacao, Boolean isComputadorNovo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.anoFabricacao = anoFabricacao;
        this.isComputadorNovo = isComputadorNovo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca
    }

    public double getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(String velocidade){
        this.velocidade = velocidade
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao){
        this.anoFabricacao = anoFabricacao
    }

    public Boolean getIsComputadorNovo(){
        return isComputadorNovo;
    }

    public void setIsComputadorNovo(String isComputadorNovo){
        this.isComputadorNovo = isComputadorNovo
    }
}