
def main():
    nome_rua = input("Digite sua rua... ")
    complemento = input("Digite seu complemento... ")
    
    cep = input("Digite seu CEP (Exemplo 91444-221) ... ")
    bairro = input("Digite seu bairro... ")
    
    estado = input("Digite seu estado... ")
    cidade = input("Digite sua cidade... ")
    
    print(f"O endereco fica na rua {nome_rua}, {complemento}, CEP {cep} - {bairro}. {cidade}/{estado}")


if __name__ == "__main__":
    main()