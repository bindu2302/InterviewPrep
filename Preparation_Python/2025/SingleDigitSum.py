def SingleDigitSum(n):
    if n==0:
        return 0
    if n % 9 ==0:
        return 9
    return n % 9
n = int(input())
print(SingleDigitSum(n))

# input : num = "1234"
# Output : 1
# Explanation : The sum of 1+2+3+4 = 10, digSum(x) == 10,Hence ans will be 1+0 = 1

# Input : num = "5674"
# Output : 4 