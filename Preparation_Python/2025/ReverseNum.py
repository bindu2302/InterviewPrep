def reverseNum(n):
    revNum = 0
    while(n != 0):
        digit = n % 10
        revNum = revNum * 10 + digit
        n = n//10
    return revNum
n = int(input())
print(reverseNum(n))

# 12345
# 54321