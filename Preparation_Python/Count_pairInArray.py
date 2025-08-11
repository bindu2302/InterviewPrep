# 1 5 7 -1 5
# 6
# Count is: 3

def Count_pairInArray(arr,k):
    count =0
    seen = {}
    for num in arr:
        if k-num in seen:
            count += seen[k-num]
        seen[num] = seen.get(num,0) + 1
    return count
arr = list(map(int,input().strip().split()))
k = int(input())

print("Count is:" , Count_pairInArray(arr,k))
