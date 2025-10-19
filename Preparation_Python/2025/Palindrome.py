# Palindrome: For Strings
s = input("Enter a String").lower()
rev = ""

for ch in s:
    rev = ch + rev

if s == rev:
    print("palindrome")
else:
    print("Not palindrome")


# Palindrome: For Numbers
num = int(input("Enter a number: "))
temp = num
rev = 0

while(num >0):
    digit = num % 10
    rev = rev * 10 + digit
    num = num//10

if(temp == rev):
    print("palindrome")
else:
    print("Not palindrome")

# Enter a number: 121
# palindrome