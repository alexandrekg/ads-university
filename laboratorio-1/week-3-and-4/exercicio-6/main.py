

def main():
    valor = float(input("Digite um valor... "))

    if valor < 0:
        print("ERRO! Valor nao pode ser menor que 0")
        return
    elif valor < 100:
        valor_final = valor + (valor * 0.10)
    elif valor < 300:
        valor_final = valor + (valor * 0.20)
    else:
        valor_final = valor + (valor * 0.50)
        
    print(f"O valor final com as taxas ficou em: {valor_final}")

if __name__ == "__main__":
    main()