def swapNum(a,b):
    temp = a
    a = b
    b = temp
    print("After swapping: ", a,b)

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    print("Before swapping: ", a,b)
    swapNum(a,b)

# 2
# 3
# Before swapping:  2 3
# After swapping:  3 2

if __name__ == "__main__":
    a = 2
    b = 3
    print("a =", a, " b =", b)

    # Tuple unpacking
    a, b = b, a

    print("a =", a, " b =", b)


# a = 2  b = 3
# a = 3  b = 2