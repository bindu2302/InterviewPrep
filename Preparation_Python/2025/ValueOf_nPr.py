def fact(n):
    fact = 1
    for i in range(1,n+1):
        fact *= i
    return fact
def nPr(n,r):
    return fact(n) / fact(n-r)

n = int(input())
r = int(input())
print(nPr(n,r))

# nPr = n! / (n - r)! 

# Examples:

# Input: n = 5
#            r = 2
# Output: 20
# Explanation: 5P2 = 5! / (5 - 2)!  = 20

# Input: n = 6
#            r = 3
# Output: 120
# Explanation: 6P3 = 6! / (6 - 3)!  = 120