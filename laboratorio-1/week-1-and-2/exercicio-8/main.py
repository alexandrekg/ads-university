def main():
    peso_grau_a = 0.33
    peso_grau_a_atividade_pratica = 0.45
    peso_grau_a_atividade_teorica = 0.55
    
    peso_grau_b = 0.67
    peso_grau_b_prova_laboratorio = 0.60
    peso_grau_b_teste_teorico = 0.20
    peso_grau_b_trabalho_extraclasse = 0.20

    nota_grau_a_atividade_pratica = float(input("Digite a nota da Atividade Pratica de Grau A... ")) * peso_grau_a_atividade_pratica
    nota_grau_a_atividade_teorica = float(input("Digite a nota da Atividade Teorica de Grau A... ")) * peso_grau_a_atividade_teorica
    
    nota_grau_b_prova_laboratorio = float(input("Digite a nota da Prova de Laboratorio de Grau B... ")) * peso_grau_b_prova_laboratorio
    nota_grau_b_teste_teorico = float(input("Digite a nota do Teste Teorico de Grau B... ")) * peso_grau_b_teste_teorico
    nota_grau_b_trabalho_extraclasse = float(input("Digite a nota do Trabalho Extraclasse de Grau B... ")) * peso_grau_b_trabalho_extraclasse
    
    nota_grau_a = (nota_grau_a_atividade_pratica + nota_grau_a_atividade_teorica) * peso_grau_a
    nota_grau_b = (nota_grau_b_prova_laboratorio + nota_grau_b_teste_teorico + nota_grau_b_trabalho_extraclasse) * peso_grau_b
    
    nota_final = nota_grau_a + nota_grau_b
    
    print(f"A nota final do aluno eh: {nota_final} ")

if __name__ == "__main__":
    main()