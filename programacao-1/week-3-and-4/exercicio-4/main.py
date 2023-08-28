

def main():
    grau_a = float(input("Digite a nota grau A...   "))
    grau_b = float(input("Digite a nota Grau B...   "))

    if grau_a < 0 or grau_b < 0:
        print("ERRO! Nota deve ser 0 ou maior")
        return

    peso_grau_a = 0.3
    peso_grau_b = 0.7
        
    nota_final = (grau_a * peso_grau_a) + (grau_b * peso_grau_b)
    if nota_final < 7:
        print("O aluno precisa fazer Grau C")
    else:
        print("O aluno nao precisa fazer Grau C")    


if __name__ == "__main__":
    main()