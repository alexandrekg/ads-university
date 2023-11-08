package etapa4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Loja loja = null;
        Produto produto = null;

        int opcao;

        do {
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da loja: ");
                    String nomeLoja = scanner.next();

                    System.out.print("Digite a quantidade de funcionários da loja: ");
                    int quantidadeFuncionarios = scanner.nextInt();

                    System.out.print("Digite o salário base dos funcionários da loja: ");
                    double salarioBaseFuncionario = scanner.nextDouble();

                    System.out.print("Digite o nome da rua: ");
                    String nomeRua = scanner.next();

                    System.out.print("Digite a cidade: ");
                    String cidade = scanner.next();

                    System.out.print("Digite o estado: ");
                    String estado = scanner.next();

                    System.out.print("Digite o país: ");
                    String pais = scanner.next();

                    System.out.print("Digite o CEP: ");
                    String cep = scanner.next();

                    System.out.print("Digite o número: ");
                    String numero = scanner.next();

                    System.out.print("Digite o complemento: ");
                    String complemento = scanner.next();

                    Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);

                    System.out.print("Digite o dia de fundação da loja: ");
                    int diaFundacao = scanner.nextInt();

                    System.out.print("Digite o mês de fundação da loja: ");
                    int mesFundacao = scanner.nextInt();

                    System.out.print("Digite o ano de fundação da loja: ");
                    int anoFundacao = scanner.nextInt();

                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                    loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 10);
                    
                    System.out.println("-----------------------------------------------------");
                    System.out.println(loja.toString());
                    System.out.println("-----------------------------------------------------");
                    System.out.println(endereco.toString());
                    System.out.println("-----------------------------------------------------");
                    break;

                case 2:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.next();

                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();

                    System.out.print("Digite o dia de validade do produto: ");
                    int diaValidade = scanner.nextInt();

                    System.out.print("Digite o mês de validade do produto: ");
                    int mesValidade = scanner.nextInt();

                    System.out.print("Digite o ano de validade do produto: ");
                    int anoValidade = scanner.nextInt();

                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                    produto = new Produto(nomeProduto, precoProduto, dataValidade);
                    System.out.println("-----------------------------------------------------");
                    System.out.println(produto.toString());
                    System.out.println("-----------------------------------------------------");

                    if (produto.estaVencido(new Data(20, 10, 2023))) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);


        scanner.close();
    }
}