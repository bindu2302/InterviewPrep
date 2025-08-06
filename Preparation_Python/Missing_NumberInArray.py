def missing_num(arr):
    n = len(arr)
    expected = n * (n+1) //2
    return expected - sum(arr)
arr = list(map(int,input().split()))
print("Missing num: ", missing_num(arr))

# 3 0 1
# Missing num:  2