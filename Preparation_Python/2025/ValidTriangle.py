def validTriangle(a,b,c):
    if(a+b<=c or a+c <=b or b+c<=a):
        return False
    return True
a=int(input())
b=int(input())
c=int(input())
if validTriangle(a,b,c):
    print("Valid")
else:
    print("Not Valid")