def sumofdigits(n):
    sum = 0
    while(n != 0):
        digit = n % 10
        sum = sum + digit
        n = n//10
    return sum
n = int(input())
print(sumofdigits(n))

#  or
def sumofdigits(n):
    if n==0:
        return 0
    return n % 10 + sumofdigits(n//10)
n = int(input())
print(sumofdigits(n))