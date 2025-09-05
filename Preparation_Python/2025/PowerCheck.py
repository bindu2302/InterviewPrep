def PowerCheck(x,y):
  # The only power of 1 is 1 itself
    if x == 1:
        return y == 1

    # Repeatedly compute power of x
    pow = 1
    while pow < y:
        pow *= x

    # Check if power of x becomes y
    return pow == y
x = int(input())
y = int(input())
print(PowerCheck(x,y))


# Input:  x = 10, y = 1
# Output: True
# x^0 = 1

# Input:  x = 10, y = 1000
# Output: True
# x^3 = 1

# Input:  x = 10, y = 1001
# Output: False