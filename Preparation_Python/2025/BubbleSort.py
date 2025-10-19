arr = [int(x) for x in input("Enter the Elements: ").split()]
n = len(arr)
for i in range(n-1):
    for j in range(n-1-i):
        if(arr[j] > arr[j+1]):
            arr[j],arr[j+1] = arr[j+1],arr[j]
print("Sorted Array: ", arr)

# Enter the Elements: 90 1 30 50 30
# Sorted Array:  [1, 30, 30, 50, 90]