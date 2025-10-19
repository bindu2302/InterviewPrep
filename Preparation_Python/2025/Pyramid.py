h = int(input("Enter height: "))
row = 1
while row <= h:
    # print spaces
    space = h - row
    s = ""
    i = 0
    while i < space:
        s += " "
        i += 1
    # print stars: (2*row - 1)
    j = 0
    while j < 2*row - 1:
        s += "*"
        j += 1
    print(s)
    row += 1
