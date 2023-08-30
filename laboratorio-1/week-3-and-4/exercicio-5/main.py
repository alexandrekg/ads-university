

def main():
    preco_produto = float(input("Digite o preco do produto... "))
    
    if preco_produto <= 0:
        print("Preco invalido!")
    elif preco_produto <= 30:
        print("Preco baixo")
    elif preco_produto <= 50:
        print("Preco medio")
    else:
        print("Preco alto")    

if __name__ == "__main__":
    main()