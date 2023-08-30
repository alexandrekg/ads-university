

def main():
    numero_1 = int(input("Digite um numero inteiro... "))
    numero_2 = int(input("Digite outro numero inteiro..."))
    
    if numero_2 == 0:
        print("ERRO! Nao pode fazer divisao por 0!")
        return
    
    resultado = numero_1 / numero_2
    print(f"O resultado da divisao eh: {resultado}")

if __name__ == "__main__":
    main()