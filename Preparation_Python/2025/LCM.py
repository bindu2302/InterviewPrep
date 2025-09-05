# def Lcm(a,b):
#     g = max(a,b)
#     s = min(a,b)
#     for i in range(g,a*b,g):
#         if(i % s == 0):
#             return i
#     return a * b
# a = int(input())
# b = int(input())
# print(Lcm(a,b))

def gcd(a,b):
    return a if b==0 else gcd(b,a%b)
def lcm(a,b):
    return (a // gcd(a,b)) * b
   
a = int(input())
b = int(input())
print(lcm(a,b))

# Given two positive integers a and b. Find the Least Common Multiple (LCM) of a and b.
# LCM of two numbers is the smallest number which can be divided by both numbers. 

# Input :  a = 10, b = 5
# Output :  10
# Explanation : 10 is the smallest number divisible by both 10 and 5

# Input :  a = 5, b = 11
# Output :  55
# Explanation : 55 is the smallest number divisible by both 5 and 11