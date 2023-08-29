"""
Qual é a saída na tela (na ordem correta) quando a variável sexo possuir os seguintes valores antes da execução deste trecho:
"M"
"f"
"F"
"m"
"K"


"""

def retorno_sexo(sexo):
    if sexo == "F" and sexo == "f":
        print("Sexo feminino!")
    elif sexo == "M" and sexo == "m":
        print("Sexo masculino!") 
    else:
        print("Sexo invalido!")
        
retorno_sexo("M")
retorno_sexo("f")
retorno_sexo("F")
retorno_sexo("m")
retorno_sexo("K")
