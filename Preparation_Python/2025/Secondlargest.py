numbers = [int(x) for x in input("enter the numbers with space separated: ").split()]

largest = second = -float('inf')

for num in numbers:
    if num > largest:
        second = largest
        largest = num
    elif num > second and num != largest:
        second = num
if second == -float('inf'):
    print("No second number is found.")
else:
    print("Second number is: ", second)

# enter the numbers with space separated: 5 10 20 4 33
# Second number is:  20