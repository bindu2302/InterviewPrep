arr = [int(x) for x in input("Enter numbers: ").split()]
if len(arr) == 0:
    print("Zero")
else:
    max = arr[0]
    min = arr[0]
    i = 0
    while i < len(arr):
        if arr[i] > max:
            max = arr[i]
        if arr[i] < min:
            min = arr[i]
        i += 1
    print("Max: ", max, " Min: ",min)

# Enter numbers: 10 20 33 1 0 100 300
# Max:  300  Min:  0