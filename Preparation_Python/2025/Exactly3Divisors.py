def CountDivisors(n):
    count = 0
    for i in range(1,n+1):
        if(n%i==0):
            count+=1
    return count

def Exactly3Divisors(n):
    total = 0
    for i in range(1,n+1):
        if(CountDivisors(i) == 3):
            total += 1
    return total

n = int(input())
print(Exactly3Divisors(n))

# Given a number n, print count of numbers in the range from 1 to n having exactly 3 divisors. 

# Examples: 

# Input: n = 16
# Output: 2
# Explanation: Only 4 and 9 have exactly three divisors.

# Input: n = 100
# Output: 4
# Explanation: 4, 9, 25 and 49 have exactly three divisors.