def NaturalSum(n):
    sum =0
    x = 1
    while x<=n:
        sum += x
        x += 1
    return sum
if __name__ == "__main__":
    n = int(input())
    print(NaturalSum(n))

# 15 -- 120

def SquareNaturalSum(n):
    sum = 0
    x = 1
    while x <= n:
        sum += x * x
        x = x+1
    return sum
if __name__ == "__main__":
    n = int(input())
    print(SquareNaturalSum(n))
# 2 -- 5 
# 8 -- 204