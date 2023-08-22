import math


def main():
    a = int(input("Digite um numero inteiro... "))
    b = int(input("Digite o segundo numero inteiro... "))
    c = int(input("Digite o terceiro numero inteiro... "))
    d = int(input("Digite o quarto numero inteiro... "))
    e = int(input("Digite o quinto numero inteiro... "))
    
    area_triangulo = (b * c) / 2
    print(f"A area do triangulo eh: {area_triangulo}")
    
    perimetro_retangulo = a + b + c + d
    print(f"O perimetro do retangulo eh {perimetro_retangulo}")
    
    area_circulo = math.pi * (e ** 2)
    print(f"A area do circulo eh: {area_circulo}")

if __name__ == "__main__":
    main()