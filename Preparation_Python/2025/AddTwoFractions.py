from math import gcd

def AddTwoFractions(a,b):
    den = gcd(a[1],b[1])

    den = (a[1] * b[1]) // den

    num = (a[0]) * (den//a[1]) + (b[0]) * (den//b[1])

    common_factor = gcd(num,den)

    den //= common_factor
    num //= common_factor
    return[num,den]

a = [1, 2]
b = [3, 2]
ans = AddTwoFractions(a, b)
print(f'{ans[0]}, {ans[1]}')

# Given two integer arrays a[] and b[] containing two integers each representing the numerator and denominator of a fraction respectively. 
# The task is to find the sum of the two fractions and return the numerator and denominator of the result.

# Examples : 

# Input:  a = [1, 2] , b = [3, 2] 
# Output: [2, 1] 
# Explanation: 1/2 + 3/2 = 2/1

# Input:  a = [1, 3] , b = [3, 9] 
# Output: [2, 3] 
# Explanation: 1/3 + 3/9 = 2/3   

# Input:  a = [1, 5] , b = [3, 15] 
# Output: [2, 5] 
# Explanation: 1/5 + 3/15 = 2/5   