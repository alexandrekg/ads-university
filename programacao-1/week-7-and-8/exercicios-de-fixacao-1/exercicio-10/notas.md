# Exercício 10. Os comandos for, if e while possuem a possibilidade de utilização ou não das chaves. Quando podemos utilizar estes comandos sem as chaves e quando devemos utilizá-los com as chaves?

Quando temos apenas uma instrucao dentro do comando, nao precisamos usar as chaves:
```
// Exemplo com if sem chaves
if (condicao)
    System.out.println("Apenas uma instrução");
```

```
// Exemplo com for sem chaves
for (int i = 0; i < 5; i++)
    System.out.println(i);
```

```
// Exemplo com while sem chaves
while (condicao)
    System.out.println("Looping");
```


------------------------------------------------------------------------------
Quando temos mais de uma instrucao, precisamos usar as chaves

```
// Exemplo com if usando chaves
if (condicao) {
    System.out.println("Instrução 1");
    System.out.println("Instrução 2");
}
```


```
// Exemplo com for usando chaves
for (int i = 0; i < 5; i++) {
    System.out.println("Iteração " + i);
    System.out.println("Outra instrução");
}
```


```
// Exemplo com while usando chaves
while (condicao) {
    System.out.println("Looping");
    // Outras instruções
}
```