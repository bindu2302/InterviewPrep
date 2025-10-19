n = int(input("Enter a number"))

if n <= 1:
    print("Not Prime")
else:
    i=2
    isPrime = True 
    while(i * i <= n):
        if(n % i ==0):
            isPrime = False
            break
        i += 1
    print("Prime" if isPrime else "Not prime")

    