
def main():
    a = int(input("Digite o primeiro numero inteiro... "))
    b = int(input("Digite o segundo numero inteiro... "))
    c = int(input("Digite o terceiro numero inteiro... "))

    raiz_discriminante = (b ** 2) - 4 * a * c
    raiz_positiva = (- b + (raiz_discriminante ** 0.5)) / (2 * a)
    raiz_negativa = (- b - (raiz_discriminante ** 0.5)) / (2 * a)
    
    print(f"A raiz positiva eh: {raiz_positiva}")
    print(f"A raiz negativa eh: {raiz_negativa}")

if __name__ == "__main__":
    main()