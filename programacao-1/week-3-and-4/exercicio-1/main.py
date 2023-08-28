

def main():
    numero = int(input("Digite um numero inteiro... "))
    par = (numero % 2) == 0
    print(f"O numero que voce digitou eh {'Par' if par else 'Impar'}")

if __name__ == "__main__":
    main()