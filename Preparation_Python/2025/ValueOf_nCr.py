def fact(n):
    fact = 1
    for i in range(2,n+1):
        fact *= i
    return fact

def nCr(n,r):
    if(r>n):
        return 0
    return fact(n) // (fact(r) * fact(n-r))

n = int(input())
r = int(input())
print(nCr(n,r))

# nCr = n! / r! * (n - r)! 

# Examples:
# input: n = 5, r = 2
# Output: 10 
# Explanation: The value of  5C2 is calculated as 5! / ((5−2)! * 2!​)= 10.

# Input: n = 2, r = 4
# Output: 0
# Explanation: Since r is greater than n, thus 2C4 = 0

# Input: n = 5, r = 0
# Output: 1
# Explanation:  The value of  5C0 is calculated as 5!/(5−0)!*0! = 5!/5!*0! = 1.