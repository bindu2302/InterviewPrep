arr = [int(x) for x in input("Enter an array: ").split()]
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        if(arr[i] == arr[j]):
            print(arr[i])
            