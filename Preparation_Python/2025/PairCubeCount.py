def PairCubeCount(n):
    count =0
    for i in range(1,n+1):
        for j in range(n+1):
            if(i**3 + j**3 == n):
                count+=1
    return count
n = int(input())
print(PairCubeCount(n))

# Given n, count all 'a' and 'b' that satisfy the condition a^3 + b^3 = n. Where (a, b) and (b, a) are considered two different pairs

# Examples: 

# Input: n = 9
# Output: 2
# Explanation: 1^3 + 2^3 = 9 and 2^3 + 1^3 = 9

# Input: n = 28
# Output: 2
# Explanation: 1^3 + 3^3 = 28 and 3^3 + 1^3 = 28