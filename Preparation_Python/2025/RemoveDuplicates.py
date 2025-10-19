arr = [int(x) for x in input("Enter numbers: ").split()]
unique = []
for num in arr:
    found = False
    for u in unique:
        if num == u:
            found = True
            break

    if not found:
        unique.append(num)
        
print("Unique Elements Are: " , unique)
