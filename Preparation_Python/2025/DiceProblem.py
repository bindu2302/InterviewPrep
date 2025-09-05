def oppositeFaceOfDice(n):
    if n == 1:
        return 6
    elif n == 2:
        return 5
    elif n == 3:
        return 4
    elif n == 4:
        return 3
    elif n == 5:
        return 2
    else:
        return 1

n = int(input())
print(oppositeFaceOfDice(n))

# In a normal 6-faced dice, 1 is opposite to 6, 2 is opposite to 5, and 3 is opposite to 4. Hence a normal if-else-if block can be placed 
# Examples:

# Input: n = 2
# Output: 5
# Explanation: For dice facing number 5 opposite face will have the number 2.

# Input: n = 6
# Output: 1
# Explanation: For dice facing number 6 opposite face will have the number 1.

def oppositeFaceOfDice(n):
   ans = 7-n
   return ans
n = int(input())
print(oppositeFaceOfDice(n))