

def main():
    ano = int(input("Digite um numero referente a um ano... "))
    
    is_bissexto = ano % 4 == 0    
    print(f"O ano que voce digitou {'eh' if is_bissexto else 'nao eh'} bissexto")

if __name__ == "__main__":
    main()