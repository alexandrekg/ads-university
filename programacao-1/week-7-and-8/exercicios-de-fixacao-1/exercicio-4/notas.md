# Exercício 4. O que faz a instrução break? Dê (no mínimo) um exemplo de utilização.

- A instrucao interrompe um laco de repeticao, fazendo sair da iteracao;

```
int x = 10;
do {
    x--;
    System.out.println(x);
    if (x == 5) {
        break;
    }
} while (x > 0);
```