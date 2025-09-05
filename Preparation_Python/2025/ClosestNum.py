# Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number,
# then output the one having maximum absolute value.

# Examples: 

# Input: n = 13, m = 4
# Output: 12
# Explanation: 12 is the closest to 13, divisible by 4.

# Input: n = -15, m = 6
# Output: -18
# Explanation: Both -12 and -18 are closest to -15, but -18 has the maximum absolute value.

def closestNum(n,m):
    closest = 0
    mindiff = float('inf')

    for i in range(n-abs(m), n+abs(m) + 1):
        if i % m ==0:
            diff = abs(n-i)
            if(diff < mindiff or diff == mindiff and abs(i) > abs(closest)):
                closest = i
                mindiff = diff
    return closest


n = int(input())
m = int(input())
print(closestNum(n,m))