

def main():
    opcao = int(input("* Digite 1 para somar dois valores.\
            \n * Digite 2 para subtrair dois valores. \
            \n * Digite 3 para multiplicar dois valores. \
            \n * Digite 4 para dividir dois valores. \
            \n * Digite 5 para realizar uma potencia entre dois valores. \
            \n * Digite 6 para realizar uma radiacao entre dois valores. \
            \n * Digite qualquer outro numero para sair. \
            \n    "))
    
    if opcao < 1 or opcao > 6:
        print("Encerrando o programa!")
        return
    
    numero_1 = int(input("Digite o primeiro numero..."))
    numero_2 = int(input("Digite o primeiro numero..."))
    
    if opcao == 1:
        resultado = numero_1 + numero_2
    elif opcao == 2:
        resultado = numero_1 - numero_2
    elif opcao == 3:
        resultado = numero_1 * numero_2
    elif opcao == 4:
        resultado = numero_1 / numero_2
    elif opcao == 5:
        resultado = numero_1 ** numero_2
    elif opcao == 6:
        resultado = numero_1 ** (1 / numero_2)
    
    print(f"O resultado da operacao eh: {resultado}")

if __name__ == "__main__":
    main()