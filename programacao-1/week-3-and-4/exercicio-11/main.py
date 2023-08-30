

def main():
    contador = 0
    soma = 0
    while contador < 10:
        if contador > 0:
            numero = int(input("Digite outro numero inteiro... "))
        else:
            numero = int(input("Digite um numero inteiro..."))
        soma += numero
        contador += 1
    
    print(f"A soma de todos os numeros eh: {soma}")


if __name__ == "__main__":
    main()