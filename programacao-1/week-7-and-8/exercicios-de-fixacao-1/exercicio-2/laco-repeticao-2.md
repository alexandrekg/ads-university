## Antes
```
int y = 100;

while(y >= 0)

    System.out.println(y--);
```


## Depois
```
for (var y = 100; y >= 0; y--) {
    System.out.println(y);
}
```