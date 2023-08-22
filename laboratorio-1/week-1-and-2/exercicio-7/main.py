def main():
    nota_trabalho = int(input("Digite a nota do trabalho... "))
    nota_prova = int(input("Digite a nota da prova... "))
    nota_teste = int(input("Digite a nota do teste... "))
    
    peso_nota_trabalho = 0.1
    peso_nota_prova = 0.6
    peso_nota_teste = 0.3
    
    nota_representativa_trabalho = peso_nota_trabalho * nota_trabalho
    nota_representativa_prova = peso_nota_prova * nota_prova
    nota_representativa_teste = peso_nota_teste * nota_teste
    
    nota_final = nota_representativa_trabalho + nota_representativa_prova + nota_representativa_teste
    
    print(f"A nota final do aluno eh: {nota_final}")


if __name__ == "__main__":
    main()