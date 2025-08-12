def simulate_exit_or_loop(n,arr,s):
    visited = set() # To store visited positions to detect loops
    steps = 0
    i = s # start index

    while True:
        if i < 1 or i > n:
            print(f"Exited in {steps} steps.")
            return
        
        if i in visited:
            print(f"Loop detected after {steps} steps.")
            return
        
        visited.add(i)
        steps += 1

        next_i = i + arr[i-1]  # (i - 1) because list is 0-based in Python
        if next_i < 1 or next_i > n:
            print(f"Exited in {steps} steps.")
            return
        i = next_i

def main():
    n = int(input().strip())
    arr = list(map(int,input().strip().split()))
    s = int(input().strip())

    if len(arr) != n or s < 1 or s > n:
        print("Invalid start")
        return
    simulate_exit_or_loop(n,arr,s)

if __name__ == "__main__":
    main() 
