text = input("Enter the String")

freq = {}
for ch in text:
    if ch in freq:
        freq[ch] += 1
    else:
        freq[ch] = 1
print("Character count: ",freq)
