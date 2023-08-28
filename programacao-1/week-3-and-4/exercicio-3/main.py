

def main():
    ano = int(input("Digite um numero referente um ano (Exemplo: 1995, 2004)...   "))

    is_numero_bissexto = ano % 4 == 0
    
    print(f"O numero {'eh' if is_numero_bissexto else 'nao eh'} bissexto")    

if __name__ == "__main__":
    main()