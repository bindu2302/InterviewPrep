num = int(input("Enter a number: "))

temp = num
sum = 0

while temp > 0:
    digit = temp % 10
    sum += digit * digit * digit
    temp = temp // 10

if sum == num:
    print("it is an Armstrong number")
else:
    print("it is not an armstrong number")
