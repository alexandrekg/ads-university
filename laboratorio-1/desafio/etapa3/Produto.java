package etapa3;

public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data dataAtual) {
    	if (dataAtual.getAno() > dataValidade.getAno())
    		return true;
    	
    	if (dataAtual.getMes() > dataValidade.getMes())
    		return true;
    	
    	if (dataAtual.getDia() > dataValidade.getDia())
    		return true;
    	
    	return false;
    }

    @Override
    public String toString() {
        return "Dados do produto" +
                "\nNome: " + nome +
                "\nPreço: " + preco +
                "\nPreço: " + preco +
                "\nData de Validade: " + dataValidade;
    }
}