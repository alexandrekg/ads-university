"""
Considerando que a variável z possui valor 50 antes do while, qual o valor da variável z após a execução do laço?
"""

z = 50
while z != 10:
    if z > 10:
        z -= 1
    else:
        z += 1
        
print(z)