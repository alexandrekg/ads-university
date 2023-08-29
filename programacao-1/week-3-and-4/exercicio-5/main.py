

def main():
    letra = input("Digite uma letra...  ")
    
    if letra.lower() in ['a', 'e', 'i', 'o', 'u']:
        print('A letra eh uma vogal')
    else:
        print('A letra eh uma consoante')


if __name__ == "__main__":
    main()