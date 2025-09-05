def DecimaltoBinary(n):
    binary = ""
    temp = n
    while(temp>0):
        remainder = temp%2
        binary += str(remainder)
        temp //= 2
    return binary[::-1]
n = int(input())
print(DecimaltoBinary(n))

# Input: n = 12
# Output: "1100"

# Input: n = 33
# Output: "100001"
