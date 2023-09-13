

def main():
    numero_1 = int(input("Digite um numero inteiro... "))
    numero_2 = int(input("Digite outro numero inteiro..."))
    numero_3 = int(input("Digite outro numero inteiro..."))
    
    if numero_1 < numero_2 and numero_1 < numero_3:
        print(f"O primeiro numero que voce digitou eh o menor: {numero_1}")
    elif numero_2 < numero_1 and numero_2 < numero_3:
        print(f"O segundo numero que voce digitou eh o menor: {numero_2}")
    else:
        print(f"O terceiro numero que voce digitou eh o menor: {numero_3}")
        

if __name__ == "__main__":
    main()