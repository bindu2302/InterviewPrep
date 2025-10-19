s = input("Enter a String: ")
rev = ""
for ch in s:
    rev = ch + rev
#for i in range(len(s)-1,-1,-1):
    # rev += s[i]

# i = len(s) -1
# while i >=0 :
#     rev += s[i]
#     i -= 1
print("Reversed string:", rev)

