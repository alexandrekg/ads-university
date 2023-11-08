package etapa4;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
    
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public int quantidadeLojasPorTipo(String tipo) {   
        if (!tipo.equals("Cosmetico") && !tipo.equals("Vestuario") &&
                !tipo.equals("Bijuteria") && !tipo.equals("Alimentacao") &&
                !tipo.equals("Informatica")) {
                return -1;
            }
       
        int contador = 0;

        for (Loja loja : lojas) {
            if (loja.getClass().getSimpleName().equals(tipo)) {
                contador++;
            }
        }

        return contador;
    }
    
    public Informatica lojaSeguroMaisCaro() {
        double maxSeguro = 0;
        Informatica lojaSeguroMaisCaro = null;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maxSeguro) {
                    maxSeguro = informatica.getSeguroEletronicos();
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }

        return lojaSeguroMaisCaro;
    }

    @Override
    public String toString() {
        return "Dados do shopping" +
                "\nNome: " + nome +
                "\nEndereço: " + endereco +
                "\nLojas: " + lojas;
    }
}