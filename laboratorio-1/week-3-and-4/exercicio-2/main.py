

def main():
    numero_1 = int(input("Digite um numero inteiro... "))
    numero_2 = int(input("Digite outro numero inteiro..."))
    
    print(f"Dentre os numeros que voce passou, o maior eh: {numero_1 if numero_1 > numero_2 else numero_2}")

if __name__ == "__main__":
    main()