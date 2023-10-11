## Antes
```
int z = 50;

while(z != 10)

    if(z > 10)

        z--;

    else

        z++;
```


## Depois
```
int z = 50;

for (; z != 10; ) {
    if (z > 10) {
        z--;
    } else {
        z++;
    }

    System.out.println("Valor final de z: " + z);
}
```