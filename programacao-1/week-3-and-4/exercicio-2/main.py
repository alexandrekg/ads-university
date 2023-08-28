

def main():
    numero_a = int(input("Digite o numero 'A'... "))
    numero_b = int(input("Digite o numero 'B'... "))
    
    if numero_b < 1:
        print('ERRO! Valor de "B" deve ser maior que 0')
        return 
    
    resultado = numero_a / numero_b
    print(f"O resultado da divisao de A por B eh {resultado}")

if __name__ == "__main__":
    main()