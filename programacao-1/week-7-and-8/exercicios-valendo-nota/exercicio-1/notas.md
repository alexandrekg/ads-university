# Considere a existência das classes Carro (com atributos marca e valor) e Cliente (com atributos nome e carro, do tipo Carro). O construtor das classes recebem parâmetros para inicializar todos os atributos, e ambas as classes possuem todos os métodos de acesso.

Assinale a alternativa que completa o código abaixo para (respectivamente): 
i) associar um objeto do tipo Carro ao cliente; 
ii) alterar o valor do carro do cliente criado para 90000?

Cliente cli = new Cliente("Petrônio", __________);
____________________


## Selecione a resposta:
A 
```
new Carro("Fiat", 37000)
  cli.setValor(90000);
```

B
```
new Carro("Fiat", 37000)
Carro.setValor(90000);
```

C
```
new Carro("Fiat", 37000)
cli.getCarro().setValor(90000);
```

D
```
new Carro("Fiat", 37000)
carro.setValor(90000);
```

E
```
Carro("Fiat", 37000)
cli.getCarro().setValor(90000);
```



Resposta C