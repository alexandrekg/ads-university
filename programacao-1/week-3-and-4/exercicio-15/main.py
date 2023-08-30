

def main():
    qtd_produtos = int(input("Quantos produtos deseja adicionar na lista? "))
    lista_produtos = []
    
    for i in range(0, qtd_produtos):
        produto = input("Digite o produto que deseja adicionar na lista:  ")
        lista_produtos.append(produto)        

    print("Segue a sua lista de produtos: ")
    for produto in lista_produtos:
        print(f"- {produto}")
        

if __name__ == "__main__":
    main()